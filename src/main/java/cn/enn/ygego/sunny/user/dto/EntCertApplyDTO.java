package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntCertApply
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntCertApplyDTO implements Serializable {
	
	private static final long serialVersionUID = -5683003901894834178L;
	
	private Long	certApplyId; /* 资质申请ID */
	private Long	memberId; /* 会员ID */
	private String	entCode; /* 企业编码 */
	private Long	pareMemberId; /* 父级会员ID */
	private Integer	applyType; /* 申请类型 */
	private Integer	authenType; /* 认证类型 */
	private String	entName; /* 企业名称 */
	private Integer	entType; /* 企业类型 */
	private String	businessMode; /* 经营模式 */
	private String	legalPerson; /* 法人 */
	private Integer	legalPersonNationality; /* 法人国籍 */
	private Integer	businessLicenseAreaId; /* 营业执照所在地域ID */
	private String	businessLicenseAddress; /* 营业执照详细地址 */
	private Integer	businessLicenseType; /* 营业执照类型 */
	private Date	establishDate; /* 成立日期 */
	private Date	certStartDate; /* 营业执照起始 */
	private Date	certLimitDate; /* 营业执照截止 */
	private Integer	limitType; /* 期限类型 */
	private Integer	entCertType; /* 企业证件类型 */
	private Long	regCapital; /* 注册资本 */
	private Integer	regCapitalUnit; /* 注册资本单位类型 */
	private String	entTel; /* 企业电话 */
	private Integer	status; /* 状态 */
	private Date	applyTime; /* 申请时间 */
	private Date	createTime; /* 创建时间 */
	private Long	createMemberId; /* 创建人会员ID */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */
	private Long	approveAcctId; /* 审核人账户ID */
	private String	approveName; /* 审核人姓名 */
	private Long	approveMemberId; /* 审核人会员ID */
	private Date	auditTime; /* 审核时间 */
	private String	approveDesc; /* 审核结果描述 */

	// Constructor
	public EntCertApplyDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntCertApplyDTO(Long certApplyId, Long memberId, String entCode, Long pareMemberId, Integer applyType, Integer authenType, String entName, Integer entType, String businessMode, String legalPerson, Integer legalPersonNationality, Integer businessLicenseAreaId, String businessLicenseAddress, Integer businessLicenseType, Date establishDate, Date certStartDate, Date certLimitDate, Integer limitType, Integer entCertType, Long regCapital, Integer regCapitalUnit, String entTel, Integer status, Date applyTime, Date createTime, Long createMemberId, Long createAcctId, String createName, Long approveAcctId, String approveName, Long approveMemberId, Date auditTime, String approveDesc) {
		this.certApplyId = certApplyId;
		this.memberId = memberId;
		this.entCode = entCode;
		this.pareMemberId = pareMemberId;
		this.applyType = applyType;
		this.authenType = authenType;
		this.entName = entName;
		this.entType = entType;
		this.businessMode = businessMode;
		this.legalPerson = legalPerson;
		this.legalPersonNationality = legalPersonNationality;
		this.businessLicenseAreaId = businessLicenseAreaId;
		this.businessLicenseAddress = businessLicenseAddress;
		this.businessLicenseType = businessLicenseType;
		this.establishDate = establishDate;
		this.certStartDate = certStartDate;
		this.certLimitDate = certLimitDate;
		this.limitType = limitType;
		this.entCertType = entCertType;
		this.regCapital = regCapital;
		this.regCapitalUnit = regCapitalUnit;
		this.entTel = entTel;
		this.status = status;
		this.applyTime = applyTime;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.approveAcctId = approveAcctId;
		this.approveName = approveName;
		this.approveMemberId = approveMemberId;
		this.auditTime = auditTime;
		this.approveDesc = approveDesc;
	}

	public Long getCertApplyId() {
		return certApplyId;
	}

	public void setCertApplyId(Long certApplyId) {
		this.certApplyId = certApplyId;
	}
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getEntCode() {
		return entCode;
	}

	public void setEntCode(String entCode) {
		this.entCode = entCode;
	}
	public Long getPareMemberId() {
		return pareMemberId;
	}

	public void setPareMemberId(Long pareMemberId) {
		this.pareMemberId = pareMemberId;
	}
	public Integer getApplyType() {
		return applyType;
	}

	public void setApplyType(Integer applyType) {
		this.applyType = applyType;
	}
	public Integer getAuthenType() {
		return authenType;
	}

	public void setAuthenType(Integer authenType) {
		this.authenType = authenType;
	}
	public String getEntName() {
		return entName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}
	public Integer getEntType() {
		return entType;
	}

	public void setEntType(Integer entType) {
		this.entType = entType;
	}
	public String getBusinessMode() {
		return businessMode;
	}

	public void setBusinessMode(String businessMode) {
		this.businessMode = businessMode;
	}
	public String getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}
	public Integer getLegalPersonNationality() {
		return legalPersonNationality;
	}

	public void setLegalPersonNationality(Integer legalPersonNationality) {
		this.legalPersonNationality = legalPersonNationality;
	}
	public Integer getBusinessLicenseAreaId() {
		return businessLicenseAreaId;
	}

	public void setBusinessLicenseAreaId(Integer businessLicenseAreaId) {
		this.businessLicenseAreaId = businessLicenseAreaId;
	}
	public String getBusinessLicenseAddress() {
		return businessLicenseAddress;
	}

	public void setBusinessLicenseAddress(String businessLicenseAddress) {
		this.businessLicenseAddress = businessLicenseAddress;
	}
	public Integer getBusinessLicenseType() {
		return businessLicenseType;
	}

	public void setBusinessLicenseType(Integer businessLicenseType) {
		this.businessLicenseType = businessLicenseType;
	}
	public Date getEstablishDate() {
		return establishDate;
	}

	public void setEstablishDate(Date establishDate) {
		this.establishDate = establishDate;
	}
	public Date getCertStartDate() {
		return certStartDate;
	}

	public void setCertStartDate(Date certStartDate) {
		this.certStartDate = certStartDate;
	}
	public Date getCertLimitDate() {
		return certLimitDate;
	}

	public void setCertLimitDate(Date certLimitDate) {
		this.certLimitDate = certLimitDate;
	}
	public Integer getLimitType() {
		return limitType;
	}

	public void setLimitType(Integer limitType) {
		this.limitType = limitType;
	}
	public Integer getEntCertType() {
		return entCertType;
	}

	public void setEntCertType(Integer entCertType) {
		this.entCertType = entCertType;
	}
	public Long getRegCapital() {
		return regCapital;
	}

	public void setRegCapital(Long regCapital) {
		this.regCapital = regCapital;
	}
	public Integer getRegCapitalUnit() {
		return regCapitalUnit;
	}

	public void setRegCapitalUnit(Integer regCapitalUnit) {
		this.regCapitalUnit = regCapitalUnit;
	}
	public String getEntTel() {
		return entTel;
	}

	public void setEntTel(String entTel) {
		this.entTel = entTel;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
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
	public Long getApproveAcctId() {
		return approveAcctId;
	}

	public void setApproveAcctId(Long approveAcctId) {
		this.approveAcctId = approveAcctId;
	}
	public String getApproveName() {
		return approveName;
	}

	public void setApproveName(String approveName) {
		this.approveName = approveName;
	}
	public Long getApproveMemberId() {
		return approveMemberId;
	}

	public void setApproveMemberId(Long approveMemberId) {
		this.approveMemberId = approveMemberId;
	}
	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public String getApproveDesc() {
		return approveDesc;
	}

	public void setApproveDesc(String approveDesc) {
		this.approveDesc = approveDesc;
	}
	@Override
	public String toString() {
		return "EntCertApplyDTO [" + "certApplyId=" + certApplyId + ", memberId=" + memberId + ", entCode=" + entCode + ", pareMemberId=" + pareMemberId + ", applyType=" + applyType + ", authenType=" + authenType + ", entName=" + entName + ", entType=" + entType + ", businessMode=" + businessMode + ", legalPerson=" + legalPerson + ", legalPersonNationality=" + legalPersonNationality + ", businessLicenseAreaId=" + businessLicenseAreaId + ", businessLicenseAddress=" + businessLicenseAddress + ", businessLicenseType=" + businessLicenseType + ", establishDate=" + establishDate + ", certStartDate=" + certStartDate + ", certLimitDate=" + certLimitDate + ", limitType=" + limitType + ", entCertType=" + entCertType + ", regCapital=" + regCapital + ", regCapitalUnit=" + regCapitalUnit + ", entTel=" + entTel + ", status=" + status + ", applyTime=" + applyTime + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName + ", approveAcctId=" + approveAcctId + ", approveName=" + approveName + ", approveMemberId=" + approveMemberId + ", auditTime=" + auditTime + ", approveDesc=" + approveDesc +  "]";
	}
}
