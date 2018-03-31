package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketInfo implements Serializable {
	
	private Long	marketId;		 /* 超市ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private String	marketCode;		 /* 超市编码 */ 
	private String	marketName;		 /* 超市名称 */ 
	private String	serviceType;		 /* 服务类型 */ 
	private Long	areaId;		 /* 地区ID */ 
	private String	areaIdFullPath;		 /* 地区ID路径 */ 
	private String	areaNameFullPath;		 /* 地区名称路径 */ 
	private String	addressDetail;		 /* 详细地址 */ 
	private String	contact;		 /* 联系人 */ 
	private String	contactTel;		 /* 联系电话 */ 
	private String	email;		 /* 电子邮件 */ 
	private Integer	status;		 /* 状态 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public MarketInfo() {
	}

	/**
	 * full Constructor
	 */
	public MarketInfo(Long marketId, Long memberId, String marketCode, String marketName, String serviceType, Long areaId, String areaIdFullPath, String areaNameFullPath, String addressDetail, String contact, String contactTel, String email, Integer status, Date createTime, Long createAcctId, String createName) {
		this.marketId = marketId;
		this.memberId = memberId;
		this.marketCode = marketCode;
		this.marketName = marketName;
		this.serviceType = serviceType;
		this.areaId = areaId;
		this.areaIdFullPath = areaIdFullPath;
		this.areaNameFullPath = areaNameFullPath;
		this.addressDetail = addressDetail;
		this.contact = contact;
		this.contactTel = contactTel;
		this.email = email;
		this.status = status;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getMarketCode() {
		return marketCode;
	}

	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAreaIdFullPath() {
		return areaIdFullPath;
	}

	public void setAreaIdFullPath(String areaIdFullPath) {
		this.areaIdFullPath = areaIdFullPath;
	}

	public String getAreaNameFullPath() {
		return areaNameFullPath;
	}

	public void setAreaNameFullPath(String areaNameFullPath) {
		this.areaNameFullPath = areaNameFullPath;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
		return "MarketInfo [" + "marketId=" + marketId + ", memberId=" + memberId + ", marketCode=" + marketCode + ", marketName=" + marketName + ", serviceType=" + serviceType + ", areaId=" + areaId + ", areaIdFullPath=" + areaIdFullPath + ", areaNameFullPath=" + areaNameFullPath + ", addressDetail=" + addressDetail + ", contact=" + contact + ", contactTel=" + contactTel + ", email=" + email + ", status=" + status + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
