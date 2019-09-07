package com.james.myblog.service.impl;

import com.james.myblog.dao.AdminUserMapper;
import com.james.myblog.entity.AdminUser;
import com.james.myblog.service.AdminUserService;
import com.james.myblog.util.MD5Util;

import javax.annotation.Resource;

/**
 * 对于用户个人信息的修改service
 * @author: JamesZhan
 * @create: 2019 - 09 - 03 0:27
 */

public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    AdminUserMapper adminUserMapper;

    @Override
    public AdminUser login(String userName, String password) {
        String passwordMd5 = MD5Util.md5Encode(password, "UTF-8");
        return adminUserMapper.login(userName, passwordMd5);
    }

    @Override
    public AdminUser getUserDetailById(Integer loginUserId) {
        return adminUserMapper.selectByPrimaryKey(loginUserId);
    }

    @Override
    public Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        //当前用户非空才可以进行更改
        if (adminUser != null) {
            String originalPasswordMd5 = MD5Util.md5Encode(originalPassword, "UTF-8");
            String newPasswordMd5 = MD5Util.md5Encode(newPassword, "UTF-8");
            //比较原密码是否正确
            if (originalPasswordMd5.equals(adminUser.getLoginPassword())) {
                //设置新密码并修改
                adminUser.setLoginPassword(newPasswordMd5);
                if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                    //修改成功则返回true
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Boolean updateName(Integer loginUserId, String loginUserName, String nickName) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        //当前用户非空才可以进行更改
        if (adminUser != null) {
            //设置新密码并修改
            adminUser.setLoginUserName(loginUserName);
            adminUser.setNickName(nickName);
            if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                //修改成功则返回true
                return true;
            }
        }
        return false;
    }
}
