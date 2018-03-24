/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: ChannelSupermarketVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 20:42 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 20:42      0.0.1             TODO
 */
@ApiModel(description = "渠道超市列表的描述类")
public class ChannelSupermarketVO implements Serializable {

    @ApiModelProperty("超市标识")
    private Integer supermarketId; /*超市标识*/
    @ApiModelProperty("超市名称")
    private String supermarketName; /*超市名称*/
    @ApiModelProperty("超市编码")
    private String supermarketCode; /*超市编码*/
    @ApiModelProperty("审核状态")
    private Integer status; /*审核状态*/
    @ApiModelProperty("渠道名称")
    private String channelName; /*渠道名称*/

    public ChannelSupermarketVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ChannelSupermarketVO(Integer supermarketId, String supermarketName, String supermarketCode, Integer status,
            String channelName) {
        super();
        this.supermarketId = supermarketId;
        this.supermarketName = supermarketName;
        this.supermarketCode = supermarketCode;
        this.status = status;
        this.channelName = channelName;
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

    public String getSupermarketCode() {
        return supermarketCode;
    }

    public void setSupermarketCode(String supermarketCode) {
        this.supermarketCode = supermarketCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public String toString() {
        return "ChannelSupermarketVO [supermarketId=" + supermarketId + ", supermarketName=" + supermarketName
                + ", supermarketCode=" + supermarketCode + ", status=" + status + ", channelName=" + channelName + "]";
    }

}
