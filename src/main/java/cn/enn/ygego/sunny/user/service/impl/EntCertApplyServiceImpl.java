package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntCertApplyService;
import cn.enn.ygego.sunny.user.dao.EntCertApplyDao;
import cn.enn.ygego.sunny.user.model.EntCertApply;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntCertApply
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class EntCertApplyServiceImpl implements EntCertApplyService{

    @Autowired
    private EntCertApplyDao entCertApplyDao;

    public List<EntCertApply> findAll(){
       return  entCertApplyDao.findAll();
    }

    public List<EntCertApply> findEntCertApplys(EntCertApply record){
       return  entCertApplyDao.find(record);
    }

    public EntCertApply getEntCertApplyByPrimaryKey(Long certApplyId){
        return entCertApplyDao.getByPrimaryKey(certApplyId);
    }

    public Integer createEntCertApply(EntCertApply record){
        return entCertApplyDao.insert(record);
    }

    public Integer removeEntCertApply(EntCertApply record){
        return entCertApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyId){
    	return entCertApplyDao.deleteByPrimaryKey(certApplyId);
    }

    public Integer modifyEntCertApplyByPrimaryKey(EntCertApply record){
        return entCertApplyDao.updateByPrimaryKey(record);
    }









}