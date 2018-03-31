/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.supermarket;

import java.util.List;

/**
 * 申请入驻超市信息详情描述类
 * ClassName: SupermarketInfoVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-30 18:49 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-30 18:49      0.0.1             TODO
 */

public class SupermarketInfoVO {

    // 超市id
    private Long marketId;
    // 超市编码
    private String supermarketCode;
    // 经营类型
    private Integer serviceType;
    // 联系人
    private String contact;
    // 联系电话
    private String contactTel;
    // 仓库地址
    private List<String> storageName;
    // 收费类型
    private String chargeType;

    public SupermarketInfoVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SupermarketInfoVO(Long marketId, String supermarketCode, Integer serviceType, String contact,
            String contactTel, List<String> storageName, String chargeType) {
        super();
        this.marketId = marketId;
        this.supermarketCode = supermarketCode;
        this.serviceType = serviceType;
        this.contact = contact;
        this.contactTel = contactTel;
        this.storageName = storageName;
        this.chargeType = chargeType;
    }

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    public String getSupermarketCode() {
        return supermarketCode;
    }

    public void setSupermarketCode(String supermarketCode) {
        this.supermarketCode = supermarketCode;
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
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

    @Override
    public String toString() {
        return "SupermarketInfoVO [marketId=" + marketId + ", supermarketCode=" + supermarketCode + ", serviceType="
                + serviceType + ", contact=" + contact + ", contactTel=" + contactTel + ", storageName=" + storageName
                + ", chargeType=" + chargeType + "]";
    }

}
