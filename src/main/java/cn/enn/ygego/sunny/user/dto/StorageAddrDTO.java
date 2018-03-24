package cn.enn.ygego.sunny.user.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * DTO:StorageAddr
 * 
 * @author gencode
 * @date 2018-3-20
 */
@ApiModel(description = "采购工厂库存地")
public class StorageAddrDTO implements Serializable {
	
	private static final long serialVersionUID = -4147145381537482736L;
	
	@ApiModelProperty("库存地ID")
	private Long	storageAddrId; /* 库存地ID */
	@ApiModelProperty("工厂ID")
	private Long	factoryId; /* 工厂ID */
	@ApiModelProperty("库存地代码")
	private String	storageAddrCode; /* 库存地代码 */
	@ApiModelProperty("库存地名称")
	private String	storageAddrName; /* 库存地名称 */
	@ApiModelProperty("创建时间")
	private Date	createTime; /* 创建时间 */
	@ApiModelProperty("创建人会员ID")
	private Long	createMemberId; /* 创建人会员ID */
	@ApiModelProperty("创建人账户ID")
	private Long	createAcctId; /* 创建人账户ID */
	@ApiModelProperty("创建人姓名")
	private String	createName; /* 创建人姓名 */

	// Constructor
	public StorageAddrDTO() {
	}

	/**
	 * full Constructor
	 */
	public StorageAddrDTO(Long storageAddrId, Long factoryId, String storageAddrCode, String storageAddrName, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.storageAddrId = storageAddrId;
		this.factoryId = factoryId;
		this.storageAddrCode = storageAddrCode;
		this.storageAddrName = storageAddrName;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getStorageAddrId() {
		return storageAddrId;
	}

	public void setStorageAddrId(Long storageAddrId) {
		this.storageAddrId = storageAddrId;
	}
	public Long getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(Long factoryId) {
		this.factoryId = factoryId;
	}
	public String getStorageAddrCode() {
		return storageAddrCode;
	}

	public void setStorageAddrCode(String storageAddrCode) {
		this.storageAddrCode = storageAddrCode;
	}
	public String getStorageAddrName() {
		return storageAddrName;
	}

	public void setStorageAddrName(String storageAddrName) {
		this.storageAddrName = storageAddrName;
	}
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getCreateMemberId() {
		return createMemberId;
	}

	public void setCreateMemberId(Long createMemberId) {
		this.createMemberId = createMemberId;
	}
	public Long getCreateAcctId() {
		return createAcctId;
	}

	public void setCreateAcctId(Long createAcctId) {
		this.createAcctId = createAcctId;
	}
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}
	@Override
	public String toString() {
		return "StorageAddrDTO [" + "storageAddrId=" + storageAddrId + ", factoryId=" + factoryId + ", storageAddrCode=" + storageAddrCode + ", storageAddrName=" + storageAddrName + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
