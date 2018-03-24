package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntCertApply;

/**
 * dal Interface:EntCertApply
 * @author gencode
 */
public interface EntCertApplyDao {

	Integer insert(EntCertApply record);

    Integer insertSelective(EntCertApply record);
    
    Integer delete(EntCertApply record);

    Integer deleteByPrimaryKey(@Param("certApplyId") Long certApplyId);
    
    Integer updateByPrimaryKey(EntCertApply record);

    List<EntCertApply> findAll();

    List<EntCertApply> find(EntCertApply record);

    Integer getCount(EntCertApply record);

    EntCertApply getByPrimaryKey(@Param("certApplyId") Long certApplyId);

	


}