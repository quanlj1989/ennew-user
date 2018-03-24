package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualServiceCertFileService;
import cn.enn.ygego.sunny.user.dao.IndividualServiceCertFileDao;
import cn.enn.ygego.sunny.user.model.IndividualServiceCertFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualServiceCertFile
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualServiceCertFileServiceImpl implements IndividualServiceCertFileService{

    @Autowired
    private IndividualServiceCertFileDao individualServiceCertFileDao;

    public List<IndividualServiceCertFile> findAll(){
       return  individualServiceCertFileDao.findAll();
    }

    public List<IndividualServiceCertFile> findIndividualServiceCertFiles(IndividualServiceCertFile record){
       return  individualServiceCertFileDao.find(record);
    }

    public IndividualServiceCertFile getIndividualServiceCertFileByPrimaryKey(Long certApplyFileId){
        return individualServiceCertFileDao.getByPrimaryKey(certApplyFileId);
    }

    public Integer createIndividualServiceCertFile(IndividualServiceCertFile record){
        return individualServiceCertFileDao.insert(record);
    }

    public Integer removeIndividualServiceCertFile(IndividualServiceCertFile record){
        return individualServiceCertFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyFileId){
    	return individualServiceCertFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer modifyIndividualServiceCertFileByPrimaryKey(IndividualServiceCertFile record){
        return individualServiceCertFileDao.updateByPrimaryKey(record);
    }









}