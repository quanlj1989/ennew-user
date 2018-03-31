/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.supermarket;

/**
 * 仓储服务费用
 * ClassName: WarehouseChargeVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-31 11:19 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-31 11:19      0.0.1             TODO
 */

public class WarehouseChargeVO {

    // 收费类型
    private String chargeType;
    // 收费详情
    private String chargeDetail;
    // 适用物料
    private String forMaterial;

    public WarehouseChargeVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public WarehouseChargeVO(String chargeType, String chargeDetail, String forMaterial) {
        super();
        this.chargeType = chargeType;
        this.chargeDetail = chargeDetail;
        this.forMaterial = forMaterial;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getChargeDetail() {
        return chargeDetail;
    }

    public void setChargeDetail(String chargeDetail) {
        this.chargeDetail = chargeDetail;
    }

    public String getForMaterial() {
        return forMaterial;
    }

    public void setForMaterial(String forMaterial) {
        this.forMaterial = forMaterial;
    }

    @Override
    public String toString() {
        return "WarehouseChargeVO [chargeType=" + chargeType + ", chargeDetail=" + chargeDetail + ", forMaterial="
                + forMaterial + "]";
    }

}
