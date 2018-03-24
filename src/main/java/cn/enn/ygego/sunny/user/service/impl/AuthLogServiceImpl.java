package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.AuthLogService;
import cn.enn.ygego.sunny.user.dao.AuthLogDao;
import cn.enn.ygego.sunny.user.model.AuthLog;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:AuthLog
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class AuthLogServiceImpl implements AuthLogService{

    @Autowired
    private AuthLogDao authLogDao;

    public List<AuthLog> findAll(){
       return  authLogDao.findAll();
    }

    public List<AuthLog> findAuthLogs(AuthLog record){
       return  authLogDao.find(record);
    }

    public AuthLog getAuthLogByPrimaryKey(Long logId){
        return authLogDao.getByPrimaryKey(logId);
    }

    public Integer createAuthLog(AuthLog record){
        return authLogDao.insert(record);
    }

    public Integer removeAuthLog(AuthLog record){
        return authLogDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long logId){
    	return authLogDao.deleteByPrimaryKey(logId);
    }

    public Integer modifyAuthLogByPrimaryKey(AuthLog record){
        return authLogDao.updateByPrimaryKey(record);
    }









}