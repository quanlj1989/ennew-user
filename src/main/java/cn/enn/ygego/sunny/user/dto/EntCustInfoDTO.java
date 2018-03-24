package cn.enn.ygego.sunny.user.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:EntCustInfo
 * 
 * @author gencode
 * @date 2018-3-21
 */
public class EntCustInfoDTO implements Serializable {
	
	private static final long serialVersionUID = -4227553020986066765L;
	
	private Long	memberId; /* 会员ID */
	private Long	pareMemberId; /* 父级会员ID */
	private String	entName; /* 企业名称 */
	private String	authenType; /* 认证类型 */
	private String	custCode; /* 客户编码 */
	private Integer	entType; /* 企业类型 */
	private String	businessMode; /* 经营模式 */
	private String	legalPerson; /* 法人 */
	private Integer	legalPersonNationality; /* 法人国籍 */
	private Integer	businessLicenseAreaId; /* 营业执照所在地域ID */
	private String	businessLicenseAddress; /* 营业执照详细地址 */
	private String	businessLicenseFullAddress; /* 营业执照地址全称 */
	private Integer	businessLicenseType; /* 营业执照类型 */
	private Date	establishDate; /* 成立日期 */
	private Date	certLimitDate; /* 证件期限 */
	private Integer	limitType; /* 期限类型 */
	private Long	regCapital; /* 注册资本 */
	private Integer	regCapitalUnit; /* 注册资本单位类型 */
	private String	entTel; /* 企业电话 */
	private Integer	status; /* 状态 */
	private Integer	supplierSet; /* 供应商设置 */
	private Integer	blackWhiteListSet; /* 黑白名单设置 */
	private Integer	agreementPriceId; /* 协议价设置 */
	private Integer	cateMateId; /* 类目物料设置 */
	private Long	agreementId; /* 协议ID */
	private Date	authTime; /* 认证时间 */
	private Date	createTime; /* 创建时间 */
	private Long	createMemberId; /* 创建人会员ID */
	private Long	createAcctId; /* 创建人账户ID */
	private String	createName; /* 创建人姓名 */
	private Date	modTime; /* 修改时间 */
	private Long	modMemberId; /* 修改人会员ID */
	private Long	modAcctId; /* 修改人账户ID */
	private String	modAcctName; /* 修改人账户名称 */

	// Constructor
	public EntCustInfoDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntCustInfoDTO(Long memberId, Long pareMemberId, String entName, String authenType, String custCode, Integer entType, String businessMode, String legalPerson, Integer legalPersonNationality, Integer businessLicenseAreaId, String businessLicenseAddress, String businessLicenseFullAddress, Integer businessLicenseType, Date establishDate, Date certLimitDate, Integer limitType, Long regCapital, Integer regCapitalUnit, String entTel, Integer status, Integer supplierSet, Integer blackWhiteListSet, Integer agreementPriceId, Integer cateMateId, Long agreementId, Date authTime, Date createTime, Long createMemberId, Long createAcctId, String createName, Date modTime, Long modMemberId, Long modAcctId, String modAcctName) {
		this.memberId = memberId;
		this.pareMemberId = pareMemberId;
		this.entName = entName;
		this.authenType = authenType;
		this.custCode = custCode;
		this.entType = entType;
		this.businessMode = businessMode;
		this.legalPerson = legalPerson;
		this.legalPersonNationality = legalPersonNationality;
		this.businessLicenseAreaId = businessLicenseAreaId;
		this.businessLicenseAddress = businessLicenseAddress;
		this.businessLicenseFullAddress = businessLicenseFullAddress;
		this.businessLicenseType = businessLicenseType;
		this.establishDate = establishDate;
		this.certLimitDate = certLimitDate;
		this.limitType = limitType;
		this.regCapital = regCapital;
		this.regCapitalUnit = regCapitalUnit;
		this.entTel = entTel;
		this.status = status;
		this.supplierSet = supplierSet;
		this.blackWhiteListSet = blackWhiteListSet;
		this.agreementPriceId = agreementPriceId;
		this.cateMateId = cateMateId;
		this.agreementId = agreementId;
		this.authTime = authTime;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
		this.modTime = modTime;
		this.modMemberId = modMemberId;
		this.modAcctId = modAcctId;
		this.modAcctName = modAcctName;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Long getPareMemberId() {
		return pareMemberId;
	}

	public void setPareMemberId(Long pareMemberId) {
		this.pareMemberId = pareMemberId;
	}
	public String getEntName() {
		return entName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}
	public String getAuthenType() {
		return authenType;
	}

	public void setAuthenType(String authenType) {
		this.authenType = authenType;
	}
	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
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
	public String getBusinessLicenseFullAddress() {
		return businessLicenseFullAddress;
	}

	public void setBusinessLicenseFullAddress(String businessLicenseFullAddress) {
		this.businessLicenseFullAddress = businessLicenseFullAddress;
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
	public Integer getSupplierSet() {
		return supplierSet;
	}

	public void setSupplierSet(Integer supplierSet) {
		this.supplierSet = supplierSet;
	}
	public Integer getBlackWhiteListSet() {
		return blackWhiteListSet;
	}

	public void setBlackWhiteListSet(Integer blackWhiteListSet) {
		this.blackWhiteListSet = blackWhiteListSet;
	}
	public Integer getAgreementPriceId() {
		return agreementPriceId;
	}

	public void setAgreementPriceId(Integer agreementPriceId) {
		this.agreementPriceId = agreementPriceId;
	}
	public Integer getCateMateId() {
		return cateMateId;
	}

	public void setCateMateId(Integer cateMateId) {
		this.cateMateId = cateMateId;
	}
	public Long getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(Long agreementId) {
		this.agreementId = agreementId;
	}
	public Date getAuthTime() {
		return authTime;
	}

	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
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
	public Date getModTime() {
		return modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}
	public Long getModMemberId() {
		return modMemberId;
	}

	public void setModMemberId(Long modMemberId) {
		this.modMemberId = modMemberId;
	}
	public Long getModAcctId() {
		return modAcctId;
	}

	public void setModAcctId(Long modAcctId) {
		this.modAcctId = modAcctId;
	}
	public String getModAcctName() {
		return modAcctName;
	}

	public void setModAcctName(String modAcctName) {
		this.modAcctName = modAcctName;
	}
	@Override
	public String toString() {
		return "EntCustInfoDTO [" + "memberId=" + memberId + ", pareMemberId=" + pareMemberId + ", entName=" + entName + ", authenType=" + authenType + ", custCode=" + custCode + ", entType=" + entType + ", businessMode=" + businessMode + ", legalPerson=" + legalPerson + ", legalPersonNationality=" + legalPersonNationality + ", businessLicenseAreaId=" + businessLicenseAreaId + ", businessLicenseAddress=" + businessLicenseAddress + ", businessLicenseFullAddress=" + businessLicenseFullAddress + ", businessLicenseType=" + businessLicenseType + ", establishDate=" + establishDate + ", certLimitDate=" + certLimitDate + ", limitType=" + limitType + ", regCapital=" + regCapital + ", regCapitalUnit=" + regCapitalUnit + ", entTel=" + entTel + ", status=" + status + ", supplierSet=" + supplierSet + ", blackWhiteListSet=" + blackWhiteListSet + ", agreementPriceId=" + agreementPriceId + ", cateMateId=" + cateMateId + ", agreementId=" + agreementId + ", authTime=" + authTime + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName + ", modTime=" + modTime + ", modMemberId=" + modMemberId + ", modAcctId=" + modAcctId + ", modAcctName=" + modAcctName +  "]";
	}
}
