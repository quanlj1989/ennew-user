package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualServiceApplyCertService;
import cn.enn.ygego.sunny.user.dao.IndividualServiceApplyCertDao;
import cn.enn.ygego.sunny.user.model.IndividualServiceApplyCert;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualServiceApplyCert
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualServiceApplyCertServiceImpl implements IndividualServiceApplyCertService{

    @Autowired
    private IndividualServiceApplyCertDao individualServiceApplyCertDao;

    public List<IndividualServiceApplyCert> findAll(){
       return  individualServiceApplyCertDao.findAll();
    }

    public List<IndividualServiceApplyCert> findIndividualServiceApplyCerts(IndividualServiceApplyCert record){
       return  individualServiceApplyCertDao.find(record);
    }

    public IndividualServiceApplyCert getIndividualServiceApplyCertByPrimaryKey(Long serviceApplyCertId){
        return individualServiceApplyCertDao.getByPrimaryKey(serviceApplyCertId);
    }

    public Integer createIndividualServiceApplyCert(IndividualServiceApplyCert record){
        return individualServiceApplyCertDao.insert(record);
    }

    public Integer removeIndividualServiceApplyCert(IndividualServiceApplyCert record){
        return individualServiceApplyCertDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long serviceApplyCertId){
    	return individualServiceApplyCertDao.deleteByPrimaryKey(serviceApplyCertId);
    }

    public Integer modifyIndividualServiceApplyCertByPrimaryKey(IndividualServiceApplyCert record){
        return individualServiceApplyCertDao.updateByPrimaryKey(record);
    }









}