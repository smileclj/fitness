package com.dasx.fitness.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(String value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(String value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(String value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(String value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(String value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLike(String value) {
            addCriterion("union_id like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotLike(String value) {
            addCriterion("union_id not like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<String> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<String> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(String value1, String value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(String value1, String value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdIsNull() {
            addCriterion("regular_store_id is null");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdIsNotNull() {
            addCriterion("regular_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdEqualTo(Integer value) {
            addCriterion("regular_store_id =", value, "regularStoreId");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdNotEqualTo(Integer value) {
            addCriterion("regular_store_id <>", value, "regularStoreId");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdGreaterThan(Integer value) {
            addCriterion("regular_store_id >", value, "regularStoreId");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("regular_store_id >=", value, "regularStoreId");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdLessThan(Integer value) {
            addCriterion("regular_store_id <", value, "regularStoreId");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("regular_store_id <=", value, "regularStoreId");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdIn(List<Integer> values) {
            addCriterion("regular_store_id in", values, "regularStoreId");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdNotIn(List<Integer> values) {
            addCriterion("regular_store_id not in", values, "regularStoreId");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("regular_store_id between", value1, value2, "regularStoreId");
            return (Criteria) this;
        }

        public Criteria andRegularStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("regular_store_id not between", value1, value2, "regularStoreId");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartIsNull() {
            addCriterion("common_time_start is null");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartIsNotNull() {
            addCriterion("common_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartEqualTo(Date value) {
            addCriterion("common_time_start =", value, "commonTimeStart");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartNotEqualTo(Date value) {
            addCriterion("common_time_start <>", value, "commonTimeStart");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartGreaterThan(Date value) {
            addCriterion("common_time_start >", value, "commonTimeStart");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("common_time_start >=", value, "commonTimeStart");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartLessThan(Date value) {
            addCriterion("common_time_start <", value, "commonTimeStart");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("common_time_start <=", value, "commonTimeStart");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartIn(List<Date> values) {
            addCriterion("common_time_start in", values, "commonTimeStart");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartNotIn(List<Date> values) {
            addCriterion("common_time_start not in", values, "commonTimeStart");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartBetween(Date value1, Date value2) {
            addCriterion("common_time_start between", value1, value2, "commonTimeStart");
            return (Criteria) this;
        }

        public Criteria andCommonTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("common_time_start not between", value1, value2, "commonTimeStart");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndIsNull() {
            addCriterion("common_time_end is null");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndIsNotNull() {
            addCriterion("common_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndEqualTo(Date value) {
            addCriterion("common_time_end =", value, "commonTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndNotEqualTo(Date value) {
            addCriterion("common_time_end <>", value, "commonTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndGreaterThan(Date value) {
            addCriterion("common_time_end >", value, "commonTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("common_time_end >=", value, "commonTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndLessThan(Date value) {
            addCriterion("common_time_end <", value, "commonTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("common_time_end <=", value, "commonTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndIn(List<Date> values) {
            addCriterion("common_time_end in", values, "commonTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndNotIn(List<Date> values) {
            addCriterion("common_time_end not in", values, "commonTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndBetween(Date value1, Date value2) {
            addCriterion("common_time_end between", value1, value2, "commonTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCommonTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("common_time_end not between", value1, value2, "commonTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCommonNumIsNull() {
            addCriterion("common_num is null");
            return (Criteria) this;
        }

        public Criteria andCommonNumIsNotNull() {
            addCriterion("common_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommonNumEqualTo(Integer value) {
            addCriterion("common_num =", value, "commonNum");
            return (Criteria) this;
        }

        public Criteria andCommonNumNotEqualTo(Integer value) {
            addCriterion("common_num <>", value, "commonNum");
            return (Criteria) this;
        }

        public Criteria andCommonNumGreaterThan(Integer value) {
            addCriterion("common_num >", value, "commonNum");
            return (Criteria) this;
        }

        public Criteria andCommonNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("common_num >=", value, "commonNum");
            return (Criteria) this;
        }

        public Criteria andCommonNumLessThan(Integer value) {
            addCriterion("common_num <", value, "commonNum");
            return (Criteria) this;
        }

        public Criteria andCommonNumLessThanOrEqualTo(Integer value) {
            addCriterion("common_num <=", value, "commonNum");
            return (Criteria) this;
        }

        public Criteria andCommonNumIn(List<Integer> values) {
            addCriterion("common_num in", values, "commonNum");
            return (Criteria) this;
        }

        public Criteria andCommonNumNotIn(List<Integer> values) {
            addCriterion("common_num not in", values, "commonNum");
            return (Criteria) this;
        }

        public Criteria andCommonNumBetween(Integer value1, Integer value2) {
            addCriterion("common_num between", value1, value2, "commonNum");
            return (Criteria) this;
        }

        public Criteria andCommonNumNotBetween(Integer value1, Integer value2) {
            addCriterion("common_num not between", value1, value2, "commonNum");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartIsNull() {
            addCriterion("crossfit_time_start is null");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartIsNotNull() {
            addCriterion("crossfit_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartEqualTo(Date value) {
            addCriterion("crossfit_time_start =", value, "crossfitTimeStart");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartNotEqualTo(Date value) {
            addCriterion("crossfit_time_start <>", value, "crossfitTimeStart");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartGreaterThan(Date value) {
            addCriterion("crossfit_time_start >", value, "crossfitTimeStart");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("crossfit_time_start >=", value, "crossfitTimeStart");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartLessThan(Date value) {
            addCriterion("crossfit_time_start <", value, "crossfitTimeStart");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("crossfit_time_start <=", value, "crossfitTimeStart");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartIn(List<Date> values) {
            addCriterion("crossfit_time_start in", values, "crossfitTimeStart");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartNotIn(List<Date> values) {
            addCriterion("crossfit_time_start not in", values, "crossfitTimeStart");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartBetween(Date value1, Date value2) {
            addCriterion("crossfit_time_start between", value1, value2, "crossfitTimeStart");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("crossfit_time_start not between", value1, value2, "crossfitTimeStart");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndIsNull() {
            addCriterion("crossfit_time_end is null");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndIsNotNull() {
            addCriterion("crossfit_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndEqualTo(Date value) {
            addCriterion("crossfit_time_end =", value, "crossfitTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndNotEqualTo(Date value) {
            addCriterion("crossfit_time_end <>", value, "crossfitTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndGreaterThan(Date value) {
            addCriterion("crossfit_time_end >", value, "crossfitTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("crossfit_time_end >=", value, "crossfitTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndLessThan(Date value) {
            addCriterion("crossfit_time_end <", value, "crossfitTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("crossfit_time_end <=", value, "crossfitTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndIn(List<Date> values) {
            addCriterion("crossfit_time_end in", values, "crossfitTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndNotIn(List<Date> values) {
            addCriterion("crossfit_time_end not in", values, "crossfitTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndBetween(Date value1, Date value2) {
            addCriterion("crossfit_time_end between", value1, value2, "crossfitTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCrossfitTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("crossfit_time_end not between", value1, value2, "crossfitTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumIsNull() {
            addCriterion("crossfit_num is null");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumIsNotNull() {
            addCriterion("crossfit_num is not null");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumEqualTo(Integer value) {
            addCriterion("crossfit_num =", value, "crossfitNum");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumNotEqualTo(Integer value) {
            addCriterion("crossfit_num <>", value, "crossfitNum");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumGreaterThan(Integer value) {
            addCriterion("crossfit_num >", value, "crossfitNum");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("crossfit_num >=", value, "crossfitNum");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumLessThan(Integer value) {
            addCriterion("crossfit_num <", value, "crossfitNum");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumLessThanOrEqualTo(Integer value) {
            addCriterion("crossfit_num <=", value, "crossfitNum");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumIn(List<Integer> values) {
            addCriterion("crossfit_num in", values, "crossfitNum");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumNotIn(List<Integer> values) {
            addCriterion("crossfit_num not in", values, "crossfitNum");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumBetween(Integer value1, Integer value2) {
            addCriterion("crossfit_num between", value1, value2, "crossfitNum");
            return (Criteria) this;
        }

        public Criteria andCrossfitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("crossfit_num not between", value1, value2, "crossfitNum");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}