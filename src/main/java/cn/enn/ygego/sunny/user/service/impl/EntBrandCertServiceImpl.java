package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntBrandCertService;
import cn.enn.ygego.sunny.user.dao.EntBrandCertDao;
import cn.enn.ygego.sunny.user.model.EntBrandCert;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntBrandCert
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class EntBrandCertServiceImpl implements EntBrandCertService{

    @Autowired
    private EntBrandCertDao entBrandCertDao;

    public List<EntBrandCert> findAll(){
       return  entBrandCertDao.findAll();
    }

    public List<EntBrandCert> findEntBrandCerts(EntBrandCert record){
       return  entBrandCertDao.find(record);
    }

    public EntBrandCert getEntBrandCertByPrimaryKey(Long brandCertId){
        return entBrandCertDao.getByPrimaryKey(brandCertId);
    }

    public Integer createEntBrandCert(EntBrandCert record){
        return entBrandCertDao.insert(record);
    }

    public Integer removeEntBrandCert(EntBrandCert record){
        return entBrandCertDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long brandCertId){
    	return entBrandCertDao.deleteByPrimaryKey(brandCertId);
    }

    public Integer modifyEntBrandCertByPrimaryKey(EntBrandCert record){
        return entBrandCertDao.updateByPrimaryKey(record);
    }









}