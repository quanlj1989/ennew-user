package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntCertInfo;

/**
 * dal Interface:EntCertInfo
 * @author gencode
 */
public interface EntCertInfoDao {

	Integer insert(EntCertInfo record);

    Integer insertSelective(EntCertInfo record);
    
    Integer delete(EntCertInfo record);

    Integer deleteByPrimaryKey(@Param("certInfoId") Long certInfoId);
    
    Integer updateByPrimaryKey(EntCertInfo record);

    List<EntCertInfo> findAll();

    List<EntCertInfo> find(EntCertInfo record);

    Integer getCount(EntCertInfo record);

    EntCertInfo getByPrimaryKey(@Param("certInfoId") Long certInfoId);

	


}