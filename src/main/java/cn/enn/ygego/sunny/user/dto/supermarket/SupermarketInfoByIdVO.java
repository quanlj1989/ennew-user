/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.supermarket;

import java.util.List;

/**
 * 查看超市详情超市信息描述类
 * ClassName: SupermarketInfoByIdVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-31 14:38 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-31 14:38      0.0.1             TODO
 */

public class SupermarketInfoByIdVO {

    // 超市id
    private Long marketId;
    // 超市编码
    private String marketCode;
    // 超市名称
    private String marketName;
    // 定位位置
    private String position;
    // 经营类型
    private String serviceType;
    // 库房位置
    private List<String> storageName;
    // 收费模式
    private String chargeType;
    // 入驻渠道
    private String enterChannel;
    // 入驻供应商
    private Integer supplierNum;
    // 入驻商品种类
    private Integer goodsKind;

    public SupermarketInfoByIdVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SupermarketInfoByIdVO(Long marketId, String marketCode, String marketName, String position,
            String serviceType, List<String> storageName, String chargeType, String enterChannel, Integer supplierNum,
            Integer goodsKind) {
        super();
        this.marketId = marketId;
        this.marketCode = marketCode;
        this.marketName = marketName;
        this.position = position;
        this.serviceType = serviceType;
        this.storageName = storageName;
        this.chargeType = chargeType;
        this.enterChannel = enterChannel;
        this.supplierNum = supplierNum;
        this.goodsKind = goodsKind;
    }

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public List<String> getStorageName() {
        return storageName;
    }

    public void setStorageName(List<String> storageName) {
        this.storageName = storageName;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getEnterChannel() {
        return enterChannel;
    }

    public void setEnterChannel(String enterChannel) {
        this.enterChannel = enterChannel;
    }

    public Integer getSupplierNum() {
        return supplierNum;
    }

    public void setSupplierNum(Integer supplierNum) {
        this.supplierNum = supplierNum;
    }

    public Integer getGoodsKind() {
        return goodsKind;
    }

    public void setGoodsKind(Integer goodsKind) {
        this.goodsKind = goodsKind;
    }

    @Override
    public String toString() {
        return "SupermarketInfoByIdVO [marketId=" + marketId + ", marketCode=" + marketCode + ", marketName="
                + marketName + ", position=" + position + ", serviceType=" + serviceType + ", storageName="
                + storageName + ", chargeType=" + chargeType + ", enterChannel=" + enterChannel + ", supplierNum="
                + supplierNum + ", goodsKind=" + goodsKind + "]";
    }

}
