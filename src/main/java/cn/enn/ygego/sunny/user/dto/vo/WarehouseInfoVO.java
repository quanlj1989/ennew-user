/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: WarehouseInfoVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-21 09:45 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-21 09:45      0.0.1             TODO
 */
@ApiModel(description = "仓库信息的描述类")
public class WarehouseInfoVO implements Serializable {

    @ApiModelProperty("仓库编号")
    private String warehouseCode; /*仓库编号*/
    @ApiModelProperty("仓库名称")
    private String warehouseName; /*仓库名称*/
    @ApiModelProperty("仓库地址")
    private String warehouseAddr; /*仓库地址*/
    @ApiModelProperty("仓库状态")
    private Integer status; /*仓库状态*/
    @ApiModelProperty("仓库经理")
    private String warehouseManager; /*仓库经理*/
    @ApiModelProperty("联系电话")
    private String warehouseTel; /*联系电话*/

    public WarehouseInfoVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public WarehouseInfoVO(String warehouseCode, String warehouseName, String warehouseAddr, Integer status,
            String warehouseManager, String warehouseTel) {
        super();
        this.warehouseCode = warehouseCode;
        this.warehouseName = warehouseName;
        this.warehouseAddr = warehouseAddr;
        this.status = status;
        this.warehouseManager = warehouseManager;
        this.warehouseTel = warehouseTel;
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

    public String getWarehouseManager() {
        return warehouseManager;
    }

    public void setWarehouseManager(String warehouseManager) {
        this.warehouseManager = warehouseManager;
    }

    public String getWarehouseTel() {
        return warehouseTel;
    }

    public void setWarehouseTel(String warehouseTel) {
        this.warehouseTel = warehouseTel;
    }

    @Override
    public String toString() {
        return "WarehouseInfoVO [warehouseCode=" + warehouseCode + ", warehouseName=" + warehouseName
                + ", warehouseAddr=" + warehouseAddr + ", status=" + status + ", warehouseManager=" + warehouseManager
                + ", warehouseTel=" + warehouseTel + "]";
    }

}
