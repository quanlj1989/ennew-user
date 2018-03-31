package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntPaySetService;
import cn.enn.ygego.sunny.user.dao.EntPaySetDao;
import cn.enn.ygego.sunny.user.model.EntPaySet;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntPaySet
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntPaySetServiceImpl implements EntPaySetService{

    @Autowired
    private EntPaySetDao entPaySetDao;

    public List<EntPaySet> findAll(){
       return  entPaySetDao.findAll();
    }

    public List<EntPaySet> findEntPaySets(EntPaySet record){
       return  entPaySetDao.find(record);
    }

    public EntPaySet getEntPaySetByPrimaryKey(Long paySetId){
        return entPaySetDao.getByPrimaryKey(paySetId);
    }

    public Integer createEntPaySet(EntPaySet record){
        return entPaySetDao.insert(record);
    }

    public Integer removeEntPaySet(EntPaySet record){
        return entPaySetDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long paySetId){
    	return entPaySetDao.deleteByPrimaryKey(paySetId);
    }

    public Integer modifyEntPaySetByPrimaryKey(EntPaySet record){
        return entPaySetDao.updateByPrimaryKey(record);
    }









}