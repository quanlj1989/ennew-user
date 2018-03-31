package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.InspectAuditLog;

/**
 * dal Interface:InspectAuditLog
 * @author gencode
 * @date 2018-3-30
 */
public interface InspectAuditLogService {

    public List<InspectAuditLog> findAll();

    public List<InspectAuditLog> findInspectAuditLogs(InspectAuditLog record);

    public InspectAuditLog getInspectAuditLogByPrimaryKey(Long logId);

    public Integer createInspectAuditLog(InspectAuditLog record);

    public Integer removeInspectAuditLog(InspectAuditLog record);

    public Integer removeByPrimaryKey(Long logId);

    public Integer modifyInspectAuditLogByPrimaryKey(InspectAuditLog record);



}