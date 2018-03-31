package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.ProdInfoService;
import cn.enn.ygego.sunny.user.dao.ProdInfoDao;
import cn.enn.ygego.sunny.user.model.ProdInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:ProdInfo
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class ProdInfoServiceImpl implements ProdInfoService{

    @Autowired
    private ProdInfoDao prodInfoDao;

    public List<ProdInfo> findAll(){
       return  prodInfoDao.findAll();
    }

    public List<ProdInfo> findProdInfos(ProdInfo record){
       return  prodInfoDao.find(record);
    }

    public ProdInfo getProdInfoByPrimaryKey(Long prodId){
        return prodInfoDao.getByPrimaryKey(prodId);
    }

    public Integer createProdInfo(ProdInfo record){
        return prodInfoDao.insert(record);
    }

    public Integer removeProdInfo(ProdInfo record){
        return prodInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long prodId){
    	return prodInfoDao.deleteByPrimaryKey(prodId);
    }

    public Integer modifyProdInfoByPrimaryKey(ProdInfo record){
        return prodInfoDao.updateByPrimaryKey(record);
    }









}