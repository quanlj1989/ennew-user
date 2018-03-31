package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntAuthCertApply;

/**
 * dal Interface:EntAuthCertApply
 * @author gencode
 */
public interface EntAuthCertApplyDao {

	Integer insert(EntAuthCertApply record);

    Integer insertSelective(EntAuthCertApply record);
    
    Integer delete(EntAuthCertApply record);

    Integer deleteByPrimaryKey(@Param("certApplyId") Long certApplyId);
    
    Integer updateByPrimaryKey(EntAuthCertApply record);

    List<EntAuthCertApply> findAll();

    List<EntAuthCertApply> find(EntAuthCertApply record);

    Integer getCount(EntAuthCertApply record);

    EntAuthCertApply getByPrimaryKey(@Param("certApplyId") Long certApplyId);

	


}