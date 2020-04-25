package com.ssm.entity;

import java.util.Date;

public class Living {
    private Integer id;

    private Integer uid;

    private Integer dormid;

    private String relativeman;

    private String relativetel;

    private Date livingdate;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getDormid() {
        return dormid;
    }

    public void setDormid(Integer dormid) {
        this.dormid = dormid;
    }

    public String getRelativeman() {
        return relativeman;
    }

    public void setRelativeman(String relativeman) {
        this.relativeman = relativeman == null ? null : relativeman.trim();
    }

    public String getRelativetel() {
        return relativetel;
    }

    public void setRelativetel(String relativetel) {
        this.relativetel = relativetel == null ? null : relativetel.trim();
    }

    public Date getLivingdate() {
        return livingdate;
    }

    public void setLivingdate(Date livingdate) {
        this.livingdate = livingdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}