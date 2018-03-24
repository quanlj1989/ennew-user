package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntBrandCert;

/**
 * dal Interface:EntBrandCert
 * @author gencode
 */
public interface EntBrandCertDao {

	Integer insert(EntBrandCert record);

    Integer insertSelective(EntBrandCert record);
    
    Integer delete(EntBrandCert record);

    Integer deleteByPrimaryKey(@Param("brandCertId") Long brandCertId);
    
    Integer updateByPrimaryKey(EntBrandCert record);

    List<EntBrandCert> findAll();

    List<EntBrandCert> find(EntBrandCert record);

    Integer getCount(EntBrandCert record);

    EntBrandCert getByPrimaryKey(@Param("brandCertId") Long brandCertId);

	


}