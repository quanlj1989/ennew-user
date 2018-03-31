package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntChannelPermit;

/**
 * dal Interface:EntChannelPermit
 * @author gencode
 * @date 2018-3-28
 */
public interface EntChannelPermitService {

    public List<EntChannelPermit> findAll();

    public List<EntChannelPermit> findEntChannelPermits(EntChannelPermit record);

    public EntChannelPermit getEntChannelPermitByPrimaryKey(Long channelPermitId);

    public Integer createEntChannelPermit(EntChannelPermit record);

    public Integer removeEntChannelPermit(EntChannelPermit record);

    public Integer removeByPrimaryKey(Long channelPermitId);

    public Integer modifyEntChannelPermitByPrimaryKey(EntChannelPermit record);



}