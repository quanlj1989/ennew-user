package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntChannelPermit;

/**
 * dal Interface:EntChannelPermit
 * @author gencode
 */
public interface EntChannelPermitDao {

	Integer insert(EntChannelPermit record);

    Integer insertSelective(EntChannelPermit record);
    
    Integer delete(EntChannelPermit record);

    Integer deleteByPrimaryKey(@Param("channelPermitId") Long channelPermitId);
    
    Integer updateByPrimaryKey(EntChannelPermit record);

    List<EntChannelPermit> findAll();

    List<EntChannelPermit> find(EntChannelPermit record);

    Integer getCount(EntChannelPermit record);

    EntChannelPermit getByPrimaryKey(@Param("channelPermitId") Long channelPermitId);

	


}