package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.InspectFactoryApplyAttach;

/**
 * dal Interface:InspectFactoryApplyAttach
 * @author gencode
 */
public interface InspectFactoryApplyAttachDao {

	Integer insert(InspectFactoryApplyAttach record);

    Integer insertSelective(InspectFactoryApplyAttach record);
    
    Integer delete(InspectFactoryApplyAttach record);

    Integer deleteByPrimaryKey(@Param("attaId") Long attaId);
    
    Integer updateByPrimaryKey(InspectFactoryApplyAttach record);

    List<InspectFactoryApplyAttach> findAll();

    List<InspectFactoryApplyAttach> find(InspectFactoryApplyAttach record);

    Integer getCount(InspectFactoryApplyAttach record);

    InspectFactoryApplyAttach getByPrimaryKey(@Param("attaId") Long attaId);

	


}