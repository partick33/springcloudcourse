package com.partick.springcloudcourse.server.dto;

import java.util.List;

/**
 * @author partick_peng
 */
public class PageDTO<T>{
    /**
     * 页码
     */
    private Integer page;
    /**
     * 分页数量
     */
    private Integer size;
    /**
     * 记录总数
     */
    private Integer total;
    /**
     * 返回列表
     */
    private List<T> list;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
