package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualCertFileService;
import cn.enn.ygego.sunny.user.dao.IndividualCertFileDao;
import cn.enn.ygego.sunny.user.model.IndividualCertFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualCertFile
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualCertFileServiceImpl implements IndividualCertFileService{

    @Autowired
    private IndividualCertFileDao individualCertFileDao;

    public List<IndividualCertFile> findAll(){
       return  individualCertFileDao.findAll();
    }

    public List<IndividualCertFile> findIndividualCertFiles(IndividualCertFile record){
       return  individualCertFileDao.find(record);
    }

    public IndividualCertFile getIndividualCertFileByPrimaryKey(Long certFileId){
        return individualCertFileDao.getByPrimaryKey(certFileId);
    }

    public Integer createIndividualCertFile(IndividualCertFile record){
        return individualCertFileDao.insert(record);
    }

    public Integer removeIndividualCertFile(IndividualCertFile record){
        return individualCertFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certFileId){
    	return individualCertFileDao.deleteByPrimaryKey(certFileId);
    }

    public Integer modifyIndividualCertFileByPrimaryKey(IndividualCertFile record){
        return individualCertFileDao.updateByPrimaryKey(record);
    }

    public List<IndividualCertFile> getFilesByCertInfoId(Long certInfoId){
        return individualCertFileDao.getByCertInfoId(certInfoId);
    }


}