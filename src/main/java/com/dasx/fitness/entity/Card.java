package com.dasx.fitness.entity;

import java.math.BigDecimal;

public class Card {
    private Integer cardId;

    private String cardName;

    private String logo;

    private String remark;

    private BigDecimal price;

    private Byte billMethod;

    private Integer billNumber;

    private Byte type;

    private Byte idDelete;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getBillMethod() {
        return billMethod;
    }

    public void setBillMethod(Byte billMethod) {
        this.billMethod = billMethod;
    }

    public Integer getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(Integer billNumber) {
        this.billNumber = billNumber;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(Byte idDelete) {
        this.idDelete = idDelete;
    }
}