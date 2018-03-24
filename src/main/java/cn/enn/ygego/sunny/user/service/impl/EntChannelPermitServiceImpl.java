package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntChannelPermitService;
import cn.enn.ygego.sunny.user.dao.EntChannelPermitDao;
import cn.enn.ygego.sunny.user.model.EntChannelPermit;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntChannelPermit
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class EntChannelPermitServiceImpl implements EntChannelPermitService{

    @Autowired
    private EntChannelPermitDao entChannelPermitDao;

    public List<EntChannelPermit> findAll(){
       return  entChannelPermitDao.findAll();
    }

    public List<EntChannelPermit> findEntChannelPermits(EntChannelPermit record){
       return  entChannelPermitDao.find(record);
    }

    public EntChannelPermit getEntChannelPermitByPrimaryKey(Long channelPermitId){
        return entChannelPermitDao.getByPrimaryKey(channelPermitId);
    }

    public Integer createEntChannelPermit(EntChannelPermit record){
        return entChannelPermitDao.insert(record);
    }

    public Integer removeEntChannelPermit(EntChannelPermit record){
        return entChannelPermitDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long channelPermitId){
    	return entChannelPermitDao.deleteByPrimaryKey(channelPermitId);
    }

    public Integer modifyEntChannelPermitByPrimaryKey(EntChannelPermit record){
        return entChannelPermitDao.updateByPrimaryKey(record);
    }









}