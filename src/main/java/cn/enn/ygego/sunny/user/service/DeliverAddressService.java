package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.DeliverAddressDTO;
import cn.enn.ygego.sunny.user.dto.vo.BaseQueryVO;
import cn.enn.ygego.sunny.user.model.DeliverAddress;

/**
 * dal Interface:DeliverAddress
 * @author gencode
 * @date 2018-3-22
 */
public interface DeliverAddressService {

    public List<DeliverAddress> findAll();

    public List<DeliverAddress> findDeliverAddresss(DeliverAddress record);

    public List<DeliverAddressDTO> findDeliverAddresssPage(BaseQueryVO record);

    public DeliverAddress getDeliverAddressByPrimaryKey(Long deliverAddressId);

    public Integer createDeliverAddress(DeliverAddress record);

    public Integer removeDeliverAddress(DeliverAddress record);

    public Integer removeByPrimaryKey(Long deliverAddressId);

    public Integer modifyDeliverAddressByPrimaryKey(DeliverAddress record);

    public Integer getCount(DeliverAddress record);

}