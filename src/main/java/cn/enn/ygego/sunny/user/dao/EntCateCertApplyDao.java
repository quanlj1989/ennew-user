package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntCateCertApply;

/**
 * dal Interface:EntCateCertApply
 * @author gencode
 */
public interface EntCateCertApplyDao {

	Integer insert(EntCateCertApply record);

    Integer insertSelective(EntCateCertApply record);
    
    Integer delete(EntCateCertApply record);

    Integer deleteByPrimaryKey(@Param("certApplyDetailId") Long certApplyDetailId);
    
    Integer updateByPrimaryKey(EntCateCertApply record);

    List<EntCateCertApply> findAll();

    List<EntCateCertApply> find(EntCateCertApply record);

    Integer getCount(EntCateCertApply record);

    EntCateCertApply getByPrimaryKey(@Param("certApplyDetailId") Long certApplyDetailId);

	


}