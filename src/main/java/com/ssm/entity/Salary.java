package com.ssm.entity;

public class Salary {
    private Integer id;

    private Integer uid;

    private Double performance;

    private Double factsalary;

    private String deductsituation;

    private Double deductsalary;

    private Integer mid;

    private Month month;

    private User user;

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Double getPerformance() {
        return performance;
    }

    public void setPerformance(Double performance) {
        this.performance = performance;
    }

    public Double getFactsalary() {
        return factsalary;
    }

    public void setFactsalary(Double factsalary) {
        this.factsalary = factsalary;
    }

    public String getDeductsituation() {
        return deductsituation;
    }

    public void setDeductsituation(String deductsituation) {
        this.deductsituation = deductsituation == null ? null : deductsituation.trim();
    }

    public Double getDeductsalary() {
        return deductsalary;
    }

    public void setDeductsalary(Double deductsalary) {
        this.deductsalary = deductsalary;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", uid=" + uid +
                ", performance=" + performance +
                ", factsalary=" + factsalary +
                ", deductsituation='" + deductsituation + '\'' +
                ", deductsalary=" + deductsalary +
                ", mid=" + mid +
                ", month=" + month +
                ", user=" + user +
                '}';
    }
}