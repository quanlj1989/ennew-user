package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntBrandApplyCertFileService;
import cn.enn.ygego.sunny.user.dao.EntBrandApplyCertFileDao;
import cn.enn.ygego.sunny.user.model.EntBrandApplyCertFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntBrandApplyCertFile
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntBrandApplyCertFileServiceImpl implements EntBrandApplyCertFileService{

    @Autowired
    private EntBrandApplyCertFileDao entBrandApplyCertFileDao;

    public List<EntBrandApplyCertFile> findAll(){
       return  entBrandApplyCertFileDao.findAll();
    }

    public List<EntBrandApplyCertFile> findEntBrandApplyCertFiles(EntBrandApplyCertFile record){
       return  entBrandApplyCertFileDao.find(record);
    }

    public EntBrandApplyCertFile getEntBrandApplyCertFileByPrimaryKey(Long certApplyFileId){
        return entBrandApplyCertFileDao.getByPrimaryKey(certApplyFileId);
    }

    public Integer createEntBrandApplyCertFile(EntBrandApplyCertFile record){
        return entBrandApplyCertFileDao.insert(record);
    }

    public Integer removeEntBrandApplyCertFile(EntBrandApplyCertFile record){
        return entBrandApplyCertFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyFileId){
    	return entBrandApplyCertFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer modifyEntBrandApplyCertFileByPrimaryKey(EntBrandApplyCertFile record){
        return entBrandApplyCertFileDao.updateByPrimaryKey(record);
    }









}