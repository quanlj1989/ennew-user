/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ClassName: QuestionFeedbackVO
 * Description:
 * Author: liangchao
 * Date: 2018/3/22 19:29
 * History:
 * <author>          <time>          <version>          <desc>
 * liangc           修改时间           0.0.1              描述
 */
public class QuestionFeedbackVO implements Serializable {

    private static final long serialVersionUID = 4872046679596451292L;

    private Integer pageSize;   /* 每页显示条目 */
    private Integer pageNum;    /* 当前页码 */
    private Integer startRow;   /* 开始行 */

    private Long	questionId; /* 问题ID */
    private Long	memberId; /* 会员ID */
    private String	entName; /* 企业名称 */
    private Integer	isResponse; /* 是否回复 */
    private Date startTime; /* 开始时间 */
    private Date endTime;   /* 结束时间 */
    private String keyword; /* 关键词 */
    private Integer	status; /* 状态 */

    private List idList; /* 获取问题ids */

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public Integer getIsResponse() {
        return isResponse;
    }

    public void setIsResponse(Integer isResponse) {
        this.isResponse = isResponse;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public List getIdList() {
        return idList;
    }

    public void setIdList(List idList) {
        this.idList = idList;
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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
