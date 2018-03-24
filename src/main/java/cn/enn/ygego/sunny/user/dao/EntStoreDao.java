package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntStore;

/**
 * dal Interface:EntStore
 * @author gencode
 */
public interface EntStoreDao {

	Integer insert(EntStore record);

    Integer insertSelective(EntStore record);
    
    Integer delete(EntStore record);

    Integer deleteByPrimaryKey(@Param("storeId") Long storeId);
    
    Integer updateByPrimaryKey(EntStore record);

    List<EntStore> findAll();

    List<EntStore> find(EntStore record);

    Integer getCount(EntStore record);

    EntStore getByPrimaryKey(@Param("storeId") Long storeId);

	


}