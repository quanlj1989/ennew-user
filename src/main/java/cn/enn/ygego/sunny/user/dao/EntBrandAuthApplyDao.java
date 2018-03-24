package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntBrandAuthApply;

/**
 * dal Interface:EntBrandAuthApply
 * @author gencode
 */
public interface EntBrandAuthApplyDao {

	Integer insert(EntBrandAuthApply record);

    Integer insertSelective(EntBrandAuthApply record);
    
    Integer delete(EntBrandAuthApply record);

    Integer deleteByPrimaryKey(@Param("brandApplyId") Long brandApplyId);
    
    Integer updateByPrimaryKey(EntBrandAuthApply record);

    List<EntBrandAuthApply> findAll();

    List<EntBrandAuthApply> find(EntBrandAuthApply record);

    Integer getCount(EntBrandAuthApply record);

    EntBrandAuthApply getByPrimaryKey(@Param("brandApplyId") Long brandApplyId);

	


}