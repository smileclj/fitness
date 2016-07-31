package com.dasx.fitness.entity;

import java.util.Date;

public class CardRecord {
    private Integer cardRecordId;

    private Integer userId;

    private Integer cardId;

    private Integer storeId;

    private Date createTime;

    public Integer getCardRecordId() {
        return cardRecordId;
    }

    public void setCardRecordId(Integer cardRecordId) {
        this.cardRecordId = cardRecordId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}