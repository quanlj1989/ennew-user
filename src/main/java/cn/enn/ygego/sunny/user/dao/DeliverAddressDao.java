package cn.enn.ygego.sunny.user.dao;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.DeliverAddressDTO;
import cn.enn.ygego.sunny.user.dto.vo.BaseQueryVO;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.DeliverAddress;

/**
 * dal Interface:DeliverAddress
 * @author gencode
 */
public interface DeliverAddressDao {

	Integer insert(DeliverAddress record);

    Integer insertSelective(DeliverAddress record);
    
    Integer delete(DeliverAddress record);

    Integer deleteByPrimaryKey(@Param("deliverAddressId") Long deliverAddressId);
    
    Integer updateByPrimaryKey(DeliverAddress record);

    List<DeliverAddress> findAll();

    List<DeliverAddress> find(DeliverAddress record);

    List<DeliverAddressDTO> findPage(BaseQueryVO record);

    Integer getCount(DeliverAddress record);

    DeliverAddress getByPrimaryKey(@Param("deliverAddressId") Long deliverAddressId);

	


}