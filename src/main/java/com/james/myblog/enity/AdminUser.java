package com.james.myblog.enity;

import lombok.Data;

/**
 * @author: JamesZhan
 * @create: 2019 - 08 - 22 22:24
 */

@Data
public class AdminUser {
    /**
     * 对应数据库tb_admin_use
     */
    private Integer adminUserId;

    private String loginUserName;

    private String loginPassword;

    private String nickName;
    /**
     * 判断用户是否被限制
     */
    private Byte locked;
}
