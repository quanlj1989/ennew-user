package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.AcctRoleRelaService;
import cn.enn.ygego.sunny.user.dao.AcctRoleRelaDao;
import cn.enn.ygego.sunny.user.model.AcctRoleRela;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:AcctRoleRela
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class AcctRoleRelaServiceImpl implements AcctRoleRelaService{

    @Autowired
    private AcctRoleRelaDao acctRoleRelaDao;

    public List<AcctRoleRela> findAll(){
       return  acctRoleRelaDao.findAll();
    }

    public List<AcctRoleRela> findAcctRoleRelas(AcctRoleRela record){
       return  acctRoleRelaDao.find(record);
    }

    public AcctRoleRela getAcctRoleRelaByPrimaryKey(Long relaId){
        return acctRoleRelaDao.getByPrimaryKey(relaId);
    }

    public Integer createAcctRoleRela(AcctRoleRela record){
        return acctRoleRelaDao.insert(record);
    }

    public Integer removeAcctRoleRela(AcctRoleRela record){
        return acctRoleRelaDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long relaId){
    	return acctRoleRelaDao.deleteByPrimaryKey(relaId);
    }

    public Integer modifyAcctRoleRelaByPrimaryKey(AcctRoleRela record){
        return acctRoleRelaDao.updateByPrimaryKey(record);
    }









}