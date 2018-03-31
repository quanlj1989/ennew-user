package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.ProdInfo;

/**
 * dal Interface:ProdInfo
 * @author gencode
 */
public interface ProdInfoDao {

	Integer insert(ProdInfo record);

    Integer insertSelective(ProdInfo record);
    
    Integer delete(ProdInfo record);

    Integer deleteByPrimaryKey(@Param("prodId") Long prodId);
    
    Integer updateByPrimaryKey(ProdInfo record);

    List<ProdInfo> findAll();

    List<ProdInfo> find(ProdInfo record);

    Integer getCount(ProdInfo record);

    ProdInfo getByPrimaryKey(@Param("prodId") Long prodId);

	


}