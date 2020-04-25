package com.ssm.entity;

import com.ssm.util.DateUtils;

import java.util.Date;

public class Cost {
    private Integer id;

    private Integer bid;

    private Integer uid;

    private Date costdate;


    private String costdateStr;

    private Double eaxmcost;

    private Double foodcost;

    private Double linecost;

    private Integer orderstatus;

    private String orderstatusStr;

    private User user;

    private Bed bed;

    public String getCostdateStr() {
        if (costdate != null) {
            costdateStr = DateUtils.dateString1(costdate, "yyyy-MM-dd HH:mm");
        }
        return costdateStr;
    }

    public String getOrderstatusStr() {
        if (orderstatus != null) {
            if (orderstatus == 0) {
                orderstatusStr = "未支付";
            }

            if (orderstatus == 1) {
                orderstatusStr = "已支付";
            }
            if (orderstatus == 2) {
                orderstatusStr = "交了押金";
            }
        }
        return orderstatusStr;
    }

    public void setOrderstatusStr(String orderstatusStr) {

        this.orderstatusStr = orderstatusStr;
    }

    public void setCostdateStr(String costdateStr) {
        this.costdateStr = costdateStr;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCostdate() {
        return costdate;
    }

    public void setCostdate(Date costdate) {
        this.costdate = costdate;
    }

    public Double getEaxmcost() {
        return eaxmcost;
    }

    public void setEaxmcost(Double eaxmcost) {
        this.eaxmcost = eaxmcost;
    }

    public Double getFoodcost() {
        return foodcost;
    }

    public void setFoodcost(Double foodcost) {
        this.foodcost = foodcost;
    }

    public Double getLinecost() {
        return linecost;
    }

    public void setLinecost(Double linecost) {
        this.linecost = linecost;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "id=" + id +
                ", bid=" + bid +
                ", uid=" + uid +
                ", costdate=" + costdate +
                ", costdateStr='" + costdateStr + '\'' +
                ", eaxmcost=" + eaxmcost +
                ", foodcost=" + foodcost +
                ", linecost=" + linecost +
                ", orderstatus=" + orderstatus +
                ", orderstatusStr='" + orderstatusStr + '\'' +
                ", user=" + user +
                ", bed=" + bed +
                '}';
    }
}