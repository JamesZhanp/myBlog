package com.james.myblog.dao;

import com.james.myblog.entity.BlogConfig;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 07 11:43
 */
public interface BlogConfigMapper {

    /**
     * 查询所有的Blog Config的内容
     * @return
     */
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);
}
