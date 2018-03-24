package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.RelaMemberToAcctService;
import cn.enn.ygego.sunny.user.dao.RelaMemberToAcctDao;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcct;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:RelaMemberToAcct
 * @author gencode
 * @date 2018-3-24
 */
@Service
public class RelaMemberToAcctServiceImpl implements RelaMemberToAcctService{

    @Autowired
    private RelaMemberToAcctDao relaMemberToAcctDao;

    public List<RelaMemberToAcct> findAll(){
       return  relaMemberToAcctDao.findAll();
    }

    public List<RelaMemberToAcct> findRelaMemberToAccts(RelaMemberToAcct record){
       return  relaMemberToAcctDao.find(record);
    }

    public RelaMemberToAcct getRelaMemberToAcctByPrimaryKey(Long relaId){
        return relaMemberToAcctDao.getByPrimaryKey(relaId);
    }

    public Integer createRelaMemberToAcct(RelaMemberToAcct record){
        return relaMemberToAcctDao.insert(record);
    }

    public Integer removeRelaMemberToAcct(RelaMemberToAcct record){
        return relaMemberToAcctDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long relaId){
    	return relaMemberToAcctDao.deleteByPrimaryKey(relaId);
    }

    public Integer modifyRelaMemberToAcctByPrimaryKey(RelaMemberToAcct record){
        return relaMemberToAcctDao.updateByPrimaryKey(record);
    }









}