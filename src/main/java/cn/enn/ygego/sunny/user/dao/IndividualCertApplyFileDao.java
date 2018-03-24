package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualCertApplyFile;

/**
 * dal Interface:IndividualCertApplyFile
 * @author gencode
 */
public interface IndividualCertApplyFileDao {

	Integer insert(IndividualCertApplyFile record);

    Integer insertSelective(IndividualCertApplyFile record);
    
    /* 批量插入数据 */
    Integer insertList(List<IndividualCertApplyFile> record);
    
    Integer delete(IndividualCertApplyFile record);

    Integer deleteByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);
    
    Integer updateByPrimaryKey(IndividualCertApplyFile record);

    List<IndividualCertApplyFile> findAll();

    List<IndividualCertApplyFile> find(IndividualCertApplyFile record);

    Integer getCount(IndividualCertApplyFile record);

    IndividualCertApplyFile getByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);

    /**
     * 
     * @Description TODO
     * @author puanl
     * @date 2018年3月22日 下午3:41:11 
     * @param record
     * @return
     */
    List<IndividualCertApplyFile> getByCertApplyDetailId(@Param("certApplyDetailId") Long certApplyDetailId);


}