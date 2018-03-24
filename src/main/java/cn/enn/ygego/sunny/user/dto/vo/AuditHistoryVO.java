/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AuditHistoryVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 17:50 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 17:50      0.0.1             TODO
 */
@ApiModel(description = "查看验厂审核历史详情的描述类")
public class AuditHistoryVO implements Serializable {

    @ApiModelProperty("审核时间")
    private Date auditTime; /*审核时间*/
    @ApiModelProperty("申请时间")
    private Date applyTime; /*申请时间*/
    @ApiModelProperty("驳回原因")
    private String rejectCause; /*驳回原因*/
    @ApiModelProperty("申请次数")
    private Integer applyNum; /*申请次数*/

    public AuditHistoryVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public AuditHistoryVO(Date auditTime, Date applyTime, String rejectCause, Integer applyNum) {
        super();
        this.auditTime = auditTime;
        this.applyTime = applyTime;
        this.rejectCause = rejectCause;
        this.applyNum = applyNum;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getRejectCause() {
        return rejectCause;
    }

    public void setRejectCause(String rejectCause) {
        this.rejectCause = rejectCause;
    }

    public Integer getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(Integer applyNum) {
        this.applyNum = applyNum;
    }

    @Override
    public String toString() {
        return "AuditHistoryVO [auditTime=" + auditTime + ", applyTime=" + applyTime + ", rejectCause=" + rejectCause
                + ", applyNum=" + applyNum + "]";
    }

}
