package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.OperAuthLoginLog;

/**
 * dal Interface:OperAuthLoginLog
 * @author gencode
 */
public interface OperAuthLoginLogDao {

	Integer insert(OperAuthLoginLog record);

    Integer insertSelective(OperAuthLoginLog record);
    
    Integer delete(OperAuthLoginLog record);

    Integer deleteByPrimaryKey(@Param("logId") Long logId);
    
    Integer updateByPrimaryKey(OperAuthLoginLog record);

    List<OperAuthLoginLog> findAll();

    List<OperAuthLoginLog> find(OperAuthLoginLog record);

    Integer getCount(OperAuthLoginLog record);

    OperAuthLoginLog getByPrimaryKey(@Param("logId") Long logId);

	


}