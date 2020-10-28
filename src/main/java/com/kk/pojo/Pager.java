package com.kk.pojo;
/**
 *作者: 柯神_
 *时间: 21:55
 *日期: 2020/10/24
 *User: 蜘蛛啊全是腿儿
**/

import java.util.List;

public class Pager<T> {
    private Integer startPage;
    private Integer pageSize;
    private List<T> list;
    private long total;

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
