package com.mo.test.model;

import java.util.Date;

public class OrderDistribute {
    /**
     * 主键，自增id
     */
    private Long id;

    /**
     * 外键，关联到tx_order.id
     */
    private Long orderId;

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 经销商id
     */
    private String dealerId;

    /**
     * 商户名称
     */
    private String dealerName;

    /**
     * 商场id
     */
    private String marketId;

    /**
     * 商场名称
     */
    private String marketName;

    /**
     * 1 已分单 2 已接单  4 失效
     */
    private Byte distStatus;

    /**
     * 分单时间
     */
    private Date distTime;

    /**
     * 分单人id
     */
    private String distUserId;

    /**
     * 分单人姓名
     */
    private String distUserName;

    /**
     * 接单时间
     */
    private Date acceptTime;

    /**
     * 接单人id
     */
    private String acceptUserId;

    /**
     * 接单人姓名
     */
    private String acceptUserName;

    /**
     * 经销商移动电话
     */
    private String mobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId == null ? null : dealerId.trim();
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId == null ? null : marketId.trim();
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName == null ? null : marketName.trim();
    }

    public Byte getDistStatus() {
        return distStatus;
    }

    public void setDistStatus(Byte distStatus) {
        this.distStatus = distStatus;
    }

    public Date getDistTime() {
        return distTime;
    }

    public void setDistTime(Date distTime) {
        this.distTime = distTime;
    }

    public String getDistUserId() {
        return distUserId;
    }

    public void setDistUserId(String distUserId) {
        this.distUserId = distUserId == null ? null : distUserId.trim();
    }

    public String getDistUserName() {
        return distUserName;
    }

    public void setDistUserName(String distUserName) {
        this.distUserName = distUserName == null ? null : distUserName.trim();
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId == null ? null : acceptUserId.trim();
    }

    public String getAcceptUserName() {
        return acceptUserName;
    }

    public void setAcceptUserName(String acceptUserName) {
        this.acceptUserName = acceptUserName == null ? null : acceptUserName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}