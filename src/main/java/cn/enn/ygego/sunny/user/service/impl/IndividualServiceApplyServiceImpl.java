package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualServiceApplyService;
import cn.enn.ygego.sunny.user.dao.IndividualServiceApplyDao;
import cn.enn.ygego.sunny.user.model.IndividualServiceApply;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualServiceApply
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualServiceApplyServiceImpl implements IndividualServiceApplyService{

    @Autowired
    private IndividualServiceApplyDao individualServiceApplyDao;

    public List<IndividualServiceApply> findAll(){
       return  individualServiceApplyDao.findAll();
    }

    public List<IndividualServiceApply> findIndividualServiceApplys(IndividualServiceApply record){
       return  individualServiceApplyDao.find(record);
    }

    public IndividualServiceApply getIndividualServiceApplyByPrimaryKey(Long serviceApplyId){
        return individualServiceApplyDao.getByPrimaryKey(serviceApplyId);
    }

    public Integer createIndividualServiceApply(IndividualServiceApply record){
        return individualServiceApplyDao.insert(record);
    }

    public Integer removeIndividualServiceApply(IndividualServiceApply record){
        return individualServiceApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long serviceApplyId){
    	return individualServiceApplyDao.deleteByPrimaryKey(serviceApplyId);
    }

    public Integer modifyIndividualServiceApplyByPrimaryKey(IndividualServiceApply record){
        return individualServiceApplyDao.updateByPrimaryKey(record);
    }









}