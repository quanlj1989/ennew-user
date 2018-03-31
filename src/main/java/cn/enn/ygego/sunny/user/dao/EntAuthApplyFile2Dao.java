package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntAuthApplyFile2;

/**
 * dal Interface:EntAuthApplyFile2
 * @author gencode
 */
public interface EntAuthApplyFile2Dao {

	Integer insert(EntAuthApplyFile2 record);

    Integer insertSelective(EntAuthApplyFile2 record);
    
    Integer delete(EntAuthApplyFile2 record);

    Integer deleteByPrimaryKey(@Param("applyFileId") Long applyFileId);
    
    Integer updateByPrimaryKey(EntAuthApplyFile2 record);

    List<EntAuthApplyFile2> findAll();

    List<EntAuthApplyFile2> find(EntAuthApplyFile2 record);

    Integer getCount(EntAuthApplyFile2 record);

    EntAuthApplyFile2 getByPrimaryKey(@Param("applyFileId") Long applyFileId);

	


}