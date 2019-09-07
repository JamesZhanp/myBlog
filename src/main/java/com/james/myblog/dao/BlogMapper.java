package com.james.myblog.dao;

import com.james.myblog.entity.Blog;
import com.james.myblog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 07 11:46
 */
public interface BlogMapper {
    int deleteByPrimaryKey(Long blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Long blogId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBlog(Blog record);

    int updateByPrimaryKey(Blog record);

    List<Blog> findBlogList(PageQueryUtil pageUtil);

    /**
     * 使用type寻找范围内的Blog
     * @param type
     * @param limit
     * @return
     */
    List<Blog> findBlogListByType(@Param("type") int type, @Param("limit") int limit);

    int getTotalBlogs(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);

    List<Blog> getBlogsPageByTagId(PageQueryUtil pageUtil);

    int getTotalBlogsByTagId(PageQueryUtil pageUtil);

    Blog selectBySubUrl(String subUrl);

    int updateBlogCategorys(@Param("categoryName") String categoryName, @Param("categoryId") Integer categoryId, @Param("ids")Integer[] ids);

}
