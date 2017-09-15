package com.kakasys.entity.coin;

import java.io.Serializable;

public class AccountCompany implements Serializable {
    private String id;

    private String isDisable;

    private String createTime;

    private String comId;

    private String deptId;

    private String empId;

    private String adminId;

    private String budgeId;

    private String accountName;

    private String accountLever;

    private String accountCode;

    private String accountAmount;

    private String applierId;

    private String accountId;

    private String remainAccountId;

    private String canIn;

    private String canOut;

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId == null ? null : comId.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getBudgeId() {
        return budgeId;
    }

    public void setBudgeId(String budgeId) {
        this.budgeId = budgeId == null ? null : budgeId.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountLever() {
        return accountLever;
    }

    public void setAccountLever(String accountLever) {
        this.accountLever = accountLever == null ? null : accountLever.trim();
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode == null ? null : accountCode.trim();
    }

    public String getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(String accountAmount) {
        this.accountAmount = accountAmount == null ? null : accountAmount.trim();
    }

    public String getApplierId() {
        return applierId;
    }

    public void setApplierId(String applierId) {
        this.applierId = applierId == null ? null : applierId.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getRemainAccountId() {
        return remainAccountId;
    }

    public void setRemainAccountId(String remainAccountId) {
        this.remainAccountId = remainAccountId == null ? null : remainAccountId.trim();
    }

    public String getCanIn() {
        return canIn;
    }

    public void setCanIn(String canIn) {
        this.canIn = canIn == null ? null : canIn.trim();
    }

    public String getCanOut() {
        return canOut;
    }

    public void setCanOut(String canOut) {
        this.canOut = canOut == null ? null : canOut.trim();
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
        sb.append(", comId=").append(comId);
        sb.append(", deptId=").append(deptId);
        sb.append(", empId=").append(empId);
        sb.append(", adminId=").append(adminId);
        sb.append(", budgeId=").append(budgeId);
        sb.append(", accountName=").append(accountName);
        sb.append(", accountLever=").append(accountLever);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", accountAmount=").append(accountAmount);
        sb.append(", applierId=").append(applierId);
        sb.append(", accountId=").append(accountId);
        sb.append(", remainAccountId=").append(remainAccountId);
        sb.append(", canIn=").append(canIn);
        sb.append(", canOut=").append(canOut);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}