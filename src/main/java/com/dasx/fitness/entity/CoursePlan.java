package com.dasx.fitness.entity;

import java.util.Date;

public class CoursePlan {
    private Integer coursePlanId;

    private Integer courseId;

    private Date startTime;

    private Date endTime;

    private Date effectTime;

    private Integer stock;

    private Date createTime;

    private Byte isDelete;

    public Integer getCoursePlanId() {
        return coursePlanId;
    }

    public void setCoursePlanId(Integer coursePlanId) {
        this.coursePlanId = coursePlanId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}