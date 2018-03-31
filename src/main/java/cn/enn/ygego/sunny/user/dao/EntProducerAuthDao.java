package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntProducerAuth;

/**
 * dal Interface:EntProducerAuth
 * @author gencode
 */
public interface EntProducerAuthDao {

	Integer insert(EntProducerAuth record);

    Integer insertSelective(EntProducerAuth record);
    
    Integer delete(EntProducerAuth record);

    Integer deleteByPrimaryKey(@Param("authId") Long authId);
    
    Integer updateByPrimaryKey(EntProducerAuth record);

    List<EntProducerAuth> findAll();

    List<EntProducerAuth> find(EntProducerAuth record);

    Integer getCount(EntProducerAuth record);

    EntProducerAuth getByPrimaryKey(@Param("authId") Long authId);

	


}