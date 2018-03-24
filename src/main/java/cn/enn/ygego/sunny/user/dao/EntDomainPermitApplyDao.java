package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntDomainPermitApply;

/**
 * dal Interface:EntDomainPermitApply
 * @author gencode
 */
public interface EntDomainPermitApplyDao {

	Integer insert(EntDomainPermitApply record);

    Integer insertSelective(EntDomainPermitApply record);
    
    Integer delete(EntDomainPermitApply record);

    Integer deleteByPrimaryKey(@Param("domainApplyId") Long domainApplyId);
    
    Integer updateByPrimaryKey(EntDomainPermitApply record);

    List<EntDomainPermitApply> findAll();

    List<EntDomainPermitApply> find(EntDomainPermitApply record);

    Integer getCount(EntDomainPermitApply record);

    EntDomainPermitApply getByPrimaryKey(@Param("domainApplyId") Long domainApplyId);

	


}