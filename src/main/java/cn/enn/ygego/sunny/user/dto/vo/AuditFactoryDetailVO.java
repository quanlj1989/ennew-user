/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AuditFactoryDetailVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 17:14 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 17:14      0.0.1             TODO
 */
@ApiModel(description = "查看验厂详情的描述类")
public class AuditFactoryDetailVO implements Serializable {

    @ApiModelProperty("类目名称")
    private String verifyCategory; /* 类目名称 */
    @ApiModelProperty("最后申请时间")
    private Date lastApplyTime; /* 最后申请时间 */
    @ApiModelProperty("最后审核时间")
    private Date lastAuditTime; /* 最后审核时间 */
    @ApiModelProperty("最后驳回原因")
    private String lastRejectCause; /* 最后驳回原因 */
    @ApiModelProperty("验厂详情的企业信息")
    private List<AuditCompanyListVO> companyList; /*验厂详情的企业信息*/
    @ApiModelProperty("验厂证件信息")
    private List<AuditCredentialsVO> credentials; /*验厂证件信息*/
    @ApiModelProperty("验厂审核历史")
    private List<AuditHistoryVO> auditHistory; /*验厂审核历史*/
    @ApiModelProperty("验厂级别")
    private String auditLevel; /* 验厂级别 */

    public AuditFactoryDetailVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public AuditFactoryDetailVO(String verifyCategory, Date lastApplyTime, Date lastAuditTime, String lastRejectCause,
            List<AuditCompanyListVO> companyList, List<AuditCredentialsVO> credentials,
            List<AuditHistoryVO> auditHistory, String auditLevel) {
        super();
        this.verifyCategory = verifyCategory;
        this.lastApplyTime = lastApplyTime;
        this.lastAuditTime = lastAuditTime;
        this.lastRejectCause = lastRejectCause;
        this.companyList = companyList;
        this.credentials = credentials;
        this.auditHistory = auditHistory;
        this.auditLevel = auditLevel;
    }

    public String getVerifyCategory() {
        return verifyCategory;
    }

    public void setVerifyCategory(String verifyCategory) {
        this.verifyCategory = verifyCategory;
    }

    public Date getLastApplyTime() {
        return lastApplyTime;
    }

    public void setLastApplyTime(Date lastApplyTime) {
        this.lastApplyTime = lastApplyTime;
    }

    public Date getLastAuditTime() {
        return lastAuditTime;
    }

    public void setLastAuditTime(Date lastAuditTime) {
        this.lastAuditTime = lastAuditTime;
    }

    public String getLastRejectCause() {
        return lastRejectCause;
    }

    public void setLastRejectCause(String lastRejectCause) {
        this.lastRejectCause = lastRejectCause;
    }

    public List<AuditCompanyListVO> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<AuditCompanyListVO> companyList) {
        this.companyList = companyList;
    }

    public List<AuditCredentialsVO> getCredentials() {
        return credentials;
    }

    public void setCredentials(List<AuditCredentialsVO> credentials) {
        this.credentials = credentials;
    }

    public List<AuditHistoryVO> getAuditHistory() {
        return auditHistory;
    }

    public void setAuditHistory(List<AuditHistoryVO> auditHistory) {
        this.auditHistory = auditHistory;
    }

    public String getAuditLevel() {
        return auditLevel;
    }

    public void setAuditLevel(String auditLevel) {
        this.auditLevel = auditLevel;
    }

    @Override
    public String toString() {
        return "AuditFactoryDetailVO [verifyCategory=" + verifyCategory + ", lastApplyTime=" + lastApplyTime
                + ", lastAuditTime=" + lastAuditTime + ", lastRejectCause=" + lastRejectCause + ", companyList="
                + companyList + ", credentials=" + credentials + ", auditHistory=" + auditHistory + ", auditLevel="
                + auditLevel + "]";
    }

}
