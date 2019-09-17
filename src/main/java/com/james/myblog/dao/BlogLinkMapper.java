package com.james.myblog.dao;

import com.james.myblog.entity.BlogLink;
import com.james.myblog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 07 11:45
 */
@Mapper
public interface BlogLinkMapper {

    /**
     * 使用主键删除
     * @param linkId
     * @return
     */
    int deleteByPrimaryKey(Integer linkId);

    int insert(BlogLink record);

    int insertSelective(BlogLink record);

    BlogLink selectByPrimaryKey(Integer linkId);

    int updateByPrimaryKeySelective(BlogLink record);

    int updateByPrimaryKey(BlogLink record);

    List<BlogLink> findLinkList(PageQueryUtil pageUtil);

    int getTotalLinks(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);
}
