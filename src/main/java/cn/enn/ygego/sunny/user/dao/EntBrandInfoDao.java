package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntBrandInfo;

/**
 * dal Interface:EntBrandInfo
 * @author gencode
 */
public interface EntBrandInfoDao {

	Integer insert(EntBrandInfo record);

    Integer insertSelective(EntBrandInfo record);
    
    Integer delete(EntBrandInfo record);

    Integer deleteByPrimaryKey(@Param("entBrandId") Long entBrandId);
    
    Integer updateByPrimaryKey(EntBrandInfo record);

    List<EntBrandInfo> findAll();

    List<EntBrandInfo> find(EntBrandInfo record);

    Integer getCount(EntBrandInfo record);

    EntBrandInfo getByPrimaryKey(@Param("entBrandId") Long entBrandId);

	


}