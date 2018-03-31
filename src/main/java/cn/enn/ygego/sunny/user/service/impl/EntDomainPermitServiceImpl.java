package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntDomainPermitService;
import cn.enn.ygego.sunny.user.dao.EntDomainPermitDao;
import cn.enn.ygego.sunny.user.model.EntDomainPermit;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntDomainPermit
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntDomainPermitServiceImpl implements EntDomainPermitService{

    @Autowired
    private EntDomainPermitDao entDomainPermitDao;

    public List<EntDomainPermit> findAll(){
       return  entDomainPermitDao.findAll();
    }

    public List<EntDomainPermit> findEntDomainPermits(EntDomainPermit record){
       return  entDomainPermitDao.find(record);
    }

    public EntDomainPermit getEntDomainPermitByPrimaryKey(Long domainPermitId){
        return entDomainPermitDao.getByPrimaryKey(domainPermitId);
    }

    public Integer createEntDomainPermit(EntDomainPermit record){
        return entDomainPermitDao.insert(record);
    }

    public Integer removeEntDomainPermit(EntDomainPermit record){
        return entDomainPermitDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long domainPermitId){
    	return entDomainPermitDao.deleteByPrimaryKey(domainPermitId);
    }

    public Integer modifyEntDomainPermitByPrimaryKey(EntDomainPermit record){
        return entDomainPermitDao.updateByPrimaryKey(record);
    }









}