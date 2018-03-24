/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: chargeTypeVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 20:17 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 20:17      0.0.1             TODO
 */
@ApiModel(description = "超市仓储详情收费的描述类")
public class ChargeTypeVO implements Serializable {

    @ApiModelProperty("服务费用")
    private Integer serviceCharge; /*服务费用*/
    @ApiModelProperty("费用单位")
    private String unit; /*费用单位*/
    @ApiModelProperty("仓库费用")
    private String warehouseCharge; /*仓库费用*/

    public ChargeTypeVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ChargeTypeVO(Integer serviceCharge, String unit, String warehouseCharge) {
        super();
        this.serviceCharge = serviceCharge;
        this.unit = unit;
        this.warehouseCharge = warehouseCharge;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getWarehouseCharge() {
        return warehouseCharge;
    }

    public void setWarehouseCharge(String warehouseCharge) {
        this.warehouseCharge = warehouseCharge;
    }

    @Override
    public String toString() {
        return "chargeTypeVO [serviceCharge=" + serviceCharge + ", unit=" + unit + ", warehouseCharge="
                + warehouseCharge + "]";
    }

}
