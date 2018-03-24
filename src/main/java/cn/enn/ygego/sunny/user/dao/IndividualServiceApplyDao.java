package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualServiceApply;

/**
 * dal Interface:IndividualServiceApply
 * @author gencode
 */
public interface IndividualServiceApplyDao {

	Integer insert(IndividualServiceApply record);

    Integer insertSelective(IndividualServiceApply record);
    
    Integer delete(IndividualServiceApply record);

    Integer deleteByPrimaryKey(@Param("serviceApplyId") Long serviceApplyId);
    
    Integer updateByPrimaryKey(IndividualServiceApply record);

    List<IndividualServiceApply> findAll();

    List<IndividualServiceApply> find(IndividualServiceApply record);

    Integer getCount(IndividualServiceApply record);

    IndividualServiceApply getByPrimaryKey(@Param("serviceApplyId") Long serviceApplyId);

	


}