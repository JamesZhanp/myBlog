package com.james.myblog.util;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: JamesZhan
 * @create: 2019 - 08 - 28 22:57
 */

@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int resultCode;

    private String message;

    private T data;

    public Result(){

    }

    public Result(int resultCode, String message){
        this.resultCode = resultCode;
        this.message = message;
    }

}
