package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:EntAuthCertApply
 * 
 * @author gencode
 */
public class EntAuthCertApply implements Serializable {
	
	private static final long serialVersionUID = 6200833308941555474L;
	
	private Long	certApplyId;		 /* 资质申请ID */ 
	private Long	authApplyId;		 /* 认证申请ID */ 
	private Long	memberId;		 /* 会员ID */ 
	private Integer	authenType;		 /* 认证类型 */ 
	private Integer	certType;		 /* 资质类型 */ 
	private String	certName;		 /* 资质名称 */ 
	private String	certNo;		 /* 资质号码 */ 
	private Date	certValidDate;		 /* 资质有效期 */ 
	private Integer	sortNum;		 /* 排序编号 */ 
	private Date	createTime;		 /* 创建时间 */ 

	// Constructor
	public EntAuthCertApply() {
	}

	/**
	 * full Constructor
	 */
	public EntAuthCertApply(Long certApplyId, Long authApplyId, Long memberId, Integer authenType, Integer certType, String certName, String certNo, Date certValidDate, Integer sortNum, Date createTime) {
		this.certApplyId = certApplyId;
		this.authApplyId = authApplyId;
		this.memberId = memberId;
		this.authenType = authenType;
		this.certType = certType;
		this.certName = certName;
		this.certNo = certNo;
		this.certValidDate = certValidDate;
		this.sortNum = sortNum;
		this.createTime = createTime;
	}

	public Long getCertApplyId() {
		return certApplyId;
	}

	public void setCertApplyId(Long certApplyId) {
		this.certApplyId = certApplyId;
	}

	public Long getAuthApplyId() {
		return authApplyId;
	}

	public void setAuthApplyId(Long authApplyId) {
		this.authApplyId = authApplyId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Integer getAuthenType() {
		return authenType;
	}

	public void setAuthenType(Integer authenType) {
		this.authenType = authenType;
	}

	public Integer getCertType() {
		return certType;
	}

	public void setCertType(Integer certType) {
		this.certType = certType;
	}

	public String getCertName() {
		return certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Date getCertValidDate() {
		return certValidDate;
	}

	public void setCertValidDate(Date certValidDate) {
		this.certValidDate = certValidDate;
	}

	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "EntAuthCertApply [" + "certApplyId=" + certApplyId+ ", authApplyId=" + authApplyId+ ", memberId=" + memberId+ ", authenType=" + authenType+ ", certType=" + certType+ ", certName=" + certName+ ", certNo=" + certNo+ ", certValidDate=" + certValidDate+ ", sortNum=" + sortNum+ ", createTime=" + createTime+  "]";
	}
}
