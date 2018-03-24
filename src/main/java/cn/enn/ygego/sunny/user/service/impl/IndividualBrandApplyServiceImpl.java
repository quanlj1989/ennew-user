package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualBrandApplyService;
import cn.enn.ygego.sunny.user.dao.IndividualBrandApplyDao;
import cn.enn.ygego.sunny.user.model.IndividualBrandApply;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualBrandApply
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualBrandApplyServiceImpl implements IndividualBrandApplyService{

    @Autowired
    private IndividualBrandApplyDao individualBrandApplyDao;

    public List<IndividualBrandApply> findAll(){
       return  individualBrandApplyDao.findAll();
    }

    public List<IndividualBrandApply> findIndividualBrandApplys(IndividualBrandApply record){
       return  individualBrandApplyDao.find(record);
    }

    public IndividualBrandApply getIndividualBrandApplyByPrimaryKey(Integer brandApplyId){
        return individualBrandApplyDao.getByPrimaryKey(brandApplyId);
    }

    public Integer createIndividualBrandApply(IndividualBrandApply record){
        return individualBrandApplyDao.insert(record);
    }

    public Integer removeIndividualBrandApply(IndividualBrandApply record){
        return individualBrandApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Integer brandApplyId){
    	return individualBrandApplyDao.deleteByPrimaryKey(brandApplyId);
    }

    public Integer modifyIndividualBrandApplyByPrimaryKey(IndividualBrandApply record){
        return individualBrandApplyDao.updateByPrimaryKey(record);
    }









}