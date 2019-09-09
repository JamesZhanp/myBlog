package com.james.myblog.service;

import com.james.myblog.entity.BlogTagCount;
import com.james.myblog.util.PageQueryUtil;
import com.james.myblog.util.PageResult;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 07 16:36
 */
public interface TagService {
    /**
     * 查询标签的分页数据
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    /**
     * 获取所有的tags
     * @return
     */
    int getTotalTags();

    /**
     * 保存tags
     * @param tagName
     * @return
     */

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
