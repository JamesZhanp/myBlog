package com.james.myblog.dao;

import com.james.myblog.entity.BlogTag;
import com.james.myblog.entity.BlogTagCount;
import com.james.myblog.util.PageQueryUtil;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 07 11:50
 */
public interface BlogTagMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(BlogTag record);

    int insertSelective(BlogTag record);

    BlogTag selectByPrimaryKey(Integer tagId);

    BlogTag selectByTagName(String tagName);

    int updateByPrimaryKeySelective(BlogTag record);

    int updateByPrimaryKey(BlogTag record);

    List<BlogTag> findTagList(PageQueryUtil pageUtil);

    List<BlogTagCount> getTagCount();

    int getTotalTags(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);

    int batchInsertBlogTag(List<BlogTag> tagList);
}
