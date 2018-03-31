package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntDomainPermitApplyService;
import cn.enn.ygego.sunny.user.dao.EntDomainPermitApplyDao;
import cn.enn.ygego.sunny.user.model.EntDomainPermitApply;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntDomainPermitApply
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntDomainPermitApplyServiceImpl implements EntDomainPermitApplyService{

    @Autowired
    private EntDomainPermitApplyDao entDomainPermitApplyDao;

    public List<EntDomainPermitApply> findAll(){
       return  entDomainPermitApplyDao.findAll();
    }

    public List<EntDomainPermitApply> findEntDomainPermitApplys(EntDomainPermitApply record){
       return  entDomainPermitApplyDao.find(record);
    }

    public EntDomainPermitApply getEntDomainPermitApplyByPrimaryKey(Long domainApplyId){
        return entDomainPermitApplyDao.getByPrimaryKey(domainApplyId);
    }

    public Integer createEntDomainPermitApply(EntDomainPermitApply record){
        return entDomainPermitApplyDao.insert(record);
    }

    public Integer removeEntDomainPermitApply(EntDomainPermitApply record){
        return entDomainPermitApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long domainApplyId){
    	return entDomainPermitApplyDao.deleteByPrimaryKey(domainApplyId);
    }

    public Integer modifyEntDomainPermitApplyByPrimaryKey(EntDomainPermitApply record){
        return entDomainPermitApplyDao.updateByPrimaryKey(record);
    }









}