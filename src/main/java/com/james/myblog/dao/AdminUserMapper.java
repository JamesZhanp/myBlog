package com.james.myblog.dao;

import com.james.myblog.enity.AdminUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 02 23:58
 */

@Mapper
public interface AdminUserMapper {
    /**
     * 插入实体类 AdminUser
     * @param record
     * @return
     */
    int insert(AdminUser record);

    /**
     * 登录方法
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    /**
     * 使用id查询用户
     * @param adminUserId
     * @return
     */
    AdminUser selectByPrimaryKey(Integer adminUserId);

    /**
     * 更新所选的用户信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(AdminUser record);

    /**
     * 更新用户信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(AdminUser record);
}
