package cn.enn.ygego.sunny.user.dto;

import java.io.Serializable;

/**
 * DTO:EntCateCertApplyFile
 * 
 * @author gencode
 * @date 2018-3-30
 */
public class EntCateCertApplyFileDTO implements Serializable {
	
	private static final long serialVersionUID = -6129694840263137070L;
	
	private Long	certApplyFileId; /* 资质申请文件ID */
	private Long	certApplyDetailId; /* 资质申请明细ID */
	private Integer	certFileType; /* 资质文件类型 */
	private Long	fileSize; /* 文件大小 */
	private String	fileUrl; /* 文件地址 */

	// Constructor
	public EntCateCertApplyFileDTO() {
	}

	/**
	 * full Constructor
	 */
	public EntCateCertApplyFileDTO(Long certApplyFileId, Long certApplyDetailId, Integer certFileType, Long fileSize, String fileUrl) {
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
		return "EntCateCertApplyFileDTO [" + "certApplyFileId=" + certApplyFileId + ", certApplyDetailId=" + certApplyDetailId + ", certFileType=" + certFileType + ", fileSize=" + fileSize + ", fileUrl=" + fileUrl +  "]";
	}
}
