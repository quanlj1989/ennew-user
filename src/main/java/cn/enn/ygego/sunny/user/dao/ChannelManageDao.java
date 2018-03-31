package cn.enn.ygego.sunny.user.dao;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.vo.ChannelRquestVO;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.ChannelManage;

/**
 * dal Interface:ChannelManage
 * @author gencode
 */
public interface ChannelManageDao {

	Integer insert(ChannelManage record);

    Integer insertSelective(ChannelManage record);
    
    Integer delete(ChannelManage record);

    Integer deleteByPrimaryKey(@Param("channelId") Long channelId);
    
    Integer updateByPrimaryKey(ChannelManage record);

    List<ChannelManage> findAll();

    List<ChannelManage> find(ChannelManage record);

    Integer getCount(ChannelManage record);

    ChannelManage getByPrimaryKey(@Param("channelId") Long channelId);

    public List<ChannelManage> findChannelManagesPage(ChannelRquestVO record);

	


}