package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketAuthApplyFile
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketAuthApplyFile implements Serializable {
	
	private Long	applyFileId;		 /* 申请文件ID */ 
	private Long	authApplyId;		 /* 授权申请ID */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 
	private Date	createTime;		 /* 创建时间 */ 

	// Constructor
	public MarketAuthApplyFile() {
	}

	/**
	 * full Constructor
	 */
	public MarketAuthApplyFile(Long applyFileId, Long authApplyId, Long fileSize, String fileUrl, Date createTime) {
		this.applyFileId = applyFileId;
		this.authApplyId = authApplyId;
		this.fileSize = fileSize;
		this.fileUrl = fileUrl;
		this.createTime = createTime;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "MarketAuthApplyFile [" + "applyFileId=" + applyFileId + ", authApplyId=" + authApplyId + ", fileSize=" + fileSize + ", fileUrl=" + fileUrl + ", createTime=" + createTime +  "]";
	}
}
