package com.dasx.fitness.entity;

import java.util.Date;

public class UserCoursePlan {
	public static final Integer STATE_CAN_QUEUE=4;//可排队
	public static final Integer STATE_CAN_ORDER=3;//可预约
	public static final Integer STATE_ORDER=2;
	public static final Integer STATE_QUEUE=1;
	public static final Integer STATE_CANCLE=0;
	public static final Integer STATE_LIMIT=-1;
	
    private Integer id;

    private Integer userId;

    private Integer coursePlanId;

    private Date createTime;

    private Integer state;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCoursePlanId() {
        return coursePlanId;
    }

    public void setCoursePlanId(Integer coursePlanId) {
        this.coursePlanId = coursePlanId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}