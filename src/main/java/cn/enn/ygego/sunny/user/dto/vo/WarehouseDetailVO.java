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
 * ClassName: WarehouseDetailVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-21 09:44 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-21 09:44      0.0.1             TODO
 */
@ApiModel(description = "仓库列表详情的描述类")
public class WarehouseDetailVO implements Serializable {

    @ApiModelProperty("仓库信息")
    private WarehouseInfoVO warehouseInfo; /*仓库信息*/
    @ApiModelProperty("申请内容")
    private ApplyContentVO applyContent; /*申请内容*/
    @ApiModelProperty("收费标准")
    private List<ChargeStandardVO> chargeStandard; /*收费标准*/

    public WarehouseDetailVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public WarehouseDetailVO(WarehouseInfoVO warehouseInfo, ApplyContentVO applyContent,
            List<ChargeStandardVO> chargeStandard) {
        super();
        this.warehouseInfo = warehouseInfo;
        this.applyContent = applyContent;
        this.chargeStandard = chargeStandard;
    }

    public WarehouseInfoVO getWarehouseInfo() {
        return warehouseInfo;
    }

    public void setWarehouseInfo(WarehouseInfoVO warehouseInfo) {
        this.warehouseInfo = warehouseInfo;
    }

    public ApplyContentVO getApplyContent() {
        return applyContent;
    }

    public void setApplyContent(ApplyContentVO applyContent) {
        this.applyContent = applyContent;
    }

    public List<ChargeStandardVO> getChargeStandard() {
        return chargeStandard;
    }

    public void setChargeStandard(List<ChargeStandardVO> chargeStandard) {
        this.chargeStandard = chargeStandard;
    }

    @Override
    public String toString() {
        return "WarehouseDetailVO [warehouseInfo=" + warehouseInfo + ", applyContent=" + applyContent
                + ", chargeStandard=" + chargeStandard + "]";
    }

}
