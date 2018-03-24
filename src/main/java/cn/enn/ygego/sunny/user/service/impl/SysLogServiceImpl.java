package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.SysLogService;
import cn.enn.ygego.sunny.user.dao.SysLogDao;
import cn.enn.ygego.sunny.user.model.SysLog;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:SysLog
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class SysLogServiceImpl implements SysLogService{

    @Autowired
    private SysLogDao sysLogDao;

    public List<SysLog> findAll(){
       return  sysLogDao.findAll();
    }

    public List<SysLog> findSysLogs(SysLog record){
       return  sysLogDao.find(record);
    }

    public SysLog getSysLogByPrimaryKey(Long logId){
        return sysLogDao.getByPrimaryKey(logId);
    }

    public Integer createSysLog(SysLog record){
        return sysLogDao.insert(record);
    }

    public Integer removeSysLog(SysLog record){
        return sysLogDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long logId){
    	return sysLogDao.deleteByPrimaryKey(logId);
    }

    public Integer modifySysLogByPrimaryKey(SysLog record){
        return sysLogDao.updateByPrimaryKey(record);
    }









}