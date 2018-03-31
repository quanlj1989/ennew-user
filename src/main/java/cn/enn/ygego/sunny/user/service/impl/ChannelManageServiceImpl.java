package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.vo.ChannelRquestVO;
import cn.enn.ygego.sunny.user.service.ChannelManageService;
import cn.enn.ygego.sunny.user.dao.ChannelManageDao;
import cn.enn.ygego.sunny.user.model.ChannelManage;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:ChannelManage
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class ChannelManageServiceImpl implements ChannelManageService{

    @Autowired
    private ChannelManageDao channelManageDao;

    public List<ChannelManage> findAll(){
       return  channelManageDao.findAll();
    }

    public List<ChannelManage> findChannelManages(ChannelManage record){
       return  channelManageDao.find(record);
    }

    public ChannelManage getChannelManageByPrimaryKey(Long channelId){
        return channelManageDao.getByPrimaryKey(channelId);
    }

    public Integer createChannelManage(ChannelManage record){
        return channelManageDao.insert(record);
    }

    public Integer removeChannelManage(ChannelManage record){
        return channelManageDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long channelId){
    	return channelManageDao.deleteByPrimaryKey(channelId);
    }

    public Integer modifyChannelManageByPrimaryKey(ChannelManage record){
        return channelManageDao.updateByPrimaryKey(record);
    }

    @Override
    public List<ChannelManage> findChannelManagesPage(ChannelRquestVO record) {
        return channelManageDao.findChannelManagesPage(record);
    }

    @Override
    public Integer getCount(ChannelManage record) {
        return channelManageDao.getCount(record);
    }
}