package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualChannelPermitApply;

/**
 * dal Interface:IndividualChannelPermitApply
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualChannelPermitApplyService {

    public List<IndividualChannelPermitApply> findAll();

    public List<IndividualChannelPermitApply> findIndividualChannelPermitApplys(IndividualChannelPermitApply record);

    public IndividualChannelPermitApply getIndividualChannelPermitApplyByPrimaryKey(Long channelApplyId);

    public Integer createIndividualChannelPermitApply(IndividualChannelPermitApply record);

    public Integer removeIndividualChannelPermitApply(IndividualChannelPermitApply record);

    public Integer removeByPrimaryKey(Long channelApplyId);

    public Integer modifyIndividualChannelPermitApplyByPrimaryKey(IndividualChannelPermitApply record);



}