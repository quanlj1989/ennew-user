package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualServiceApplyCert;

/**
 * dal Interface:IndividualServiceApplyCert
 * @author gencode
 */
public interface IndividualServiceApplyCertDao {

	Integer insert(IndividualServiceApplyCert record);

    Integer insertSelective(IndividualServiceApplyCert record);
    
    Integer delete(IndividualServiceApplyCert record);

    Integer deleteByPrimaryKey(@Param("serviceApplyCertId") Long serviceApplyCertId);
    
    Integer updateByPrimaryKey(IndividualServiceApplyCert record);

    List<IndividualServiceApplyCert> findAll();

    List<IndividualServiceApplyCert> find(IndividualServiceApplyCert record);

    Integer getCount(IndividualServiceApplyCert record);

    IndividualServiceApplyCert getByPrimaryKey(@Param("serviceApplyCertId") Long serviceApplyCertId);

	


}