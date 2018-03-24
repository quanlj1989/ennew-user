package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.IndividualChannelPermit;

/**
 * dal Interface:IndividualChannelPermit
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualChannelPermitService {

    public List<IndividualChannelPermit> findAll();

    public List<IndividualChannelPermit> findIndividualChannelPermits(IndividualChannelPermit record);

    public IndividualChannelPermit getIndividualChannelPermitByPrimaryKey(Long channelPermitId);

    public Integer createIndividualChannelPermit(IndividualChannelPermit record);

    public Integer removeIndividualChannelPermit(IndividualChannelPermit record);

    public Integer removeByPrimaryKey(Long channelPermitId);

    public Integer modifyIndividualChannelPermitByPrimaryKey(IndividualChannelPermit record);



}