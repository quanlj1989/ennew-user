package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualCertApplyDetailService;
import cn.enn.ygego.sunny.user.dao.IndividualCertApplyDetailDao;
import cn.enn.ygego.sunny.user.model.IndividualCertApplyDetail;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualCertApplyDetail
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualCertApplyDetailServiceImpl implements IndividualCertApplyDetailService{

    @Autowired
    private IndividualCertApplyDetailDao individualCertApplyDetailDao;

    public List<IndividualCertApplyDetail> findAll(){
       return  individualCertApplyDetailDao.findAll();
    }

    public List<IndividualCertApplyDetail> findIndividualCertApplyDetails(IndividualCertApplyDetail record){
       return  individualCertApplyDetailDao.find(record);
    }

    public IndividualCertApplyDetail getIndividualCertApplyDetailByPrimaryKey(Long certApplyDetailId){
        return individualCertApplyDetailDao.getByPrimaryKey(certApplyDetailId);
    }

    public Integer createIndividualCertApplyDetail(IndividualCertApplyDetail record){
        return individualCertApplyDetailDao.insert(record);
    }

    public Integer removeIndividualCertApplyDetail(IndividualCertApplyDetail record){
        return individualCertApplyDetailDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyDetailId){
    	return individualCertApplyDetailDao.deleteByPrimaryKey(certApplyDetailId);
    }

    public Integer modifyIndividualCertApplyDetailByPrimaryKey(IndividualCertApplyDetail record){
        return individualCertApplyDetailDao.updateByPrimaryKey(record);
    }









}