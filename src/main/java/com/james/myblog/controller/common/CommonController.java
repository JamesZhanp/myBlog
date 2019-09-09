package com.james.myblog.controller.common;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 08 23:36
 */

@Controller
public class CommonController {
    @Autowired
    private DefaultKaptcha kaptcha;

    @GetMapping("/common/kaptcha")
    public void defaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        byte[] captchaOutputStream = null;
        /**
         * byte数组输出流
         */
        ByteArrayOutputStream imgOutputStream = new ByteArrayOutputStream();

        try{
            //生产验证码字符串保存在session中

            String verifyCode = kaptcha.createText();
            httpServletRequest.getSession().setAttribute("verifyCode", verifyCode);
            BufferedImage challenge = kaptcha.createImage(verifyCode);
            ImageIO.write(challenge, "jpg", imgOutputStream);
        }catch (IllegalArgumentException e){
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        // 图像转换成二进制数据流
        captchaOutputStream = imgOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream = httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaOutputStream);
        responseOutputStream.flush();
        responseOutputStream.close();
    }
}
