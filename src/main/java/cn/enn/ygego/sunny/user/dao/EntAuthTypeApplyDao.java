package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntAuthTypeApply;

/**
 * dal Interface:EntAuthTypeApply
 * @author gencode
 */
public interface EntAuthTypeApplyDao {

	Integer insert(EntAuthTypeApply record);

    Integer insertSelective(EntAuthTypeApply record);
    
    Integer delete(EntAuthTypeApply record);

    Integer deleteByPrimaryKey(@Param("authApplyId") Long authApplyId);
    
    Integer updateByPrimaryKey(EntAuthTypeApply record);

    List<EntAuthTypeApply> findAll();

    List<EntAuthTypeApply> find(EntAuthTypeApply record);

    Integer getCount(EntAuthTypeApply record);

    EntAuthTypeApply getByPrimaryKey(@Param("authApplyId") Long authApplyId);

	


}