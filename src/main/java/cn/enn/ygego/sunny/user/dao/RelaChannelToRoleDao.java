package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.RelaChannelToRole;

/**
 * dal Interface:RelaChannelToRole
 * @author gencode
 */
public interface RelaChannelToRoleDao {

	Integer insert(RelaChannelToRole record);

    Integer insertSelective(RelaChannelToRole record);
    
    Integer delete(RelaChannelToRole record);

    Integer deleteByPrimaryKey(@Param("relaId") Long relaId);
    
    Integer updateByPrimaryKey(RelaChannelToRole record);

    List<RelaChannelToRole> findAll();

    List<RelaChannelToRole> find(RelaChannelToRole record);

    Integer getCount(RelaChannelToRole record);

    RelaChannelToRole getByPrimaryKey(@Param("relaId") Long relaId);

	


}