package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualDomainPermitApplyService;
import cn.enn.ygego.sunny.user.dao.IndividualDomainPermitApplyDao;
import cn.enn.ygego.sunny.user.model.IndividualDomainPermitApply;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualDomainPermitApply
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualDomainPermitApplyServiceImpl implements IndividualDomainPermitApplyService{

    @Autowired
    private IndividualDomainPermitApplyDao individualDomainPermitApplyDao;

    public List<IndividualDomainPermitApply> findAll(){
       return  individualDomainPermitApplyDao.findAll();
    }

    public List<IndividualDomainPermitApply> findIndividualDomainPermitApplys(IndividualDomainPermitApply record){
       return  individualDomainPermitApplyDao.find(record);
    }

    public IndividualDomainPermitApply getIndividualDomainPermitApplyByPrimaryKey(Long domainApplyId){
        return individualDomainPermitApplyDao.getByPrimaryKey(domainApplyId);
    }

    public Integer createIndividualDomainPermitApply(IndividualDomainPermitApply record){
        return individualDomainPermitApplyDao.insert(record);
    }

    public Integer removeIndividualDomainPermitApply(IndividualDomainPermitApply record){
        return individualDomainPermitApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long domainApplyId){
    	return individualDomainPermitApplyDao.deleteByPrimaryKey(domainApplyId);
    }

    public Integer modifyIndividualDomainPermitApplyByPrimaryKey(IndividualDomainPermitApply record){
        return individualDomainPermitApplyDao.updateByPrimaryKey(record);
    }









}