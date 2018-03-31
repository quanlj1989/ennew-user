package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:EntAuthApplyFile2
 * 
 * @author gencode
 */
public class EntAuthApplyFile2 implements Serializable {
	
	private static final long serialVersionUID = 1354015071909825386L;
	
	private Long	applyFileId;		 /* 申请文件ID */ 
	private Long	authApplyId;		 /* 授权申请ID */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 

	// Constructor
	public EntAuthApplyFile2() {
	}

	/**
	 * full Constructor
	 */
	public EntAuthApplyFile2(Long applyFileId, Long authApplyId, Long fileSize, String fileUrl) {
		this.applyFileId = applyFileId;
		this.authApplyId = authApplyId;
		this.fileSize = fileSize;
		this.fileUrl = fileUrl;
	}

	public Long getApplyFileId() {
		return applyFileId;
	}

	public void setApplyFileId(Long applyFileId) {
		this.applyFileId = applyFileId;
	}

	public Long getAuthApplyId() {
		return authApplyId;
	}

	public void setAuthApplyId(Long authApplyId) {
		this.authApplyId = authApplyId;
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
		return "EntAuthApplyFile2 [" + "applyFileId=" + applyFileId+ ", authApplyId=" + authApplyId+ ", fileSize=" + fileSize+ ", fileUrl=" + fileUrl+  "]";
	}
}
