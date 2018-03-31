/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO:ChannelManage
 * 
 * @author gencode
 * @date 2018-3-26
 */
public class ChannelRquestVO implements Serializable {

	private static final long serialVersionUID = 8877726588419034128L;

	private Long	channelId; /* 渠道ID */
	private String	channelName; /* 渠道名称 */
	private Date	createStartTime; /* 开始时间 */
	private Date	createEndTime; /* 结束时间 */
	private String	channelOperAcctName;		 /* 渠道运营账户名称 */
	private String channelIds;
	private Integer pageSize;
	private Integer pageNum;
	private Integer startRow;
	// Constructor
	public ChannelRquestVO() {
	}

	public String getChannelIds() {
		return channelIds;
	}

	public void setChannelIds(String channelIds) {
		this.channelIds = channelIds;
	}

	public String getChannelOperAcctName() {
		return channelOperAcctName;
	}

	public void setChannelOperAcctName(String channelOperAcctName) {
		this.channelOperAcctName = channelOperAcctName;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Date getCreateStartTime() {
		return createStartTime;
	}

	public void setCreateStartTime(Date createStartTime) {
		this.createStartTime = createStartTime;
	}

	public Date getCreateEndTime() {
		return createEndTime;
	}

	public void setCreateEndTime(Date createEndTime) {
		this.createEndTime = createEndTime;
	}
}
