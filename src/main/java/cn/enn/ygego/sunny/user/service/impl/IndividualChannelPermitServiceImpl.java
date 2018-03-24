package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualChannelPermitService;
import cn.enn.ygego.sunny.user.dao.IndividualChannelPermitDao;
import cn.enn.ygego.sunny.user.model.IndividualChannelPermit;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualChannelPermit
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualChannelPermitServiceImpl implements IndividualChannelPermitService{

    @Autowired
    private IndividualChannelPermitDao individualChannelPermitDao;

    public List<IndividualChannelPermit> findAll(){
       return  individualChannelPermitDao.findAll();
    }

    public List<IndividualChannelPermit> findIndividualChannelPermits(IndividualChannelPermit record){
       return  individualChannelPermitDao.find(record);
    }

    public IndividualChannelPermit getIndividualChannelPermitByPrimaryKey(Long channelPermitId){
        return individualChannelPermitDao.getByPrimaryKey(channelPermitId);
    }

    public Integer createIndividualChannelPermit(IndividualChannelPermit record){
        return individualChannelPermitDao.insert(record);
    }

    public Integer removeIndividualChannelPermit(IndividualChannelPermit record){
        return individualChannelPermitDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long channelPermitId){
    	return individualChannelPermitDao.deleteByPrimaryKey(channelPermitId);
    }

    public Integer modifyIndividualChannelPermitByPrimaryKey(IndividualChannelPermit record){
        return individualChannelPermitDao.updateByPrimaryKey(record);
    }









}