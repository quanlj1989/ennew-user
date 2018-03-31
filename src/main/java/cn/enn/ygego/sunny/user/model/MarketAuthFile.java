package cn.enn.ygego.sunny.user.model;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName: MarketAuthFile
 * Description:
 * Author: 杨超
 * Date: 2018-3-31
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
*/
public class MarketAuthFile implements Serializable {
	
	private Long	authFileId;		 /* 授权文件ID */ 
	private Long	authId;		 /* 授权ID */ 
	private Long	fileSize;		 /* 文件大小 */ 
	private String	fileUrl;		 /* 文件地址 */ 
	private Date	createTime;		 /* 创建时间 */ 

	// Constructor
	public MarketAuthFile() {
	}

	/**
	 * full Constructor
	 */
	public MarketAuthFile(Long authFileId, Long authId, Long fileSize, String fileUrl, Date createTime) {
		this.authFileId = authFileId;
		this.authId = authId;
		this.fileSize = fileSize;
		this.fileUrl = fileUrl;
		this.createTime = createTime;
	}

	public Long getAuthFileId() {
		return authFileId;
	}

	public void setAuthFileId(Long authFileId) {
		this.authFileId = authFileId;
	}

	public Long getAuthId() {
		return authId;
	}

	public void setAuthId(Long authId) {
		this.authId = authId;
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
		return "MarketAuthFile [" + "authFileId=" + authFileId + ", authId=" + authId + ", fileSize=" + fileSize + ", fileUrl=" + fileUrl + ", createTime=" + createTime +  "]";
	}
}
