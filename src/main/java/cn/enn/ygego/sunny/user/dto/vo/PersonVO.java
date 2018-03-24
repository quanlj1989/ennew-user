package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;

import cn.enn.ygego.sunny.user.dto.EntCustInfoDTO;
import cn.enn.ygego.sunny.user.dto.IndividualCustDTO;
import io.swagger.annotations.ApiModel;

/**
 * 个人用户信息详情对象 
 * 
 * ClassName: PersonVO	
 * Description 
 * Author "quanlinjie"
 * Date 2018年3月19日 下午6:38:50 
 * History: 
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@ApiModel(description = "个人客户信息对象")
public class PersonVO implements Serializable {

    private static final long serialVersionUID = 4577737043337133842L;
    
    // 会员账户关系信息
    private Long    memberId; /* 企业会员ID */
    private Long    acctId; /* 账户ID */
    private Integer memberType;  /* 会员ID类型 */
    
    // 账户信息
    private Long    channelId; /* 渠道ID */
    private String  acctName; /* 账户名称 */
    private String  acctCode; /* 账户编码 */
    private Integer acctState; /* 账户状态 */
    private String  logoUrl; /* LOGO_URL */
    private String  name; /* 姓名 */
    private Integer genderType; /* 性别 */
    private Long    deptId; /* 部门ID */
    private String  mobileNum; /* 手机号 */
    private String  email; /* 电子邮件 */
    private Long    areaId; /* 地区ID */
    private String  areaIdFullPath; /* 地区ID路径 */
    private String  areaNameFullPath; /* 地区名称路径 */
    private String  contactAddr; /* 联系地址 */
    private String  postCode; /* 邮编 */
    private Date    registerTime; /* 注册时间 */
    private Date    updateTime; /* 更新时间 */
    private Date    lastLoginTime; /* 最后登录时间 */
    private Integer isDelete; /* 是否删除 */
    
    private Integer certType; /* 证件类型 */
    private String  certCode; /* 证件号码 */
    private Date    authTime; /* 认证时间 */
    
    /* 用户认证信息 */
    private IndividualCustDTO individualCust;
    
    /* 企业用户信息 */
    private EntCustInfoDTO entCustInfo;
    
    public Long getMemberId() {
        return memberId;
    }
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
    public Long getAcctId() {
        return acctId;
    }
    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }
    public Integer getMemberType() {
        return memberType;
    }
    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }
    public Long getChannelId() {
        return channelId;
    }
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Date getLastLoginTime() {
        return lastLoginTime;
    }
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    public Integer getIsDelete() {
        return isDelete;
    }
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
    
    public IndividualCustDTO getIndividualCust() {
        return individualCust;
    }
    public void setIndividualCust(IndividualCustDTO individualCust) {
        this.individualCust = individualCust;
    }
    public EntCustInfoDTO getEntCustInfo() {
        return entCustInfo;
    }
    public void setEntCustInfo(EntCustInfoDTO entCustInfo) {
        this.entCustInfo = entCustInfo;
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
    public Date getAuthTime() {
        return authTime;
    }
    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }
    
    
}
