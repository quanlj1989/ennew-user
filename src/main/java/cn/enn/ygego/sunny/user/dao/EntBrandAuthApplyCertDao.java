package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntBrandAuthApplyCert;

/**
 * dal Interface:EntBrandAuthApplyCert
 * @author gencode
 */
public interface EntBrandAuthApplyCertDao {

	Integer insert(EntBrandAuthApplyCert record);

    Integer insertSelective(EntBrandAuthApplyCert record);
    
    Integer delete(EntBrandAuthApplyCert record);

    Integer deleteByPrimaryKey(@Param("brandApplyCertId") Long brandApplyCertId);
    
    Integer updateByPrimaryKey(EntBrandAuthApplyCert record);

    List<EntBrandAuthApplyCert> findAll();

    List<EntBrandAuthApplyCert> find(EntBrandAuthApplyCert record);

    Integer getCount(EntBrandAuthApplyCert record);

    EntBrandAuthApplyCert getByPrimaryKey(@Param("brandApplyCertId") Long brandApplyCertId);

	


}