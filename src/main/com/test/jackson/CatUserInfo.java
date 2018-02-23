package com.test.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;

@JsonRootName(value = "UserInfo")
public class CatUserInfo implements Serializable {
    private static final long serialVersionUID = -7687211885194777704L;

    /**
     * 用户ID
     */
    @JsonProperty("UserID")
    private String userID;
    /**
     * 用户
     */
    @JsonProperty("Name")
    private String name;
    /**
     * 性别
     */
    @JsonProperty("Gender")
    private String gender;
    /**
     * 手机号码
     */
    @JsonProperty("Mobile")
    private String mobile;
    /**
     * 固定电话
     */
    @JsonProperty("Telephone")
    private String telephone;
    /**
     * 公司名称
     */
    @JsonProperty("Company")
    private String company;
    /**
     * 职位
     */
    @JsonProperty("Position")
    private String position;
    /**
     * 使用地区省
     */
    @JsonProperty("Province")
    private String province;
    /**
     * 使用地区市
     */
    @JsonProperty("City")
    private String city;
    /**
     * 出生年月
     */
    @JsonProperty("Birthday")
    private String birthday;
    /**
     * 预计购买时间
     */
    @JsonProperty("PurchasePeriod")
    private String purchasePeriod;
    /**
     * 感兴趣的挖掘机类型
     */
    @JsonProperty("ExcavatorSize")
    private String excavatorSize;
    /**
     * 询价的挖掘机型号
     */
    @JsonProperty("ExcavatorModel")
    private String excavatorModel;
    /**
     * 同意卡特联系
     */
    @JsonProperty("AgreeContact")
    private String agreeContact;
    /**
     * 订购留言
     */
    @JsonProperty("OrderMessage")
    private String orderMessage;
    /**
     * 注册日期
     */
    @JsonProperty("RegDate")
    private String regDate;
    /**
     * 用户来源-Website
     */
    @JsonProperty("DataSource")
    private String dataSource;
    /**
     * 用户来源-Media
     */
    @JsonProperty("MediaSource")
    private String mediaSource;
    /**
     * 询价
     */
    @JsonProperty("RegisterType")
    private String registerType;
    /**
     * 数据来源CODE
     */
    @JsonProperty("DataSourceCode")
    private String dataSourceCode;
    /**
     * 来源
     */
    @JsonProperty("UTM-SOURCE")
    private String utmSource;
    /**
     * 媒介
     */
    @JsonProperty("UTM-MEDIUM")
    private String utmMedium;
    /**
     * 内容
     */
    @JsonProperty("UTM-CONTENT")
    private String utmContent;
    /**
     * 关键字
     */
    @JsonProperty("UTM-TERM")
    private String utmTerm;
    /**
     * 活动名称
     */
    @JsonProperty("UTM-CAMPAIGN")
    private String utmCampaign;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPurchasePeriod() {
        return purchasePeriod;
    }

    public void setPurchasePeriod(String purchasePeriod) {
        this.purchasePeriod = purchasePeriod;
    }

    public String getExcavatorSize() {
        return excavatorSize;
    }

    public void setExcavatorSize(String excavatorSize) {
        this.excavatorSize = excavatorSize;
    }

    public String getExcavatorModel() {
        return excavatorModel;
    }

    public void setExcavatorModel(String excavatorModel) {
        this.excavatorModel = excavatorModel;
    }

    public String getAgreeContact() {
        return agreeContact;
    }

    public void setAgreeContact(String agreeContact) {
        this.agreeContact = agreeContact;
    }

    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getMediaSource() {
        return mediaSource;
    }

    public void setMediaSource(String mediaSource) {
        this.mediaSource = mediaSource;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public String getDataSourceCode() {
        return dataSourceCode;
    }

    public void setDataSourceCode(String dataSourceCode) {
        this.dataSourceCode = dataSourceCode;
    }

    public String getUtmSource() {
        return utmSource;
    }

    public void setUtmSource(String utmSource) {
        this.utmSource = utmSource;
    }

    public String getUtmMedium() {
        return utmMedium;
    }

    public void setUtmMedium(String utmMedium) {
        this.utmMedium = utmMedium;
    }

    public String getUtmContent() {
        return utmContent;
    }

    public void setUtmContent(String utmContent) {
        this.utmContent = utmContent;
    }

    public String getUtmTerm() {
        return utmTerm;
    }

    public void setUtmTerm(String utmTerm) {
        this.utmTerm = utmTerm;
    }

    public String getUtmCampaign() {
        return utmCampaign;
    }

    public void setUtmCampaign(String utmCampaign) {
        this.utmCampaign = utmCampaign;
    }
}
