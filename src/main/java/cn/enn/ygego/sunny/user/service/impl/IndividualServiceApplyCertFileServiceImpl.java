package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualServiceApplyCertFileService;
import cn.enn.ygego.sunny.user.dao.IndividualServiceApplyCertFileDao;
import cn.enn.ygego.sunny.user.model.IndividualServiceApplyCertFile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualServiceApplyCertFile
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualServiceApplyCertFileServiceImpl implements IndividualServiceApplyCertFileService{

    @Autowired
    private IndividualServiceApplyCertFileDao individualServiceApplyCertFileDao;

    public List<IndividualServiceApplyCertFile> findAll(){
       return  individualServiceApplyCertFileDao.findAll();
    }

    public List<IndividualServiceApplyCertFile> findIndividualServiceApplyCertFiles(IndividualServiceApplyCertFile record){
       return  individualServiceApplyCertFileDao.find(record);
    }

    public IndividualServiceApplyCertFile getIndividualServiceApplyCertFileByPrimaryKey(Long certApplyFileId){
        return individualServiceApplyCertFileDao.getByPrimaryKey(certApplyFileId);
    }

    public Integer createIndividualServiceApplyCertFile(IndividualServiceApplyCertFile record){
        return individualServiceApplyCertFileDao.insert(record);
    }

    public Integer removeIndividualServiceApplyCertFile(IndividualServiceApplyCertFile record){
        return individualServiceApplyCertFileDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyFileId){
    	return individualServiceApplyCertFileDao.deleteByPrimaryKey(certApplyFileId);
    }

    public Integer modifyIndividualServiceApplyCertFileByPrimaryKey(IndividualServiceApplyCertFile record){
        return individualServiceApplyCertFileDao.updateByPrimaryKey(record);
    }









}