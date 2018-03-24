package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualBrandApply;

/**
 * dal Interface:IndividualBrandApply
 * @author gencode
 */
public interface IndividualBrandApplyDao {

	Integer insert(IndividualBrandApply record);

    Integer insertSelective(IndividualBrandApply record);
    
    Integer delete(IndividualBrandApply record);

    Integer deleteByPrimaryKey(@Param("brandApplyId") Integer brandApplyId);
    
    Integer updateByPrimaryKey(IndividualBrandApply record);

    List<IndividualBrandApply> findAll();

    List<IndividualBrandApply> find(IndividualBrandApply record);

    Integer getCount(IndividualBrandApply record);

    IndividualBrandApply getByPrimaryKey(@Param("brandApplyId") Integer brandApplyId);

	


}