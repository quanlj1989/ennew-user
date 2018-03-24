package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * entity:EntCertFile
 * 
 * @author gencode
 */
public class EntCertFile implements Serializable {
	
	private static final long serialVersionUID = 4948531466838873330L;
	
	private Long	certFileId;		 /* 资质文件信息ID */ 
	private Long	certInfoId;		 /* 资质信息ID */ 
	private Integer	certFileType;		 /* 资质文件类型 */ 
	private Integer	sortNum;		 /* 排序编号 */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 

	// Constructor
	public EntCertFile() {
	}

	/**
	 * full Constructor
	 */
	public EntCertFile(Long certFileId, Long certInfoId, Integer certFileType, Integer sortNum, Long fileSize, String fileUrl) {
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
		return "EntCertFile [" + "certFileId=" + certFileId+ ", certInfoId=" + certInfoId+ ", certFileType=" + certFileType+ ", sortNum=" + sortNum+ ", fileSize=" + fileSize+ ", fileUrl=" + fileUrl+  "]";
	}
}
