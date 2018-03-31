package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntCateCertApplyFileService;
import cn.enn.ygego.sunny.user.dao.EntCateCertApplyFileDao;
import cn.enn.ygego.sunny.user.model.EntCateCertApplyFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntCateCertApplyFile
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntCateCertApplyFileServiceImpl implements EntCateCertApplyFileService{

    @Autowired
    private EntCateCertApplyFileDao entCateCertApplyFileDao;

    public List<EntCateCertApplyFile> findAll(){
       return  entCateCertApplyFileDao.findAll();
    }

    public List<EntCateCertApplyFile> findEntCateCertApplyFiles(EntCateCertApplyFile record){
       return  entCateCertApplyFileDao.find(record);
    }

    public EntCateCertApplyFile getEntCateCertApplyFileByPrimaryKey(Long certApplyFileId){
        return entCateCertApplyFileDao.getByPrimaryKey(certApplyFileId);
    }

    public Integer createEntCateCertApplyFile(EntCateCertApplyFile record){
        return entCateCertApplyFileDao.insert(record);
    }

    public Integer removeEntCateCertApplyFile(EntCateCertApplyFile record){
        return entCateCertApplyFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyFileId){
    	return entCateCertApplyFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer modifyEntCateCertApplyFileByPrimaryKey(EntCateCertApplyFile record){
        return entCateCertApplyFileDao.updateByPrimaryKey(record);
    }









}