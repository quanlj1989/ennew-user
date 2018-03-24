package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntBrandCertFile;

/**
 * dal Interface:EntBrandCertFile
 * @author gencode
 */
public interface EntBrandCertFileDao {

	Integer insert(EntBrandCertFile record);

    Integer insertSelective(EntBrandCertFile record);
    
    Integer delete(EntBrandCertFile record);

    Integer deleteByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);
    
    Integer updateByPrimaryKey(EntBrandCertFile record);

    List<EntBrandCertFile> findAll();

    List<EntBrandCertFile> find(EntBrandCertFile record);

    Integer getCount(EntBrandCertFile record);

    EntBrandCertFile getByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);

	


}