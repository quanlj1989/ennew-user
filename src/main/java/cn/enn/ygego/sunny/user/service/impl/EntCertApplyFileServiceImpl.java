package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntCertApplyFileService;
import cn.enn.ygego.sunny.user.dao.EntCertApplyFileDao;
import cn.enn.ygego.sunny.user.model.EntCertApplyFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntCertApplyFile
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class EntCertApplyFileServiceImpl implements EntCertApplyFileService{

    @Autowired
    private EntCertApplyFileDao entCertApplyFileDao;

    public List<EntCertApplyFile> findAll(){
       return  entCertApplyFileDao.findAll();
    }

    public List<EntCertApplyFile> findEntCertApplyFiles(EntCertApplyFile record){
       return  entCertApplyFileDao.find(record);
    }

    public EntCertApplyFile getEntCertApplyFileByPrimaryKey(Long certApplyFileId){
        return entCertApplyFileDao.getByPrimaryKey(certApplyFileId);
    }

    public Integer createEntCertApplyFile(EntCertApplyFile record){
        return entCertApplyFileDao.insert(record);
    }

    public Integer removeEntCertApplyFile(EntCertApplyFile record){
        return entCertApplyFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyFileId){
    	return entCertApplyFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer modifyEntCertApplyFileByPrimaryKey(EntCertApplyFile record){
        return entCertApplyFileDao.updateByPrimaryKey(record);
    }









}