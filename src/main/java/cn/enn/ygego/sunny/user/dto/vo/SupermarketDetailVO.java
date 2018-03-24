/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: SupermarketDetailVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 20:13 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 20:13      0.0.1             TODO
 */
@ApiModel(description = "超市仓储详情的描述类")
public class SupermarketDetailVO implements Serializable {

    @ApiModelProperty("超市标识")
    private Integer supermarketId; /*超市标识*/
    @ApiModelProperty("超市名称")
    private String supermarketName; /*超市名称*/
    @ApiModelProperty("收费类型")
    private ChargeTypeVO chargeType; /*收费类型*/
    @ApiModelProperty("服务类型")
    private String serviceType; /*服务类型*/

    public SupermarketDetailVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SupermarketDetailVO(Integer supermarketId, String supermarketName, ChargeTypeVO chargeType,
            String serviceType) {
        super();
        this.supermarketId = supermarketId;
        this.supermarketName = supermarketName;
        this.chargeType = chargeType;
        this.serviceType = serviceType;
    }

    public Integer getSupermarketId() {
        return supermarketId;
    }

    public void setSupermarketId(Integer supermarketId) {
        this.supermarketId = supermarketId;
    }

    public String getSupermarketName() {
        return supermarketName;
    }

    public void setSupermarketName(String supermarketName) {
        this.supermarketName = supermarketName;
    }

    public ChargeTypeVO getChargeType() {
        return chargeType;
    }

    public void setChargeType(ChargeTypeVO chargeType) {
        this.chargeType = chargeType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "SupermarketDetailVO [supermarketId=" + supermarketId + ", supermarketName=" + supermarketName
                + ", chargeType=" + chargeType + ", serviceType=" + serviceType + "]";
    }

}
