package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntMaterial;

/**
 * dal Interface:EntMaterial
 * @author gencode
 */
public interface EntMaterialDao {

	Integer insert(EntMaterial record);

    Integer insertSelective(EntMaterial record);
    
    Integer delete(EntMaterial record);

    Integer deleteByPrimaryKey(@Param("entMaterialId") Long entMaterialId);
    
    Integer updateByPrimaryKey(EntMaterial record);

    List<EntMaterial> findAll();

    List<EntMaterial> find(EntMaterial record);

    Integer getCount(EntMaterial record);

    EntMaterial getByPrimaryKey(@Param("entMaterialId") Long entMaterialId);

	


}