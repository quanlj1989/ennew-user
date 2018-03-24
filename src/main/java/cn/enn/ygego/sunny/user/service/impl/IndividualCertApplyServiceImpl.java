package cn.enn.ygego.sunny.user.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import cn.enn.ygego.sunny.user.service.IndividualCertApplyService;
import cn.enn.ygego.sunny.user.dao.IndividualCertApplyDao;
import cn.enn.ygego.sunny.user.dao.IndividualCertApplyDetailDao;
import cn.enn.ygego.sunny.user.dao.IndividualCertApplyFileDao;
import cn.enn.ygego.sunny.user.dao.IndividualCertFileDao;
import cn.enn.ygego.sunny.user.dao.IndividualCertInfoDao;
import cn.enn.ygego.sunny.user.dao.IndividualCustDao;
import cn.enn.ygego.sunny.user.dto.IndividualCertApplyDTO;
import cn.enn.ygego.sunny.user.dto.vo.IndividualCertApplyVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.model.IndividualCertApply;
import cn.enn.ygego.sunny.user.model.IndividualCertApplyDetail;
import cn.enn.ygego.sunny.user.model.IndividualCertApplyFile;
import cn.enn.ygego.sunny.user.model.IndividualCertFile;
import cn.enn.ygego.sunny.user.model.IndividualCertInfo;
import cn.enn.ygego.sunny.user.model.IndividualCust;

