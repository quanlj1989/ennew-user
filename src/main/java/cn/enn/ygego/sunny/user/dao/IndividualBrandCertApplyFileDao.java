package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualBrandCertApplyFile;

/**
 * dal Interface:IndividualBrandCertApplyFile
 * @author gencode
 */
public interface IndividualBrandCertApplyFileDao {

	Integer insert(IndividualBrandCertApplyFile record);

    Integer insertSelective(IndividualBrandCertApplyFile record);
    
    Integer delete(IndividualBrandCertApplyFile record);

    Integer deleteByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);
    
    Integer updateByPrimaryKey(IndividualBrandCertApplyFile record);

    List<IndividualBrandCertApplyFile> findAll();

    List<IndividualBrandCertApplyFile> find(IndividualBrandCertApplyFile record);

    Integer getCount(IndividualBrandCertApplyFile record);

    IndividualBrandCertApplyFile getByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);

	


}