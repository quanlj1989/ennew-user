package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:DeliverAddress
 * 
 * @author gencode
 * @date 2018-3-22
 */
public class DeliverAddressDTO implements Serializable {
	
	private static final long serialVersionUID = -5343668407419792405L;
	
	private Long	deliverAddressId; /* 发货地址ID */
	private Long	memberId; /* 会员ID */
	private Long	areaId; /* 地区ID */
	private String	areaIdFullPath; /* 地区ID路径 */
	private String	areaNameFullPath; /* 地区名称路径 */
	private String	addressDetail; /* 详细地址 */
	private String	contact; /* 联系人 */
	private String	contactTel; /* 联系电话 */
	private String	fixedPhone; /* 固定电话 */
	private Integer	isDefaultDeliverAddr; /* 是否默认发货地 */
	private Integer	isDefaultRefundAddr; /* 是否默认退货地 */
	private Date	createTime; /* 创建时间 */
	private Long	createMemberId; /* 创建人会员ID */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */

	// Constructor
	public DeliverAddressDTO() {
	}

	/**
	 * full Constructor
	 */
	public DeliverAddressDTO(Long deliverAddressId, Long memberId, Long areaId, String areaIdFullPath, String areaNameFullPath, String addressDetail, String contact, String contactTel, String fixedPhone, Integer isDefaultDeliverAddr, Integer isDefaultRefundAddr, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.deliverAddressId = deliverAddressId;
		this.memberId = memberId;
		this.areaId = areaId;
		this.areaIdFullPath = areaIdFullPath;
		this.areaNameFullPath = areaNameFullPath;
		this.addressDetail = addressDetail;
		this.contact = contact;
		this.contactTel = contactTel;
		this.fixedPhone = fixedPhone;
		this.isDefaultDeliverAddr = isDefaultDeliverAddr;
		this.isDefaultRefundAddr = isDefaultRefundAddr;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getDeliverAddressId() {
		return deliverAddressId;
	}

	public void setDeliverAddressId(Long deliverAddressId) {
		this.deliverAddressId = deliverAddressId;
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
	public Integer getIsDefaultDeliverAddr() {
		return isDefaultDeliverAddr;
	}

	public void setIsDefaultDeliverAddr(Integer isDefaultDeliverAddr) {
		this.isDefaultDeliverAddr = isDefaultDeliverAddr;
	}
	public Integer getIsDefaultRefundAddr() {
		return isDefaultRefundAddr;
	}

	public void setIsDefaultRefundAddr(Integer isDefaultRefundAddr) {
		this.isDefaultRefundAddr = isDefaultRefundAddr;
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
		return "DeliverAddressDTO [" + "deliverAddressId=" + deliverAddressId + ", memberId=" + memberId + ", areaId=" + areaId + ", areaIdFullPath=" + areaIdFullPath + ", areaNameFullPath=" + areaNameFullPath + ", addressDetail=" + addressDetail + ", contact=" + contact + ", contactTel=" + contactTel + ", fixedPhone=" + fixedPhone + ", isDefaultDeliverAddr=" + isDefaultDeliverAddr + ", isDefaultRefundAddr=" + isDefaultRefundAddr + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
