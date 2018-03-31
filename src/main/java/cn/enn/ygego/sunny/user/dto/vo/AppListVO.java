/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.RoleInfoDTO;
import cn.enn.ygego.sunny.user.model.RoleInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * DTO:RoleInfo
 * 
 * @author gencode
 * @date 2018-3-19
 */
public class AppListVO implements Serializable {

	private static final long serialVersionUID = -3174040318996406861L;
	private Long	appId; /* 应用标识 */
    private List<FunctionManageVO> functionManageVOS=new ArrayList<>();
    private List<ChannelRoleVO>  channelRoleVOS=new ArrayList<>();
	// Constructor
	public AppListVO() {
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public List<FunctionManageVO> getFunctionManageVOS() {
		return functionManageVOS;
	}

	public void setFunctionManageVOS(List<FunctionManageVO> functionManageVOS) {
		this.functionManageVOS = functionManageVOS;
	}

	public List<ChannelRoleVO> getChannelRoleVOS() {
		return channelRoleVOS;
	}

	public void setChannelRoleVOS(List<ChannelRoleVO> channelRoleVOS) {
		this.channelRoleVOS = channelRoleVOS;
	}
}
