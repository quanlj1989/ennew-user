package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntAuthApplyFile;

/**
 * dal Interface:EntAuthApplyFile
 * @author gencode
 */
public interface EntAuthApplyFileDao {

	Integer insert(EntAuthApplyFile record);

    Integer insertSelective(EntAuthApplyFile record);
    
    Integer delete(EntAuthApplyFile record);

    Integer deleteByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);
    
    Integer updateByPrimaryKey(EntAuthApplyFile record);

    List<EntAuthApplyFile> findAll();

    List<EntAuthApplyFile> find(EntAuthApplyFile record);

    Integer getCount(EntAuthApplyFile record);

    EntAuthApplyFile getByPrimaryKey(@Param("certApplyFileId") Long certApplyFileId);

	


}