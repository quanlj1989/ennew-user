package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.OperAuthLoginLog;

/**
 * dal Interface:OperAuthLoginLog
 * @author gencode
 * @date 2018-3-22
 */
public interface OperAuthLoginLogService {

    public List<OperAuthLoginLog> findAll();

    public List<OperAuthLoginLog> findOperAuthLoginLogs(OperAuthLoginLog record);

    public OperAuthLoginLog getOperAuthLoginLogByPrimaryKey(Long logId);

    public Integer createOperAuthLoginLog(OperAuthLoginLog record);

    public Integer removeOperAuthLoginLog(OperAuthLoginLog record);

    public Integer removeByPrimaryKey(Long logId);

    public Integer modifyOperAuthLoginLogByPrimaryKey(OperAuthLoginLog record);



}