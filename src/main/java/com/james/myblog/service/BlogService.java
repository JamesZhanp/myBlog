package com.james.myblog.service;

import com.james.myblog.controller.vo.BlogDetailVO;
import com.james.myblog.controller.vo.SimpleBlogListVO;
import com.james.myblog.entity.Blog;
import com.james.myblog.util.PageQueryUtil;
import com.james.myblog.util.PageResult;

import java.util.List;

/**
 * 博客的Service内容
 * @author: JamesZhan
 * @create: 2019 - 09 - 07 11:56
 */
public interface BlogService {
    /**
     * 保存博客
     * @param blog
     * @return
     */
    String saveBlog(Blog blog);

    /**
     * 获取分页内容
     * @param pageQueryUtil
     * @return
     */
    PageResult getBlogsPage(PageQueryUtil pageQueryUtil);

    int getTotalBlogs();

    /**
     * 删除博客
     * @param ids
     * @return
     */
    Boolean deleteBatch(Integer[] ids);

    /**
     * 根据id获取详情
     *
     * @param blogId
     * @return
     */
    Blog getBlogById(Long blogId);

    /**
     * 后台修改
     *
     * @param blog
     * @return
     */
    String updateBlog(Blog blog);

    /**
     * 获取首页文章列表
     *
     * @param page
     * @return
     */
    PageResult getBlogsForIndexPage(int page);


    /**
     * 首页侧边栏数据列表
     * 0-点击最多 1-最新发布
     *
     * @param type
     * @return
     */
    List<SimpleBlogListVO> getBlogListForIndexPage(int type);
    /**
     * 文章详情
     *
     * @param blogId
     * @return
     */
    BlogDetailVO getBlogDetail(Long blogId);

    /**
     * 根据标签获取文章列表
     *
     * @param tagName
     * @param page
     * @return
     */
    PageResult getBlogsPageByTag(String tagName, int page);

    /**
     * 根据分类获取文章列表
     *
     * @param categoryId
     * @param page
     * @return
     */
    PageResult getBlogsPageByCategory(String categoryId, int page);

    /**
     * 根据搜索获取文章列表
     *
     * @param keyword
     * @param page
     * @return
     */
    PageResult getBlogsPageBySearch(String keyword, int page);

    BlogDetailVO getBlogDetailBySubUrl(String subUrl);
}
