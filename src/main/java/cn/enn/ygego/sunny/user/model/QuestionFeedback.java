package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:QuestionFeedback
 * 
 * @author gencode
 */
public class QuestionFeedback implements Serializable {
	
	private static final long serialVersionUID = 6652960347918640506L;
	
	private Long	questionId;		 /* 问题ID */ 
	private Integer	questionType;		 /* 问题类型 */ 
	private String	questionCode;		 /* 问题编号 */ 
	private String	questionUrl;		 /* 问题网址 */ 
	private String	questionModule;		 /* 问题模块 */ 
	private String	questionDesc;		 /* 问题描述 */ 
	private Integer	status;		 /* 状态 */ 
	private String	contact;		 /* 联系人 */ 
	private String	contactTel;		 /* 联系电话 */ 
	private Date	createTime;		 /* 创建时间 */ 
	private Long	createMemberId;		 /* 创建人会员ID */ 
	private Long	createAcctId;		 /* 创建人账户ID */ 
	private String	createName;		 /* 创建人姓名 */ 

	// Constructor
	public QuestionFeedback() {
	}

	/**
	 * full Constructor
	 */
	public QuestionFeedback(Long questionId, Integer questionType, String questionCode, String questionUrl, String questionModule, String questionDesc, Integer status, String contact, String contactTel, Date createTime, Long createMemberId, Long createAcctId, String createName) {
		this.questionId = questionId;
		this.questionType = questionType;
		this.questionCode = questionCode;
		this.questionUrl = questionUrl;
		this.questionModule = questionModule;
		this.questionDesc = questionDesc;
		this.status = status;
		this.contact = contact;
		this.contactTel = contactTel;
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

	@Override
	public String toString() {
		return "QuestionFeedback [" + "questionId=" + questionId+ ", questionType=" + questionType+ ", questionCode=" + questionCode+ ", questionUrl=" + questionUrl+ ", questionModule=" + questionModule+ ", questionDesc=" + questionDesc+ ", status=" + status+ ", contact=" + contact+ ", contactTel=" + contactTel+ ", createTime=" + createTime+ ", createMemberId=" + createMemberId+ ", createAcctId=" + createAcctId+ ", createName=" + createName+  "]";
	}
}
