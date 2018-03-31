package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntCateCertFileService;
import cn.enn.ygego.sunny.user.dao.EntCateCertFileDao;
import cn.enn.ygego.sunny.user.model.EntCateCertFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntCateCertFile
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntCateCertFileServiceImpl implements EntCateCertFileService{

    @Autowired
    private EntCateCertFileDao entCateCertFileDao;

    public List<EntCateCertFile> findAll(){
       return  entCateCertFileDao.findAll();
    }

    public List<EntCateCertFile> findEntCateCertFiles(EntCateCertFile record){
       return  entCateCertFileDao.find(record);
    }

    public EntCateCertFile getEntCateCertFileByPrimaryKey(Long certFileId){
        return entCateCertFileDao.getByPrimaryKey(certFileId);
    }

    public Integer createEntCateCertFile(EntCateCertFile record){
        return entCateCertFileDao.insert(record);
    }

    public Integer removeEntCateCertFile(EntCateCertFile record){
        return entCateCertFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certFileId){
    	return entCateCertFileDao.deleteByPrimaryKey(certFileId);
    }

    public Integer modifyEntCateCertFileByPrimaryKey(EntCateCertFile record){
        return entCateCertFileDao.updateByPrimaryKey(record);
    }









}