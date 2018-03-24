package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualServiceCert;

/**
 * dal Interface:IndividualServiceCert
 * @author gencode
 */
public interface IndividualServiceCertDao {

	Integer insert(IndividualServiceCert record);

    Integer insertSelective(IndividualServiceCert record);
    
    Integer delete(IndividualServiceCert record);

    Integer deleteByPrimaryKey(@Param("serviceCertId") Long serviceCertId);
    
    Integer updateByPrimaryKey(IndividualServiceCert record);

    List<IndividualServiceCert> findAll();

    List<IndividualServiceCert> find(IndividualServiceCert record);

    Integer getCount(IndividualServiceCert record);

    IndividualServiceCert getByPrimaryKey(@Param("serviceCertId") Long serviceCertId);

	


}