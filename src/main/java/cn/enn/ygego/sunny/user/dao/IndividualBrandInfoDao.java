package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualBrandInfo;

/**
 * dal Interface:IndividualBrandInfo
 * @author gencode
 */
public interface IndividualBrandInfoDao {

	Integer insert(IndividualBrandInfo record);

    Integer insertSelective(IndividualBrandInfo record);
    
    Integer delete(IndividualBrandInfo record);

    Integer deleteByPrimaryKey(@Param("individualBrandId") Long individualBrandId);
    
    Integer updateByPrimaryKey(IndividualBrandInfo record);

    List<IndividualBrandInfo> findAll();

    List<IndividualBrandInfo> find(IndividualBrandInfo record);

    Integer getCount(IndividualBrandInfo record);

    IndividualBrandInfo getByPrimaryKey(@Param("individualBrandId") Long individualBrandId);

	


}