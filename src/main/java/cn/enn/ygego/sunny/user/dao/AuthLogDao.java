package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.AuthLog;

/**
 * dal Interface:AuthLog
 * @author gencode
 */
public interface AuthLogDao {

	Integer insert(AuthLog record);

    Integer insertSelective(AuthLog record);
    
    Integer delete(AuthLog record);

    Integer deleteByPrimaryKey(@Param("logId") Long logId);
    
    Integer updateByPrimaryKey(AuthLog record);

    List<AuthLog> findAll();

    List<AuthLog> find(AuthLog record);

    Integer getCount(AuthLog record);

    AuthLog getByPrimaryKey(@Param("logId") Long logId);

	


}