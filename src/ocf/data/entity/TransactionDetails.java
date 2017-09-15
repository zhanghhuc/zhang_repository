package ocf.data.entity;

import java.io.Serializable;

public class TransactionDetails implements Serializable {
    private String id;

    private String isDisable;

    private Long createTime;

    private String date;

    private String mainAccountId;

    private String relAccountId;

    private String detailName;

    private String detailType;

    private Integer amount;

    private String remark;

    private String operatorName;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(String isDisable) {
        this.isDisable = isDisable == null ? null : isDisable.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getMainAccountId() {
        return mainAccountId;
    }

    public void setMainAccountId(String mainAccountId) {
        this.mainAccountId = mainAccountId == null ? null : mainAccountId.trim();
    }

    public String getRelAccountId() {
        return relAccountId;
    }

    public void setRelAccountId(String relAccountId) {
        this.relAccountId = relAccountId == null ? null : relAccountId.trim();
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName == null ? null : detailName.trim();
    }

    public String getDetailType() {
        return detailType;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType == null ? null : detailType.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", isDisable=").append(isDisable);
        sb.append(", createTime=").append(createTime);
        sb.append(", date=").append(date);
        sb.append(", mainAccountId=").append(mainAccountId);
        sb.append(", relAccountId=").append(relAccountId);
        sb.append(", detailName=").append(detailName);
        sb.append(", detailType=").append(detailType);
        sb.append(", amount=").append(amount);
        sb.append(", remark=").append(remark);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}