package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntApplyProdInfo;

/**
 * dal Interface:EntApplyProdInfo
 * @author gencode
 */
public interface EntApplyProdInfoDao {

	Integer insert(EntApplyProdInfo record);

    Integer insertSelective(EntApplyProdInfo record);
    
    Integer delete(EntApplyProdInfo record);

    Integer deleteByPrimaryKey(@Param("applyProdId") Long applyProdId);
    
    Integer updateByPrimaryKey(EntApplyProdInfo record);

    List<EntApplyProdInfo> findAll();

    List<EntApplyProdInfo> find(EntApplyProdInfo record);

    Integer getCount(EntApplyProdInfo record);

    EntApplyProdInfo getByPrimaryKey(@Param("applyProdId") Long applyProdId);

	


}