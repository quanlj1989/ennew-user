/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: ChargeStandardVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-21 10:08 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-21 10:08      0.0.1             TODO
 */
@ApiModel(description = "仓库收费标准的描述类")
public class ChargeStandardVO implements Serializable {

    @ApiModelProperty("收费类型")
    private String chargeType; /*收费类型*/
    @ApiModelProperty("收费明细")
    private String chargeDetail; /*收费明细*/
    @ApiModelProperty("添加人")
    private List<String> operator; /*添加人*/

    public ChargeStandardVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ChargeStandardVO(String chargeType, String chargeDetail, List<String> operator) {
        super();
        this.chargeType = chargeType;
        this.chargeDetail = chargeDetail;
        this.operator = operator;
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

    public List<String> getOperator() {
        return operator;
    }

    public void setOperator(List<String> operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "ChargeStandardVO [chargeType=" + chargeType + ", chargeDetail=" + chargeDetail + ", operator="
                + operator + "]";
    }

}
