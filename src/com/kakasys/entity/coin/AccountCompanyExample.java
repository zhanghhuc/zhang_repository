package com.kakasys.entity.coin;

import java.util.ArrayList;
import java.util.List;

public class AccountCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountCompanyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIsDisableIsNull() {
            addCriterion("is_disable is null");
            return (Criteria) this;
        }

        public Criteria andIsDisableIsNotNull() {
            addCriterion("is_disable is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisableEqualTo(String value) {
            addCriterion("is_disable =", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableNotEqualTo(String value) {
            addCriterion("is_disable <>", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableGreaterThan(String value) {
            addCriterion("is_disable >", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableGreaterThanOrEqualTo(String value) {
            addCriterion("is_disable >=", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableLessThan(String value) {
            addCriterion("is_disable <", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableLessThanOrEqualTo(String value) {
            addCriterion("is_disable <=", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableLike(String value) {
            addCriterion("is_disable like", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableNotLike(String value) {
            addCriterion("is_disable not like", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableIn(List<String> values) {
            addCriterion("is_disable in", values, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableNotIn(List<String> values) {
            addCriterion("is_disable not in", values, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableBetween(String value1, String value2) {
            addCriterion("is_disable between", value1, value2, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableNotBetween(String value1, String value2) {
            addCriterion("is_disable not between", value1, value2, "isDisable");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(String value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(String value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(String value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(String value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(String value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(String value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLike(String value) {
            addCriterion("com_id like", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotLike(String value) {
            addCriterion("com_id not like", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<String> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<String> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(String value1, String value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(String value1, String value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("dept_id like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("dept_id not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("emp_id like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("emp_id not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(String value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(String value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(String value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(String value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(String value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLike(String value) {
            addCriterion("admin_id like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotLike(String value) {
            addCriterion("admin_id not like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<String> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<String> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(String value1, String value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(String value1, String value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdIsNull() {
            addCriterion("budge_id is null");
            return (Criteria) this;
        }

        public Criteria andBudgeIdIsNotNull() {
            addCriterion("budge_id is not null");
            return (Criteria) this;
        }

        public Criteria andBudgeIdEqualTo(String value) {
            addCriterion("budge_id =", value, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdNotEqualTo(String value) {
            addCriterion("budge_id <>", value, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdGreaterThan(String value) {
            addCriterion("budge_id >", value, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdGreaterThanOrEqualTo(String value) {
            addCriterion("budge_id >=", value, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdLessThan(String value) {
            addCriterion("budge_id <", value, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdLessThanOrEqualTo(String value) {
            addCriterion("budge_id <=", value, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdLike(String value) {
            addCriterion("budge_id like", value, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdNotLike(String value) {
            addCriterion("budge_id not like", value, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdIn(List<String> values) {
            addCriterion("budge_id in", values, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdNotIn(List<String> values) {
            addCriterion("budge_id not in", values, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdBetween(String value1, String value2) {
            addCriterion("budge_id between", value1, value2, "budgeId");
            return (Criteria) this;
        }

        public Criteria andBudgeIdNotBetween(String value1, String value2) {
            addCriterion("budge_id not between", value1, value2, "budgeId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountLeverIsNull() {
            addCriterion("account_lever is null");
            return (Criteria) this;
        }

        public Criteria andAccountLeverIsNotNull() {
            addCriterion("account_lever is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLeverEqualTo(String value) {
            addCriterion("account_lever =", value, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverNotEqualTo(String value) {
            addCriterion("account_lever <>", value, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverGreaterThan(String value) {
            addCriterion("account_lever >", value, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverGreaterThanOrEqualTo(String value) {
            addCriterion("account_lever >=", value, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverLessThan(String value) {
            addCriterion("account_lever <", value, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverLessThanOrEqualTo(String value) {
            addCriterion("account_lever <=", value, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverLike(String value) {
            addCriterion("account_lever like", value, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverNotLike(String value) {
            addCriterion("account_lever not like", value, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverIn(List<String> values) {
            addCriterion("account_lever in", values, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverNotIn(List<String> values) {
            addCriterion("account_lever not in", values, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverBetween(String value1, String value2) {
            addCriterion("account_lever between", value1, value2, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountLeverNotBetween(String value1, String value2) {
            addCriterion("account_lever not between", value1, value2, "accountLever");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIsNull() {
            addCriterion("account_code is null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIsNotNull() {
            addCriterion("account_code is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeEqualTo(String value) {
            addCriterion("account_code =", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotEqualTo(String value) {
            addCriterion("account_code <>", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeGreaterThan(String value) {
            addCriterion("account_code >", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("account_code >=", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLessThan(String value) {
            addCriterion("account_code <", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLessThanOrEqualTo(String value) {
            addCriterion("account_code <=", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLike(String value) {
            addCriterion("account_code like", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotLike(String value) {
            addCriterion("account_code not like", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIn(List<String> values) {
            addCriterion("account_code in", values, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotIn(List<String> values) {
            addCriterion("account_code not in", values, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeBetween(String value1, String value2) {
            addCriterion("account_code between", value1, value2, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotBetween(String value1, String value2) {
            addCriterion("account_code not between", value1, value2, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountAmountIsNull() {
            addCriterion("account_amount is null");
            return (Criteria) this;
        }

        public Criteria andAccountAmountIsNotNull() {
            addCriterion("account_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAmountEqualTo(String value) {
            addCriterion("account_amount =", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountNotEqualTo(String value) {
            addCriterion("account_amount <>", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountGreaterThan(String value) {
            addCriterion("account_amount >", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountGreaterThanOrEqualTo(String value) {
            addCriterion("account_amount >=", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountLessThan(String value) {
            addCriterion("account_amount <", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountLessThanOrEqualTo(String value) {
            addCriterion("account_amount <=", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountLike(String value) {
            addCriterion("account_amount like", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountNotLike(String value) {
            addCriterion("account_amount not like", value, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountIn(List<String> values) {
            addCriterion("account_amount in", values, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountNotIn(List<String> values) {
            addCriterion("account_amount not in", values, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountBetween(String value1, String value2) {
            addCriterion("account_amount between", value1, value2, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andAccountAmountNotBetween(String value1, String value2) {
            addCriterion("account_amount not between", value1, value2, "accountAmount");
            return (Criteria) this;
        }

        public Criteria andApplierIdIsNull() {
            addCriterion("applier_id is null");
            return (Criteria) this;
        }

        public Criteria andApplierIdIsNotNull() {
            addCriterion("applier_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplierIdEqualTo(String value) {
            addCriterion("applier_id =", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdNotEqualTo(String value) {
            addCriterion("applier_id <>", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdGreaterThan(String value) {
            addCriterion("applier_id >", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("applier_id >=", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdLessThan(String value) {
            addCriterion("applier_id <", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdLessThanOrEqualTo(String value) {
            addCriterion("applier_id <=", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdLike(String value) {
            addCriterion("applier_id like", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdNotLike(String value) {
            addCriterion("applier_id not like", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdIn(List<String> values) {
            addCriterion("applier_id in", values, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdNotIn(List<String> values) {
            addCriterion("applier_id not in", values, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdBetween(String value1, String value2) {
            addCriterion("applier_id between", value1, value2, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdNotBetween(String value1, String value2) {
            addCriterion("applier_id not between", value1, value2, "applierId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdIsNull() {
            addCriterion("remain_account_id is null");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdIsNotNull() {
            addCriterion("remain_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdEqualTo(String value) {
            addCriterion("remain_account_id =", value, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdNotEqualTo(String value) {
            addCriterion("remain_account_id <>", value, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdGreaterThan(String value) {
            addCriterion("remain_account_id >", value, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("remain_account_id >=", value, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdLessThan(String value) {
            addCriterion("remain_account_id <", value, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdLessThanOrEqualTo(String value) {
            addCriterion("remain_account_id <=", value, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdLike(String value) {
            addCriterion("remain_account_id like", value, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdNotLike(String value) {
            addCriterion("remain_account_id not like", value, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdIn(List<String> values) {
            addCriterion("remain_account_id in", values, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdNotIn(List<String> values) {
            addCriterion("remain_account_id not in", values, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdBetween(String value1, String value2) {
            addCriterion("remain_account_id between", value1, value2, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andRemainAccountIdNotBetween(String value1, String value2) {
            addCriterion("remain_account_id not between", value1, value2, "remainAccountId");
            return (Criteria) this;
        }

        public Criteria andCanInIsNull() {
            addCriterion("can_in is null");
            return (Criteria) this;
        }

        public Criteria andCanInIsNotNull() {
            addCriterion("can_in is not null");
            return (Criteria) this;
        }

        public Criteria andCanInEqualTo(String value) {
            addCriterion("can_in =", value, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInNotEqualTo(String value) {
            addCriterion("can_in <>", value, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInGreaterThan(String value) {
            addCriterion("can_in >", value, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInGreaterThanOrEqualTo(String value) {
            addCriterion("can_in >=", value, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInLessThan(String value) {
            addCriterion("can_in <", value, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInLessThanOrEqualTo(String value) {
            addCriterion("can_in <=", value, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInLike(String value) {
            addCriterion("can_in like", value, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInNotLike(String value) {
            addCriterion("can_in not like", value, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInIn(List<String> values) {
            addCriterion("can_in in", values, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInNotIn(List<String> values) {
            addCriterion("can_in not in", values, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInBetween(String value1, String value2) {
            addCriterion("can_in between", value1, value2, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanInNotBetween(String value1, String value2) {
            addCriterion("can_in not between", value1, value2, "canIn");
            return (Criteria) this;
        }

        public Criteria andCanOutIsNull() {
            addCriterion("can_out is null");
            return (Criteria) this;
        }

        public Criteria andCanOutIsNotNull() {
            addCriterion("can_out is not null");
            return (Criteria) this;
        }

        public Criteria andCanOutEqualTo(String value) {
            addCriterion("can_out =", value, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutNotEqualTo(String value) {
            addCriterion("can_out <>", value, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutGreaterThan(String value) {
            addCriterion("can_out >", value, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutGreaterThanOrEqualTo(String value) {
            addCriterion("can_out >=", value, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutLessThan(String value) {
            addCriterion("can_out <", value, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutLessThanOrEqualTo(String value) {
            addCriterion("can_out <=", value, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutLike(String value) {
            addCriterion("can_out like", value, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutNotLike(String value) {
            addCriterion("can_out not like", value, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutIn(List<String> values) {
            addCriterion("can_out in", values, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutNotIn(List<String> values) {
            addCriterion("can_out not in", values, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutBetween(String value1, String value2) {
            addCriterion("can_out between", value1, value2, "canOut");
            return (Criteria) this;
        }

        public Criteria andCanOutNotBetween(String value1, String value2) {
            addCriterion("can_out not between", value1, value2, "canOut");
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