package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualBrandApplyCert;

/**
 * dal Interface:IndividualBrandApplyCert
 * @author gencode
 */
public interface IndividualBrandApplyCertDao {

	Integer insert(IndividualBrandApplyCert record);

    Integer insertSelective(IndividualBrandApplyCert record);
    
    Integer delete(IndividualBrandApplyCert record);

    Integer deleteByPrimaryKey(@Param("brandApplyCertId") Long brandApplyCertId);
    
    Integer updateByPrimaryKey(IndividualBrandApplyCert record);

    List<IndividualBrandApplyCert> findAll();

    List<IndividualBrandApplyCert> find(IndividualBrandApplyCert record);

    Integer getCount(IndividualBrandApplyCert record);

    IndividualBrandApplyCert getByPrimaryKey(@Param("brandApplyCertId") Long brandApplyCertId);

	


}