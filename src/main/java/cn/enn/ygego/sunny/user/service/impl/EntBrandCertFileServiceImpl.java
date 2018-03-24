package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntBrandCertFileService;
import cn.enn.ygego.sunny.user.dao.EntBrandCertFileDao;
import cn.enn.ygego.sunny.user.model.EntBrandCertFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntBrandCertFile
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class EntBrandCertFileServiceImpl implements EntBrandCertFileService{

    @Autowired
    private EntBrandCertFileDao entBrandCertFileDao;

    public List<EntBrandCertFile> findAll(){
       return  entBrandCertFileDao.findAll();
    }

    public List<EntBrandCertFile> findEntBrandCertFiles(EntBrandCertFile record){
       return  entBrandCertFileDao.find(record);
    }

    public EntBrandCertFile getEntBrandCertFileByPrimaryKey(Long certApplyFileId){
        return entBrandCertFileDao.getByPrimaryKey(certApplyFileId);
    }

    public Integer createEntBrandCertFile(EntBrandCertFile record){
        return entBrandCertFileDao.insert(record);
    }

    public Integer removeEntBrandCertFile(EntBrandCertFile record){
        return entBrandCertFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyFileId){
    	return entBrandCertFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer modifyEntBrandCertFileByPrimaryKey(EntBrandCertFile record){
        return entBrandCertFileDao.updateByPrimaryKey(record);
    }









}