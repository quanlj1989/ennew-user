package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.OperManage;

/**
 * dal Interface:OperManage
 * @author gencode
 */
public interface OperManageDao {

	Integer insert(OperManage record);

    Integer insertSelective(OperManage record);
    
    Integer delete(OperManage record);

    Integer deleteByPrimaryKey(@Param("operId") Long operId);
    
    Integer updateByPrimaryKey(OperManage record);

    List<OperManage> findAll();

    List<OperManage> find(OperManage record);

    Integer getCount(OperManage record);

    OperManage getByPrimaryKey(@Param("operId") Long operId);

	


}