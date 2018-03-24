package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualServiceApplyCertFile;

/**
 * dal Interface:IndividualServiceApplyCertFile
 * @author gencode
 */
public interface IndividualServiceApplyCertFileDao {

	Integer insert(IndividualServiceApplyCertFile record);

    Integer insertSelective(IndividualServiceApplyCertFile record);
    
    Integer delete(IndividualServiceApplyCertFile record);

    Integer deleteByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);
    
    Integer updateByPrimaryKey(IndividualServiceApplyCertFile record);

    List<IndividualServiceApplyCertFile> findAll();

    List<IndividualServiceApplyCertFile> find(IndividualServiceApplyCertFile record);

    Integer getCount(IndividualServiceApplyCertFile record);

    IndividualServiceApplyCertFile getByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);

	


}