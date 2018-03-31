package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntApplyProducerAuth;

/**
 * dal Interface:EntApplyProducerAuth
 * @author gencode
 */
public interface EntApplyProducerAuthDao {

	Integer insert(EntApplyProducerAuth record);

    Integer insertSelective(EntApplyProducerAuth record);
    
    Integer delete(EntApplyProducerAuth record);

    Integer deleteByPrimaryKey(@Param("authApplyId") Long authApplyId);
    
    Integer updateByPrimaryKey(EntApplyProducerAuth record);

    List<EntApplyProducerAuth> findAll();

    List<EntApplyProducerAuth> find(EntApplyProducerAuth record);

    Integer getCount(EntApplyProducerAuth record);

    EntApplyProducerAuth getByPrimaryKey(@Param("authApplyId") Long authApplyId);

	


}