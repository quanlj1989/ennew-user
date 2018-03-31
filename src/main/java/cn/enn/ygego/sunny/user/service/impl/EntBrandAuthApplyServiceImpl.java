package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntBrandAuthApplyService;
import cn.enn.ygego.sunny.user.dao.EntBrandAuthApplyDao;
import cn.enn.ygego.sunny.user.model.EntBrandAuthApply;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntBrandAuthApply
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntBrandAuthApplyServiceImpl implements EntBrandAuthApplyService{

    @Autowired
    private EntBrandAuthApplyDao entBrandAuthApplyDao;

    public List<EntBrandAuthApply> findAll(){
       return  entBrandAuthApplyDao.findAll();
    }

    public List<EntBrandAuthApply> findEntBrandAuthApplys(EntBrandAuthApply record){
       return  entBrandAuthApplyDao.find(record);
    }

    public EntBrandAuthApply getEntBrandAuthApplyByPrimaryKey(Long brandApplyId){
        return entBrandAuthApplyDao.getByPrimaryKey(brandApplyId);
    }

    public Integer createEntBrandAuthApply(EntBrandAuthApply record){
        return entBrandAuthApplyDao.insert(record);
    }

    public Integer removeEntBrandAuthApply(EntBrandAuthApply record){
        return entBrandAuthApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long brandApplyId){
    	return entBrandAuthApplyDao.deleteByPrimaryKey(brandApplyId);
    }

    public Integer modifyEntBrandAuthApplyByPrimaryKey(EntBrandAuthApply record){
        return entBrandAuthApplyDao.updateByPrimaryKey(record);
    }









}