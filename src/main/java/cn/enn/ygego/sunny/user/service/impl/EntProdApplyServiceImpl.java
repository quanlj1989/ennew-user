package cn.enn.ygego.sunny.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.enn.ygego.sunny.user.dao.EntApplyProdInfoDao;
import cn.enn.ygego.sunny.user.dao.EntApplyProducerAuthDao;
import cn.enn.ygego.sunny.user.dao.EntAuthApplyFile2Dao;
import cn.enn.ygego.sunny.user.dao.EntCateCertApplyDao;
import cn.enn.ygego.sunny.user.dao.EntCateCertApplyFileDao;
import cn.enn.ygego.sunny.user.dto.EntApplyProdInfoDTO;
import cn.enn.ygego.sunny.user.dto.EntProdApplyDTO;
import cn.enn.ygego.sunny.user.dto.vo.EntApplyProducerAuthVO;
import cn.enn.ygego.sunny.user.dto.vo.EntCateCertApplyVO;
import cn.enn.ygego.sunny.user.dto.vo.EntProdApplyVO;
import cn.enn.ygego.sunny.user.model.EntApplyProdInfo;
import cn.enn.ygego.sunny.user.model.EntApplyProducerAuth;
import cn.enn.ygego.sunny.user.model.EntAuthApplyFile2;
import cn.enn.ygego.sunny.user.model.EntCateCertApply;
import cn.enn.ygego.sunny.user.model.EntCateCertApplyFile;
import cn.enn.ygego.sunny.user.service.EntCateCertApplyService;
import cn.enn.ygego.sunny.user.service.EntProdApplyService;
import cn.enn.ygego.sunny.user.dao.EntProdApplyDao;
import cn.enn.ygego.sunny.user.model.EntProdApply;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

/**
 * dal Interface:EntProdApply
 * @author gencode
 * @date 2018-3-30
 */
@Service
public class EntProdApplyServiceImpl implements EntProdApplyService{

    @Autowired
    private EntProdApplyDao entProdApplyDao;
    @Autowired
    private EntCateCertApplyDao entCateCertApplyDao;
    @Autowired
    private EntCateCertApplyFileDao entCateCertApplyFileDao;
    @Autowired
    private EntApplyProdInfoDao entApplyProdInfoDao;
    @Autowired
    private EntApplyProducerAuthDao entApplyProducerAuthDao;
    @Autowired
    private EntAuthApplyFile2Dao entAuthApplyFile2Dao;

    public List<EntProdApply> findAll(){
       return  entProdApplyDao.findAll();
    }

    public List<EntProdApply> findEntProdApplys(EntProdApply record){
       return  entProdApplyDao.find(record);
    }

    public EntProdApply getEntProdApplyByPrimaryKey(Long applyId){
        return entProdApplyDao.getByPrimaryKey(applyId);
    }

    public Integer createEntProdApply(EntProdApply record){
        return entProdApplyDao.insert(record);
    }

    public Integer removeEntProdApply(EntProdApply record){
        return entProdApplyDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long applyId){
    	return entProdApplyDao.deleteByPrimaryKey(applyId);
    }

    public Integer modifyEntProdApplyByPrimaryKey(EntProdApply record){
        return entProdApplyDao.updateByPrimaryKey(record);
    }

