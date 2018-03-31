/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * DTO:ChannelManage
 * 
 * @author gencode
 * @date 2018-3-26
 */
public class ChannelRoleVO implements Serializable {

	private static final long serialVersionUID = 8877726588419034128L;

	private Long	channelId; /* 渠道ID */
	private String	channelName; /* 渠道名称 */
	private List<FunctionManageVO> functionManageVOS=new ArrayList<>();

	public List<FunctionManageVO> getFunctionManageVOS() {
		return functionManageVOS;
	}

	public void setFunctionManageVOS(List<FunctionManageVO> functionManageVOS) {
		this.functionManageVOS = functionManageVOS;
	}

	// Constructor
	public ChannelRoleVO() {
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
}
