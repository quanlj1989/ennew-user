/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: WarehouseVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 21:03 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 21:03      0.0.1             TODO
 */
@ApiModel(description = "仓库列表的描述类")
public class WarehouseVO implements Serializable {

    @ApiModelProperty("仓库标识")
    private Long warehouseId; /*仓库标识*/
    @ApiModelProperty("仓库编码")
    private String warehouseCode; /*仓库编码*/
    @ApiModelProperty("仓库名称")
    private String warehouseName; /*仓库名称*/
    @ApiModelProperty("仓库地址")
    private String warehouseAddr; /*仓库地址*/
    @ApiModelProperty("审核状态")
    private Integer status; /*审核状态*/

    public WarehouseVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public WarehouseVO(Long warehouseId, String warehouseCode, String warehouseName, String warehouseAddr,
            Integer status) {
        super();
        this.warehouseId = warehouseId;
        this.warehouseCode = warehouseCode;
        this.warehouseName = warehouseName;
        this.warehouseAddr = warehouseAddr;
        this.status = status;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseAddr() {
        return warehouseAddr;
    }

    public void setWarehouseAddr(String warehouseAddr) {
        this.warehouseAddr = warehouseAddr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WarehouseVO [warehouseId=" + warehouseId + ", warehouseCode=" + warehouseCode + ", warehouseName="
                + warehouseName + ", warehouseAddr=" + warehouseAddr + ", status=" + status + "]";
    }

}
