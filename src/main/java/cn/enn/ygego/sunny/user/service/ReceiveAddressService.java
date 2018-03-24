package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.ReceiveAddressDTO;
import cn.enn.ygego.sunny.user.dto.vo.BaseQueryVO;
import cn.enn.ygego.sunny.user.model.ReceiveAddress;

/**
 * dal Interface:ReceiveAddress
 * @author gencode
 * @date 2018-3-22
 */
public interface ReceiveAddressService {

    public List<ReceiveAddress> findAll();

    public List<ReceiveAddress> findReceiveAddresss(ReceiveAddress record);

    public List<ReceiveAddressDTO> findReceiveAddresssPage(BaseQueryVO record);

    public ReceiveAddress getReceiveAddressByPrimaryKey(Long receiveAddressId);

    public Integer createReceiveAddress(ReceiveAddress record);

    public Integer removeReceiveAddress(ReceiveAddress record);

    public Integer removeByPrimaryKey(Long receiveAddressId);

    public Integer modifyReceiveAddressByPrimaryKey(ReceiveAddress record);



}