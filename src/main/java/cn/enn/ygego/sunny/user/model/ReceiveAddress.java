package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:ReceiveAddress
 * 
 * @author gencode
 */
public class ReceiveAddress implements Serializable {
	
	private static final long serialVersionUID = 7365661255971686765L;
	
	private Long	receiveAddressId;		 /* 收货地址ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Long	areaId;		 /* 地区ID */ 
	private String	areaIdFullPath;		 /* 地区ID路径 */ 
	private String	areaNameFullPath;		 /* 地区名称路径 */ 
	private String	addressDetail;		 /* 详细地址 */ 
	private String	contact;		 /* 联系人 */ 
	private String	contactTel;		 /* 联系电话 */ 
	private String	fixedPhone;		 /* 固定电话 */ 
	private Integer	isDefaultReceiveAddr;		 /* 是否默认收货地 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public ReceiveAddress() {
	}

	/**
	 * full Constructor
	 */
	public ReceiveAddress(Long receiveAddressId, Long memberId, Long areaId, String areaIdFullPath, String areaNameFullPath, String addressDetail, String contact, String contactTel, String fixedPhone, Integer isDefaultReceiveAddr, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.receiveAddressId = receiveAddressId;
		this.memberId = memberId;
		this.areaId = areaId;
		this.areaIdFullPath = areaIdFullPath;
		this.areaNameFullPath = areaNameFullPath;
		this.addressDetail = addressDetail;
		this.contact = contact;
		this.contactTel = contactTel;
		this.fixedPhone = fixedPhone;
		this.isDefaultReceiveAddr = isDefaultReceiveAddr;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getReceiveAddressId() {
		return receiveAddressId;
	}

	public void setReceiveAddressId(Long receiveAddressId) {
		this.receiveAddressId = receiveAddressId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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

	public String getFixedPhone() {
		return fixedPhone;
	}

	public void setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
	}

	public Integer getIsDefaultReceiveAddr() {
		return isDefaultReceiveAddr;
	}

	public void setIsDefaultReceiveAddr(Integer isDefaultReceiveAddr) {
		this.isDefaultReceiveAddr = isDefaultReceiveAddr;
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
		return "ReceiveAddress [" + "receiveAddressId=" + receiveAddressId+ ", memberId=" + memberId+ ", areaId=" + areaId+ ", areaIdFullPath=" + areaIdFullPath+ ", areaNameFullPath=" + areaNameFullPath+ ", addressDetail=" + addressDetail+ ", contact=" + contact+ ", contactTel=" + contactTel+ ", fixedPhone=" + fixedPhone+ ", isDefaultReceiveAddr=" + isDefaultReceiveAddr+ ", createTime=" + createTime+ ", createMemberId=" + createMemberId+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
