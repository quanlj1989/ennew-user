package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualBrandCertApplyFileService;
import cn.enn.ygego.sunny.user.dao.IndividualBrandCertApplyFileDao;
import cn.enn.ygego.sunny.user.model.IndividualBrandCertApplyFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualBrandCertApplyFile
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualBrandCertApplyFileServiceImpl implements IndividualBrandCertApplyFileService{

    @Autowired
    private IndividualBrandCertApplyFileDao individualBrandCertApplyFileDao;

    public List<IndividualBrandCertApplyFile> findAll(){
       return  individualBrandCertApplyFileDao.findAll();
    }

    public List<IndividualBrandCertApplyFile> findIndividualBrandCertApplyFiles(IndividualBrandCertApplyFile record){
       return  individualBrandCertApplyFileDao.find(record);
    }

    public IndividualBrandCertApplyFile getIndividualBrandCertApplyFileByPrimaryKey(Long certApplyFileId){
        return individualBrandCertApplyFileDao.getByPrimaryKey(certApplyFileId);
    }

    public Integer createIndividualBrandCertApplyFile(IndividualBrandCertApplyFile record){
        return individualBrandCertApplyFileDao.insert(record);
    }

    public Integer removeIndividualBrandCertApplyFile(IndividualBrandCertApplyFile record){
        return individualBrandCertApplyFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyFileId){
    	return individualBrandCertApplyFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer modifyIndividualBrandCertApplyFileByPrimaryKey(IndividualBrandCertApplyFile record){
        return individualBrandCertApplyFileDao.updateByPrimaryKey(record);
    }









}