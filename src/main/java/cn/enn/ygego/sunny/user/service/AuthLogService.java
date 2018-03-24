package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.AuthLog;

/**
 * dal Interface:AuthLog
 * @author gencode
 * @date 2018-3-22
 */
public interface AuthLogService {

    public List<AuthLog> findAll();

    public List<AuthLog> findAuthLogs(AuthLog record);

    public AuthLog getAuthLogByPrimaryKey(Long logId);

    public Integer createAuthLog(AuthLog record);

    public Integer removeAuthLog(AuthLog record);

    public Integer removeByPrimaryKey(Long logId);

    public Integer modifyAuthLogByPrimaryKey(AuthLog record);



}