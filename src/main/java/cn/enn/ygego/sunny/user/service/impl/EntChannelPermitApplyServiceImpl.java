package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;

import cn.enn.ygego.sunny.user.constant.ChannelAuthStatusEnum;
import cn.enn.ygego.sunny.user.constant.StatusConstant;
import cn.enn.ygego.sunny.user.dao.EntChannelPermitDao;
import cn.enn.ygego.sunny.user.dto.vo.EntChannelPermitVO;
import cn.enn.ygego.sunny.user.model.EntChannelPermit;
import cn.enn.ygego.sunny.user.service.EntChannelPermitApplyService;
import cn.enn.ygego.sunny.user.dao.EntChannelPermitApplyDao;
import cn.enn.ygego.sunny.user.model.EntChannelPermitApply;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:EntChannelPermitApply
 * @author gencode
 * @date 2018-3-28
 */
@Service
public class EntChannelPermitApplyServiceImpl implements EntChannelPermitApplyService{

    @Autowired
    private EntChannelPermitApplyDao entChannelPermitApplyDao;

    @Autowired
    private EntChannelPermitDao entChannelPermitDao;

    public List<EntChannelPermitApply> findAll(){
       return  entChannelPermitApplyDao.findAll();
    }

    public List<EntChannelPermitApply> findEntChannelPermitApplys(EntChannelPermitApply record){
       return  entChannelPermitApplyDao.find(record);
    }

    public EntChannelPermitApply getEntChannelPermitApplyByPrimaryKey(Long channelApplyId){
        return entChannelPermitApplyDao.getByPrimaryKey(channelApplyId);
    }

    public Integer createEntChannelPermitApply(EntChannelPermitApply record){
        return entChannelPermitApplyDao.insert(record);
    }

    public Integer removeEntChannelPermitApply(EntChannelPermitApply record){
        return entChannelPermitApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long channelApplyId){
    	return entChannelPermitApplyDao.deleteByPrimaryKey(channelApplyId);
    }

    public Integer modifyEntChannelPermitApplyByPrimaryKey(EntChannelPermitApply record){
        return entChannelPermitApplyDao.updateByPrimaryKey(record);
    }

    public Integer modifyEntChannelPermitApplyByPrimaryKey(EntChannelPermitVO record){
        List<EntChannelPermitApply> entChannelPermitApplyList = record.getEntChannelPermitApplyList();
        int result = StatusConstant.UNRELATIVE;
        for(EntChannelPermitApply entChannelPermitApply : entChannelPermitApplyList){
            entChannelPermitApply.setStatus(ChannelAuthStatusEnum.APPLY_STATUS_AGREE.getCode());
            result = entChannelPermitApplyDao.updateByPrimaryKey(entChannelPermitApply);
            if(ChannelAuthStatusEnum.APPLY_STATUS_AGREE.getCode() == entChannelPermitApply.getStatus()){
                EntChannelPermit entChannelPermit = new EntChannelPermit();
                entChannelPermitApply = entChannelPermitApplyDao.getByPrimaryKey(entChannelPermitApply.getChannelApplyId());
                BeanUtils.copyProperties(entChannelPermitApply,entChannelPermit);
                entChannelPermit.setCreateAcctId(record.getCreateAcctId());
                entChannelPermit.setCreateName(record.getCreateName());
                entChannelPermit.setCreateTime(record.getCreateTime());
                result = entChannelPermitDao.insert(entChannelPermit);
            }
        }
        return result;
    }








}