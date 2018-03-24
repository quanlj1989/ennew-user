package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualCertInfoService;
import cn.enn.ygego.sunny.user.dao.IndividualCertInfoDao;
import cn.enn.ygego.sunny.user.model.IndividualCertInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualCertInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualCertInfoServiceImpl implements IndividualCertInfoService{

    @Autowired
    private IndividualCertInfoDao individualCertInfoDao;

    public List<IndividualCertInfo> findAll(){
       return  individualCertInfoDao.findAll();
    }

    public List<IndividualCertInfo> findIndividualCertInfos(IndividualCertInfo record){
       return  individualCertInfoDao.find(record);
    }

    public IndividualCertInfo getIndividualCertInfoByPrimaryKey(Long certInfoId){
        return individualCertInfoDao.getByPrimaryKey(certInfoId);
    }

    public Integer createIndividualCertInfo(IndividualCertInfo record){
        return individualCertInfoDao.insert(record);
    }

    public Integer removeIndividualCertInfo(IndividualCertInfo record){
        return individualCertInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certInfoId){
    	return individualCertInfoDao.deleteByPrimaryKey(certInfoId);
    }

    public Integer modifyIndividualCertInfoByPrimaryKey(IndividualCertInfo record){
        return individualCertInfoDao.updateByPrimaryKey(record);
    }









}