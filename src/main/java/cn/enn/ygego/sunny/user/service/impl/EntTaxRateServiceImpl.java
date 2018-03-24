package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntTaxRateService;
import cn.enn.ygego.sunny.user.dao.EntTaxRateDao;
import cn.enn.ygego.sunny.user.model.EntTaxRate;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntTaxRate
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class EntTaxRateServiceImpl implements EntTaxRateService{

    @Autowired
    private EntTaxRateDao entTaxRateDao;

    public List<EntTaxRate> findAll(){
       return  entTaxRateDao.findAll();
    }

    public List<EntTaxRate> findEntTaxRates(EntTaxRate record){
       return  entTaxRateDao.find(record);
    }

    public EntTaxRate getEntTaxRateByPrimaryKey(Long taxRateId){
        return entTaxRateDao.getByPrimaryKey(taxRateId);
    }

    public Integer createEntTaxRate(EntTaxRate record){
        return entTaxRateDao.insert(record);
    }

    public Integer removeEntTaxRate(EntTaxRate record){
        return entTaxRateDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long taxRateId){
    	return entTaxRateDao.deleteByPrimaryKey(taxRateId);
    }

    public Integer modifyEntTaxRateByPrimaryKey(EntTaxRate record){
        return entTaxRateDao.updateByPrimaryKey(record);
    }









}