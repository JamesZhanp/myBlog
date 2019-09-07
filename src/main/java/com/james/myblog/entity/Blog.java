package com.james.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author: JamesZhan
 * @create: 2019 - 08 - 22 22:26
 */
@Data
public class Blog {
    private Long blogId;

    private String blogTitle;

    private String blogSubUrl;

    /**
     * 博客封面图
     */
    private String blogCoverImage;

    private Integer blogCategoryId;

    private String blogCategoryName;

    /**
     * 博客的标签
     */
    private String blogTags;


    private Byte blogStatus;

    private Long blogViews;

    private Byte enableComment;

    private Byte isDeleted;

    /**
     * Json解析之后的时间更格式
      */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private Date updateTime;

    private String blogContent;
}
