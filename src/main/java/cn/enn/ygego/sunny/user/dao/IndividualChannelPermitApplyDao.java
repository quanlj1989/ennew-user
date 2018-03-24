package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualChannelPermitApply;

/**
 * dal Interface:IndividualChannelPermitApply
 * @author gencode
 */
public interface IndividualChannelPermitApplyDao {

	Integer insert(IndividualChannelPermitApply record);

    Integer insertSelective(IndividualChannelPermitApply record);
    
    Integer delete(IndividualChannelPermitApply record);

    Integer deleteByPrimaryKey(@Param("channelApplyId") Long channelApplyId);
    
    Integer updateByPrimaryKey(IndividualChannelPermitApply record);

    List<IndividualChannelPermitApply> findAll();

    List<IndividualChannelPermitApply> find(IndividualChannelPermitApply record);

    Integer getCount(IndividualChannelPermitApply record);

    IndividualChannelPermitApply getByPrimaryKey(@Param("channelApplyId") Long channelApplyId);

	


}