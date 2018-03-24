package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import cn.enn.ygego.sunny.user.dto.IndividualCertApplyFileDTO;
import cn.enn.ygego.sunny.user.model.IndividualCertApplyFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "个人客户认证申请对象")
public class IndividualCertApplyVO implements Serializable {

    private static final long serialVersionUID = -6620138749847674593L;
    
    @ApiModelProperty("账户ID")
    private Long    acctId;      /* 账户ID */ 
    @ApiModelProperty("账户名称")
    private String  acctName;        /* 账户名称 */ 
    @ApiModelProperty("账户编码")
    private String  acctCode;        /* 账户编码 */ 
    @ApiModelProperty("账户状态")
    private Integer acctState;       /* 账户状态 */ 
    @ApiModelProperty("LOGO_URL")
    private String  logoUrl;         /* LOGO_URL */ 
    @ApiModelProperty("性别")
    private Integer genderType;      /* 性别 */ 
    @ApiModelProperty("部门ID")
    private Long    deptId;      /* 部门ID */ 
    @ApiModelProperty("手机号")
    private String  mobileNum;       /* 手机号 */ 
    @ApiModelProperty("电子邮件")
    private String  email;       /* 电子邮件 */ 
    @ApiModelProperty("地区ID")
    private Long    areaId;      /* 地区ID */ 
    @ApiModelProperty("地区ID路径")
    private String  areaIdFullPath;      /* 地区ID路径 */ 
    @ApiModelProperty("地区名称路径")
    private String  areaNameFullPath;        /* 地区名称路径 */ 
    @ApiModelProperty("联系地址")
    private String  contactAddr;         /* 联系地址 */ 
    @ApiModelProperty("邮编")
    private String  postCode;        /* 邮编 */ 
    @ApiModelProperty("注册时间")
    private Date    registerTime;        /* 注册时间 */ 
    
    @ApiModelProperty("资质申请ID")
    private Long    certApplyId; /* 资质申请ID */
    @ApiModelProperty("会员ID")
    private Long    memberId; /* 会员ID */
    @ApiModelProperty("申请类型")
    private Integer applyType; /* 申请类型 */
    @ApiModelProperty("姓名")
    private String  name; /* 姓名 */
    @ApiModelProperty("证件类型")
    private Integer certType; /* 证件类型 */
    @ApiModelProperty("证件号码")
    private String  certCode; /* 证件号码 */
    @ApiModelProperty("状态 ")
    private Integer status; /* 状态 */
    @ApiModelProperty("申请时间 ")
    private Date    applyTime; /* 申请时间 */
    @ApiModelProperty("创建时间")
    private Date    createTime; /* 创建时间 */
    @ApiModelProperty("创建人会员ID")
    private Long    createMemberId; /* 创建人会员ID */
    @ApiModelProperty("创建人账户ID")
    private Long    createAcctId; /* 创建人账户ID */
    @ApiModelProperty("创建人姓名")
    private String  createName; /* 创建人姓名 */
    @ApiModelProperty("审核人账户ID")
    private Long    approveAcctId; /* 审核人账户ID */
    @ApiModelProperty("审核人姓名")
    private String  approveName; /* 审核人姓名 */
    @ApiModelProperty("审核人会员ID")
    private Long    approveMemberId; /* 审核人会员ID */
    @ApiModelProperty("审核时间")
    private Date    auditTime; /* 审核时间 */
    @ApiModelProperty("审核结果描述")
    private String  approveDesc; /* 审核结果描述 */
    
    @ApiModelProperty("资质申请明细ID")
    private Long    certApplyDetailId; /* 资质申请明细ID */
    @ApiModelProperty("资质有效期")
    private Date    certValidDate; /* 资质有效期 */
    @ApiModelProperty("排序编号")
    private Integer sortNum; /* 排序编号 */
    
    @ApiModelProperty("资质申请文件ID")
    List<IndividualCertApplyFile> individualCertApplyFileList; /* 资质文件列表 */

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctCode() {
        return acctCode;
    }

    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public Integer getAcctState() {
        return acctState;
    }

    public void setAcctState(Integer acctState) {
        this.acctState = acctState;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Integer getGenderType() {
        return genderType;
    }

    public void setGenderType(Integer genderType) {
        this.genderType = genderType;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
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

    public String getContactAddr() {
        return contactAddr;
    }

    public void setContactAddr(String contactAddr) {
        this.contactAddr = contactAddr;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
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

    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCertType() {
        return certType;
    }

    public void setCertType(Integer certType) {
        this.certType = certType;
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode;
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

    public Long getCertApplyDetailId() {
        return certApplyDetailId;
    }

    public void setCertApplyDetailId(Long certApplyDetailId) {
        this.certApplyDetailId = certApplyDetailId;
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

    public List<IndividualCertApplyFile> getIndividualCertApplyFileList() {
        return individualCertApplyFileList;
    }

    public void setIndividualCertApplyFileList(List<IndividualCertApplyFile> individualCertApplyFileList) {
        this.individualCertApplyFileList = individualCertApplyFileList;
    }
    
}
