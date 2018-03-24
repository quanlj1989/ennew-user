package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntCertApplyFile;

/**
 * dal Interface:EntCertApplyFile
 * @author gencode
 */
public interface EntCertApplyFileDao {

	Integer insert(EntCertApplyFile record);

    Integer insertSelective(EntCertApplyFile record);
    
    Integer delete(EntCertApplyFile record);

    Integer deleteByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);
    
    Integer updateByPrimaryKey(EntCertApplyFile record);

    List<EntCertApplyFile> findAll();

    List<EntCertApplyFile> find(EntCertApplyFile record);

    Integer getCount(EntCertApplyFile record);

    EntCertApplyFile getByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);

	


}