package com.james.myblog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: JamesZhan
 * @create: 2019 - 08 - 27 23:54
 */

@Data
public class BlogConfig {
    private String configName;

    private String configValue;

    private Date createTime;

    private Date updateTime;

}
