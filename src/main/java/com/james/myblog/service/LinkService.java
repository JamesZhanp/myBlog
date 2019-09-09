package com.james.myblog.service;

import com.james.myblog.entity.BlogLink;
import com.james.myblog.util.PageQueryUtil;
import com.james.myblog.util.PageResult;

import java.util.List;
import java.util.Map;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 07 16:31
 */
public interface LinkService {
    /**
     * 查询友链的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    int getTotalLinks();

    /**
     * 保存link
     * @param link
     * @return
     */
    Boolean saveLink(BlogLink link);

    /**
     * 用id查询
     * @param id
     * @return
     */
    BlogLink selectById(Integer id);

    /**
     * 更新link的信息
     * @param tempLink
     * @return
     */
    Boolean updateLink(BlogLink tempLink);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回友链页面所需的所有数据
     *
     * @return
     */
    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
