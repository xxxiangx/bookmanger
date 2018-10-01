package com.po;

import java.util.Date;

public class Readertype {
    private Integer id;

    private String typename;

    private Integer maxborrownum;

    private Integer limit;

    private Date addtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getMaxborrownum() {
        return maxborrownum;
    }

    public void setMaxborrownum(Integer maxborrownum) {
        this.maxborrownum = maxborrownum;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}