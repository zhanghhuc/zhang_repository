package ocf.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerMCExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerMCExample() {
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

        public Criteria andBannerIdIsNull() {
            addCriterion("banner_id is null");
            return (Criteria) this;
        }

        public Criteria andBannerIdIsNotNull() {
            addCriterion("banner_id is not null");
            return (Criteria) this;
        }

        public Criteria andBannerIdEqualTo(Integer value) {
            addCriterion("banner_id =", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotEqualTo(Integer value) {
            addCriterion("banner_id <>", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThan(Integer value) {
            addCriterion("banner_id >", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("banner_id >=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThan(Integer value) {
            addCriterion("banner_id <", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThanOrEqualTo(Integer value) {
            addCriterion("banner_id <=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdIn(List<Integer> values) {
            addCriterion("banner_id in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotIn(List<Integer> values) {
            addCriterion("banner_id not in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdBetween(Integer value1, Integer value2) {
            addCriterion("banner_id between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("banner_id not between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerCodeIsNull() {
            addCriterion("banner_code is null");
            return (Criteria) this;
        }

        public Criteria andBannerCodeIsNotNull() {
            addCriterion("banner_code is not null");
            return (Criteria) this;
        }

        public Criteria andBannerCodeEqualTo(String value) {
            addCriterion("banner_code =", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeNotEqualTo(String value) {
            addCriterion("banner_code <>", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeGreaterThan(String value) {
            addCriterion("banner_code >", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("banner_code >=", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeLessThan(String value) {
            addCriterion("banner_code <", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeLessThanOrEqualTo(String value) {
            addCriterion("banner_code <=", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeLike(String value) {
            addCriterion("banner_code like", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeNotLike(String value) {
            addCriterion("banner_code not like", value, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeIn(List<String> values) {
            addCriterion("banner_code in", values, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeNotIn(List<String> values) {
            addCriterion("banner_code not in", values, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeBetween(String value1, String value2) {
            addCriterion("banner_code between", value1, value2, "bannerCode");
            return (Criteria) this;
        }

        public Criteria andBannerCodeNotBetween(String value1, String value2) {
            addCriterion("banner_code not between", value1, value2, "bannerCode");
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

        public Criteria andIsDisableEqualTo(Byte value) {
            addCriterion("is_disable =", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableNotEqualTo(Byte value) {
            addCriterion("is_disable <>", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableGreaterThan(Byte value) {
            addCriterion("is_disable >", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_disable >=", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableLessThan(Byte value) {
            addCriterion("is_disable <", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableLessThanOrEqualTo(Byte value) {
            addCriterion("is_disable <=", value, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableIn(List<Byte> values) {
            addCriterion("is_disable in", values, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableNotIn(List<Byte> values) {
            addCriterion("is_disable not in", values, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableBetween(Byte value1, Byte value2) {
            addCriterion("is_disable between", value1, value2, "isDisable");
            return (Criteria) this;
        }

        public Criteria andIsDisableNotBetween(Byte value1, Byte value2) {
            addCriterion("is_disable not between", value1, value2, "isDisable");
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

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Byte value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Byte value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Byte value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Byte value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Byte value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Byte> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Byte> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Byte value1, Byte value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
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

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTimeSignIsNull() {
            addCriterion("time_sign is null");
            return (Criteria) this;
        }

        public Criteria andTimeSignIsNotNull() {
            addCriterion("time_sign is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSignEqualTo(Date value) {
            addCriterion("time_sign =", value, "timeSign");
            return (Criteria) this;
        }

        public Criteria andTimeSignNotEqualTo(Date value) {
            addCriterion("time_sign <>", value, "timeSign");
            return (Criteria) this;
        }

        public Criteria andTimeSignGreaterThan(Date value) {
            addCriterion("time_sign >", value, "timeSign");
            return (Criteria) this;
        }

        public Criteria andTimeSignGreaterThanOrEqualTo(Date value) {
            addCriterion("time_sign >=", value, "timeSign");
            return (Criteria) this;
        }

        public Criteria andTimeSignLessThan(Date value) {
            addCriterion("time_sign <", value, "timeSign");
            return (Criteria) this;
        }

        public Criteria andTimeSignLessThanOrEqualTo(Date value) {
            addCriterion("time_sign <=", value, "timeSign");
            return (Criteria) this;
        }

        public Criteria andTimeSignIn(List<Date> values) {
            addCriterion("time_sign in", values, "timeSign");
            return (Criteria) this;
        }

        public Criteria andTimeSignNotIn(List<Date> values) {
            addCriterion("time_sign not in", values, "timeSign");
            return (Criteria) this;
        }

        public Criteria andTimeSignBetween(Date value1, Date value2) {
            addCriterion("time_sign between", value1, value2, "timeSign");
            return (Criteria) this;
        }

        public Criteria andTimeSignNotBetween(Date value1, Date value2) {
            addCriterion("time_sign not between", value1, value2, "timeSign");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNull() {
            addCriterion("banner_url is null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNotNull() {
            addCriterion("banner_url is not null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlEqualTo(String value) {
            addCriterion("banner_url =", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotEqualTo(String value) {
            addCriterion("banner_url <>", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThan(String value) {
            addCriterion("banner_url >", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("banner_url >=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThan(String value) {
            addCriterion("banner_url <", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThanOrEqualTo(String value) {
            addCriterion("banner_url <=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLike(String value) {
            addCriterion("banner_url like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotLike(String value) {
            addCriterion("banner_url not like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIn(List<String> values) {
            addCriterion("banner_url in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotIn(List<String> values) {
            addCriterion("banner_url not in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlBetween(String value1, String value2) {
            addCriterion("banner_url between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotBetween(String value1, String value2) {
            addCriterion("banner_url not between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlIsNull() {
            addCriterion("banner_to_url is null");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlIsNotNull() {
            addCriterion("banner_to_url is not null");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlEqualTo(String value) {
            addCriterion("banner_to_url =", value, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlNotEqualTo(String value) {
            addCriterion("banner_to_url <>", value, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlGreaterThan(String value) {
            addCriterion("banner_to_url >", value, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlGreaterThanOrEqualTo(String value) {
            addCriterion("banner_to_url >=", value, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlLessThan(String value) {
            addCriterion("banner_to_url <", value, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlLessThanOrEqualTo(String value) {
            addCriterion("banner_to_url <=", value, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlLike(String value) {
            addCriterion("banner_to_url like", value, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlNotLike(String value) {
            addCriterion("banner_to_url not like", value, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlIn(List<String> values) {
            addCriterion("banner_to_url in", values, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlNotIn(List<String> values) {
            addCriterion("banner_to_url not in", values, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlBetween(String value1, String value2) {
            addCriterion("banner_to_url between", value1, value2, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerToUrlNotBetween(String value1, String value2) {
            addCriterion("banner_to_url not between", value1, value2, "bannerToUrl");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIsNull() {
            addCriterion("banner_type is null");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIsNotNull() {
            addCriterion("banner_type is not null");
            return (Criteria) this;
        }

        public Criteria andBannerTypeEqualTo(Byte value) {
            addCriterion("banner_type =", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotEqualTo(Byte value) {
            addCriterion("banner_type <>", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeGreaterThan(Byte value) {
            addCriterion("banner_type >", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("banner_type >=", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLessThan(Byte value) {
            addCriterion("banner_type <", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("banner_type <=", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIn(List<Byte> values) {
            addCriterion("banner_type in", values, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotIn(List<Byte> values) {
            addCriterion("banner_type not in", values, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeBetween(Byte value1, Byte value2) {
            addCriterion("banner_type between", value1, value2, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("banner_type not between", value1, value2, "bannerType");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeIsNull() {
            addCriterion("remove_time is null");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeIsNotNull() {
            addCriterion("remove_time is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeEqualTo(Long value) {
            addCriterion("remove_time =", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeNotEqualTo(Long value) {
            addCriterion("remove_time <>", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeGreaterThan(Long value) {
            addCriterion("remove_time >", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("remove_time >=", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeLessThan(Long value) {
            addCriterion("remove_time <", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeLessThanOrEqualTo(Long value) {
            addCriterion("remove_time <=", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeIn(List<Long> values) {
            addCriterion("remove_time in", values, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeNotIn(List<Long> values) {
            addCriterion("remove_time not in", values, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeBetween(Long value1, Long value2) {
            addCriterion("remove_time between", value1, value2, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeNotBetween(Long value1, Long value2) {
            addCriterion("remove_time not between", value1, value2, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveContentIsNull() {
            addCriterion("remove_content is null");
            return (Criteria) this;
        }

        public Criteria andRemoveContentIsNotNull() {
            addCriterion("remove_content is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveContentEqualTo(String value) {
            addCriterion("remove_content =", value, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentNotEqualTo(String value) {
            addCriterion("remove_content <>", value, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentGreaterThan(String value) {
            addCriterion("remove_content >", value, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentGreaterThanOrEqualTo(String value) {
            addCriterion("remove_content >=", value, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentLessThan(String value) {
            addCriterion("remove_content <", value, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentLessThanOrEqualTo(String value) {
            addCriterion("remove_content <=", value, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentLike(String value) {
            addCriterion("remove_content like", value, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentNotLike(String value) {
            addCriterion("remove_content not like", value, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentIn(List<String> values) {
            addCriterion("remove_content in", values, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentNotIn(List<String> values) {
            addCriterion("remove_content not in", values, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentBetween(String value1, String value2) {
            addCriterion("remove_content between", value1, value2, "removeContent");
            return (Criteria) this;
        }

        public Criteria andRemoveContentNotBetween(String value1, String value2) {
            addCriterion("remove_content not between", value1, value2, "removeContent");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeIsNull() {
            addCriterion("auto_show_time is null");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeIsNotNull() {
            addCriterion("auto_show_time is not null");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeEqualTo(Long value) {
            addCriterion("auto_show_time =", value, "autoShowTime");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeNotEqualTo(Long value) {
            addCriterion("auto_show_time <>", value, "autoShowTime");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeGreaterThan(Long value) {
            addCriterion("auto_show_time >", value, "autoShowTime");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("auto_show_time >=", value, "autoShowTime");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeLessThan(Long value) {
            addCriterion("auto_show_time <", value, "autoShowTime");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeLessThanOrEqualTo(Long value) {
            addCriterion("auto_show_time <=", value, "autoShowTime");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeIn(List<Long> values) {
            addCriterion("auto_show_time in", values, "autoShowTime");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeNotIn(List<Long> values) {
            addCriterion("auto_show_time not in", values, "autoShowTime");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeBetween(Long value1, Long value2) {
            addCriterion("auto_show_time between", value1, value2, "autoShowTime");
            return (Criteria) this;
        }

        public Criteria andAutoShowTimeNotBetween(Long value1, Long value2) {
            addCriterion("auto_show_time not between", value1, value2, "autoShowTime");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeIsNull() {
            addCriterion("auto_hidden_time is null");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeIsNotNull() {
            addCriterion("auto_hidden_time is not null");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeEqualTo(Long value) {
            addCriterion("auto_hidden_time =", value, "autoHiddenTime");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeNotEqualTo(Long value) {
            addCriterion("auto_hidden_time <>", value, "autoHiddenTime");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeGreaterThan(Long value) {
            addCriterion("auto_hidden_time >", value, "autoHiddenTime");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("auto_hidden_time >=", value, "autoHiddenTime");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeLessThan(Long value) {
            addCriterion("auto_hidden_time <", value, "autoHiddenTime");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeLessThanOrEqualTo(Long value) {
            addCriterion("auto_hidden_time <=", value, "autoHiddenTime");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeIn(List<Long> values) {
            addCriterion("auto_hidden_time in", values, "autoHiddenTime");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeNotIn(List<Long> values) {
            addCriterion("auto_hidden_time not in", values, "autoHiddenTime");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeBetween(Long value1, Long value2) {
            addCriterion("auto_hidden_time between", value1, value2, "autoHiddenTime");
            return (Criteria) this;
        }

        public Criteria andAutoHiddenTimeNotBetween(Long value1, Long value2) {
            addCriterion("auto_hidden_time not between", value1, value2, "autoHiddenTime");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(Byte value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(Byte value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(Byte value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(Byte value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(Byte value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(Byte value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<Byte> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<Byte> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(Byte value1, Byte value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(Byte value1, Byte value2) {
            addCriterion("site not between", value1, value2, "site");
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