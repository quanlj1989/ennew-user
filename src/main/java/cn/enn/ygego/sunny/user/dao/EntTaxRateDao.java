package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntTaxRate;

/**
 * dal Interface:EntTaxRate
 * @author gencode
 */
public interface EntTaxRateDao {

	Integer insert(EntTaxRate record);

    Integer insertSelective(EntTaxRate record);
    
    Integer delete(EntTaxRate record);

    Integer deleteByPrimaryKey(@Param("taxRateId") Long taxRateId);
    
    Integer updateByPrimaryKey(EntTaxRate record);

    List<EntTaxRate> findAll();

    List<EntTaxRate> find(EntTaxRate record);

    Integer getCount(EntTaxRate record);

    EntTaxRate getByPrimaryKey(@Param("taxRateId") Long taxRateId);

	


}