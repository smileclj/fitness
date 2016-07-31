package com.dasx.fitness.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CoachComment {
    private Integer coachCommentId;

    private Integer coachId;

    private Integer userId;

    private BigDecimal star;

    private String content;

    private Date createTime;

    public Integer getCoachCommentId() {
        return coachCommentId;
    }

    public void setCoachCommentId(Integer coachCommentId) {
        this.coachCommentId = coachCommentId;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
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