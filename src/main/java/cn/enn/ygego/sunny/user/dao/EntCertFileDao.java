package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntCertFile;

/**
 * dal Interface:EntCertFile
 * @author gencode
 */
public interface EntCertFileDao {

	Integer insert(EntCertFile record);

    Integer insertSelective(EntCertFile record);
    
    Integer delete(EntCertFile record);

    Integer deleteByPrimaryKey(@Param("certFileId") Long certFileId);
    
    Integer updateByPrimaryKey(EntCertFile record);

    List<EntCertFile> findAll();

    List<EntCertFile> find(EntCertFile record);

    Integer getCount(EntCertFile record);

    EntCertFile getByPrimaryKey(@Param("certFileId") Long certFileId);

	


}