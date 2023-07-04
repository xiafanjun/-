package com.neuedu.kjds.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaoSalesOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaoSalesOrderExample() {
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

        public Criteria andSaoIdIsNull() {
            addCriterion("SAO_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaoIdIsNotNull() {
            addCriterion("SAO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaoIdEqualTo(Integer value) {
            addCriterion("SAO_ID =", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdNotEqualTo(Integer value) {
            addCriterion("SAO_ID <>", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdGreaterThan(Integer value) {
            addCriterion("SAO_ID >", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAO_ID >=", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdLessThan(Integer value) {
            addCriterion("SAO_ID <", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdLessThanOrEqualTo(Integer value) {
            addCriterion("SAO_ID <=", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdIn(List<Integer> values) {
            addCriterion("SAO_ID in", values, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdNotIn(List<Integer> values) {
            addCriterion("SAO_ID not in", values, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdBetween(Integer value1, Integer value2) {
            addCriterion("SAO_ID between", value1, value2, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SAO_ID not between", value1, value2, "saoId");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("CREATION_DATE =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("CREATION_DATE in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("CREATION_DATE not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNull() {
            addCriterion("LAST_UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNotNull() {
            addCriterion("LAST_UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLike(String value) {
            addCriterion("LAST_UPDATE_BY like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotLike(String value) {
            addCriterion("LAST_UPDATE_BY not like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY not between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCallCntIsNull() {
            addCriterion("CALL_CNT is null");
            return (Criteria) this;
        }

        public Criteria andCallCntIsNotNull() {
            addCriterion("CALL_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andCallCntEqualTo(Integer value) {
            addCriterion("CALL_CNT =", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(Integer value) {
            addCriterion("CALL_CNT <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(Integer value) {
            addCriterion("CALL_CNT >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(Integer value) {
            addCriterion("CALL_CNT <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntIn(List<Integer> values) {
            addCriterion("CALL_CNT in", values, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotIn(List<Integer> values) {
            addCriterion("CALL_CNT not in", values, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntBetween(Integer value1, Integer value2) {
            addCriterion("CALL_CNT between", value1, value2, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotBetween(Integer value1, Integer value2) {
            addCriterion("CALL_CNT not between", value1, value2, "callCnt");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStsCdIsNull() {
            addCriterion("STS_CD is null");
            return (Criteria) this;
        }

        public Criteria andStsCdIsNotNull() {
            addCriterion("STS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andStsCdEqualTo(String value) {
            addCriterion("STS_CD =", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualTo(String value) {
            addCriterion("STS_CD <>", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThan(String value) {
            addCriterion("STS_CD >", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("STS_CD >=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThan(String value) {
            addCriterion("STS_CD <", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualTo(String value) {
            addCriterion("STS_CD <=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLike(String value) {
            addCriterion("STS_CD like", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotLike(String value) {
            addCriterion("STS_CD not like", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdIn(List<String> values) {
            addCriterion("STS_CD in", values, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotIn(List<String> values) {
            addCriterion("STS_CD not in", values, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdBetween(String value1, String value2) {
            addCriterion("STS_CD between", value1, value2, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotBetween(String value1, String value2) {
            addCriterion("STS_CD not between", value1, value2, "stsCd");
            return (Criteria) this;
        }

        public Criteria andManIdIsNull() {
            addCriterion("MAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andManIdIsNotNull() {
            addCriterion("MAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManIdEqualTo(Integer value) {
            addCriterion("MAN_ID =", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualTo(Integer value) {
            addCriterion("MAN_ID <>", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThan(Integer value) {
            addCriterion("MAN_ID >", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAN_ID >=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThan(Integer value) {
            addCriterion("MAN_ID <", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualTo(Integer value) {
            addCriterion("MAN_ID <=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdIn(List<Integer> values) {
            addCriterion("MAN_ID in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotIn(List<Integer> values) {
            addCriterion("MAN_ID not in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdBetween(Integer value1, Integer value2) {
            addCriterion("MAN_ID between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MAN_ID not between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andWarIdIsNull() {
            addCriterion("WAR_ID is null");
            return (Criteria) this;
        }

        public Criteria andWarIdIsNotNull() {
            addCriterion("WAR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWarIdEqualTo(Integer value) {
            addCriterion("WAR_ID =", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdNotEqualTo(Integer value) {
            addCriterion("WAR_ID <>", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdGreaterThan(Integer value) {
            addCriterion("WAR_ID >", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WAR_ID >=", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdLessThan(Integer value) {
            addCriterion("WAR_ID <", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdLessThanOrEqualTo(Integer value) {
            addCriterion("WAR_ID <=", value, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdIn(List<Integer> values) {
            addCriterion("WAR_ID in", values, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdNotIn(List<Integer> values) {
            addCriterion("WAR_ID not in", values, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdBetween(Integer value1, Integer value2) {
            addCriterion("WAR_ID between", value1, value2, "warId");
            return (Criteria) this;
        }

        public Criteria andWarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WAR_ID not between", value1, value2, "warId");
            return (Criteria) this;
        }

        public Criteria andSyncDateIsNull() {
            addCriterion("SYNC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSyncDateIsNotNull() {
            addCriterion("SYNC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSyncDateEqualTo(Date value) {
            addCriterion("SYNC_DATE =", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateNotEqualTo(Date value) {
            addCriterion("SYNC_DATE <>", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateGreaterThan(Date value) {
            addCriterion("SYNC_DATE >", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SYNC_DATE >=", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateLessThan(Date value) {
            addCriterion("SYNC_DATE <", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateLessThanOrEqualTo(Date value) {
            addCriterion("SYNC_DATE <=", value, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateIn(List<Date> values) {
            addCriterion("SYNC_DATE in", values, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateNotIn(List<Date> values) {
            addCriterion("SYNC_DATE not in", values, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateBetween(Date value1, Date value2) {
            addCriterion("SYNC_DATE between", value1, value2, "syncDate");
            return (Criteria) this;
        }

        public Criteria andSyncDateNotBetween(Date value1, Date value2) {
            addCriterion("SYNC_DATE not between", value1, value2, "syncDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNull() {
            addCriterion("PAYMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("PAYMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(Date value) {
            addCriterion("PAYMENT_DATE =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(Date value) {
            addCriterion("PAYMENT_DATE <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(Date value) {
            addCriterion("PAYMENT_DATE >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYMENT_DATE >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(Date value) {
            addCriterion("PAYMENT_DATE <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("PAYMENT_DATE <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<Date> values) {
            addCriterion("PAYMENT_DATE in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<Date> values) {
            addCriterion("PAYMENT_DATE not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(Date value1, Date value2) {
            addCriterion("PAYMENT_DATE between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("PAYMENT_DATE not between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPushDateIsNull() {
            addCriterion("PUSH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPushDateIsNotNull() {
            addCriterion("PUSH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPushDateEqualTo(Date value) {
            addCriterion("PUSH_DATE =", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateNotEqualTo(Date value) {
            addCriterion("PUSH_DATE <>", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateGreaterThan(Date value) {
            addCriterion("PUSH_DATE >", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PUSH_DATE >=", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateLessThan(Date value) {
            addCriterion("PUSH_DATE <", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateLessThanOrEqualTo(Date value) {
            addCriterion("PUSH_DATE <=", value, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateIn(List<Date> values) {
            addCriterion("PUSH_DATE in", values, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateNotIn(List<Date> values) {
            addCriterion("PUSH_DATE not in", values, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateBetween(Date value1, Date value2) {
            addCriterion("PUSH_DATE between", value1, value2, "pushDate");
            return (Criteria) this;
        }

        public Criteria andPushDateNotBetween(Date value1, Date value2) {
            addCriterion("PUSH_DATE not between", value1, value2, "pushDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateIsNull() {
            addCriterion("TRACK_NO_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateIsNotNull() {
            addCriterion("TRACK_NO_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateEqualTo(Date value) {
            addCriterion("TRACK_NO_DATE =", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateNotEqualTo(Date value) {
            addCriterion("TRACK_NO_DATE <>", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateGreaterThan(Date value) {
            addCriterion("TRACK_NO_DATE >", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRACK_NO_DATE >=", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateLessThan(Date value) {
            addCriterion("TRACK_NO_DATE <", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateLessThanOrEqualTo(Date value) {
            addCriterion("TRACK_NO_DATE <=", value, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateIn(List<Date> values) {
            addCriterion("TRACK_NO_DATE in", values, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateNotIn(List<Date> values) {
            addCriterion("TRACK_NO_DATE not in", values, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateBetween(Date value1, Date value2) {
            addCriterion("TRACK_NO_DATE between", value1, value2, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andTrackNoDateNotBetween(Date value1, Date value2) {
            addCriterion("TRACK_NO_DATE not between", value1, value2, "trackNoDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateIsNull() {
            addCriterion("FULFILLMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateIsNotNull() {
            addCriterion("FULFILLMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateEqualTo(Date value) {
            addCriterion("FULFILLMENT_DATE =", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateNotEqualTo(Date value) {
            addCriterion("FULFILLMENT_DATE <>", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateGreaterThan(Date value) {
            addCriterion("FULFILLMENT_DATE >", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FULFILLMENT_DATE >=", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateLessThan(Date value) {
            addCriterion("FULFILLMENT_DATE <", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateLessThanOrEqualTo(Date value) {
            addCriterion("FULFILLMENT_DATE <=", value, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateIn(List<Date> values) {
            addCriterion("FULFILLMENT_DATE in", values, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateNotIn(List<Date> values) {
            addCriterion("FULFILLMENT_DATE not in", values, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateBetween(Date value1, Date value2) {
            addCriterion("FULFILLMENT_DATE between", value1, value2, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andFulfillmentDateNotBetween(Date value1, Date value2) {
            addCriterion("FULFILLMENT_DATE not between", value1, value2, "fulfillmentDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateIsNull() {
            addCriterion("SETTLEMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementDateIsNotNull() {
            addCriterion("SETTLEMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementDateEqualTo(Date value) {
            addCriterion("SETTLEMENT_DATE =", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateNotEqualTo(Date value) {
            addCriterion("SETTLEMENT_DATE <>", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateGreaterThan(Date value) {
            addCriterion("SETTLEMENT_DATE >", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SETTLEMENT_DATE >=", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateLessThan(Date value) {
            addCriterion("SETTLEMENT_DATE <", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateLessThanOrEqualTo(Date value) {
            addCriterion("SETTLEMENT_DATE <=", value, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateIn(List<Date> values) {
            addCriterion("SETTLEMENT_DATE in", values, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateNotIn(List<Date> values) {
            addCriterion("SETTLEMENT_DATE not in", values, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateBetween(Date value1, Date value2) {
            addCriterion("SETTLEMENT_DATE between", value1, value2, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andSettlementDateNotBetween(Date value1, Date value2) {
            addCriterion("SETTLEMENT_DATE not between", value1, value2, "settlementDate");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNull() {
            addCriterion("PRODUCT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNotNull() {
            addCriterion("PRODUCT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProductAmountEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT =", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT <>", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT >", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT >=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThan(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT <", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_AMOUNT <=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_AMOUNT in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_AMOUNT not in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_AMOUNT between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_AMOUNT not between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andFreightCostIsNull() {
            addCriterion("FREIGHT_COST is null");
            return (Criteria) this;
        }

        public Criteria andFreightCostIsNotNull() {
            addCriterion("FREIGHT_COST is not null");
            return (Criteria) this;
        }

        public Criteria andFreightCostEqualTo(BigDecimal value) {
            addCriterion("FREIGHT_COST =", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostNotEqualTo(BigDecimal value) {
            addCriterion("FREIGHT_COST <>", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostGreaterThan(BigDecimal value) {
            addCriterion("FREIGHT_COST >", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FREIGHT_COST >=", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostLessThan(BigDecimal value) {
            addCriterion("FREIGHT_COST <", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FREIGHT_COST <=", value, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostIn(List<BigDecimal> values) {
            addCriterion("FREIGHT_COST in", values, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostNotIn(List<BigDecimal> values) {
            addCriterion("FREIGHT_COST not in", values, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREIGHT_COST between", value1, value2, "freightCost");
            return (Criteria) this;
        }

        public Criteria andFreightCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREIGHT_COST not between", value1, value2, "freightCost");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIsNull() {
            addCriterion("HANDLING_FEE is null");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIsNotNull() {
            addCriterion("HANDLING_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeEqualTo(BigDecimal value) {
            addCriterion("HANDLING_FEE =", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotEqualTo(BigDecimal value) {
            addCriterion("HANDLING_FEE <>", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeGreaterThan(BigDecimal value) {
            addCriterion("HANDLING_FEE >", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLING_FEE >=", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeLessThan(BigDecimal value) {
            addCriterion("HANDLING_FEE <", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLING_FEE <=", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIn(List<BigDecimal> values) {
            addCriterion("HANDLING_FEE in", values, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotIn(List<BigDecimal> values) {
            addCriterion("HANDLING_FEE not in", values, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLING_FEE between", value1, value2, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLING_FEE not between", value1, value2, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkIsNull() {
            addCriterion("CUSTOMER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkIsNotNull() {
            addCriterion("CUSTOMER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkEqualTo(String value) {
            addCriterion("CUSTOMER_REMARK =", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotEqualTo(String value) {
            addCriterion("CUSTOMER_REMARK <>", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkGreaterThan(String value) {
            addCriterion("CUSTOMER_REMARK >", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_REMARK >=", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkLessThan(String value) {
            addCriterion("CUSTOMER_REMARK <", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_REMARK <=", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkLike(String value) {
            addCriterion("CUSTOMER_REMARK like", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotLike(String value) {
            addCriterion("CUSTOMER_REMARK not like", value, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkIn(List<String> values) {
            addCriterion("CUSTOMER_REMARK in", values, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotIn(List<String> values) {
            addCriterion("CUSTOMER_REMARK not in", values, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkBetween(String value1, String value2) {
            addCriterion("CUSTOMER_REMARK between", value1, value2, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarkNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_REMARK not between", value1, value2, "customerRemark");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderStsIsNull() {
            addCriterion("ORDER_STS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStsIsNotNull() {
            addCriterion("ORDER_STS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStsEqualTo(String value) {
            addCriterion("ORDER_STS =", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotEqualTo(String value) {
            addCriterion("ORDER_STS <>", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsGreaterThan(String value) {
            addCriterion("ORDER_STS >", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STS >=", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLessThan(String value) {
            addCriterion("ORDER_STS <", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STS <=", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsLike(String value) {
            addCriterion("ORDER_STS like", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotLike(String value) {
            addCriterion("ORDER_STS not like", value, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsIn(List<String> values) {
            addCriterion("ORDER_STS in", values, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotIn(List<String> values) {
            addCriterion("ORDER_STS not in", values, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsBetween(String value1, String value2) {
            addCriterion("ORDER_STS between", value1, value2, "orderSts");
            return (Criteria) this;
        }

        public Criteria andOrderStsNotBetween(String value1, String value2) {
            addCriterion("ORDER_STS not between", value1, value2, "orderSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsIsNull() {
            addCriterion("REFUND_STS is null");
            return (Criteria) this;
        }

        public Criteria andRefundStsIsNotNull() {
            addCriterion("REFUND_STS is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStsEqualTo(String value) {
            addCriterion("REFUND_STS =", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotEqualTo(String value) {
            addCriterion("REFUND_STS <>", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsGreaterThan(String value) {
            addCriterion("REFUND_STS >", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_STS >=", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsLessThan(String value) {
            addCriterion("REFUND_STS <", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsLessThanOrEqualTo(String value) {
            addCriterion("REFUND_STS <=", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsLike(String value) {
            addCriterion("REFUND_STS like", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotLike(String value) {
            addCriterion("REFUND_STS not like", value, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsIn(List<String> values) {
            addCriterion("REFUND_STS in", values, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotIn(List<String> values) {
            addCriterion("REFUND_STS not in", values, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsBetween(String value1, String value2) {
            addCriterion("REFUND_STS between", value1, value2, "refundSts");
            return (Criteria) this;
        }

        public Criteria andRefundStsNotBetween(String value1, String value2) {
            addCriterion("REFUND_STS not between", value1, value2, "refundSts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsIsNull() {
            addCriterion("DELIVERY_STS is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsIsNotNull() {
            addCriterion("DELIVERY_STS is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsEqualTo(String value) {
            addCriterion("DELIVERY_STS =", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsNotEqualTo(String value) {
            addCriterion("DELIVERY_STS <>", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsGreaterThan(String value) {
            addCriterion("DELIVERY_STS >", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_STS >=", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsLessThan(String value) {
            addCriterion("DELIVERY_STS <", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_STS <=", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsLike(String value) {
            addCriterion("DELIVERY_STS like", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsNotLike(String value) {
            addCriterion("DELIVERY_STS not like", value, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsIn(List<String> values) {
            addCriterion("DELIVERY_STS in", values, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsNotIn(List<String> values) {
            addCriterion("DELIVERY_STS not in", values, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsBetween(String value1, String value2) {
            addCriterion("DELIVERY_STS between", value1, value2, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andDeliveryStsNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_STS not between", value1, value2, "deliverySts");
            return (Criteria) this;
        }

        public Criteria andStoIdIsNull() {
            addCriterion("STO_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoIdIsNotNull() {
            addCriterion("STO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoIdEqualTo(Integer value) {
            addCriterion("STO_ID =", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotEqualTo(Integer value) {
            addCriterion("STO_ID <>", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThan(Integer value) {
            addCriterion("STO_ID >", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STO_ID >=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThan(Integer value) {
            addCriterion("STO_ID <", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThanOrEqualTo(Integer value) {
            addCriterion("STO_ID <=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdIn(List<Integer> values) {
            addCriterion("STO_ID in", values, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotIn(List<Integer> values) {
            addCriterion("STO_ID not in", values, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdBetween(Integer value1, Integer value2) {
            addCriterion("STO_ID between", value1, value2, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STO_ID not between", value1, value2, "stoId");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostIsNull() {
            addCriterion("LAST_FREIGHT_COST is null");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostIsNotNull() {
            addCriterion("LAST_FREIGHT_COST is not null");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostEqualTo(BigDecimal value) {
            addCriterion("LAST_FREIGHT_COST =", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostNotEqualTo(BigDecimal value) {
            addCriterion("LAST_FREIGHT_COST <>", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostGreaterThan(BigDecimal value) {
            addCriterion("LAST_FREIGHT_COST >", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_FREIGHT_COST >=", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostLessThan(BigDecimal value) {
            addCriterion("LAST_FREIGHT_COST <", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_FREIGHT_COST <=", value, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostIn(List<BigDecimal> values) {
            addCriterion("LAST_FREIGHT_COST in", values, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostNotIn(List<BigDecimal> values) {
            addCriterion("LAST_FREIGHT_COST not in", values, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_FREIGHT_COST between", value1, value2, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andLastFreightCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_FREIGHT_COST not between", value1, value2, "lastFreightCost");
            return (Criteria) this;
        }

        public Criteria andCancleTimeIsNull() {
            addCriterion("CANCLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCancleTimeIsNotNull() {
            addCriterion("CANCLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCancleTimeEqualTo(Date value) {
            addCriterion("CANCLE_TIME =", value, "cancleTime");
            return (Criteria) this;
        }

        public Criteria andCancleTimeNotEqualTo(Date value) {
            addCriterion("CANCLE_TIME <>", value, "cancleTime");
            return (Criteria) this;
        }

        public Criteria andCancleTimeGreaterThan(Date value) {
            addCriterion("CANCLE_TIME >", value, "cancleTime");
            return (Criteria) this;
        }

        public Criteria andCancleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCLE_TIME >=", value, "cancleTime");
            return (Criteria) this;
        }

        public Criteria andCancleTimeLessThan(Date value) {
            addCriterion("CANCLE_TIME <", value, "cancleTime");
            return (Criteria) this;
        }

        public Criteria andCancleTimeLessThanOrEqualTo(Date value) {
            addCriterion("CANCLE_TIME <=", value, "cancleTime");
            return (Criteria) this;
        }

        public Criteria andCancleTimeIn(List<Date> values) {
            addCriterion("CANCLE_TIME in", values, "cancleTime");
            return (Criteria) this;
        }

        public Criteria andCancleTimeNotIn(List<Date> values) {
            addCriterion("CANCLE_TIME not in", values, "cancleTime");
            return (Criteria) this;
        }

        public Criteria andCancleTimeBetween(Date value1, Date value2) {
            addCriterion("CANCLE_TIME between", value1, value2, "cancleTime");
            return (Criteria) this;
        }

        public Criteria andCancleTimeNotBetween(Date value1, Date value2) {
            addCriterion("CANCLE_TIME not between", value1, value2, "cancleTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusIsNull() {
            addCriterion("AUTO_PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusIsNotNull() {
            addCriterion("AUTO_PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusEqualTo(String value) {
            addCriterion("AUTO_PAY_STATUS =", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusNotEqualTo(String value) {
            addCriterion("AUTO_PAY_STATUS <>", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusGreaterThan(String value) {
            addCriterion("AUTO_PAY_STATUS >", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_PAY_STATUS >=", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusLessThan(String value) {
            addCriterion("AUTO_PAY_STATUS <", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusLessThanOrEqualTo(String value) {
            addCriterion("AUTO_PAY_STATUS <=", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusLike(String value) {
            addCriterion("AUTO_PAY_STATUS like", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusNotLike(String value) {
            addCriterion("AUTO_PAY_STATUS not like", value, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusIn(List<String> values) {
            addCriterion("AUTO_PAY_STATUS in", values, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusNotIn(List<String> values) {
            addCriterion("AUTO_PAY_STATUS not in", values, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusBetween(String value1, String value2) {
            addCriterion("AUTO_PAY_STATUS between", value1, value2, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayStatusNotBetween(String value1, String value2) {
            addCriterion("AUTO_PAY_STATUS not between", value1, value2, "autoPayStatus");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeIsNull() {
            addCriterion("AUTO_PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeIsNotNull() {
            addCriterion("AUTO_PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeEqualTo(String value) {
            addCriterion("AUTO_PAY_TIME =", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeNotEqualTo(String value) {
            addCriterion("AUTO_PAY_TIME <>", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeGreaterThan(String value) {
            addCriterion("AUTO_PAY_TIME >", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_PAY_TIME >=", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeLessThan(String value) {
            addCriterion("AUTO_PAY_TIME <", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeLessThanOrEqualTo(String value) {
            addCriterion("AUTO_PAY_TIME <=", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeLike(String value) {
            addCriterion("AUTO_PAY_TIME like", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeNotLike(String value) {
            addCriterion("AUTO_PAY_TIME not like", value, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeIn(List<String> values) {
            addCriterion("AUTO_PAY_TIME in", values, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeNotIn(List<String> values) {
            addCriterion("AUTO_PAY_TIME not in", values, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeBetween(String value1, String value2) {
            addCriterion("AUTO_PAY_TIME between", value1, value2, "autoPayTime");
            return (Criteria) this;
        }

        public Criteria andAutoPayTimeNotBetween(String value1, String value2) {
            addCriterion("AUTO_PAY_TIME not between", value1, value2, "autoPayTime");
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