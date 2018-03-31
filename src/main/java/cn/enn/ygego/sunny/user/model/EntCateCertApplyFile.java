package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:EntCateCertApplyFile
 * 
 * @author gencode
 */
public class EntCateCertApplyFile implements Serializable {
	
	private static final long serialVersionUID = -2737432882124404836L;
	
	private Long	certApplyFileId;		 /* 资质申请文件ID */ 
	private Long	certApplyDetailId;		 /* 资质申请明细ID */ 
	private Integer	certFileType;		 /* 资质文件类型 */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 

	// Constructor
	public EntCateCertApplyFile() {
	}

	/**
	 * full Constructor
	 */
	public EntCateCertApplyFile(Long certApplyFileId, Long certApplyDetailId, Integer certFileType, Long fileSize, String fileUrl) {
		this.certApplyFileId = certApplyFileId;
		this.certApplyDetailId = certApplyDetailId;
		this.certFileType = certFileType;
		this.fileSize = fileSize;
		this.fileUrl = fileUrl;
	}

	public Long getCertApplyFileId() {
		return certApplyFileId;
	}

	public void setCertApplyFileId(Long certApplyFileId) {
		this.certApplyFileId = certApplyFileId;
	}

	public Long getCertApplyDetailId() {
		return certApplyDetailId;
	}

	public void setCertApplyDetailId(Long certApplyDetailId) {
		this.certApplyDetailId = certApplyDetailId;
	}

	public Integer getCertFileType() {
		return certFileType;
	}

	public void setCertFileType(Integer certFileType) {
		this.certFileType = certFileType;
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
		return "EntCateCertApplyFile [" + "certApplyFileId=" + certApplyFileId+ ", certApplyDetailId=" + certApplyDetailId+ ", certFileType=" + certFileType+ ", fileSize=" + fileSize+ ", fileUrl=" + fileUrl+  "]";
	}
}
