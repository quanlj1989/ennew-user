package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntCateCertFile;

/**
 * dal Interface:EntCateCertFile
 * @author gencode
 */
public interface EntCateCertFileDao {

	Integer insert(EntCateCertFile record);

    Integer insertSelective(EntCateCertFile record);
    
    Integer delete(EntCateCertFile record);

    Integer deleteByPrimaryKey(@Param("certFileId") Long certFileId);
    
    Integer updateByPrimaryKey(EntCateCertFile record);

    List<EntCateCertFile> findAll();

    List<EntCateCertFile> find(EntCateCertFile record);

    Integer getCount(EntCateCertFile record);

    EntCateCertFile getByPrimaryKey(@Param("certFileId") Long certFileId);

	


}