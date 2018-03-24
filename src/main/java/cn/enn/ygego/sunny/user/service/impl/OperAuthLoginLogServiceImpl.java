package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.OperAuthLoginLogService;
import cn.enn.ygego.sunny.user.dao.OperAuthLoginLogDao;
import cn.enn.ygego.sunny.user.model.OperAuthLoginLog;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:OperAuthLoginLog
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class OperAuthLoginLogServiceImpl implements OperAuthLoginLogService{

    @Autowired
    private OperAuthLoginLogDao operAuthLoginLogDao;

    public List<OperAuthLoginLog> findAll(){
       return  operAuthLoginLogDao.findAll();
    }

    public List<OperAuthLoginLog> findOperAuthLoginLogs(OperAuthLoginLog record){
       return  operAuthLoginLogDao.find(record);
    }

    public OperAuthLoginLog getOperAuthLoginLogByPrimaryKey(Long logId){
        return operAuthLoginLogDao.getByPrimaryKey(logId);
    }

    public Integer createOperAuthLoginLog(OperAuthLoginLog record){
        return operAuthLoginLogDao.insert(record);
    }

    public Integer removeOperAuthLoginLog(OperAuthLoginLog record){
        return operAuthLoginLogDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long logId){
    	return operAuthLoginLogDao.deleteByPrimaryKey(logId);
    }

    public Integer modifyOperAuthLoginLogByPrimaryKey(OperAuthLoginLog record){
        return operAuthLoginLogDao.updateByPrimaryKey(record);
    }









}