package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.RoleOperPrivRela;

/**
 * dal Interface:RoleOperPrivRela
 * @author gencode
 */
public interface RoleOperPrivRelaDao {

	Integer insert(RoleOperPrivRela record);

    Integer insertSelective(RoleOperPrivRela record);
    
    Integer delete(RoleOperPrivRela record);

    Integer deleteByPrimaryKey(@Param("relaId") Long relaId);
    
    Integer updateByPrimaryKey(RoleOperPrivRela record);

    List<RoleOperPrivRela> findAll();

    List<RoleOperPrivRela> find(RoleOperPrivRela record);

    Integer getCount(RoleOperPrivRela record);

    RoleOperPrivRela getByPrimaryKey(@Param("relaId") Long relaId);

	


}