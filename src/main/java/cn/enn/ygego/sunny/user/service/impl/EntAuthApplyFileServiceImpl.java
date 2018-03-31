package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntAuthApplyFileService;
import cn.enn.ygego.sunny.user.dao.EntAuthApplyFileDao;
import cn.enn.ygego.sunny.user.model.EntAuthApplyFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntAuthApplyFile
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntAuthApplyFileServiceImpl implements EntAuthApplyFileService{

    @Autowired
    private EntAuthApplyFileDao entAuthApplyFileDao;

    public List<EntAuthApplyFile> findAll(){
       return  entAuthApplyFileDao.findAll();
    }

    public List<EntAuthApplyFile> findEntAuthApplyFiles(EntAuthApplyFile record){
       return  entAuthApplyFileDao.find(record);
    }

    public EntAuthApplyFile getEntAuthApplyFileByPrimaryKey(Long certApplyFileId){
        return entAuthApplyFileDao.getByPrimaryKey(certApplyFileId);
    }

    public Integer createEntAuthApplyFile(EntAuthApplyFile record){
        return entAuthApplyFileDao.insert(record);
    }

    public Integer removeEntAuthApplyFile(EntAuthApplyFile record){
        return entAuthApplyFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyFileId){
    	return entAuthApplyFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer modifyEntAuthApplyFileByPrimaryKey(EntAuthApplyFile record){
        return entAuthApplyFileDao.updateByPrimaryKey(record);
    }









}