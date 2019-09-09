package com.james.myblog.service;

import com.james.myblog.entity.BlogCategory;
import com.james.myblog.util.PageQueryUtil;
import com.james.myblog.util.PageResult;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2019 - 09 - 07 16:23
 */
public interface CategoryService {

    /**
     * 查询分类的数据页
     * @param queryUtil
     * @return
     */
    PageResult getBlogCategoryPage(PageQueryUtil queryUtil);

    /**
     * 获取所有的类别
     * @return
     */
    int getTotalCategories();

    /**
     * 保存新的类别
     * @param categoryName
     * @param categoryIcon
     * @return
     */
    Boolean saveCategory(String categoryName, String categoryIcon);

    /**
     * 更新类别的信息
     * @param categoryId
     * @param categoryName
     * @param categoryIcon
     * @return
     */
    Boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    Boolean deleteBatch(Integer[] ids);

    List<BlogCategory> getAllCategories();
}
