package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualServiceCertFile;

/**
 * dal Interface:IndividualServiceCertFile
 * @author gencode
 */
public interface IndividualServiceCertFileDao {

	Integer insert(IndividualServiceCertFile record);

    Integer insertSelective(IndividualServiceCertFile record);
    
    Integer delete(IndividualServiceCertFile record);

    Integer deleteByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);
    
    Integer updateByPrimaryKey(IndividualServiceCertFile record);

    List<IndividualServiceCertFile> findAll();

    List<IndividualServiceCertFile> find(IndividualServiceCertFile record);

    Integer getCount(IndividualServiceCertFile record);

    IndividualServiceCertFile getByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);

	


}