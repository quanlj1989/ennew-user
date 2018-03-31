package cn.enn.ygego.sunny.user.dto;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.user.model.QuestionAttach;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * DTO:QuestionFeedback
 * 
 * @author gencode
 * @date 2018-3-19
 */
@ApiModel(description = "用于查询反馈信息的条件描述类")
public class QuestionFeedbackDTO implements Serializable {
	
	private static final long serialVersionUID = 677027359325754786L;

	@ApiModelProperty("问题ID")
	private Long	questionId; /* 问题ID */
	@ApiModelProperty("问题类型")
	private Integer	questionType; /* 问题类型 */
	@ApiModelProperty("问题编号")
	private String	questionCode; /* 问题编号 */
	@ApiModelProperty("问题网址")
	private String	questionUrl; /* 问题网址 */
	@ApiModelProperty("问题模块")
	private String	questionModule; /* 问题模块 */
	@ApiModelProperty("问题描述")
	private String	questionDesc; /* 问题描述 */
	@ApiModelProperty("企业名称")
	private String	entName; /* 企业名称 */
	@ApiModelProperty("是否回复")
	private Integer	isResponse; /* 是否回复 */
	@ApiModelProperty("状态")
	private Integer	status; /* 状态 */
	@ApiModelProperty("联系人")
	private String	contact; /* 联系人 */
	@ApiModelProperty("联系电话")
	private String	contactTel; /* 联系电话 */
	@ApiModelProperty("电子邮件")
	private String	email; /* 电子邮件 */
	@ApiModelProperty("创建时间")
	private Date	createTime; /* 创建时间 */
	@ApiModelProperty("创建人会员ID")
	private Long	createMemberId; /* 创建人会员ID */
	@ApiModelProperty("创建人账户ID")
	private Long	createAcctId; /* 创建人账户ID */
	@ApiModelProperty("创建人姓名")
	private String	createName; /* 创建人姓名 */

	@ApiModelProperty("上传附件信息")
	private List<QuestionAttachDTO> attachList = new ArrayList<>();

	private List<QuestionResponseDTO> responseList = new ArrayList<>();

	public List<QuestionResponseDTO> getResponseList() {
		return responseList;
	}

	public void setResponseList(List<QuestionResponseDTO> responseList) {
		this.responseList = responseList;
	}

	public List<QuestionAttachDTO> getAttachList() {
		return attachList;
	}

	public void setAttachList(List<QuestionAttachDTO> attachList) {
		this.attachList = attachList;
		this.responseList = new ArrayList<>();
	}

	// Constructor
	public QuestionFeedbackDTO() {
		this.attachList = new ArrayList<>();
		this.responseList = new ArrayList<>();
	}

	/**
	 * full Constructor
	 */
	public QuestionFeedbackDTO(Long questionId, Integer questionType, String questionCode, String questionUrl, String questionModule, String questionDesc, String entName, Integer isResponse, Integer status, String contact, String contactTel, String email, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.questionId = questionId;
		this.questionType = questionType;
		this.questionCode = questionCode;
		this.questionUrl = questionUrl;
		this.questionModule = questionModule;
		this.questionDesc = questionDesc;
		this.entName = entName;
		this.isResponse = isResponse;
		this.status = status;
		this.contact = contact;
		this.contactTel = contactTel;
		this.email = email;
		this.createTime = createTime;
		this.createMemberId = createMemberId;
		this.createAcctId = createAcctId;
		this.createName = createName;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public Integer getQuestionType() {
		return questionType;
	}

	public void setQuestionType(Integer questionType) {
		this.questionType = questionType;
	}
	public String getQuestionCode() {
		return questionCode;
	}

	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}
	public String getQuestionUrl() {
		return questionUrl;
	}

	public void setQuestionUrl(String questionUrl) {
		this.questionUrl = questionUrl;
	}
	public String getQuestionModule() {
		return questionModule;
	}

	public void setQuestionModule(String questionModule) {
		this.questionModule = questionModule;
	}
	public String getQuestionDesc() {
		return questionDesc;
	}

	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "QuestionFeedbackDTO [" + "questionId=" + questionId + ", questionType=" + questionType + ", questionCode=" + questionCode + ", questionUrl=" + questionUrl + ", questionModule=" + questionModule + ", questionDesc=" + questionDesc + ", status=" + status + ", contact=" + contact + ", contactTel=" + contactTel + ", createTime=" + createTime + ", createMemberId=" + createMemberId + ", createAcctId=" + createAcctId + ", createName=" + createName +  "]";
	}

}
