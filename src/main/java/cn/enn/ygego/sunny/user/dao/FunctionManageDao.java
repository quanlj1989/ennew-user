package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.FunctionManage;

/**
 * dal Interface:FunctionManage
 * @author gencode
 */
public interface FunctionManageDao {

	Integer insert(FunctionManage record);

    Integer insertSelective(FunctionManage record);
    
    Integer delete(FunctionManage record);

    Integer deleteByPrimaryKey(@Param("functionId") Long functionId);
    
    Integer updateByPrimaryKey(FunctionManage record);

    List<FunctionManage> findAll();

    List<FunctionManage> find(FunctionManage record);

    Integer getCount(FunctionManage record);

    FunctionManage getByPrimaryKey(@Param("functionId") Long functionId);

	


}