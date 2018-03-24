package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualChannelPermitApplyService;
import cn.enn.ygego.sunny.user.dao.IndividualChannelPermitApplyDao;
import cn.enn.ygego.sunny.user.model.IndividualChannelPermitApply;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualChannelPermitApply
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualChannelPermitApplyServiceImpl implements IndividualChannelPermitApplyService{

    @Autowired
    private IndividualChannelPermitApplyDao individualChannelPermitApplyDao;

    public List<IndividualChannelPermitApply> findAll(){
       return  individualChannelPermitApplyDao.findAll();
    }

    public List<IndividualChannelPermitApply> findIndividualChannelPermitApplys(IndividualChannelPermitApply record){
       return  individualChannelPermitApplyDao.find(record);
    }

    public IndividualChannelPermitApply getIndividualChannelPermitApplyByPrimaryKey(Long channelApplyId){
        return individualChannelPermitApplyDao.getByPrimaryKey(channelApplyId);
    }

    public Integer createIndividualChannelPermitApply(IndividualChannelPermitApply record){
        return individualChannelPermitApplyDao.insert(record);
    }

    public Integer removeIndividualChannelPermitApply(IndividualChannelPermitApply record){
        return individualChannelPermitApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long channelApplyId){
    	return individualChannelPermitApplyDao.deleteByPrimaryKey(channelApplyId);
    }

    public Integer modifyIndividualChannelPermitApplyByPrimaryKey(IndividualChannelPermitApply record){
        return individualChannelPermitApplyDao.updateByPrimaryKey(record);
    }









}