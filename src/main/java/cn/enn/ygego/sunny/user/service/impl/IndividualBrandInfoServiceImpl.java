package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualBrandInfoService;
import cn.enn.ygego.sunny.user.dao.IndividualBrandInfoDao;
import cn.enn.ygego.sunny.user.model.IndividualBrandInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualBrandInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualBrandInfoServiceImpl implements IndividualBrandInfoService{

    @Autowired
    private IndividualBrandInfoDao individualBrandInfoDao;

    public List<IndividualBrandInfo> findAll(){
       return  individualBrandInfoDao.findAll();
    }

    public List<IndividualBrandInfo> findIndividualBrandInfos(IndividualBrandInfo record){
       return  individualBrandInfoDao.find(record);
    }

    public IndividualBrandInfo getIndividualBrandInfoByPrimaryKey(Long individualBrandId){
        return individualBrandInfoDao.getByPrimaryKey(individualBrandId);
    }

    public Integer createIndividualBrandInfo(IndividualBrandInfo record){
        return individualBrandInfoDao.insert(record);
    }

    public Integer removeIndividualBrandInfo(IndividualBrandInfo record){
        return individualBrandInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long individualBrandId){
    	return individualBrandInfoDao.deleteByPrimaryKey(individualBrandId);
    }

    public Integer modifyIndividualBrandInfoByPrimaryKey(IndividualBrandInfo record){
        return individualBrandInfoDao.updateByPrimaryKey(record);
    }









}