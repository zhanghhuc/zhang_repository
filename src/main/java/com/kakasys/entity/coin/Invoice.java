package com.kakasys.entity.coin;

import java.io.Serializable;

public class Invoice implements Serializable {
    private String id;

    private String createdate;

    private String buyname;

    private String buyid;

    private String money;

    private String sellname;

    private String sellid;

    private String invoicecode;

    private String invoicenumber;

    private String checkcode;

    private String capital;

    private String rate;

    private String ratemoney;

    private String moneyupper;

    private String employeeid;

    private String url;

    private String typeid;

    private String content;

    private Integer status;

    private String invoicetype;

    private Integer type;

    private String userid;

    private String title;

    private String servicename;

    private String totalratemoney;

    private String totalcapital;

    private String formId;

    private String fareTypeName;

    private String messageId;

    private String color;

    private String icon;

    private Boolean hasUploadOss;

    private String isDelete;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getBuyname() {
        return buyname;
    }

    public void setBuyname(String buyname) {
        this.buyname = buyname == null ? null : buyname.trim();
    }

    public String getBuyid() {
        return buyid;
    }

    public void setBuyid(String buyid) {
        this.buyid = buyid == null ? null : buyid.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getSellname() {
        return sellname;
    }

    public void setSellname(String sellname) {
        this.sellname = sellname == null ? null : sellname.trim();
    }

    public String getSellid() {
        return sellid;
    }

    public void setSellid(String sellid) {
        this.sellid = sellid == null ? null : sellid.trim();
    }

    public String getInvoicecode() {
        return invoicecode;
    }

    public void setInvoicecode(String invoicecode) {
        this.invoicecode = invoicecode == null ? null : invoicecode.trim();
    }

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber == null ? null : invoicenumber.trim();
    }

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode == null ? null : checkcode.trim();
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital == null ? null : capital.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getRatemoney() {
        return ratemoney;
    }

    public void setRatemoney(String ratemoney) {
        this.ratemoney = ratemoney == null ? null : ratemoney.trim();
    }

    public String getMoneyupper() {
        return moneyupper;
    }

    public void setMoneyupper(String moneyupper) {
        this.moneyupper = moneyupper == null ? null : moneyupper.trim();
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype == null ? null : invoicetype.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public String getTotalratemoney() {
        return totalratemoney;
    }

    public void setTotalratemoney(String totalratemoney) {
        this.totalratemoney = totalratemoney == null ? null : totalratemoney.trim();
    }

    public String getTotalcapital() {
        return totalcapital;
    }

    public void setTotalcapital(String totalcapital) {
        this.totalcapital = totalcapital == null ? null : totalcapital.trim();
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId == null ? null : formId.trim();
    }

    public String getFareTypeName() {
        return fareTypeName;
    }

    public void setFareTypeName(String fareTypeName) {
        this.fareTypeName = fareTypeName == null ? null : fareTypeName.trim();
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Boolean getHasUploadOss() {
        return hasUploadOss;
    }

    public void setHasUploadOss(Boolean hasUploadOss) {
        this.hasUploadOss = hasUploadOss;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createdate=").append(createdate);
        sb.append(", buyname=").append(buyname);
        sb.append(", buyid=").append(buyid);
        sb.append(", money=").append(money);
        sb.append(", sellname=").append(sellname);
        sb.append(", sellid=").append(sellid);
        sb.append(", invoicecode=").append(invoicecode);
        sb.append(", invoicenumber=").append(invoicenumber);
        sb.append(", checkcode=").append(checkcode);
        sb.append(", capital=").append(capital);
        sb.append(", rate=").append(rate);
        sb.append(", ratemoney=").append(ratemoney);
        sb.append(", moneyupper=").append(moneyupper);
        sb.append(", employeeid=").append(employeeid);
        sb.append(", url=").append(url);
        sb.append(", typeid=").append(typeid);
        sb.append(", content=").append(content);
        sb.append(", status=").append(status);
        sb.append(", invoicetype=").append(invoicetype);
        sb.append(", type=").append(type);
        sb.append(", userid=").append(userid);
        sb.append(", title=").append(title);
        sb.append(", servicename=").append(servicename);
        sb.append(", totalratemoney=").append(totalratemoney);
        sb.append(", totalcapital=").append(totalcapital);
        sb.append(", formId=").append(formId);
        sb.append(", fareTypeName=").append(fareTypeName);
        sb.append(", messageId=").append(messageId);
        sb.append(", color=").append(color);
        sb.append(", icon=").append(icon);
        sb.append(", hasUploadOss=").append(hasUploadOss);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}