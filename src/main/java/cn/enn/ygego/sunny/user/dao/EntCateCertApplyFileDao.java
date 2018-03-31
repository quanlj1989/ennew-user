package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntCateCertApplyFile;

/**
 * dal Interface:EntCateCertApplyFile
 * @author gencode
 */
public interface EntCateCertApplyFileDao {

	Integer insert(EntCateCertApplyFile record);

    Integer insertSelective(EntCateCertApplyFile record);
    
    Integer delete(EntCateCertApplyFile record);

    Integer deleteByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);
    
    Integer updateByPrimaryKey(EntCateCertApplyFile record);

    List<EntCateCertApplyFile> findAll();

    List<EntCateCertApplyFile> find(EntCateCertApplyFile record);

    Integer getCount(EntCateCertApplyFile record);

    EntCateCertApplyFile getByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);

	


}