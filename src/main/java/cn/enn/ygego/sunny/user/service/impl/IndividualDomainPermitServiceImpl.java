package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualDomainPermitService;
import cn.enn.ygego.sunny.user.dao.IndividualDomainPermitDao;
import cn.enn.ygego.sunny.user.model.IndividualDomainPermit;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualDomainPermit
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualDomainPermitServiceImpl implements IndividualDomainPermitService{

    @Autowired
    private IndividualDomainPermitDao individualDomainPermitDao;

    public List<IndividualDomainPermit> findAll(){
       return  individualDomainPermitDao.findAll();
    }

    public List<IndividualDomainPermit> findIndividualDomainPermits(IndividualDomainPermit record){
       return  individualDomainPermitDao.find(record);
    }

    public IndividualDomainPermit getIndividualDomainPermitByPrimaryKey(Long domainPermitId){
        return individualDomainPermitDao.getByPrimaryKey(domainPermitId);
    }

    public Integer createIndividualDomainPermit(IndividualDomainPermit record){
        return individualDomainPermitDao.insert(record);
    }

    public Integer removeIndividualDomainPermit(IndividualDomainPermit record){
        return individualDomainPermitDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long domainPermitId){
    	return individualDomainPermitDao.deleteByPrimaryKey(domainPermitId);
    }

    public Integer modifyIndividualDomainPermitByPrimaryKey(IndividualDomainPermit record){
        return individualDomainPermitDao.updateByPrimaryKey(record);
    }









}