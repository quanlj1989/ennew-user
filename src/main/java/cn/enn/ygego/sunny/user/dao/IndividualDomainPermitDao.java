package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualDomainPermit;

/**
 * dal Interface:IndividualDomainPermit
 * @author gencode
 */
public interface IndividualDomainPermitDao {

	Integer insert(IndividualDomainPermit record);

    Integer insertSelective(IndividualDomainPermit record);
    
    Integer delete(IndividualDomainPermit record);

    Integer deleteByPrimaryKey(@Param("domainPermitId") Long domainPermitId);
    
    Integer updateByPrimaryKey(IndividualDomainPermit record);

    List<IndividualDomainPermit> findAll();

    List<IndividualDomainPermit> find(IndividualDomainPermit record);

    Integer getCount(IndividualDomainPermit record);

    IndividualDomainPermit getByPrimaryKey(@Param("domainPermitId") Long domainPermitId);

	


}