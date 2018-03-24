package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualBrandCertFileService;
import cn.enn.ygego.sunny.user.dao.IndividualBrandCertFileDao;
import cn.enn.ygego.sunny.user.model.IndividualBrandCertFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualBrandCertFile
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualBrandCertFileServiceImpl implements IndividualBrandCertFileService{

    @Autowired
    private IndividualBrandCertFileDao individualBrandCertFileDao;

    public List<IndividualBrandCertFile> findAll(){
       return  individualBrandCertFileDao.findAll();
    }

    public List<IndividualBrandCertFile> findIndividualBrandCertFiles(IndividualBrandCertFile record){
       return  individualBrandCertFileDao.find(record);
    }

    public IndividualBrandCertFile getIndividualBrandCertFileByPrimaryKey(Long certApplyFileId){
        return individualBrandCertFileDao.getByPrimaryKey(certApplyFileId);
    }

    public Integer createIndividualBrandCertFile(IndividualBrandCertFile record){
        return individualBrandCertFileDao.insert(record);
    }

    public Integer removeIndividualBrandCertFile(IndividualBrandCertFile record){
        return individualBrandCertFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyFileId){
    	return individualBrandCertFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer modifyIndividualBrandCertFileByPrimaryKey(IndividualBrandCertFile record){
        return individualBrandCertFileDao.updateByPrimaryKey(record);
    }









}