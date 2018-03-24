package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.enn.ygego.sunny.user.dto.IndividualCertApplyDTO;
import cn.enn.ygego.sunny.user.dto.vo.IndividualCertApplyVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.model.IndividualCertApply;

/**
 * dal Interface:IndividualCertApply
 * @author gencode
 */
public interface IndividualCertApplyDao {

	Integer insert(IndividualCertApply record);

    Integer insertSelective(IndividualCertApply record);
    
    Integer delete(IndividualCertApply record);

    Integer deleteByPrimaryKey(@Param("certApplyId") Long certApplyId);
    
    Integer updateByPrimaryKey(IndividualCertApply record);

    List<IndividualCertApply> findAll();

    List<IndividualCertApply> find(IndividualCertApply record);

    Integer getCount(IndividualCertApply record);

    IndividualCertApply getByPrimaryKey(@Param("certApplyId") Long certApplyId);
    
    IndividualCertApply getByMemberId(@Param("memberId") Long memberId);
    
    /***
     * 查询人员审批列表总条数
     * @Description TODO
     * @author puanl
     * @date 2018年3月21日 下午6:21:51 
     * @param query
     * @return
     */
    Integer getAcctCertApplyCount(PersonQueryVO query);
    
    /**
     * 查询人员审批列表
     * @Description TODO
     * @author puanl
     * @date 2018年3月21日 下午6:20:31 
     * @param query
     * @return
     */
    List<IndividualCertApplyVO> getAcctCertApplyList(PersonQueryVO query);
    
    /**
     * 根据个人资质认证申请ID，查询个人资质认证详情
     * @Description TODO
     * @author puanl
     * @date 2018年3月21日 下午7:13:48 
     * @param certApplyId
     * @return
     */
    IndividualCertApplyDTO getCertApplyByApplyId(@Param("certApplyId") Long certApplyId);
    
    /**
     * @Description 根据会员ID，查询个人账户+个人审批详情
     * @author puanl
     * @date 2018年3月24日 上午7:27:21 
     * @param memberId
     * @return
     */
    IndividualCertApplyVO getCertApplyByMemberId(IndividualCertApplyVO query );
    
}