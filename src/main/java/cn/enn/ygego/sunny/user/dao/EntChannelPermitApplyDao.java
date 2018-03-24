package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.EntChannelPermitApply;

/**
 * dal Interface:EntChannelPermitApply
 * @author gencode
 */
public interface EntChannelPermitApplyDao {

	Integer insert(EntChannelPermitApply record);

    Integer insertSelective(EntChannelPermitApply record);
    
    Integer delete(EntChannelPermitApply record);

    Integer deleteByPrimaryKey(@Param("channelApplyId") Long channelApplyId);
    
    Integer updateByPrimaryKey(EntChannelPermitApply record);

    List<EntChannelPermitApply> findAll();

    List<EntChannelPermitApply> find(EntChannelPermitApply record);

    Integer getCount(EntChannelPermitApply record);

    EntChannelPermitApply getByPrimaryKey(@Param("channelApplyId") Long channelApplyId);

	


}