package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntCertFileService;
import cn.enn.ygego.sunny.user.dao.EntCertFileDao;
import cn.enn.ygego.sunny.user.model.EntCertFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntCertFile
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntCertFileServiceImpl implements EntCertFileService{

    @Autowired
    private EntCertFileDao entCertFileDao;

    public List<EntCertFile> findAll(){
       return  entCertFileDao.findAll();
    }

    public List<EntCertFile> findEntCertFiles(EntCertFile record){
       return  entCertFileDao.find(record);
    }

    public EntCertFile getEntCertFileByPrimaryKey(Long certFileId){
        return entCertFileDao.getByPrimaryKey(certFileId);
    }

    public Integer createEntCertFile(EntCertFile record){
        return entCertFileDao.insert(record);
    }

    public Integer removeEntCertFile(EntCertFile record){
        return entCertFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certFileId){
    	return entCertFileDao.deleteByPrimaryKey(certFileId);
    }

    public Integer modifyEntCertFileByPrimaryKey(EntCertFile record){
        return entCertFileDao.updateByPrimaryKey(record);
    }









}