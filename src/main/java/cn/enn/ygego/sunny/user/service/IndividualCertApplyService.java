package cn.enn.ygego.sunny.user.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import cn.enn.ygego.sunny.user.dto.IndividualCertApplyDTO;
import cn.enn.ygego.sunny.user.dto.vo.IndividualCertApplyVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.model.IndividualCertApply;
import cn.enn.ygego.sunny.user.model.IndividualCust;

/**
 * dal Interface:IndividualCertApply
 * @author gencode
 * @date 2018-3-22
 */
public interface IndividualCertApplyService {

    public List<IndividualCertApply> findAll();

    public List<IndividualCertApply> findIndividualCertApplys(IndividualCertApply record);

    public IndividualCertApply getIndividualCertApplyByPrimaryKey(Long certApplyId);

    public Integer createIndividualCertApply(IndividualCertApply record);

    public Integer removeIndividualCertApply(IndividualCertApply record);

    public Integer removeByPrimaryKey(Long certApplyId);

    public Integer modifyIndividualCertApplyByPrimaryKey(IndividualCertApply record);

    /**
     * @Description 查询个人审批信息列表总数量
     * @author puanl
     * @date 2018年3月24日 上午12:04:50 
     * @param query
     * @return
     */
    public Integer getAcctCertApplyCount(PersonQueryVO query);
    
    /**
     * @Description 查询个人审批列表
     * @author puanl
     * @date 2018年3月24日 上午12:05:25 
     * @param query
     * @return
     */
    public List<IndividualCertApplyVO> getAcctCertApplyList(PersonQueryVO query);

    /**
     * @Description 查询个人审批详情（根据审批ID查询）
     * @author puanl
     * @date 2018年3月24日 上午12:06:13 
     * @param certApplyId
     * @param memberId
     * @return
     */
    public IndividualCertApplyDTO getCertApplyByApplyId(Long certApplyId , boolean hasFile);
    
    /**
     * 
     * @Description 查询个人审批详情 (根据会员id查询)
     * @author puanl
     * @date 2018年3月24日 上午7:26:16 
     * @param memberId
     * @param hasFile
     * @return
     */
    public IndividualCertApplyVO getCertApplyByMemberId(IndividualCertApplyVO memberId, boolean hasFile);
    
    /**
     * @Description 添加个人认证信息
     * @author puanl
     * @date 2018年3月24日 上午12:25:26 
     * @param applyData
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public IndividualCertApplyDTO addIndividualCertApply(IndividualCertApplyDTO applyData) throws IllegalAccessException, InvocationTargetException;
        
    public IndividualCertApplyDTO updateIndividualCertApply(IndividualCertApplyDTO applyData) throws IllegalAccessException, InvocationTargetException;
    
    public IndividualCust copyApplyToIndividualCust(IndividualCertApply record) throws IllegalAccessException, InvocationTargetException;
    
}