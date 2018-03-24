package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.IndividualChannelPermit;

/**
 * dal Interface:IndividualChannelPermit
 * @author gencode
 */
public interface IndividualChannelPermitDao {

	Integer insert(IndividualChannelPermit record);

    Integer insertSelective(IndividualChannelPermit record);
    
    Integer delete(IndividualChannelPermit record);

    Integer deleteByPrimaryKey(@Param("channelPermitId") Long channelPermitId);
    
    Integer updateByPrimaryKey(IndividualChannelPermit record);

    List<IndividualChannelPermit> findAll();

    List<IndividualChannelPermit> find(IndividualChannelPermit record);

    Integer getCount(IndividualChannelPermit record);

    IndividualChannelPermit getByPrimaryKey(@Param("channelPermitId") Long channelPermitId);

	


}