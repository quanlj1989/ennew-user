package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualBrandApplyCertService;
import cn.enn.ygego.sunny.user.dao.IndividualBrandApplyCertDao;
import cn.enn.ygego.sunny.user.model.IndividualBrandApplyCert;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualBrandApplyCert
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualBrandApplyCertServiceImpl implements IndividualBrandApplyCertService{

    @Autowired
    private IndividualBrandApplyCertDao individualBrandApplyCertDao;

    public List<IndividualBrandApplyCert> findAll(){
       return  individualBrandApplyCertDao.findAll();
    }

    public List<IndividualBrandApplyCert> findIndividualBrandApplyCerts(IndividualBrandApplyCert record){
       return  individualBrandApplyCertDao.find(record);
    }

    public IndividualBrandApplyCert getIndividualBrandApplyCertByPrimaryKey(Long brandApplyCertId){
        return individualBrandApplyCertDao.getByPrimaryKey(brandApplyCertId);
    }

    public Integer createIndividualBrandApplyCert(IndividualBrandApplyCert record){
        return individualBrandApplyCertDao.insert(record);
    }

    public Integer removeIndividualBrandApplyCert(IndividualBrandApplyCert record){
        return individualBrandApplyCertDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long brandApplyCertId){
    	return individualBrandApplyCertDao.deleteByPrimaryKey(brandApplyCertId);
    }

    public Integer modifyIndividualBrandApplyCertByPrimaryKey(IndividualBrandApplyCert record){
        return individualBrandApplyCertDao.updateByPrimaryKey(record);
    }









}