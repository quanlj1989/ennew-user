package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualCertInfo;

/**
 * dal Interface:IndividualCertInfo
 * @author gencode
 */
public interface IndividualCertInfoDao {

	Integer insert(IndividualCertInfo record);

    Integer insertSelective(IndividualCertInfo record);
    
    Integer delete(IndividualCertInfo record);

    Integer deleteByPrimaryKey(@Param("certInfoId") Long certInfoId);
    
    Integer updateByPrimaryKey(IndividualCertInfo record);

    List<IndividualCertInfo> findAll();

    List<IndividualCertInfo> find(IndividualCertInfo record);

    Integer getCount(IndividualCertInfo record);

    IndividualCertInfo getByPrimaryKey(@Param("certInfoId") Long certInfoId);

	


}