package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;

import cn.enn.ygego.sunny.user.dao.EntCateCertApplyFileDao;
import cn.enn.ygego.sunny.user.dto.vo.EntCateAndBrandVO;
import cn.enn.ygego.sunny.user.dto.vo.EntCateCertApplyVO;
import cn.enn.ygego.sunny.user.model.EntCateCertApplyFile;
import cn.enn.ygego.sunny.user.service.EntCateCertApplyService;
import cn.enn.ygego.sunny.user.dao.EntCateCertApplyDao;
import cn.enn.ygego.sunny.user.model.EntCateCertApply;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntCateCertApply
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntCateCertApplyServiceImpl implements EntCateCertApplyService{

    @Autowired
    private EntCateCertApplyDao entCateCertApplyDao;

    @Autowired
    private EntCateCertApplyFileDao entCateCertApplyFileDao;

    public List<EntCateCertApply> findAll(){
       return  entCateCertApplyDao.findAll();
    }

    public List<EntCateCertApply> findEntCateCertApplys(EntCateCertApply record){
       return  entCateCertApplyDao.find(record);
    }

    public EntCateCertApply getEntCateCertApplyByPrimaryKey(Long certApplyDetailId){
        return entCateCertApplyDao.getByPrimaryKey(certApplyDetailId);
    }

    public Integer createEntCateCertApply(EntCateCertApply record){
        return entCateCertApplyDao.insert(record);
    }

    public Integer removeEntCateCertApply(EntCateCertApply record){
        return entCateCertApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long certApplyDetailId){
    	return entCateCertApplyDao.deleteByPrimaryKey(certApplyDetailId);
    }

    public Integer modifyEntCateCertApplyByPrimaryKey(EntCateCertApply record){
        return entCateCertApplyDao.updateByPrimaryKey(record);
    }

    public Integer createEntCateAndBrandApply(EntCateAndBrandVO record){
        //提交类目资质申请表
        EntCateCertApplyVO entCateCertApplyVO = record.getEntCateCertApplyVO();
        EntCateCertApply entCateCertApply = new EntCateCertApply();
        BeanUtils.copyProperties(entCateCertApplyVO,entCateCertApply);
        entCateCertApplyDao.insert(entCateCertApply);
        //提交类目资质申请附件表
        List<EntCateCertApplyFile> entCateCertApplyFileList = entCateCertApplyVO.getEntCateCertApplyFileList();
        for(EntCateCertApplyFile next : entCateCertApplyFileList){
            entCateCertApplyFileDao.insert(next);
        }
        //提交类目资质申请表
        record.getEntBrandAuthApplyVO();
        return 1;
    }







}