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
 * ClassName: SupermarketVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 19:43 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 19:43      0.0.1             TODO
 */
@ApiModel(description = "超市仓储列表的描述类")
public class SupermarketVO implements Serializable {

    @ApiModelProperty("超市标识")
    private Integer supermarketId; /*超市标识*/
    @ApiModelProperty("超市编码")
    private String supermarketCode; /*超市编码*/
    @ApiModelProperty("超市名称")
    private String supermarketName; /*超市名称*/
    @ApiModelProperty("仓库名称")
    private List<String> warehouseName; /*仓库名称*/
    @ApiModelProperty("服务类型")
    private String serviceType; /*服务类型*/
    @ApiModelProperty("状态")
    private Integer status; /*状态：1.启用 0.禁用*/

    public SupermarketVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SupermarketVO(Integer supermarketId, String supermarketCode, String supermarketName,
            List<String> warehouseName, String serviceType, Integer status) {
        super();
        this.supermarketId = supermarketId;
        this.supermarketCode = supermarketCode;
        this.supermarketName = supermarketName;
        this.warehouseName = warehouseName;
        this.serviceType = serviceType;
        this.status = status;
    }

    public Integer getSupermarketId() {
        return supermarketId;
    }

    public void setSupermarketId(Integer supermarketId) {
        this.supermarketId = supermarketId;
    }

    public String getSupermarketCode() {
        return supermarketCode;
    }

    public void setSupermarketCode(String supermarketCode) {
        this.supermarketCode = supermarketCode;
    }

    public String getSupermarketName() {
        return supermarketName;
    }

    public void setSupermarketName(String supermarketName) {
        this.supermarketName = supermarketName;
    }

    public List<String> getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(List<String> warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SupermarketVO [supermarketId=" + supermarketId + ", supermarketCode=" + supermarketCode
                + ", supermarketName=" + supermarketName + ", warehouseName=" + warehouseName + ", serviceType="
                + serviceType + ", status=" + status + "]";
    }

}
