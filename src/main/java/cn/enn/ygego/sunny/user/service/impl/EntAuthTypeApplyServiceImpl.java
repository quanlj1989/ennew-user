package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntAuthTypeApplyService;
import cn.enn.ygego.sunny.user.dao.EntAuthTypeApplyDao;
import cn.enn.ygego.sunny.user.model.EntAuthTypeApply;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntAuthTypeApply
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntAuthTypeApplyServiceImpl implements EntAuthTypeApplyService{

    @Autowired
    private EntAuthTypeApplyDao entAuthTypeApplyDao;

    public List<EntAuthTypeApply> findAll(){
       return  entAuthTypeApplyDao.findAll();
    }

    public List<EntAuthTypeApply> findEntAuthTypeApplys(EntAuthTypeApply record){
       return  entAuthTypeApplyDao.find(record);
    }

    public EntAuthTypeApply getEntAuthTypeApplyByPrimaryKey(Long authApplyId){
        return entAuthTypeApplyDao.getByPrimaryKey(authApplyId);
    }

    public Integer createEntAuthTypeApply(EntAuthTypeApply record){
        return entAuthTypeApplyDao.insert(record);
    }

    public Integer removeEntAuthTypeApply(EntAuthTypeApply record){
        return entAuthTypeApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long authApplyId){
    	return entAuthTypeApplyDao.deleteByPrimaryKey(authApplyId);
    }

    public Integer modifyEntAuthTypeApplyByPrimaryKey(EntAuthTypeApply record){
        return entAuthTypeApplyDao.updateByPrimaryKey(record);
    }









}