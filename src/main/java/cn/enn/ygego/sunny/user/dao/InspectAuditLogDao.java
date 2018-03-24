package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.InspectAuditLog;

/**
 * dal Interface:InspectAuditLog
 * @author gencode
 */
public interface InspectAuditLogDao {

	Integer insert(InspectAuditLog record);

    Integer insertSelective(InspectAuditLog record);
    
    Integer delete(InspectAuditLog record);

    Integer deleteByPrimaryKey(@Param("logId") Long logId);
    
    Integer updateByPrimaryKey(InspectAuditLog record);

    List<InspectAuditLog> findAll();

    List<InspectAuditLog> find(InspectAuditLog record);

    Integer getCount(InspectAuditLog record);

    InspectAuditLog getByPrimaryKey(@Param("logId") Long logId);

	


}