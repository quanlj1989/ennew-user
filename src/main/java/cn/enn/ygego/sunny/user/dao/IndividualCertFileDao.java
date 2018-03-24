package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualCertFile;

/**
 * dal Interface:IndividualCertFile
 * @author gencode
 */
public interface IndividualCertFileDao {

	Integer insert(IndividualCertFile record);

    Integer insertSelective(IndividualCertFile record);
    
    Integer insertList(List<IndividualCertFile> record);
    
    Integer delete(IndividualCertFile record);

    Integer deleteByPrimaryKey(@Param("certFileId") Long certFileId);
    
    Integer updateByPrimaryKey(IndividualCertFile record);

    List<IndividualCertFile> findAll();

    List<IndividualCertFile> find(IndividualCertFile record);

    Integer getCount(IndividualCertFile record);

    IndividualCertFile getByPrimaryKey(@Param("certFileId") Long certFileId);

    List<IndividualCertFile> getByCertInfoId(@Param("certInfoId") Long certInfoId);


}