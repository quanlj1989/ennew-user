package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.ReceiveAddressDTO;
import cn.enn.ygego.sunny.user.dto.vo.BaseQueryVO;
import cn.enn.ygego.sunny.user.service.ReceiveAddressService;
import cn.enn.ygego.sunny.user.dao.ReceiveAddressDao;
import cn.enn.ygego.sunny.user.model.ReceiveAddress;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:ReceiveAddress
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class ReceiveAddressServiceImpl implements ReceiveAddressService{

    @Autowired
    private ReceiveAddressDao receiveAddressDao;

    public List<ReceiveAddress> findAll(){
       return  receiveAddressDao.findAll();
    }

    public List<ReceiveAddress> findReceiveAddresss(ReceiveAddress record){
       return  receiveAddressDao.find(record);
    }

    public List<ReceiveAddressDTO> findReceiveAddresssPage(BaseQueryVO record) {
        return receiveAddressDao.findPage(record);
    }

    public ReceiveAddress getReceiveAddressByPrimaryKey(Long receiveAddressId){
        return receiveAddressDao.getByPrimaryKey(receiveAddressId);
    }

    public Integer createReceiveAddress(ReceiveAddress record){
        return receiveAddressDao.insert(record);
    }

    public Integer removeReceiveAddress(ReceiveAddress record){
        return receiveAddressDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long receiveAddressId){
    	return receiveAddressDao.deleteByPrimaryKey(receiveAddressId);
    }

    public Integer modifyReceiveAddressByPrimaryKey(ReceiveAddress record){
        return receiveAddressDao.updateByPrimaryKey(record);
    }









}