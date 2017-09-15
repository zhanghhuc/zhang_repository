package ocf.data.entity;

import java.io.Serializable;

public class CommonAccount implements Serializable {
    private String id;

    private String isDisable;

    private Long createTime;

    private String ownerId;

    private String type;

    private String accountName;

    private String ownerType;

    private Integer balance;

    private Integer tolerance;

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

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType == null ? null : ownerType.trim();
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getTolerance() {
        return tolerance;
    }

    public void setTolerance(Integer tolerance) {
        this.tolerance = tolerance;
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
        sb.append(", ownerId=").append(ownerId);
        sb.append(", type=").append(type);
        sb.append(", accountName=").append(accountName);
        sb.append(", ownerType=").append(ownerType);
        sb.append(", balance=").append(balance);
        sb.append(", tolerance=").append(tolerance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}