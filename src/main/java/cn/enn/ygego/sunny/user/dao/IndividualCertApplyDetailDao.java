package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualCertApplyDetail;

/**
 * dal Interface:IndividualCertApplyDetail
 * @author gencode
 */
public interface IndividualCertApplyDetailDao {

	Integer insert(IndividualCertApplyDetail record);

    Integer insertSelective(IndividualCertApplyDetail record);
    
    Integer delete(IndividualCertApplyDetail record);

    Integer deleteByPrimaryKey(@Param("certApplyDetailId") Long certApplyDetailId);
    
    Integer updateByPrimaryKey(IndividualCertApplyDetail record);

    List<IndividualCertApplyDetail> findAll();

    List<IndividualCertApplyDetail> find(IndividualCertApplyDetail record);

    Integer getCount(IndividualCertApplyDetail record);

    IndividualCertApplyDetail getByPrimaryKey(@Param("certApplyDetailId") Long certApplyDetailId);

    IndividualCertApplyDetail getByCertApplyId(@Param("certApplyId") Long certApplyId);


}