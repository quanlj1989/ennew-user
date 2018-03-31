/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ClassName: QuestionResponseVO
 * Description:
 * Author: liangchao
 * Date: 2018/3/24 18:13
 * History:
 * <author>          <time>          <version>          <desc>
 * liangc           修改时间           0.0.1              描述
 */
public class QuestionResponseVO implements Serializable {

    private static final long serialVersionUID = 4872046679596451292L;

    private Long	responseId;		 /* 回复ID */
    private Long	questionId;		 /* 问题ID */
    private String	responseContent;		 /* 回复内容 */
    private Long	createMemberId;		 /* 创建人会员ID */
    private Long	createAcctId;		 /* 创建人账户ID */
    private String	createName;		 /* 创建人姓名 */

    private Integer	status; /* 问题状态 */

    private String	email;		 /* 电子邮件 */
    private List<Long> idList; /* idList */

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getResponseId() {
        return responseId;
    }

    public void setResponseId(Long responseId) {
        this.responseId = responseId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
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

    public List<Long> getIdList() {
        return idList;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
