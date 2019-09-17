package com.james.myblog.dao;

import com.james.myblog.entity.BlogComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 07 11:41
 */
@Mapper
public interface BlogCommentMapper {
    /**
     * 使用主键删除
     * @param commentId
     * @return
     */
    int deleteByPrimaryKey(Long commentId);

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(BlogComment record);

    int insertSelective(BlogComment record);

    BlogComment selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(BlogComment record);

    int updateByPrimaryKey(BlogComment record);

    /**
     * 批量查询
     * @param map
     * @return
     */
    List<BlogComment> findBlogCommentList(Map map);

    int getTotalBlogComments(Map map);

    int checkDone(Integer[] ids);

    int deleteBatch(Integer[] ids);
}
