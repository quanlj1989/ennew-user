package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.model.EntChannelPermitApply;

/**
 * ClassName: EntChannelPermitApplyVO
 * Description:
 * Author: en3
 * Date: 2018/3/30 16:13
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntChannelPermitApplyVO extends EntChannelPermitApply {

    private static final long serialVersionUID = -5855239296518167966L;

    private String channelName;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
