package com.james.myblog.enity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author: JamesZhan
 * @create: 2019 - 08 - 27 23:48
 */

@Data
public class BlogComment {
    private Long commentId;

    private Long blogId;

    private String email;

    private String websiteUrl;

    private String commentBody;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     *     评论者的ip
     */
    private String commentatorIp;

    private String replyBody;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date replyCreateTime;

    private Byte commonStatus;

    private Byte isDelete;

}
