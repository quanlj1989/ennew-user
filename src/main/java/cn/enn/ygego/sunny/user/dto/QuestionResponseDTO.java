package cn.enn.ygego.sunny.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.io.Serializable;

/**
 * DTO:QuestionResponse
 * 
 * @author gencode
 * @date 2018-3-19
 */
@ApiModel(description = "用于查询回复反馈信息的条件描述类")
public class QuestionResponseDTO implements Serializable {
	
	private static final long serialVersionUID = 4939487311253395281L;

	@ApiModelProperty("回复ID")
	private Long	responseId; /* 回复ID */
	@ApiModelProperty("问题ID")
	private Long	questionId; /* 问题ID */
	@ApiModelProperty("回复内容")
	private String	responseContent; /* 回复内容 */
	@ApiModelProperty("创建时间")
	private Date	createTime; /* 创建时间 */
	@ApiModelProperty("创建人会员ID")
	private Long	createMemberId; /* 创建人会员ID */
	@ApiModelProperty("创建人账户ID")
	private Long	createAcctId; /* 创建人账户ID */
	@ApiModelProperty("创建人姓名")
	private String	createName; /* 创建人姓名 */

	// Constructor
	public QuestionResponseDTO() {
	}

	/**
	 * full Constructor
	 */
	public QuestionResponseDTO(Long responseId, Long questionId, String responseContent, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.responseId = responseId;
		this.questionId = questionId;
		this.responseContent = responseContent;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
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
	@Override
	public String toString() {
		return "QuestionResponseDTO [" + "responseId=" + responseId + ", questionId=" + questionId + ", responseContent=" + responseContent + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}
}
