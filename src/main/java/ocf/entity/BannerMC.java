package ocf.entity;

import java.util.Date;

public class BannerMC {
    private Integer bannerId;

    private String bannerCode;

    private Byte isDisable;

    private Byte isDelete;

    private Byte isActive;

    private Long createTime;

    private Date timeSign;

    private String remark;

    private String bannerUrl;

    private String bannerToUrl;

    private Byte bannerType;

    private Long removeTime;

    private String removeContent;

    private Long autoShowTime;

    private Long autoHiddenTime;

    private Byte site;

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerCode() {
        return bannerCode;
    }

    public void setBannerCode(String bannerCode) {
        this.bannerCode = bannerCode == null ? null : bannerCode.trim();
    }

    public Byte getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Byte isDisable) {
        this.isDisable = isDisable;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Date getTimeSign() {
        return timeSign;
    }

    public void setTimeSign(Date timeSign) {
        this.timeSign = timeSign;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }

    public String getBannerToUrl() {
        return bannerToUrl;
    }

    public void setBannerToUrl(String bannerToUrl) {
        this.bannerToUrl = bannerToUrl == null ? null : bannerToUrl.trim();
    }

    public Byte getBannerType() {
        return bannerType;
    }

    public void setBannerType(Byte bannerType) {
        this.bannerType = bannerType;
    }

    public Long getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(Long removeTime) {
        this.removeTime = removeTime;
    }

    public String getRemoveContent() {
        return removeContent;
    }

    public void setRemoveContent(String removeContent) {
        this.removeContent = removeContent == null ? null : removeContent.trim();
    }

    public Long getAutoShowTime() {
        return autoShowTime;
    }

    public void setAutoShowTime(Long autoShowTime) {
        this.autoShowTime = autoShowTime;
    }

    public Long getAutoHiddenTime() {
        return autoHiddenTime;
    }

    public void setAutoHiddenTime(Long autoHiddenTime) {
        this.autoHiddenTime = autoHiddenTime;
    }

    public Byte getSite() {
        return site;
    }

    public void setSite(Byte site) {
        this.site = site;
    }
}