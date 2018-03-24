package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.SysLog;

/**
 * dal Interface:SysLog
 * @author gencode
 */
public interface SysLogDao {

	Integer insert(SysLog record);

    Integer insertSelective(SysLog record);
    
    Integer delete(SysLog record);

    Integer deleteByPrimaryKey(@Param("logId") Long logId);
    
    Integer updateByPrimaryKey(SysLog record);

    List<SysLog> findAll();

    List<SysLog> find(SysLog record);

    Integer getCount(SysLog record);

    SysLog getByPrimaryKey(@Param("logId") Long logId);

	


}