package cn.enn.ygego.sunny.user.model;

import java.io.Serializable;

/**
 * ClassName: MarketCateCertApplyFile
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketCateCertApplyFile implements Serializable {
	
	private Long	certApplyFileId;		 /* 资质申请文件ID */ 
	private Long	certApplyDetailId;		 /* 资质申请明细ID */ 
	private Integer	certFileType;		 /* 资质文件类型 */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 

	// Constructor
	public MarketCateCertApplyFile() {
	}

	/**
	 * full Constructor
	 */
	public MarketCateCertApplyFile(Long certApplyFileId, Long certApplyDetailId, Integer certFileType, Long fileSize, String fileUrl) {
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
		return "MarketCateCertApplyFile [" + "certApplyFileId=" + certApplyFileId + ", certApplyDetailId=" + certApplyDetailId + ", certFileType=" + certFileType + ", fileSize=" + fileSize + ", fileUrl=" + fileUrl +  "]";
	}
}