import org.springframework.stereotype.Service;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:IndividualCertApply
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class IndividualCertApplyServiceImpl implements IndividualCertApplyService{

    private Logger logger = LoggerFactory.getLogger(IndividualCertApplyServiceImpl.class);
    
    @Autowired
    private IndividualCertApplyDao individualCertApplyDao;  /* 资质申请信息DAO */
    @Autowired
    private IndividualCertApplyDetailDao individualCertApplyDetailDao; /* 资质申请信息DAO */
    @Autowired
    private IndividualCertApplyFileDao individualCertApplyFileDao; /* 资质申请信息文件DAO */
    @Autowired
    private IndividualCustDao individualCustDao;  /* 资质信息表DAO */
    @Autowired
    private IndividualCertInfoDao individualCertInfoDao;  /* 资质信息详情表DAO */
    @Autowired
    private IndividualCertFileDao individualCertFileDao;  /* 资质信息文件DAO */

    @Override
    public List<IndividualCertApply> findAll(){
       return  individualCertApplyDao.findAll();
    }

    @Override
    public List<IndividualCertApply> findIndividualCertApplys(IndividualCertApply record){
       return  individualCertApplyDao.find(record);
    }

    @Override
    public IndividualCertApply getIndividualCertApplyByPrimaryKey(Long certApplyId){
        return individualCertApplyDao.getByPrimaryKey(certApplyId);
    }
    
    @Override
    public IndividualCertApply getIndividualCertApplyByMemberId(Long memberId){
        return individualCertApplyDao.getByMemberId(memberId);
    }

    @Override
    public Integer createIndividualCertApply(IndividualCertApply record){
        return individualCertApplyDao.insert(record);
    }

    @Override
    public Integer removeIndividualCertApply(IndividualCertApply record){
        return individualCertApplyDao.delete(record);
    }
    
    @Override
    public Integer removeByPrimaryKey(Long certApplyId){
    	return individualCertApplyDao.deleteByPrimaryKey(certApplyId);
    }

    @Override
    public Integer modifyIndividualCertApplyByPrimaryKey(IndividualCertApply record){
        return individualCertApplyDao.updateByPrimaryKey(record);
    }

    @Override
    public Integer getAcctCertApplyCount(PersonQueryVO query){
        return individualCertApplyDao.getAcctCertApplyCount(query);
    }


    @Override
    public List<IndividualCertApplyVO> getAcctCertApplyList(PersonQueryVO query){
        return individualCertApplyDao.getAcctCertApplyList(query);
    }

    @Override
    public IndividualCertApplyDTO getCertApplyByApplyId(Long certApplyId , boolean hasFile){
        IndividualCertApplyDTO resultDto = individualCertApplyDao.getCertApplyByApplyId(certApplyId);
        if(hasFile && resultDto != null && resultDto.getCertApplyDetailId() != null){
          //查询附件信息
          List<IndividualCertApplyFile> applyFileList =  individualCertApplyFileDao.getByCertApplyDetailId(resultDto.getCertApplyDetailId());
          resultDto.setIndividualCertApplyFileList(applyFileList);
        }
        return resultDto;
    }

    @Override
    public IndividualCertApplyVO getCertApplyByMemberId(IndividualCertApplyVO query, boolean hasFile){
        IndividualCertApplyVO resultDto = individualCertApplyDao.getCertApplyByMemberId(query);
        if(hasFile && resultDto != null && resultDto.getCertApplyDetailId() != null){
          //查询附件信息
          List<IndividualCertApplyFile> applyFileList =  individualCertApplyFileDao.getByCertApplyDetailId(resultDto.getCertApplyDetailId());
          resultDto.setIndividualCertApplyFileList(applyFileList);
        }
        return resultDto;
    }
    
    @Override
    public IndividualCertApplyDTO addIndividualCertApply(IndividualCertApplyDTO applyData) throws IllegalAccessException, InvocationTargetException {
        
        logger.info("IndividualCertApplyServiceImpl.addIndividualCertApply applyData= {}",applyData);
        
        // 保存资质申请信息
        IndividualCertApply apply = new IndividualCertApply();
        BeanUtils.copyProperties(apply, applyData);
        Integer applyF = individualCertApplyDao.insertSelective(apply);
        if(applyF <= 0){
            return null;
        }
        
        applyData.setCertApplyId(apply.getCertApplyId()); // 配置资质申请主键
        
        // 保存资质申请详情信息
        IndividualCertApplyDetail applyDetail = new IndividualCertApplyDetail();
        BeanUtils.copyProperties(applyDetail, apply);
        applyDetail.setCertNo(apply.getCertCode());  // 身份证号转换
        Integer detailF = individualCertApplyDetailDao.insertSelective(applyDetail);
        if(detailF <= 0){
            return null;
        }
        
        applyData.setCertApplyDetailId(applyDetail.getCertApplyDetailId()); // 配置资质申请详情主键
        
        // 保存资质申请文件列表
        List<IndividualCertApplyFile> fileList = new ArrayList<>();
        for(IndividualCertApplyFile file : applyData.getIndividualCertApplyFileList()){
            // 关联资质申请详情
            file.setCertApplyDetailId(applyDetail.getCertApplyDetailId());
            fileList.add(file);
        }
        
        individualCertApplyFileDao.insertList(fileList); // 批量保存文件数据
        
        return applyData;
    }
    
    @Override
    public IndividualCertApplyDTO updateIndividualCertApply(IndividualCertApplyDTO applyData) throws IllegalAccessException, InvocationTargetException{
        
        // 修改资质申请信息
        IndividualCertApply apply = new IndividualCertApply();
        BeanUtils.copyProperties(apply, applyData);
        individualCertApplyDao.updateByPrimaryKey(apply);
        // 修改资质申请详情信息
        IndividualCertApplyDetail applyDetail = individualCertApplyDetailDao.getByCertApplyId(applyData.getCertApplyId());
        applyDetail.setCertNo(applyData.getCertCode());    // 身份证号
        applyDetail.setCertType(applyData.getCertType());  // 证件类型
        applyDetail.setCertName(applyData.getName());      // 证件名称
        individualCertApplyDetailDao.updateByPrimaryKey(applyDetail);
        
        // 更新文件信息 （全删全增）
        // 删除所有文件
        IndividualCertApplyFile delFile = new IndividualCertApplyFile();
        delFile.setCertApplyDetailId(applyDetail.getCertApplyDetailId());  // 资质申请详情id
        individualCertApplyFileDao.delete(delFile);
        
        // 保存资质申请文件列表
        List<IndividualCertApplyFile> fileList = new ArrayList<>();
        for(IndividualCertApplyFile file : applyData.getIndividualCertApplyFileList()){
            // 关联资质申请详情
            file.setCertApplyDetailId(applyDetail.getCertApplyDetailId());
            fileList.add(file);
        }
        
        individualCertApplyFileDao.insertList(fileList); // 批量保存文件数据
        
        return applyData;
    }
    
    @Override
    public IndividualCust copyApplyToIndividualCust(IndividualCertApply record) throws IllegalAccessException, InvocationTargetException{
        
        // 保存客户信息表
        IndividualCust cust = new IndividualCust();
        BeanUtils.copyProperties(cust, record);
        individualCustDao.insert(cust);
        
        // 查询申请详细信息
        IndividualCertApplyDetail applyDetail = individualCertApplyDetailDao.getByCertApplyId(record.getCertApplyId());
        
        // 保存资质详情信息
        IndividualCertInfo custDetail = new IndividualCertInfo();
        BeanUtils.copyProperties(custDetail, applyDetail);
        individualCertInfoDao.insertSelective(custDetail);
        
        // 查询申请文件列表
        List<IndividualCertApplyFile> applyFileList =  individualCertApplyFileDao.getByCertApplyDetailId(applyDetail.getCertApplyDetailId());
        
        List<IndividualCertFile> custFileList = new ArrayList<>();
        for(IndividualCertApplyFile applyFile : applyFileList){
            IndividualCertFile custFile = new IndividualCertFile();
            BeanUtils.copyProperties(custFile, applyFile);
            custFile.setCertInfoId(custDetail.getCertInfoId());  /* 关联 INFO 主键 */ 
            custFileList.add(custFile);
        }
        individualCertFileDao.insertList(custFileList);
        
        return cust;
    }
    
}