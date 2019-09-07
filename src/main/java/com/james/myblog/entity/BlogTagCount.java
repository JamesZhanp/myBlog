package com.james.myblog.entity;

import lombok.Data;

/**
 * @author: JamesZhan
 * @create: 2019 - 08 - 28 0:01
 */

@Data
public class BlogTagCount {
    private Integer tagId;

    private String tagName;

    private Integer tagCount;
}
