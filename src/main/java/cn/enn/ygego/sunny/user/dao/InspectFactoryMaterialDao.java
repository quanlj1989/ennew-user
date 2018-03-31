package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.InspectFactoryMaterial;

/**
 * dal Interface:InspectFactoryMaterial
 * @author gencode
 */
public interface InspectFactoryMaterialDao {

	Integer insert(InspectFactoryMaterial record);

    Integer insertSelective(InspectFactoryMaterial record);
    
    Integer delete(InspectFactoryMaterial record);

    Integer deleteByPrimaryKey(@Param("inspectMaterialId") Long inspectMaterialId);
    
    Integer updateByPrimaryKey(InspectFactoryMaterial record);

    List<InspectFactoryMaterial> findAll();

    List<InspectFactoryMaterial> find(InspectFactoryMaterial record);

    Integer getCount(InspectFactoryMaterial record);

    InspectFactoryMaterial getByPrimaryKey(@Param("inspectMaterialId") Long inspectMaterialId);

	


}