package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:IndividualServiceCertFile
 * 
 * @author gencode
 */
public class IndividualServiceCertFile implements Serializable {
	
	private static final long serialVersionUID = -3993783320745286701L;
	
	private Long	certApplyFileId;		 /* 资质文件ID */ 
	private Long	serviceApplyCertId;		 /* 服务申请资质ID */ 
	private Integer	certFileType;		 /* 资质文件类型 */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 

	// Constructor
	public IndividualServiceCertFile() {
	}

	/**
	 * full Constructor
	 */
	public IndividualServiceCertFile(Long certApplyFileId, Long serviceApplyCertId, Integer certFileType, Long fileSize, String fileUrl) {
		this.certApplyFileId = certApplyFileId;
		this.serviceApplyCertId = serviceApplyCertId;
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

	public Long getServiceApplyCertId() {
		return serviceApplyCertId;
	}

	public void setServiceApplyCertId(Long serviceApplyCertId) {
		this.serviceApplyCertId = serviceApplyCertId;
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
		return "IndividualServiceCertFile [" + "certApplyFileId=" + certApplyFileId+ ", serviceApplyCertId=" + serviceApplyCertId+ ", certFileType=" + certFileType+ ", fileSize=" + fileSize+ ", fileUrl=" + fileUrl+  "]";
	}
}
