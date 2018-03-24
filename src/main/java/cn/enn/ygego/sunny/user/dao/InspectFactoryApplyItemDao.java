package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyItem;

/**
 * dal Interface:InspectFactoryApplyItem
 * @author gencode
 */
public interface InspectFactoryApplyItemDao {

	Integer insert(InspectFactoryApplyItem record);

    Integer insertSelective(InspectFactoryApplyItem record);
    
    Integer delete(InspectFactoryApplyItem record);

    Integer deleteByPrimaryKey(@Param("applyItemId") Long applyItemId);
    
    Integer updateByPrimaryKey(InspectFactoryApplyItem record);

    List<InspectFactoryApplyItem> findAll();

    List<InspectFactoryApplyItem> find(InspectFactoryApplyItem record);

    Integer getCount(InspectFactoryApplyItem record);

    InspectFactoryApplyItem getByPrimaryKey(@Param("applyItemId") Long applyItemId);

	


}