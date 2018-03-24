package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.RoleInfo;

/**
 * dal Interface:RoleInfo
 * @author gencode
 */
public interface RoleInfoDao {

	Integer insert(RoleInfo record);

    Integer insertSelective(RoleInfo record);
    
    Integer delete(RoleInfo record);

    Integer deleteByPrimaryKey(@Param("roleId") Long roleId);
    
    Integer updateByPrimaryKey(RoleInfo record);

    List<RoleInfo> findAll();

    List<RoleInfo> find(RoleInfo record);

    Integer getCount(RoleInfo record);

    RoleInfo getByPrimaryKey(@Param("roleId") Long roleId);

	


}