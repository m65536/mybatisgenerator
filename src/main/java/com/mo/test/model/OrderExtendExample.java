package com.mo.test.model;

import java.util.ArrayList;
import java.util.List;

public class OrderExtendExample {
    /**
     * tx_order_extend
     */
    protected String orderByClause;

    /**
     * tx_order_extend
     */
    protected boolean distinct;

    /**
     * tx_order_extend
     */
    protected List<Criteria> oredCriteria;

    public OrderExtendExample() {
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

    /**
     * tx_order_extend 2017-11-17
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusIsNull() {
            addCriterion("confirm_deliver_status is null");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusIsNotNull() {
            addCriterion("confirm_deliver_status is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusEqualTo(Byte value) {
            addCriterion("confirm_deliver_status =", value, "confirmDeliverStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusNotEqualTo(Byte value) {
            addCriterion("confirm_deliver_status <>", value, "confirmDeliverStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusGreaterThan(Byte value) {
            addCriterion("confirm_deliver_status >", value, "confirmDeliverStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("confirm_deliver_status >=", value, "confirmDeliverStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusLessThan(Byte value) {
            addCriterion("confirm_deliver_status <", value, "confirmDeliverStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusLessThanOrEqualTo(Byte value) {
            addCriterion("confirm_deliver_status <=", value, "confirmDeliverStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusIn(List<Byte> values) {
            addCriterion("confirm_deliver_status in", values, "confirmDeliverStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusNotIn(List<Byte> values) {
            addCriterion("confirm_deliver_status not in", values, "confirmDeliverStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusBetween(Byte value1, Byte value2) {
            addCriterion("confirm_deliver_status between", value1, value2, "confirmDeliverStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmDeliverStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("confirm_deliver_status not between", value1, value2, "confirmDeliverStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusIsNull() {
            addCriterion("worker_status is null");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusIsNotNull() {
            addCriterion("worker_status is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusEqualTo(Byte value) {
            addCriterion("worker_status =", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusNotEqualTo(Byte value) {
            addCriterion("worker_status <>", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusGreaterThan(Byte value) {
            addCriterion("worker_status >", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("worker_status >=", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusLessThan(Byte value) {
            addCriterion("worker_status <", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusLessThanOrEqualTo(Byte value) {
            addCriterion("worker_status <=", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusIn(List<Byte> values) {
            addCriterion("worker_status in", values, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusNotIn(List<Byte> values) {
            addCriterion("worker_status not in", values, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusBetween(Byte value1, Byte value2) {
            addCriterion("worker_status between", value1, value2, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("worker_status not between", value1, value2, "workerStatus");
            return (Criteria) this;
        }
    }

    /**
     * tx_order_extend
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tx_order_extend 2017-11-17
     */
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