package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.EntCertApplyDetailService;
import cn.enn.ygego.sunny.user.dao.EntCertApplyDetailDao;
import cn.enn.ygego.sunny.user.model.EntCertApplyDetail;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntCertApplyDetail
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntCertApplyDetailServiceImpl implements EntCertApplyDetailService{

    @Autowired
    private EntCertApplyDetailDao entCertApplyDetailDao;

    public List<EntCertApplyDetail> findAll(){
       return  entCertApplyDetailDao.findAll();
    }

    public List<EntCertApplyDetail> findEntCertApplyDetails(EntCertApplyDetail record){
       return  entCertApplyDetailDao.find(record);
    }

    public EntCertApplyDetail getEntCertApplyDetailByPrimaryKey(Long certApplyDetailId){
        return entCertApplyDetailDao.getByPrimaryKey(certApplyDetailId);
    }

    public Integer createEntCertApplyDetail(EntCertApplyDetail record){
        return entCertApplyDetailDao.insert(record);
    }

    public Integer removeEntCertApplyDetail(EntCertApplyDetail record){
        return entCertApplyDetailDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyDetailId){
    	return entCertApplyDetailDao.deleteByPrimaryKey(certApplyDetailId);
    }

    public Integer modifyEntCertApplyDetailByPrimaryKey(EntCertApplyDetail record){
        return entCertApplyDetailDao.updateByPrimaryKey(record);
    }









}