package com.kakasys.entity.coin;

import java.util.ArrayList;
import java.util.List;

public class InvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceExample() {
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

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(String value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(String value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(String value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(String value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(String value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLike(String value) {
            addCriterion("createdate like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotLike(String value) {
            addCriterion("createdate not like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<String> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<String> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(String value1, String value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(String value1, String value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andBuynameIsNull() {
            addCriterion("buyname is null");
            return (Criteria) this;
        }

        public Criteria andBuynameIsNotNull() {
            addCriterion("buyname is not null");
            return (Criteria) this;
        }

        public Criteria andBuynameEqualTo(String value) {
            addCriterion("buyname =", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameNotEqualTo(String value) {
            addCriterion("buyname <>", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameGreaterThan(String value) {
            addCriterion("buyname >", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameGreaterThanOrEqualTo(String value) {
            addCriterion("buyname >=", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameLessThan(String value) {
            addCriterion("buyname <", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameLessThanOrEqualTo(String value) {
            addCriterion("buyname <=", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameLike(String value) {
            addCriterion("buyname like", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameNotLike(String value) {
            addCriterion("buyname not like", value, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameIn(List<String> values) {
            addCriterion("buyname in", values, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameNotIn(List<String> values) {
            addCriterion("buyname not in", values, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameBetween(String value1, String value2) {
            addCriterion("buyname between", value1, value2, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuynameNotBetween(String value1, String value2) {
            addCriterion("buyname not between", value1, value2, "buyname");
            return (Criteria) this;
        }

        public Criteria andBuyidIsNull() {
            addCriterion("buyid is null");
            return (Criteria) this;
        }

        public Criteria andBuyidIsNotNull() {
            addCriterion("buyid is not null");
            return (Criteria) this;
        }

        public Criteria andBuyidEqualTo(String value) {
            addCriterion("buyid =", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidNotEqualTo(String value) {
            addCriterion("buyid <>", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidGreaterThan(String value) {
            addCriterion("buyid >", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidGreaterThanOrEqualTo(String value) {
            addCriterion("buyid >=", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidLessThan(String value) {
            addCriterion("buyid <", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidLessThanOrEqualTo(String value) {
            addCriterion("buyid <=", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidLike(String value) {
            addCriterion("buyid like", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidNotLike(String value) {
            addCriterion("buyid not like", value, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidIn(List<String> values) {
            addCriterion("buyid in", values, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidNotIn(List<String> values) {
            addCriterion("buyid not in", values, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidBetween(String value1, String value2) {
            addCriterion("buyid between", value1, value2, "buyid");
            return (Criteria) this;
        }

        public Criteria andBuyidNotBetween(String value1, String value2) {
            addCriterion("buyid not between", value1, value2, "buyid");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andSellnameIsNull() {
            addCriterion("sellname is null");
            return (Criteria) this;
        }

        public Criteria andSellnameIsNotNull() {
            addCriterion("sellname is not null");
            return (Criteria) this;
        }

        public Criteria andSellnameEqualTo(String value) {
            addCriterion("sellname =", value, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameNotEqualTo(String value) {
            addCriterion("sellname <>", value, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameGreaterThan(String value) {
            addCriterion("sellname >", value, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameGreaterThanOrEqualTo(String value) {
            addCriterion("sellname >=", value, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameLessThan(String value) {
            addCriterion("sellname <", value, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameLessThanOrEqualTo(String value) {
            addCriterion("sellname <=", value, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameLike(String value) {
            addCriterion("sellname like", value, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameNotLike(String value) {
            addCriterion("sellname not like", value, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameIn(List<String> values) {
            addCriterion("sellname in", values, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameNotIn(List<String> values) {
            addCriterion("sellname not in", values, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameBetween(String value1, String value2) {
            addCriterion("sellname between", value1, value2, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellnameNotBetween(String value1, String value2) {
            addCriterion("sellname not between", value1, value2, "sellname");
            return (Criteria) this;
        }

        public Criteria andSellidIsNull() {
            addCriterion("sellid is null");
            return (Criteria) this;
        }

        public Criteria andSellidIsNotNull() {
            addCriterion("sellid is not null");
            return (Criteria) this;
        }

        public Criteria andSellidEqualTo(String value) {
            addCriterion("sellid =", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotEqualTo(String value) {
            addCriterion("sellid <>", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidGreaterThan(String value) {
            addCriterion("sellid >", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidGreaterThanOrEqualTo(String value) {
            addCriterion("sellid >=", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidLessThan(String value) {
            addCriterion("sellid <", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidLessThanOrEqualTo(String value) {
            addCriterion("sellid <=", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidLike(String value) {
            addCriterion("sellid like", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotLike(String value) {
            addCriterion("sellid not like", value, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidIn(List<String> values) {
            addCriterion("sellid in", values, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotIn(List<String> values) {
            addCriterion("sellid not in", values, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidBetween(String value1, String value2) {
            addCriterion("sellid between", value1, value2, "sellid");
            return (Criteria) this;
        }

        public Criteria andSellidNotBetween(String value1, String value2) {
            addCriterion("sellid not between", value1, value2, "sellid");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIsNull() {
            addCriterion("invoicecode is null");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIsNotNull() {
            addCriterion("invoicecode is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeEqualTo(String value) {
            addCriterion("invoicecode =", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotEqualTo(String value) {
            addCriterion("invoicecode <>", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeGreaterThan(String value) {
            addCriterion("invoicecode >", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeGreaterThanOrEqualTo(String value) {
            addCriterion("invoicecode >=", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLessThan(String value) {
            addCriterion("invoicecode <", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLessThanOrEqualTo(String value) {
            addCriterion("invoicecode <=", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeLike(String value) {
            addCriterion("invoicecode like", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotLike(String value) {
            addCriterion("invoicecode not like", value, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeIn(List<String> values) {
            addCriterion("invoicecode in", values, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotIn(List<String> values) {
            addCriterion("invoicecode not in", values, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeBetween(String value1, String value2) {
            addCriterion("invoicecode between", value1, value2, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicecodeNotBetween(String value1, String value2) {
            addCriterion("invoicecode not between", value1, value2, "invoicecode");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberIsNull() {
            addCriterion("invoicenumber is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberIsNotNull() {
            addCriterion("invoicenumber is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberEqualTo(String value) {
            addCriterion("invoicenumber =", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberNotEqualTo(String value) {
            addCriterion("invoicenumber <>", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberGreaterThan(String value) {
            addCriterion("invoicenumber >", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberGreaterThanOrEqualTo(String value) {
            addCriterion("invoicenumber >=", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberLessThan(String value) {
            addCriterion("invoicenumber <", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberLessThanOrEqualTo(String value) {
            addCriterion("invoicenumber <=", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberLike(String value) {
            addCriterion("invoicenumber like", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberNotLike(String value) {
            addCriterion("invoicenumber not like", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberIn(List<String> values) {
            addCriterion("invoicenumber in", values, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberNotIn(List<String> values) {
            addCriterion("invoicenumber not in", values, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberBetween(String value1, String value2) {
            addCriterion("invoicenumber between", value1, value2, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberNotBetween(String value1, String value2) {
            addCriterion("invoicenumber not between", value1, value2, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNull() {
            addCriterion("checkcode is null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNotNull() {
            addCriterion("checkcode is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeEqualTo(String value) {
            addCriterion("checkcode =", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotEqualTo(String value) {
            addCriterion("checkcode <>", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThan(String value) {
            addCriterion("checkcode >", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThanOrEqualTo(String value) {
            addCriterion("checkcode >=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThan(String value) {
            addCriterion("checkcode <", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThanOrEqualTo(String value) {
            addCriterion("checkcode <=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLike(String value) {
            addCriterion("checkcode like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotLike(String value) {
            addCriterion("checkcode not like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIn(List<String> values) {
            addCriterion("checkcode in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotIn(List<String> values) {
            addCriterion("checkcode not in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeBetween(String value1, String value2) {
            addCriterion("checkcode between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotBetween(String value1, String value2) {
            addCriterion("checkcode not between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(String value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(String value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(String value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(String value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(String value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLike(String value) {
            addCriterion("capital like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotLike(String value) {
            addCriterion("capital not like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<String> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<String> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(String value1, String value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(String value1, String value2) {
            addCriterion("capital not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRatemoneyIsNull() {
            addCriterion("ratemoney is null");
            return (Criteria) this;
        }

        public Criteria andRatemoneyIsNotNull() {
            addCriterion("ratemoney is not null");
            return (Criteria) this;
        }

        public Criteria andRatemoneyEqualTo(String value) {
            addCriterion("ratemoney =", value, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyNotEqualTo(String value) {
            addCriterion("ratemoney <>", value, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyGreaterThan(String value) {
            addCriterion("ratemoney >", value, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyGreaterThanOrEqualTo(String value) {
            addCriterion("ratemoney >=", value, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyLessThan(String value) {
            addCriterion("ratemoney <", value, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyLessThanOrEqualTo(String value) {
            addCriterion("ratemoney <=", value, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyLike(String value) {
            addCriterion("ratemoney like", value, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyNotLike(String value) {
            addCriterion("ratemoney not like", value, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyIn(List<String> values) {
            addCriterion("ratemoney in", values, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyNotIn(List<String> values) {
            addCriterion("ratemoney not in", values, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyBetween(String value1, String value2) {
            addCriterion("ratemoney between", value1, value2, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andRatemoneyNotBetween(String value1, String value2) {
            addCriterion("ratemoney not between", value1, value2, "ratemoney");
            return (Criteria) this;
        }

        public Criteria andMoneyupperIsNull() {
            addCriterion("moneyupper is null");
            return (Criteria) this;
        }

        public Criteria andMoneyupperIsNotNull() {
            addCriterion("moneyupper is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyupperEqualTo(String value) {
            addCriterion("moneyupper =", value, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperNotEqualTo(String value) {
            addCriterion("moneyupper <>", value, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperGreaterThan(String value) {
            addCriterion("moneyupper >", value, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperGreaterThanOrEqualTo(String value) {
            addCriterion("moneyupper >=", value, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperLessThan(String value) {
            addCriterion("moneyupper <", value, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperLessThanOrEqualTo(String value) {
            addCriterion("moneyupper <=", value, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperLike(String value) {
            addCriterion("moneyupper like", value, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperNotLike(String value) {
            addCriterion("moneyupper not like", value, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperIn(List<String> values) {
            addCriterion("moneyupper in", values, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperNotIn(List<String> values) {
            addCriterion("moneyupper not in", values, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperBetween(String value1, String value2) {
            addCriterion("moneyupper between", value1, value2, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andMoneyupperNotBetween(String value1, String value2) {
            addCriterion("moneyupper not between", value1, value2, "moneyupper");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("employeeid is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("employeeid is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(String value) {
            addCriterion("employeeid =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(String value) {
            addCriterion("employeeid <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(String value) {
            addCriterion("employeeid >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("employeeid >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(String value) {
            addCriterion("employeeid <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(String value) {
            addCriterion("employeeid <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLike(String value) {
            addCriterion("employeeid like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotLike(String value) {
            addCriterion("employeeid not like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<String> values) {
            addCriterion("employeeid in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<String> values) {
            addCriterion("employeeid not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(String value1, String value2) {
            addCriterion("employeeid between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(String value1, String value2) {
            addCriterion("employeeid not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeid is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(String value) {
            addCriterion("typeid =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(String value) {
            addCriterion("typeid <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(String value) {
            addCriterion("typeid >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("typeid >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(String value) {
            addCriterion("typeid <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(String value) {
            addCriterion("typeid <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLike(String value) {
            addCriterion("typeid like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotLike(String value) {
            addCriterion("typeid not like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<String> values) {
            addCriterion("typeid in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<String> values) {
            addCriterion("typeid not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(String value1, String value2) {
            addCriterion("typeid between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(String value1, String value2) {
            addCriterion("typeid not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNull() {
            addCriterion("invoicetype is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNotNull() {
            addCriterion("invoicetype is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeEqualTo(String value) {
            addCriterion("invoicetype =", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotEqualTo(String value) {
            addCriterion("invoicetype <>", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThan(String value) {
            addCriterion("invoicetype >", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoicetype >=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThan(String value) {
            addCriterion("invoicetype <", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThanOrEqualTo(String value) {
            addCriterion("invoicetype <=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLike(String value) {
            addCriterion("invoicetype like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotLike(String value) {
            addCriterion("invoicetype not like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIn(List<String> values) {
            addCriterion("invoicetype in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotIn(List<String> values) {
            addCriterion("invoicetype not in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeBetween(String value1, String value2) {
            addCriterion("invoicetype between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotBetween(String value1, String value2) {
            addCriterion("invoicetype not between", value1, value2, "invoicetype");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNull() {
            addCriterion("servicename is null");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNotNull() {
            addCriterion("servicename is not null");
            return (Criteria) this;
        }

        public Criteria andServicenameEqualTo(String value) {
            addCriterion("servicename =", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotEqualTo(String value) {
            addCriterion("servicename <>", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThan(String value) {
            addCriterion("servicename >", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThanOrEqualTo(String value) {
            addCriterion("servicename >=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThan(String value) {
            addCriterion("servicename <", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThanOrEqualTo(String value) {
            addCriterion("servicename <=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLike(String value) {
            addCriterion("servicename like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotLike(String value) {
            addCriterion("servicename not like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameIn(List<String> values) {
            addCriterion("servicename in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotIn(List<String> values) {
            addCriterion("servicename not in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameBetween(String value1, String value2) {
            addCriterion("servicename between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotBetween(String value1, String value2) {
            addCriterion("servicename not between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyIsNull() {
            addCriterion("totalratemoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyIsNotNull() {
            addCriterion("totalratemoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyEqualTo(String value) {
            addCriterion("totalratemoney =", value, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyNotEqualTo(String value) {
            addCriterion("totalratemoney <>", value, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyGreaterThan(String value) {
            addCriterion("totalratemoney >", value, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyGreaterThanOrEqualTo(String value) {
            addCriterion("totalratemoney >=", value, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyLessThan(String value) {
            addCriterion("totalratemoney <", value, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyLessThanOrEqualTo(String value) {
            addCriterion("totalratemoney <=", value, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyLike(String value) {
            addCriterion("totalratemoney like", value, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyNotLike(String value) {
            addCriterion("totalratemoney not like", value, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyIn(List<String> values) {
            addCriterion("totalratemoney in", values, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyNotIn(List<String> values) {
            addCriterion("totalratemoney not in", values, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyBetween(String value1, String value2) {
            addCriterion("totalratemoney between", value1, value2, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalratemoneyNotBetween(String value1, String value2) {
            addCriterion("totalratemoney not between", value1, value2, "totalratemoney");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalIsNull() {
            addCriterion("totalcapital is null");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalIsNotNull() {
            addCriterion("totalcapital is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalEqualTo(String value) {
            addCriterion("totalcapital =", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalNotEqualTo(String value) {
            addCriterion("totalcapital <>", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalGreaterThan(String value) {
            addCriterion("totalcapital >", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalGreaterThanOrEqualTo(String value) {
            addCriterion("totalcapital >=", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalLessThan(String value) {
            addCriterion("totalcapital <", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalLessThanOrEqualTo(String value) {
            addCriterion("totalcapital <=", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalLike(String value) {
            addCriterion("totalcapital like", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalNotLike(String value) {
            addCriterion("totalcapital not like", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalIn(List<String> values) {
            addCriterion("totalcapital in", values, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalNotIn(List<String> values) {
            addCriterion("totalcapital not in", values, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalBetween(String value1, String value2) {
            addCriterion("totalcapital between", value1, value2, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalNotBetween(String value1, String value2) {
            addCriterion("totalcapital not between", value1, value2, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("form_id is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("form_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(String value) {
            addCriterion("form_id =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(String value) {
            addCriterion("form_id <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(String value) {
            addCriterion("form_id >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(String value) {
            addCriterion("form_id >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(String value) {
            addCriterion("form_id <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(String value) {
            addCriterion("form_id <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLike(String value) {
            addCriterion("form_id like", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotLike(String value) {
            addCriterion("form_id not like", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<String> values) {
            addCriterion("form_id in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<String> values) {
            addCriterion("form_id not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(String value1, String value2) {
            addCriterion("form_id between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(String value1, String value2) {
            addCriterion("form_id not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameIsNull() {
            addCriterion("fare_type_name is null");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameIsNotNull() {
            addCriterion("fare_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameEqualTo(String value) {
            addCriterion("fare_type_name =", value, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameNotEqualTo(String value) {
            addCriterion("fare_type_name <>", value, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameGreaterThan(String value) {
            addCriterion("fare_type_name >", value, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("fare_type_name >=", value, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameLessThan(String value) {
            addCriterion("fare_type_name <", value, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameLessThanOrEqualTo(String value) {
            addCriterion("fare_type_name <=", value, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameLike(String value) {
            addCriterion("fare_type_name like", value, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameNotLike(String value) {
            addCriterion("fare_type_name not like", value, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameIn(List<String> values) {
            addCriterion("fare_type_name in", values, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameNotIn(List<String> values) {
            addCriterion("fare_type_name not in", values, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameBetween(String value1, String value2) {
            addCriterion("fare_type_name between", value1, value2, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andFareTypeNameNotBetween(String value1, String value2) {
            addCriterion("fare_type_name not between", value1, value2, "fareTypeName");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(String value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(String value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(String value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(String value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(String value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLike(String value) {
            addCriterion("message_id like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotLike(String value) {
            addCriterion("message_id not like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<String> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<String> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(String value1, String value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(String value1, String value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
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

        public Criteria andHasUploadOssIsNull() {
            addCriterion("has_upload_oss is null");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssIsNotNull() {
            addCriterion("has_upload_oss is not null");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssEqualTo(Boolean value) {
            addCriterion("has_upload_oss =", value, "hasUploadOss");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssNotEqualTo(Boolean value) {
            addCriterion("has_upload_oss <>", value, "hasUploadOss");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssGreaterThan(Boolean value) {
            addCriterion("has_upload_oss >", value, "hasUploadOss");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_upload_oss >=", value, "hasUploadOss");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssLessThan(Boolean value) {
            addCriterion("has_upload_oss <", value, "hasUploadOss");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssLessThanOrEqualTo(Boolean value) {
            addCriterion("has_upload_oss <=", value, "hasUploadOss");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssIn(List<Boolean> values) {
            addCriterion("has_upload_oss in", values, "hasUploadOss");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssNotIn(List<Boolean> values) {
            addCriterion("has_upload_oss not in", values, "hasUploadOss");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssBetween(Boolean value1, Boolean value2) {
            addCriterion("has_upload_oss between", value1, value2, "hasUploadOss");
            return (Criteria) this;
        }

        public Criteria andHasUploadOssNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_upload_oss not between", value1, value2, "hasUploadOss");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("is_delete like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("is_delete not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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