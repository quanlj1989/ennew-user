package cn.enn.ygego.sunny.user.dto;

import java.io.Serializable;

/**
 * DTO:EntAuthApplyFile2
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntAuthApplyFile2DTO implements Serializable {
	
	private static final long serialVersionUID = 6836795851621225274L;
	
	private Long	applyFileId; /* 申请文件ID */
	private Long	authApplyId; /* 授权申请ID */
	private Long	fileSize; /* 文件大小 */
	private String	fileUrl; /* 文件地址 */

	// Constructor
	public EntAuthApplyFile2DTO() {
	}

	/**
	 * full Constructor
	 */
	public EntAuthApplyFile2DTO(Long applyFileId, Long authApplyId, Long fileSize, String fileUrl) {
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
		return "EntAuthApplyFile2DTO [" + "applyFileId=" + applyFileId + ", authApplyId=" + authApplyId + ", fileSize=" + fileSize + ", fileUrl=" + fileUrl +  "]";
	}
}
