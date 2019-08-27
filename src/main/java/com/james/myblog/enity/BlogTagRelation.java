package com.james.myblog.enity;

import lombok.Data;

import java.util.Date;

/**
 * @author: JamesZhan
 * @create: 2019 - 08 - 28 0:03
 */
@Data
public class BlogTagRelation {
    private Long relationId;

    private Long blogId;

    private Integer tagId;

    private Date createDate;
}
