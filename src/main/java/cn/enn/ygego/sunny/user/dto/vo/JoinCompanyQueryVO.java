package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

public class JoinCompanyQueryVO implements Serializable {

    private static final long serialVersionUID = -1307303042041577150L;

    private Long    setId;          /* 授权配置ID */
    
    private Long    memberId;       /* 子公司会员ID */
    private Long    pareMemberId;   /* 父级会员ID */
    
    private String  entName;        /* 企业名称 */
    
    private String  acctName;        /* 账户名称 */ 
    private String  name;            /* 姓名 */ 
    private String  mobileNum;       /* 手机号 */ 
    
    private Integer applyType;      /* 申请类型 （关系类型）   1：待确认 2：已确认  3：已拒绝 */
    private Integer status;         /* 状态（权限状态）     1：待确认 2：已确认 3：已拒绝  */
    
    private Integer pageSize;
    private Integer pageNum;
    private Integer startRow;
    
    private boolean freeCompany;   /* 是否绑定父公司 */
    
    
    public Long getSetId() {
        return setId;
    }
    public void setSetId(Long setId) {
        this.setId = setId;
    }
    public boolean isFreeCompany() {
        return freeCompany;
    }
    public void setFreeCompany(boolean freeCompany) {
        this.freeCompany = freeCompany;
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
    @Override
    public String toString() {
        return "JoinCompanyQueryVO [memberId=" + memberId + ", pareMemberId=" + pareMemberId + ", entName=" + entName
                + ", acctName=" + acctName + ", name=" + name + ", mobileNum=" + mobileNum + ", applyType=" + applyType
                + ", status=" + status + ", pageSize=" + pageSize + ", pageNum=" + pageNum + ", startRow=" + startRow
                + "]";
    }
    
}
