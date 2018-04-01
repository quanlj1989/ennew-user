package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;

import cn.enn.ygego.sunny.user.service.IndividualCertFileService;
import cn.enn.ygego.sunny.user.service.IndividualCustService;
import cn.enn.ygego.sunny.user.dao.IndividualCustDao;
import cn.enn.ygego.sunny.user.dto.IndividualCustDTO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonVO;
import cn.enn.ygego.sunny.user.model.IndividualCertFile;
import cn.enn.ygego.sunny.user.model.IndividualCust;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualCust
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualCustServiceImpl implements IndividualCustService{

    @Autowired
    private IndividualCustDao individualCustDao;
    @Autowired
    private IndividualCertFileService individualCertFileService;

    public List<IndividualCust> findAll(){
       return  individualCustDao.findAll();
    }

    public List<IndividualCust> findIndividualCusts(IndividualCust record){
       return  individualCustDao.find(record);
    }

    public IndividualCust getIndividualCustByPrimaryKey(Long memberId){
        return individualCustDao.getByPrimaryKey(memberId);
    }

    public Integer createIndividualCust(IndividualCust record){
        return individualCustDao.insert(record);
    }

    public Integer removeIndividualCust(IndividualCust record){
        return individualCustDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long memberId){
    	return individualCustDao.deleteByPrimaryKey(memberId);
    }

    public Integer modifyIndividualCustByPrimaryKey(IndividualCust record){
        return individualCustDao.updateByPrimaryKey(record);
    }

    @Override
    public IndividualCustDTO getIndividualCustById(Long memberId , boolean hasFile){
        IndividualCustDTO resultDto = individualCustDao.getIndividualCustById(memberId);
        // 查询文件
        if(hasFile && resultDto != null && resultDto.getCertInfoId() != null){
            List<IndividualCertFile> files = individualCertFileService.getFilesByCertInfoId(resultDto.getCertInfoId());
            resultDto.setIndividualCertFileList(files);
        }
        return resultDto;
    }

    @Override
    public Integer getPersonCount(PersonQueryVO query) {
        return individualCustDao.getPersonCount(query);
    }
    
    @Override
    public List<PersonVO> getPersonList(PersonQueryVO query) {
        return individualCustDao.getPersonList(query);
    }
    

}