package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntDept;

/**
 * dal Interface:EntDept
 * @author gencode
 */
public interface EntDeptDao {

	Integer insert(EntDept record);

    Integer insertSelective(EntDept record);
    
    Integer delete(EntDept record);

    Integer deleteByPrimaryKey(@Param("deptId") Long deptId);
    
    Integer updateByPrimaryKey(EntDept record);

    List<EntDept> findAll();

    List<EntDept> find(EntDept record);

    Integer getCount(EntDept record);

    EntDept getByPrimaryKey(@Param("deptId") Long deptId);

	


}