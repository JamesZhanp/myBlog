package com.james.myblog.util;

import org.springframework.util.StringUtils;

/**
 * @author: JamesZhan
 * @create: 2019 - 08 - 28 23:41
 */
public class ResultGenerator {
    /**
     * 响应结果生成类
     */


    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    private static final String DEFAULT_FAIR_MESAGE = "FAIL";

    private static final int RESULT_CODE_SUCCESS = 200;
    private static final int RESULT_CODE_SERVER_ERROR = 500;

    public static Result genSuccessResult(String message){
        Result result = new Result(RESULT_CODE_SUCCESS, message);
        return result;
    }

    public static Result genSuccessResult(Object data){
        Result result = new Result();
        result.setResultCode(RESULT_CODE_SUCCESS);
        result.setData(data);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    /**
     * 判断message是否为空，若为空发送默认的数据
     * @param message
     * @return
     */

    public static  Result genFailResult(String message){
        Result result = new Result();
        result.setResultCode(RESULT_CODE_SERVER_ERROR);
        if (StringUtils.isEmpty(message)){
            result.setMessage(DEFAULT_FAIR_MESAGE);
        }else{
            result.setMessage(message);
        }
        return result;
    }

    public static  Result genErrorResult(int code, String message){
        return new Result(code, message);
    }
}
