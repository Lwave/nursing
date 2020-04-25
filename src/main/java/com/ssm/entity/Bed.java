package com.ssm.entity;

public class Bed {
    private Integer id;

    private Integer uid;

    private Integer dormid;

    private String describle;

    private Double price;

    private Integer status;

    private String statusStr;

    private String icon;

    private User user;

    private Dormitory dormitory;

    public Bed() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Dormitory getDormitory() {
        return dormitory;
    }

    public void setDormitory(Dormitory dormitory) {
        this.dormitory = dormitory;
    }

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

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getStatusStr() {
        if (status != null) {
            if (status == 0) {
                statusStr = "未入住";
            }
            if (status == 1) {
                statusStr = "已入住";
            }
            if (status == 2) {
                statusStr = "预定";
            }
        }
        return statusStr;
    }

    public void setStatusStr(String statusStr) {

        this.statusStr = statusStr;
    }


    @Override
    public String toString() {
        return "Bed{" +
                "id=" + id +
                ", uid=" + uid +
                ", dormid=" + dormid +
                ", describle='" + describle + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", statusStr='" + statusStr + '\'' +
                ", icon='" + icon + '\'' +
                ", user=" + user +
                ", dormitory=" + dormitory +
                '}';
    }

}