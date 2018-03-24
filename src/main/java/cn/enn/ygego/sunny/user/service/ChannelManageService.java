package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.ChannelManage;

/**
 * dal Interface:ChannelManage
 * @author gencode
 * @date 2018-3-22
 */
public interface ChannelManageService {

    public List<ChannelManage> findAll();

    public List<ChannelManage> findChannelManages(ChannelManage record);

    public ChannelManage getChannelManageByPrimaryKey(Long channelId);

    public Integer createChannelManage(ChannelManage record);

    public Integer removeChannelManage(ChannelManage record);

    public Integer removeByPrimaryKey(Long channelId);

    public Integer modifyChannelManageByPrimaryKey(ChannelManage record);



}