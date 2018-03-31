package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.vo.EntChannelPermitVO;
import cn.enn.ygego.sunny.user.model.EntChannelPermitApply;

/**
 * dal Interface:EntChannelPermitApply
 * @author gencode
 * @date 2018-3-28
 */
public interface EntChannelPermitApplyService {

    public List<EntChannelPermitApply> findAll();

    public List<EntChannelPermitApply> findEntChannelPermitApplys(EntChannelPermitApply record);

    public EntChannelPermitApply getEntChannelPermitApplyByPrimaryKey(Long channelApplyId);

    public Integer createEntChannelPermitApply(EntChannelPermitApply record);

    public Integer removeEntChannelPermitApply(EntChannelPermitApply record);

    public Integer removeByPrimaryKey(Long channelApplyId);

    public Integer modifyEntChannelPermitApplyByPrimaryKey(EntChannelPermitApply record);

    public Integer modifyEntChannelPermitApplyByPrimaryKey(EntChannelPermitVO record);

}