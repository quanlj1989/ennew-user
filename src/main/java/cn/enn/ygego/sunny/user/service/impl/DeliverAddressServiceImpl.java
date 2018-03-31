package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.DeliverAddressDTO;
import cn.enn.ygego.sunny.user.dto.vo.BaseQueryVO;
import cn.enn.ygego.sunny.user.service.DeliverAddressService;
import cn.enn.ygego.sunny.user.dao.DeliverAddressDao;
import cn.enn.ygego.sunny.user.model.DeliverAddress;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:DeliverAddress
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class DeliverAddressServiceImpl implements DeliverAddressService{

    @Autowired
    private DeliverAddressDao deliverAddressDao;

    public List<DeliverAddress> findAll(){
       return  deliverAddressDao.findAll();
    }

    public List<DeliverAddress> findDeliverAddresss(DeliverAddress record){
       return  deliverAddressDao.find(record);
    }

    public List<DeliverAddressDTO> findDeliverAddresssPage(BaseQueryVO record) {
        return deliverAddressDao.findPage(record);
    }

    public DeliverAddress getDeliverAddressByPrimaryKey(Long deliverAddressId){
        return deliverAddressDao.getByPrimaryKey(deliverAddressId);
    }

    public Integer createDeliverAddress(DeliverAddress record){
        return deliverAddressDao.insert(record);
    }

    public Integer removeDeliverAddress(DeliverAddress record){
        return deliverAddressDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long deliverAddressId){
    	return deliverAddressDao.deleteByPrimaryKey(deliverAddressId);
    }

    public Integer modifyDeliverAddressByPrimaryKey(DeliverAddress record){
        return deliverAddressDao.updateByPrimaryKey(record);
    }

    public Integer getCount(DeliverAddress record){
        return deliverAddressDao.getCount(record);
    }










}