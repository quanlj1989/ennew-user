package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualCertApplyFileService;
import cn.enn.ygego.sunny.user.dao.IndividualCertApplyFileDao;
import cn.enn.ygego.sunny.user.model.IndividualCertApplyFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualCertApplyFile
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualCertApplyFileServiceImpl implements IndividualCertApplyFileService{

    @Autowired
    private IndividualCertApplyFileDao individualCertApplyFileDao;

    public List<IndividualCertApplyFile> findAll(){
       return  individualCertApplyFileDao.findAll();
    }

    public List<IndividualCertApplyFile> findIndividualCertApplyFiles(IndividualCertApplyFile record){
       return  individualCertApplyFileDao.find(record);
    }

    public IndividualCertApplyFile getIndividualCertApplyFileByPrimaryKey(Long certApplyFileId){
        return individualCertApplyFileDao.getByPrimaryKey(certApplyFileId);
    }

    public Integer createIndividualCertApplyFile(IndividualCertApplyFile record){
        return individualCertApplyFileDao.insert(record);
    }

    public Integer removeIndividualCertApplyFile(IndividualCertApplyFile record){
        return individualCertApplyFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyFileId){
    	return individualCertApplyFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer modifyIndividualCertApplyFileByPrimaryKey(IndividualCertApplyFile record){
        return individualCertApplyFileDao.updateByPrimaryKey(record);
    }









}