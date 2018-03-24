package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualBrandCertFile;

/**
 * dal Interface:IndividualBrandCertFile
 * @author gencode
 */
public interface IndividualBrandCertFileDao {

	Integer insert(IndividualBrandCertFile record);

    Integer insertSelective(IndividualBrandCertFile record);
    
    Integer delete(IndividualBrandCertFile record);

    Integer deleteByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);
    
    Integer updateByPrimaryKey(IndividualBrandCertFile record);

    List<IndividualBrandCertFile> findAll();

    List<IndividualBrandCertFile> find(IndividualBrandCertFile record);

    Integer getCount(IndividualBrandCertFile record);

    IndividualBrandCertFile getByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);

	


}