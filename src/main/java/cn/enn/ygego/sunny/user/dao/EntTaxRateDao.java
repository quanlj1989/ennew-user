package cn.enn.ygego.sunny.user.dao;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.EntTaxRateDTO;
import cn.enn.ygego.sunny.user.dto.vo.EntTaxRateVO;
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

    List<EntTaxRate> findPage(EntTaxRateVO entTaxRateVO);

    EntTaxRateDTO getByMemberId(Long memberId);
}