package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.vo.EmployeeQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.EmployeeVO;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcctApply;

/**
 * dal Interface:RelaMemberToAcctApply
 * @author gencode
 * @date 2018-3-24
 */
public interface RelaMemberToAcctApplyService {

    public List<RelaMemberToAcctApply> findAll();

    public List<RelaMemberToAcctApply> findRelaMemberToAcctApplys(RelaMemberToAcctApply record);

    public RelaMemberToAcctApply getRelaMemberToAcctApplyByPrimaryKey(Long relaId);

    public Integer createRelaMemberToAcctApply(RelaMemberToAcctApply record);

    public Integer removeRelaMemberToAcctApply(RelaMemberToAcctApply record);

    public Integer removeByPrimaryKey(Long relaId);

    public Integer modifyRelaMemberToAcctApplyByPrimaryKey(RelaMemberToAcctApply record);
    
    /**
     * 查看员工企业申请总数
     * @param query
     * @return
     */
    public Integer getEmployeeApplyCount(EmployeeQueryVO query);
    /**
     * 员工企业申请列表
     * @param query
     * @return
     */
    public List<EmployeeVO> getEmployeeApplyList(EmployeeQueryVO query);
    /**
     * 查询员工申请详情
     * @param employee
     * @return
     */
    public EmployeeVO getEmployeeApplyDetail(Long relaId);

}