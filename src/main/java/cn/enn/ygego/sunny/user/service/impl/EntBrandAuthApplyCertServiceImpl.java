package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntBrandAuthApplyCertService;
import cn.enn.ygego.sunny.user.dao.EntBrandAuthApplyCertDao;
import cn.enn.ygego.sunny.user.model.EntBrandAuthApplyCert;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntBrandAuthApplyCert
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntBrandAuthApplyCertServiceImpl implements EntBrandAuthApplyCertService{

    @Autowired
    private EntBrandAuthApplyCertDao entBrandAuthApplyCertDao;

    public List<EntBrandAuthApplyCert> findAll(){
       return  entBrandAuthApplyCertDao.findAll();
    }

    public List<EntBrandAuthApplyCert> findEntBrandAuthApplyCerts(EntBrandAuthApplyCert record){
       return  entBrandAuthApplyCertDao.find(record);
    }

    public EntBrandAuthApplyCert getEntBrandAuthApplyCertByPrimaryKey(Long brandApplyCertId){
        return entBrandAuthApplyCertDao.getByPrimaryKey(brandApplyCertId);
    }

    public Integer createEntBrandAuthApplyCert(EntBrandAuthApplyCert record){
        return entBrandAuthApplyCertDao.insert(record);
    }

    public Integer removeEntBrandAuthApplyCert(EntBrandAuthApplyCert record){
        return entBrandAuthApplyCertDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long brandApplyCertId){
    	return entBrandAuthApplyCertDao.deleteByPrimaryKey(brandApplyCertId);
    }

    public Integer modifyEntBrandAuthApplyCertByPrimaryKey(EntBrandAuthApplyCert record){
        return entBrandAuthApplyCertDao.updateByPrimaryKey(record);
    }









}