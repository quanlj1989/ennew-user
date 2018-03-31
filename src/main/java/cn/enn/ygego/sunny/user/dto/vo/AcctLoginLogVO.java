/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import java.util.Date;

/**
 * ClassName: AcctLoginLogVO
 * Description:
 * Author: liangchao
 * Date: 2018/3/28 19:24
 * History:
 * <author>          <time>          <version>          <desc>
 * liangc           修改时间           0.0.1              描述
 */
public class AcctLoginLogVO {

    private Integer pageSize;   /* 每页显示条目 */
    private Integer pageNum;    /* 当前页码 */
    private Integer startRow;   /* 开始行 */

    private Long	acctId;		 /* 操作人账户ID */
    private Integer	loginType;		 /* 登录类型 */
    private Integer	loginResult;		 /* 登录结果 */
    private String keyword; /* 关键词 */
    private Date startTime; /* 开始时间 */
    private Date endTime;   /* 结束时间 */

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public Integer getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(Integer loginResult) {
        this.loginResult = loginResult;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
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
}
