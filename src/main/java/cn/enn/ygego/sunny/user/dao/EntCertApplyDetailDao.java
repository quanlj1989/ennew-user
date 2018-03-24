package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntCertApplyDetail;

/**
 * dal Interface:EntCertApplyDetail
 * @author gencode
 */
public interface EntCertApplyDetailDao {

	Integer insert(EntCertApplyDetail record);

    Integer insertSelective(EntCertApplyDetail record);
    
    Integer delete(EntCertApplyDetail record);

    Integer deleteByPrimaryKey(@Param("certApplyDetailId") Long certApplyDetailId);
    
    Integer updateByPrimaryKey(EntCertApplyDetail record);

    List<EntCertApplyDetail> findAll();

    List<EntCertApplyDetail> find(EntCertApplyDetail record);

    Integer getCount(EntCertApplyDetail record);

    EntCertApplyDetail getByPrimaryKey(@Param("certApplyDetailId") Long certApplyDetailId);

	


}