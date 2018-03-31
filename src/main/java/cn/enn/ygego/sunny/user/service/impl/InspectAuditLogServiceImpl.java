package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.InspectAuditLogService;
import cn.enn.ygego.sunny.user.dao.InspectAuditLogDao;
import cn.enn.ygego.sunny.user.model.InspectAuditLog;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:InspectAuditLog
 * @author gencode
 * @date 2018-3-30
 */
@Service
public class InspectAuditLogServiceImpl implements InspectAuditLogService{

    @Autowired
    private InspectAuditLogDao inspectAuditLogDao;

    public List<InspectAuditLog> findAll(){
       return  inspectAuditLogDao.findAll();
    }

    public List<InspectAuditLog> findInspectAuditLogs(InspectAuditLog record){
       return  inspectAuditLogDao.find(record);
    }

    public InspectAuditLog getInspectAuditLogByPrimaryKey(Long logId){
        return inspectAuditLogDao.getByPrimaryKey(logId);
    }

    public Integer createInspectAuditLog(InspectAuditLog record){
        return inspectAuditLogDao.insert(record);
    }

    public Integer removeInspectAuditLog(InspectAuditLog record){
        return inspectAuditLogDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long logId){
    	return inspectAuditLogDao.deleteByPrimaryKey(logId);
    }

    public Integer modifyInspectAuditLogByPrimaryKey(InspectAuditLog record){
        return inspectAuditLogDao.updateByPrimaryKey(record);
    }









}