package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.SysLog;

/**
 * dal Interface:SysLog
 * @author gencode
 * @date 2018-3-22
 */
public interface SysLogService {

    public List<SysLog> findAll();

    public List<SysLog> findSysLogs(SysLog record);

    public SysLog getSysLogByPrimaryKey(Long logId);

    public Integer createSysLog(SysLog record);

    public Integer removeSysLog(SysLog record);

    public Integer removeByPrimaryKey(Long logId);

    public Integer modifySysLogByPrimaryKey(SysLog record);



}