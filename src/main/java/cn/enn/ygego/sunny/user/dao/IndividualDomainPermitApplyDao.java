package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualDomainPermitApply;

/**
 * dal Interface:IndividualDomainPermitApply
 * @author gencode
 */
public interface IndividualDomainPermitApplyDao {

	Integer insert(IndividualDomainPermitApply record);

    Integer insertSelective(IndividualDomainPermitApply record);
    
    Integer delete(IndividualDomainPermitApply record);

    Integer deleteByPrimaryKey(@Param("domainApplyId") Long domainApplyId);
    
    Integer updateByPrimaryKey(IndividualDomainPermitApply record);

    List<IndividualDomainPermitApply> findAll();

    List<IndividualDomainPermitApply> find(IndividualDomainPermitApply record);

    Integer getCount(IndividualDomainPermitApply record);

    IndividualDomainPermitApply getByPrimaryKey(@Param("domainApplyId") Long domainApplyId);

	


}