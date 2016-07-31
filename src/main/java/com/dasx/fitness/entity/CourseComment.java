package com.dasx.fitness.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CourseComment {
    private Integer courseCommentId;

    private Integer courseId;

    private Integer userId;

    private BigDecimal star;

    private Byte trainFeel;

    private String content;

    private Date createTime;

    public Integer getCourseCommentId() {
        return courseCommentId;
    }

    public void setCourseCommentId(Integer courseCommentId) {
        this.courseCommentId = courseCommentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getStar() {
        return star;
    }

    public void setStar(BigDecimal star) {
        this.star = star;
    }

    public Byte getTrainFeel() {
        return trainFeel;
    }

    public void setTrainFeel(Byte trainFeel) {
        this.trainFeel = trainFeel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}