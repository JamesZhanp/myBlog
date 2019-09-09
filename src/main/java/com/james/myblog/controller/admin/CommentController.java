package com.james.myblog.controller.admin;

import com.james.myblog.service.CommentService;
import com.james.myblog.util.PageQueryUtil;
import com.james.myblog.util.Result;
import com.james.myblog.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 09 22:40
 */

@RestController("/admin")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comments/list")
    @ResponseBody
    public Result list(@RequestParam Map<String, Object> params){
        if (StringUtils.isEmpty(params.get("page")) || StringUtils.isEmpty(params.get("limit"))){
            return ResultGenerator.genFailResult("参数异常");
        }
        PageQueryUtil pageQueryUtil = new PageQueryUtil(params);
        return ResultGenerator.genSuccessResult(commentService.getCommentsPage(pageQueryUtil));
    }

    @PostMapping("/comments/checkDone")
    @ResponseBody
    public Result checkDone(@RequestBody Integer[] ids){
        if (ids.length < 1){
            return ResultGenerator.genFailResult("参数异常！");
        }
        if (commentService.checkDone(ids)){
            return ResultGenerator.genSuccessResult();
        }else {
            return ResultGenerator.genFailResult("审核失败！");
        }
    }

    @PostMapping("/comments/reply")
    @ResponseBody
    public Result checkDone(@RequestParam("commentId") Long commentId,
                            @RequestParam("replyBody") String replyBody) {
        if (commentId == null || commentId < 1 || StringUtils.isEmpty(replyBody)) {
            return ResultGenerator.genFailResult("参数异常！");
        }
        if (commentService.reply(commentId, replyBody)) {
            return ResultGenerator.genSuccessResult();
        } else {
            return ResultGenerator.genFailResult("回复失败");
        }
    }

    @PostMapping("/comments/delete")
    @ResponseBody
    public Result delete(@RequestBody Integer[] ids) {
        if (ids.length < 1) {
            return ResultGenerator.genFailResult("参数异常！");
        }
        if (commentService.deleteBatch(ids)) {
            return ResultGenerator.genSuccessResult();
        } else {
            return ResultGenerator.genFailResult("刪除失败");
        }
    }

    @GetMapping("/comments")
    public String list(HttpServletRequest request) {
        request.setAttribute("path", "comments");
        return "admin/comment";
    }

}
