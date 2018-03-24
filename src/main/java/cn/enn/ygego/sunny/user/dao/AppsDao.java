package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.Apps;

/**
 * dal Interface:Apps
 * @author gencode
 */
public interface AppsDao {

	Integer insert(Apps record);

    Integer insertSelective(Apps record);
    
    Integer delete(Apps record);

    Integer deleteByPrimaryKey(@Param("appId") Long appId);
    
    Integer updateByPrimaryKey(Apps record);

    List<Apps> findAll();

    List<Apps> find(Apps record);

    Integer getCount(Apps record);

    Apps getByPrimaryKey(@Param("appId") Long appId);

	


}