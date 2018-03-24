package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.AcctRoleRela;

/**
 * dal Interface:AcctRoleRela
 * @author gencode
 */
public interface AcctRoleRelaDao {

	Integer insert(AcctRoleRela record);

    Integer insertSelective(AcctRoleRela record);
    
    Integer delete(AcctRoleRela record);

    Integer deleteByPrimaryKey(@Param("relaId") Long relaId);
    
    Integer updateByPrimaryKey(AcctRoleRela record);

    List<AcctRoleRela> findAll();

    List<AcctRoleRela> find(AcctRoleRela record);

    Integer getCount(AcctRoleRela record);

    AcctRoleRela getByPrimaryKey(@Param("relaId") Long relaId);

	


}