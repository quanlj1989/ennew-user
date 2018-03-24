package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:IndividualCertFile
 * 
 * @author gencode
 */
public class IndividualCertFile implements Serializable {
	
	private static final long serialVersionUID = 3734316108563150479L;
	
	private Long	certFileId;		 /* 资质文件信息ID */ 
	private Long	certInfoId;		 /* 资质信息ID */ 
	private Integer	certFileType;		 /* 资质文件类型 */ 
	private Integer	sortNum;		 /* 排序编号 */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 

	// Constructor
	public IndividualCertFile() {
	}

	/**
	 * full Constructor
	 */
	public IndividualCertFile(Long certFileId, Long certInfoId, Integer certFileType, Integer sortNum, Long fileSize, String fileUrl) {
		this.certFileId = certFileId;
		this.certInfoId = certInfoId;
		this.certFileType = certFileType;
		this.sortNum = sortNum;
		this.fileSize = fileSize;
		this.fileUrl = fileUrl;
	}

	public Long getCertFileId() {
		return certFileId;
	}

	public void setCertFileId(Long certFileId) {
		this.certFileId = certFileId;
	}

	public Long getCertInfoId() {
		return certInfoId;
	}

	public void setCertInfoId(Long certInfoId) {
		this.certInfoId = certInfoId;
	}

	public Integer getCertFileType() {
		return certFileType;
	}

	public void setCertFileType(Integer certFileType) {
		this.certFileType = certFileType;
	}

	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
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
		return "IndividualCertFile [" + "certFileId=" + certFileId+ ", certInfoId=" + certInfoId+ ", certFileType=" + certFileType+ ", sortNum=" + sortNum+ ", fileSize=" + fileSize+ ", fileUrl=" + fileUrl+  "]";
	}
}
