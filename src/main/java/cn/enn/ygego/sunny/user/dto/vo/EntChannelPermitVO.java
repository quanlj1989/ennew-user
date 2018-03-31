package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntChannelPermitApplyDTO;
import cn.enn.ygego.sunny.user.model.EntChannelPermitApply;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ClassName: EntChannelPermitVO
 * Description:
 * Author: en3
 * Date: 2018/3/24 17:26
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntChannelPermitVO implements Serializable {
    private static final long serialVersionUID = 1844451085589589537L;
    private List<EntChannelPermitApply> entChannelPermitApplyList;
    private Date	createTime; /* 创建时间 */
    private Long	createAcctId; /* 创建人账户ID */
    private String	createName; /* 创建人姓名 */

    public List<EntChannelPermitApply> getEntChannelPermitApplyList() {
        return entChannelPermitApplyList;
    }

    public void setEntChannelPermitApplyList(List<EntChannelPermitApply> entChannelPermitApplyList) {
        this.entChannelPermitApplyList = entChannelPermitApplyList;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateAcctId() {
        return createAcctId;
    }

    public void setCreateAcctId(Long createAcctId) {
        this.createAcctId = createAcctId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }
}
