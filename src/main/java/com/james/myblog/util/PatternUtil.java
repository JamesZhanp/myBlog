package com.james.myblog.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 正则工具类
 * @author: JamesZhan
 * @create: 2019 - 09 - 01 13:21
 */
public class PatternUtil {
    /**
     * 邮箱正则表达式
     */
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /**
     * 验证只包含中英文和数字的字符串
     * @param keyWord
     * @return
     */
    public static  Boolean validKeyWord(String keyWord){
        String regex = "^[a-zA-Z0-9\u4E00-\u9FA5]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(keyWord);
        return match.matches();
    }

    /**
     * 判断邮箱是否满足格式
     * @param emailStr
     * @return
     */
    public  static boolean isEmail(String emailStr){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    /**
     * 判断是否为网址
     * @param urlString
     * @return
     */

    public static boolean isURL(String urlString){
        String regex = "^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][tT][pP]:/*)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+(\\?{0,1}(([A-Za-z0-9-~]+\\={0,1})([A-Za-z0-9-~]*)\\&{0,1})*)$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(urlString).matches();
    }
}
