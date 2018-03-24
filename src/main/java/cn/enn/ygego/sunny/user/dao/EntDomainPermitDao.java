package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntDomainPermit;

/**
 * dal Interface:EntDomainPermit
 * @author gencode
 */
public interface EntDomainPermitDao {

	Integer insert(EntDomainPermit record);

    Integer insertSelective(EntDomainPermit record);
    
    Integer delete(EntDomainPermit record);

    Integer deleteByPrimaryKey(@Param("domainPermitId") Long domainPermitId);
    
    Integer updateByPrimaryKey(EntDomainPermit record);

    List<EntDomainPermit> findAll();

    List<EntDomainPermit> find(EntDomainPermit record);

    Integer getCount(EntDomainPermit record);

    EntDomainPermit getByPrimaryKey(@Param("domainPermitId") Long domainPermitId);

	


}