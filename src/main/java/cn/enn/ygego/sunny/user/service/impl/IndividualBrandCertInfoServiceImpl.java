package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualBrandCertInfoService;
import cn.enn.ygego.sunny.user.dao.IndividualBrandCertInfoDao;
import cn.enn.ygego.sunny.user.model.IndividualBrandCertInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualBrandCertInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualBrandCertInfoServiceImpl implements IndividualBrandCertInfoService{

    @Autowired
    private IndividualBrandCertInfoDao individualBrandCertInfoDao;

    public List<IndividualBrandCertInfo> findAll(){
       return  individualBrandCertInfoDao.findAll();
    }

    public List<IndividualBrandCertInfo> findIndividualBrandCertInfos(IndividualBrandCertInfo record){
       return  individualBrandCertInfoDao.find(record);
    }

    public IndividualBrandCertInfo getIndividualBrandCertInfoByPrimaryKey(Long brandCertId){
        return individualBrandCertInfoDao.getByPrimaryKey(brandCertId);
    }

    public Integer createIndividualBrandCertInfo(IndividualBrandCertInfo record){
        return individualBrandCertInfoDao.insert(record);
    }

    public Integer removeIndividualBrandCertInfo(IndividualBrandCertInfo record){
        return individualBrandCertInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long brandCertId){
    	return individualBrandCertInfoDao.deleteByPrimaryKey(brandCertId);
    }

    public Integer modifyIndividualBrandCertInfoByPrimaryKey(IndividualBrandCertInfo record){
        return individualBrandCertInfoDao.updateByPrimaryKey(record);
    }









}