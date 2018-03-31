package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntProdApply;

/**
 * dal Interface:EntProdApply
 * @author gencode
 */
public interface EntProdApplyDao {

	Integer insert(EntProdApply record);

    Integer insertSelective(EntProdApply record);
    
    Integer delete(EntProdApply record);

    Integer deleteByPrimaryKey(@Param("applyId") Long applyId);
    
    Integer updateByPrimaryKey(EntProdApply record);

    List<EntProdApply> findAll();

    List<EntProdApply> find(EntProdApply record);

    Integer getCount(EntProdApply record);

    EntProdApply getByPrimaryKey(@Param("applyId") Long applyId);

	


}