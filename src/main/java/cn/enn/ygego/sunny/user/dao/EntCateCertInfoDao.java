package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntCateCertInfo;

/**
 * dal Interface:EntCateCertInfo
 * @author gencode
 */
public interface EntCateCertInfoDao {

	Integer insert(EntCateCertInfo record);

    Integer insertSelective(EntCateCertInfo record);
    
    Integer delete(EntCateCertInfo record);

    Integer deleteByPrimaryKey(@Param("certInfoId") Long certInfoId);
    
    Integer updateByPrimaryKey(EntCateCertInfo record);

    List<EntCateCertInfo> findAll();

    List<EntCateCertInfo> find(EntCateCertInfo record);

    Integer getCount(EntCateCertInfo record);

    EntCateCertInfo getByPrimaryKey(@Param("certInfoId") Long certInfoId);

	


}