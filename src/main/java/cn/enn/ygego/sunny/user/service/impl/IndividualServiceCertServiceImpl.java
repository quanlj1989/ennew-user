package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualServiceCertService;
import cn.enn.ygego.sunny.user.dao.IndividualServiceCertDao;
import cn.enn.ygego.sunny.user.model.IndividualServiceCert;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualServiceCert
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualServiceCertServiceImpl implements IndividualServiceCertService{

    @Autowired
    private IndividualServiceCertDao individualServiceCertDao;

    public List<IndividualServiceCert> findAll(){
       return  individualServiceCertDao.findAll();
    }

    public List<IndividualServiceCert> findIndividualServiceCerts(IndividualServiceCert record){
       return  individualServiceCertDao.find(record);
    }

    public IndividualServiceCert getIndividualServiceCertByPrimaryKey(Long serviceCertId){
        return individualServiceCertDao.getByPrimaryKey(serviceCertId);
    }

    public Integer createIndividualServiceCert(IndividualServiceCert record){
        return individualServiceCertDao.insert(record);
    }

    public Integer removeIndividualServiceCert(IndividualServiceCert record){
        return individualServiceCertDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long serviceCertId){
    	return individualServiceCertDao.deleteByPrimaryKey(serviceCertId);
    }

    public Integer modifyIndividualServiceCertByPrimaryKey(IndividualServiceCert record){
        return individualServiceCertDao.updateByPrimaryKey(record);
    }









}