    public Integer createEntProdApplyVO(EntProdApplyVO record){
        int result = -1;
        try{
            //插入申请ID
            EntProdApply entProdApply = new EntProdApply();
            BeanUtils.copyProperties(record,entProdApply);
            entProdApplyDao.insert(entProdApply);
            //插入类目申请
            List<EntCateCertApplyVO> entCateCertApplyVOList = record.getEntCateCertApplyVOList();
            for(EntCateCertApplyVO entCateCertApplyVO : entCateCertApplyVOList){
                entCateCertApplyVO.setApplyId(entProdApply.getApplyId());
                EntCateCertApply entCateCertApply = new EntCateCertApply();
                BeanUtils.copyProperties(entCateCertApplyVO,entCateCertApply);
                entCateCertApplyDao.insert(entCateCertApply);
                List<EntCateCertApplyFile> entCateCertApplyFileList = entCateCertApplyVO.getEntCateCertApplyFileList();
                for(EntCateCertApplyFile entCateCertApplyFile: entCateCertApplyFileList){
                    entCateCertApplyFile.setCertApplyDetailId(entCateCertApply.getCertApplyDetailId());
                    entCateCertApplyFileDao.insert(entCateCertApplyFile);
                }
            }
            //插入申请商品
            List<EntApplyProdInfoDTO> entApplyProdInfoDTOList = record.getEntApplyProdInfoDTOList();
            for(EntApplyProdInfoDTO entApplyProdInfoDTO:entApplyProdInfoDTOList){
                EntApplyProdInfo entApplyProdInfo = new EntApplyProdInfo();
                BeanUtils.copyProperties(entApplyProdInfoDTO,entApplyProdInfo);
                entApplyProdInfo.setApplyId(entProdApply.getApplyId());
                entApplyProdInfoDao.insert(entApplyProdInfo);
            }

            //插入生产商授权
            List<EntApplyProducerAuthVO> entApplyProducerAuthVOList = record.getEntApplyProducerAuthVOList();
            for(EntApplyProducerAuthVO entApplyProducerAuthVO : entApplyProducerAuthVOList){
                entApplyProducerAuthVO.setApplyId(entProdApply.getApplyId());
                EntApplyProducerAuth entApplyProducerAuth = new EntApplyProducerAuth();
                BeanUtils.copyProperties(entApplyProducerAuthVO,entApplyProducerAuth);
                entApplyProducerAuthDao.insert(entApplyProducerAuth);
                List<EntAuthApplyFile2> entAuthApplyFile2List = entApplyProducerAuthVO.getEntAuthApplyFile2List();
                for(EntAuthApplyFile2 entAuthApplyFile2: entAuthApplyFile2List){
                    entAuthApplyFile2.setAuthApplyId(entApplyProducerAuth.getAuthApplyId());
                    entAuthApplyFile2Dao.insert(entAuthApplyFile2);
                }
            }
            result = 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;

    }

    public EntProdApplyVO getEntProdApplyVO(EntProdApplyDTO entProdApplyDTO){
        //查询主数据
        EntProdApplyVO entProdApplyVO = new EntProdApplyVO();
        EntProdApply entProdApply = entProdApplyDao.getByPrimaryKey(entProdApplyDTO.getApplyId());
        BeanUtils.copyProperties(entProdApply,entProdApplyVO);
        //查询类目认证
        EntCateCertApply entCateCertApply = new EntCateCertApply();
        entCateCertApply.setApplyId(entProdApplyDTO.getApplyId());
        List<EntCateCertApplyVO> entCateCertApplyVOList = new ArrayList<EntCateCertApplyVO>();
        List<EntCateCertApply> entCateCertApplyList = entCateCertApplyDao.find(entCateCertApply);
        for(EntCateCertApply entCateCertApply1 : entCateCertApplyList){
            EntCateCertApplyVO entCateCertApplyVO = new EntCateCertApplyVO();
            BeanUtils.copyProperties(entCateCertApply1,entCateCertApplyVO);
            EntCateCertApplyFile entCateCertApplyFile = new EntCateCertApplyFile();
            entCateCertApplyFile.setCertApplyDetailId(entCateCertApply1.getCertApplyDetailId());
            List<EntCateCertApplyFile> entCateCertApplyFileList1 = entCateCertApplyFileDao.find(entCateCertApplyFile);
            entCateCertApplyVO.setEntCateCertApplyFileList(entCateCertApplyFileList1);
            entCateCertApplyVOList.add(entCateCertApplyVO);
        }
        entProdApplyVO.setEntCateCertApplyVOList(entCateCertApplyVOList);
        //查询品牌
        List<EntApplyProdInfoDTO> entApplyProdInfoDTOList = new ArrayList<EntApplyProdInfoDTO>();
        EntApplyProdInfo entApplyProdInfo = new EntApplyProdInfo();
        entApplyProdInfo.setApplyId(entProdApplyDTO.getApplyId());
        List<EntApplyProdInfo> entApplyProdInfoList = entApplyProdInfoDao.find(entApplyProdInfo);
        for(EntApplyProdInfo entApplyProdInfo1 : entApplyProdInfoList){
            EntApplyProdInfoDTO entApplyProdInfoDTO = new EntApplyProdInfoDTO();
            BeanUtils.copyProperties(entApplyProdInfo1,entApplyProdInfoDTO);
            entApplyProdInfoDTOList.add(entApplyProdInfoDTO);
        }
        entProdApplyVO.setEntApplyProdInfoDTOList(entApplyProdInfoDTOList);
        //查询授权书
        List<EntApplyProducerAuthVO> entApplyProducerAuthVOList = new ArrayList<EntApplyProducerAuthVO>();
        EntApplyProducerAuth entApplyProducerAuth = new EntApplyProducerAuth();
        entApplyProducerAuth.setApplyId(entProdApplyDTO.getApplyId());
        List<EntApplyProducerAuth> entApplyProducerAuthList = entApplyProducerAuthDao.find(entApplyProducerAuth);
        for(EntApplyProducerAuth entApplyProducerAuth1 : entApplyProducerAuthList){
            EntApplyProducerAuthVO entApplyProducerAuthVO = new EntApplyProducerAuthVO();
            BeanUtils.copyProperties(entApplyProducerAuth1,entApplyProducerAuthVO);
            EntAuthApplyFile2 entAuthApplyFile2 = new EntAuthApplyFile2();
            List<EntAuthApplyFile2> entAuthApplyFile2List = entAuthApplyFile2Dao.find(entAuthApplyFile2);
            entApplyProducerAuthVO.setEntAuthApplyFile2List(entAuthApplyFile2List);
            entApplyProducerAuthVOList.add(entApplyProducerAuthVO);
        }
        entProdApplyVO.setEntApplyProducerAuthVOList(entApplyProducerAuthVOList);
        return  entProdApplyVO;
    }
}