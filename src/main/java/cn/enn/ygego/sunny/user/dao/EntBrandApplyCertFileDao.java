package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntBrandApplyCertFile;

/**
 * dal Interface:EntBrandApplyCertFile
 * @author gencode
 */
public interface EntBrandApplyCertFileDao {

	Integer insert(EntBrandApplyCertFile record);

    Integer insertSelective(EntBrandApplyCertFile record);
    
    Integer delete(EntBrandApplyCertFile record);

    Integer deleteByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);
    
    Integer updateByPrimaryKey(EntBrandApplyCertFile record);

    List<EntBrandApplyCertFile> findAll();

    List<EntBrandApplyCertFile> find(EntBrandApplyCertFile record);

    Integer getCount(EntBrandApplyCertFile record);

    EntBrandApplyCertFile getByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);

	


}