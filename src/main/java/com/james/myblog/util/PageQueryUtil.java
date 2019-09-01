package com.james.myblog.util;

import java.util.LinkedHashMap;

/**
 * 分页工具类
 *
 * @author: JamesZhan
 * @create: 2019 - 09 - 01 23:51
 */
public class PageQueryUtil extends LinkedHashMap<String, Object> {
    /**
     * 当前页码
     */
    private int page;


    /**
     * 每页条数
     */

    private int limit;

    public PageQueryUtil(LinkedHashMap<String, Object> params) {
        this.page = Integer.parseInt(params.get("page").toString());
        this.limit = Integer.parseInt(params.get("limit").toString());
        this.put("start", (page - 1) * limit);
        this.put("page", page);
        this.put("limit", limit);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "PageUtil{" +
                "page=" + page +
                ", limit=" + limit +
                '}';
    }

}
