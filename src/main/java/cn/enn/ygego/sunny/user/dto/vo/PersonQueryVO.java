package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

/**
 * 个人资质申请查询条件
 * ClassName: IndividualQueryVO	
 * Description 
 * Author puanl
 * Date 2018年3月21日 下午6:04:44 
 * History: 
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class PersonQueryVO implements Serializable {

    private static final long serialVersionUID = -603965964557814731L;
    
    private Long entMemberId;  /* 企业会员id */
    private Long newAdminMemberId;  /* 转让的 个人会员id */
    
    private Long acctId;      /* 账户ID */ 
    private Long memberId; /* 会员ID */
    private Long certApplyId; /* 资质申请ID */
    
    private String name; /* 真实姓名 */
    
    private String  acctName;        /* 账户名称 */ 
    private String  acctCode;        /* 账户编码 */ 
    private String  mobileNum;       /* 手机号 */ 
    
    private Integer authState;      /* 个人认证状态 */
    
    private Integer status; /* 状态 */
    private String startTime; /* 开始时间 */
    private String endTime;  /* 结束时间 */
    
    private Integer pageSize;
    private Integer pageNum;
    private Integer startRow;
    
    public Long getEntMemberId() {
        return entMemberId;
    }
    public void setEntMemberId(Long entMemberId) {
        this.entMemberId = entMemberId;
    }
    public Long getNewAdminMemberId() {
        return newAdminMemberId;
    }
    public void setNewAdminMemberId(Long newAdminMemberId) {
        this.newAdminMemberId = newAdminMemberId;
    }
    public Integer getAuthState() {
        return authState;
    }
    public void setAuthState(Integer authState) {
        this.authState = authState;
    }
    public Long getAcctId() {
        return acctId;
    }
    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }
    public Long getMemberId() {
        return memberId;
    }
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
    public Long getCertApplyId() {
        return certApplyId;
    }
    public void setCertApplyId(Long certApplyId) {
        this.certApplyId = certApplyId;
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
    public String getMobileNum() {
        return mobileNum;
    }
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public Integer getStartRow() {
        return startRow;
    }
    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "PersonQueryVO [acctId=" + acctId + ", memberId=" + memberId + ", certApplyId=" + certApplyId + ", name="
                + name + ", acctName=" + acctName + ", acctCode=" + acctCode + ", mobileNum=" + mobileNum + ", status="
                + status + ", startTime=" + startTime + ", endTime=" + endTime + ", pageSize=" + pageSize + ", pageNum="
                + pageNum + ", startRow=" + startRow + "]";
    }
    
}
