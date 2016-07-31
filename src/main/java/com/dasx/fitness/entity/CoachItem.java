package com.dasx.fitness.entity;

public class CoachItem {
    private Integer coachItemId;

    private String name;

    private String remark;

    private Integer price;

    public Integer getCoachItemId() {
        return coachItemId;
    }

    public void setCoachItemId(Integer coachItemId) {
        this.coachItemId = coachItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}