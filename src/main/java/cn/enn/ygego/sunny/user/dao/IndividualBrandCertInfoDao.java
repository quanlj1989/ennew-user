package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualBrandCertInfo;

/**
 * dal Interface:IndividualBrandCertInfo
 * @author gencode
 */
public interface IndividualBrandCertInfoDao {

	Integer insert(IndividualBrandCertInfo record);

    Integer insertSelective(IndividualBrandCertInfo record);
    
    Integer delete(IndividualBrandCertInfo record);

    Integer deleteByPrimaryKey(@Param("brandCertId") Long brandCertId);
    
    Integer updateByPrimaryKey(IndividualBrandCertInfo record);

    List<IndividualBrandCertInfo> findAll();

    List<IndividualBrandCertInfo> find(IndividualBrandCertInfo record);

    Integer getCount(IndividualBrandCertInfo record);

    IndividualBrandCertInfo getByPrimaryKey(@Param("brandCertId") Long brandCertId);

	


}