package com.ssm.entity;

public class Month {
    private Integer id;

    private String month;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    @Override
    public String toString() {
        return "Month{" +
                "id=" + id +
                ", month='" + month + '\'' +
                '}';
    }
}