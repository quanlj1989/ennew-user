package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;

public class JoinCompanyVO implements Serializable {

    private static final long serialVersionUID = -2405268154137447282L;

    private String  memberIds; /* 子公司ID集合 */
    
    private Long    memberId; /* 子公司会员ID */
    private Long    pareMemberId; /* 父级会员ID */
    private Long    adminAcctId;  /* 企业管理员账户ID */
    
    private String  acctName;        /* 企业管理员账户名称 */ 
    private String  name;        /* 企业管理员姓名 */ 
    private String  mobileNum;       /* 手机号 */ 
    
    private String  entName; /* 企业名称 */
    private String  custCode; /* 客户编码 */
    private String  businessMode; /* 经营模式 */
    private String  legalPerson; /* 法人 */
    private Integer legalPersonNationality; /* 法人国籍 */
    private Date    establishDate; /* 成立日期 */
    private String  entTel; /* 企业电话 */
    private Integer supplierSet; /* 供应商设置 */
    private String  blackWhiteListSet; /* 黑白名单设置 */
    private String  agreementPriceId; /* 协议价设置 */
    private Integer cateMateId; /* 类目物料设置 */
    private Date    authTime; /* 企业认证时间 */
    
    private Long    setMemberId; /* 会员ID */
    private Long    setPareMemberId; /* 父级会员ID */
    
    private Long    setId; /* 设置ID */
    private String  setBlackWhiteListSet; /* 黑白名单设置 */
    private String  setAgreementPriceId; /* 协议价设置 */
    private Integer setCateMateId; /* 类目物料设置 */
    
    private Integer applyType; /* 申请类型 （关系类型）   1：待确认 2：已确认  3：已拒绝 */
    private Integer status; /* 状态（权限状态）     1：待确认 2：已确认 3：已拒绝  */
    
    private Date    setCreateTime; /* 创建时间 */
    private Long    setCreateAcctId; /* 创建人账户ID */
    private String  setCreateName; /* 创建人姓名 */
    
    public String getMemberIds() {
        return memberIds;
    }
    public void setMemberIds(String memberIds) {
        this.memberIds = memberIds;
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
    public Long getAdminAcctId() {
        return adminAcctId;
    }
    public void setAdminAcctId(Long adminAcctId) {
        this.adminAcctId = adminAcctId;
    }
    public String getAcctName() {
        return acctName;
    }
    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobileNum() {
        return mobileNum;
    }
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    public String getEntName() {
        return entName;
    }
    public void setEntName(String entName) {
        this.entName = entName;
    }
    public String getCustCode() {
        return custCode;
    }
    public void setCustCode(String custCode) {
        this.custCode = custCode;
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
    public Date getEstablishDate() {
        return establishDate;
    }
    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }
    public String getEntTel() {
        return entTel;
    }
    public void setEntTel(String entTel) {
        this.entTel = entTel;
    }
    public Integer getSupplierSet() {
        return supplierSet;
    }
    public void setSupplierSet(Integer supplierSet) {
        this.supplierSet = supplierSet;
    }
    public String getBlackWhiteListSet() {
        return blackWhiteListSet;
    }
    public void setBlackWhiteListSet(String blackWhiteListSet) {
        this.blackWhiteListSet = blackWhiteListSet;
    }
    public String getAgreementPriceId() {
        return agreementPriceId;
    }
    public void setAgreementPriceId(String agreementPriceId) {
        this.agreementPriceId = agreementPriceId;
    }
    public Integer getCateMateId() {
        return cateMateId;
    }
    public void setCateMateId(Integer cateMateId) {
        this.cateMateId = cateMateId;
    }
    public Date getAuthTime() {
        return authTime;
    }
    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }
    public Long getSetMemberId() {
        return setMemberId;
    }
    public void setSetMemberId(Long setMemberId) {
        this.setMemberId = setMemberId;
    }
    public Long getSetPareMemberId() {
        return setPareMemberId;
    }
    public void setSetPareMemberId(Long setPareMemberId) {
        this.setPareMemberId = setPareMemberId;
    }
    public Long getSetId() {
        return setId;
    }
    public void setSetId(Long setId) {
        this.setId = setId;
    }
    
    public String getSetBlackWhiteListSet() {
        return setBlackWhiteListSet;
    }
    public void setSetBlackWhiteListSet(String setBlackWhiteListSet) {
        this.setBlackWhiteListSet = setBlackWhiteListSet;
    }
    public String getSetAgreementPriceId() {
        return setAgreementPriceId;
    }
    public void setSetAgreementPriceId(String setAgreementPriceId) {
        this.setAgreementPriceId = setAgreementPriceId;
    }
    public Integer getSetCateMateId() {
        return setCateMateId;
    }
    public void setSetCateMateId(Integer setCateMateId) {
        this.setCateMateId = setCateMateId;
    }
    public Integer getApplyType() {
        return applyType;
    }
    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getSetCreateTime() {
        return setCreateTime;
    }
    public void setSetCreateTime(Date setCreateTime) {
        this.setCreateTime = setCreateTime;
    }
    public Long getSetCreateAcctId() {
        return setCreateAcctId;
    }
    public void setSetCreateAcctId(Long setCreateAcctId) {
        this.setCreateAcctId = setCreateAcctId;
    }
    public String getSetCreateName() {
        return setCreateName;
    }
    public void setSetCreateName(String setCreateName) {
        this.setCreateName = setCreateName;
    }
    @Override
    public String toString() {
        return "JoinCompanyVO [memberId=" + memberId + ", pareMemberId=" + pareMemberId + ", adminAcctId=" + adminAcctId
                + ", acctName=" + acctName + ", name=" + name + ", mobileNum=" + mobileNum + ", entName=" + entName
                + ", custCode=" + custCode + ", businessMode=" + businessMode + ", legalPerson=" + legalPerson
                + ", legalPersonNationality=" + legalPersonNationality + ", establishDate=" + establishDate
                + ", entTel=" + entTel + ", supplierSet=" + supplierSet + ", blackWhiteListSet=" + blackWhiteListSet
                + ", agreementPriceId=" + agreementPriceId + ", cateMateId=" + cateMateId + ", authTime=" + authTime
                + ", setMemberId=" + setMemberId + ", setPareMemberId=" + setPareMemberId + ", setId=" + setId
                + ", setBlackWhiteListSet=" + setBlackWhiteListSet + ", setAgreementPriceId=" + setAgreementPriceId
                + ", setCateMateId=" + setCateMateId + ", applyType=" + applyType + ", status=" + status
                + ", setCreateTime=" + setCreateTime + ", setCreateAcctId=" + setCreateAcctId + ", setCreateName="
                + setCreateName + "]";
    }
}
