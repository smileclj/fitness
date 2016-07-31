package com.dasx.fitness.entity;

import java.util.Date;

public class User {
    private Integer userId;

    private String openId;

    private String unionId;

    private String userName;

    private Byte sex;

    private String phone;

    private String city;

    private String province;

    private String country;

    private String icon;

    private Byte type;

    private Byte state;

    private Integer regularStoreId;

    private Date commonTimeStart;

    private Date commonTimeEnd;

    private Integer commonNum;

    private Date crossfitTimeStart;

    private Date crossfitTimeEnd;

    private Integer crossfitNum;

    private Date loginTime;

    private Date createTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Integer getRegularStoreId() {
        return regularStoreId;
    }

    public void setRegularStoreId(Integer regularStoreId) {
        this.regularStoreId = regularStoreId;
    }

    public Date getCommonTimeStart() {
        return commonTimeStart;
    }

    public void setCommonTimeStart(Date commonTimeStart) {
        this.commonTimeStart = commonTimeStart;
    }

    public Date getCommonTimeEnd() {
        return commonTimeEnd;
    }

    public void setCommonTimeEnd(Date commonTimeEnd) {
        this.commonTimeEnd = commonTimeEnd;
    }

    public Integer getCommonNum() {
        return commonNum;
    }

    public void setCommonNum(Integer commonNum) {
        this.commonNum = commonNum;
    }

    public Date getCrossfitTimeStart() {
        return crossfitTimeStart;
    }

    public void setCrossfitTimeStart(Date crossfitTimeStart) {
        this.crossfitTimeStart = crossfitTimeStart;
    }

    public Date getCrossfitTimeEnd() {
        return crossfitTimeEnd;
    }

    public void setCrossfitTimeEnd(Date crossfitTimeEnd) {
        this.crossfitTimeEnd = crossfitTimeEnd;
    }

    public Integer getCrossfitNum() {
        return crossfitNum;
    }

    public void setCrossfitNum(Integer crossfitNum) {
        this.crossfitNum = crossfitNum;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}