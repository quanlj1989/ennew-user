package cn.enn.ygego.sunny.user.dao;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.ReceiveAddressDTO;
import cn.enn.ygego.sunny.user.dto.vo.BaseQueryVO;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.ReceiveAddress;

/**
 * dal Interface:ReceiveAddress
 * @author gencode
 */
public interface ReceiveAddressDao {

	Integer insert(ReceiveAddress record);

    Integer insertSelective(ReceiveAddress record);
    
    Integer delete(ReceiveAddress record);

    Integer deleteByPrimaryKey(@Param("receiveAddressId") Long receiveAddressId);
    
    Integer updateByPrimaryKey(ReceiveAddress record);

    List<ReceiveAddress> findAll();

    List<ReceiveAddress> find(ReceiveAddress record);

    List<ReceiveAddressDTO> findPage(BaseQueryVO record);

    Integer getCount(ReceiveAddress record);

    ReceiveAddress getByPrimaryKey(@Param("receiveAddressId") Long receiveAddressId);

	


}