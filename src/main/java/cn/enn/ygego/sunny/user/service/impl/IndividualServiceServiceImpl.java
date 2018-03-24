package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualServiceService;
import cn.enn.ygego.sunny.user.dao.IndividualServiceDao;
import cn.enn.ygego.sunny.user.model.IndividualService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualService
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualServiceServiceImpl implements IndividualServiceService{

    @Autowired
    private IndividualServiceDao individualServiceDao;

    public List<IndividualService> findAll(){
       return  individualServiceDao.findAll();
    }

    public List<IndividualService> findIndividualServices(IndividualService record){
       return  individualServiceDao.find(record);
    }

    public IndividualService getIndividualServiceByPrimaryKey(Long serviceId){
        return individualServiceDao.getByPrimaryKey(serviceId);
    }

    public Integer createIndividualService(IndividualService record){
        return individualServiceDao.insert(record);
    }

    public Integer removeIndividualService(IndividualService record){
        return individualServiceDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long serviceId){
    	return individualServiceDao.deleteByPrimaryKey(serviceId);
    }

    public Integer modifyIndividualServiceByPrimaryKey(IndividualService record){
        return individualServiceDao.updateByPrimaryKey(record);
    }









}