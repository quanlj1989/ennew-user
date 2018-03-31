package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntAuthCertApplyService;
import cn.enn.ygego.sunny.user.dao.EntAuthCertApplyDao;
import cn.enn.ygego.sunny.user.model.EntAuthCertApply;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntAuthCertApply
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntAuthCertApplyServiceImpl implements EntAuthCertApplyService{

    @Autowired
    private EntAuthCertApplyDao entAuthCertApplyDao;

    public List<EntAuthCertApply> findAll(){
       return  entAuthCertApplyDao.findAll();
    }

    public List<EntAuthCertApply> findEntAuthCertApplys(EntAuthCertApply record){
       return  entAuthCertApplyDao.find(record);
    }

    public EntAuthCertApply getEntAuthCertApplyByPrimaryKey(Long certApplyId){
        return entAuthCertApplyDao.getByPrimaryKey(certApplyId);
    }

    public Integer createEntAuthCertApply(EntAuthCertApply record){
        return entAuthCertApplyDao.insert(record);
    }

    public Integer removeEntAuthCertApply(EntAuthCertApply record){
        return entAuthCertApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyId){
    	return entAuthCertApplyDao.deleteByPrimaryKey(certApplyId);
    }

    public Integer modifyEntAuthCertApplyByPrimaryKey(EntAuthCertApply record){
        return entAuthCertApplyDao.updateByPrimaryKey(record);
    }









}