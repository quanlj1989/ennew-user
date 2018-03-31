package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketStorageInfo
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketStorageInfo implements Serializable {
	
	private Long	storageId;		 /* 仓库ID */ 
	private Long	marketId;		 /* 超市ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private String	storageCode;		 /* 仓库编码 */ 
	private String	storageName;		 /* 仓库名称 */ 
	private String	contact;		 /* 联系人 */ 
	private String	contactTel;		 /* 联系电话 */ 
	private String	email;		 /* 电子邮件 */ 
	private Long	areaId;		 /* 地区ID */ 
	private String	areaIdFullPath;		 /* 地区ID路径 */ 
	private String	areaNameFullPath;		 /* 地区名称路径 */ 
	private String	addressDetail;		 /* 详细地址 */ 
	private Integer	insideArea;		 /* 室内面积 */ 
	private Integer	outsideArea;		 /* 室外面积 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public MarketStorageInfo() {
	}

	/**
	 * full Constructor
	 */
	public MarketStorageInfo(Long storageId, Long marketId, Long memberId, String storageCode, String storageName, String contact, String contactTel, String email, Long areaId, String areaIdFullPath, String areaNameFullPath, String addressDetail, Integer insideArea, Integer outsideArea, Date createTime, Long createAcctId, String createName) {
		this.storageId = storageId;
		this.marketId = marketId;
		this.memberId = memberId;
		this.storageCode = storageCode;
		this.storageName = storageName;
		this.contact = contact;
		this.contactTel = contactTel;
		this.email = email;
		this.areaId = areaId;
		this.areaIdFullPath = areaIdFullPath;
		this.areaNameFullPath = areaNameFullPath;
		this.addressDetail = addressDetail;
		this.insideArea = insideArea;
		this.outsideArea = outsideArea;
		this.createTime = createTime;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getStorageId() {
		return storageId;
	}

	public void setStorageId(Long storageId) {
		this.storageId = storageId;
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

	public String getStorageCode() {
		return storageCode;
	}

	public void setStorageCode(String storageCode) {
		this.storageCode = storageCode;
	}

	public String getStorageName() {
		return storageName;
	}

	public void setStorageName(String storageName) {
		this.storageName = storageName;
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

	public Integer getInsideArea() {
		return insideArea;
	}

	public void setInsideArea(Integer insideArea) {
		this.insideArea = insideArea;
	}

	public Integer getOutsideArea() {
		return outsideArea;
	}

	public void setOutsideArea(Integer outsideArea) {
		this.outsideArea = outsideArea;
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
		return "MarketStorageInfo [" + "storageId=" + storageId + ", marketId=" + marketId + ", memberId=" + memberId + ", storageCode=" + storageCode + ", storageName=" + storageName + ", contact=" + contact + ", contactTel=" + contactTel + ", email=" + email + ", areaId=" + areaId + ", areaIdFullPath=" + areaIdFullPath + ", areaNameFullPath=" + areaNameFullPath + ", addressDetail=" + addressDetail + ", insideArea=" + insideArea + ", outsideArea=" + outsideArea + ", createTime=" + createTime + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
