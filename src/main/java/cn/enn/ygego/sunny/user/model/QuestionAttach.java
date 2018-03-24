package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:QuestionAttach
 * 
 * @author gencode
 */
public class QuestionAttach implements Serializable {
	
	private static final long serialVersionUID = -7452052092350783760L;
	
	private Long	questionAttachId;		 /* 问题附件ID */ 
	private Long	questionId;		 /* 问题ID */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 

	// Constructor
	public QuestionAttach() {
	}

	/**
	 * full Constructor
	 */
	public QuestionAttach(Long questionAttachId, Long questionId, Long fileSize, String fileUrl) {
		this.questionAttachId = questionAttachId;
		this.questionId = questionId;
		this.fileSize = fileSize;
		this.fileUrl = fileUrl;
	}

	public Long getQuestionAttachId() {
		return questionAttachId;
	}

	public void setQuestionAttachId(Long questionAttachId) {
		this.questionAttachId = questionAttachId;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	public String toString() {
		return "QuestionAttach [" + "questionAttachId=" + questionAttachId+ ", questionId=" + questionId+ ", fileSize=" + fileSize+ ", fileUrl=" + fileUrl+  "]";
	}
}
