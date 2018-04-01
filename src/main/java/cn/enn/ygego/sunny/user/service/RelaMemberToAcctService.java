package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.vo.EmployeeQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.EmployeeVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonVO;
import cn.enn.ygego.sunny.user.model.MemberInfo;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcct;

/**
 * dal Interface:RelaMemberToAcct
 * @author gencode
 * @date 2018-3-24
 */
public interface RelaMemberToAcctService {

    public List<RelaMemberToAcct> findAll();

    public List<RelaMemberToAcct> findRelaMemberToAccts(RelaMemberToAcct record);

    public RelaMemberToAcct getRelaMemberToAcctByPrimaryKey(Long relaId);

    public Integer createRelaMemberToAcct(RelaMemberToAcct record);

    public Integer removeRelaMemberToAcct(RelaMemberToAcct record);

    public Integer removeByPrimaryKey(Long relaId);

    public Integer modifyRelaMemberToAcctByPrimaryKey(RelaMemberToAcct record);

    /**
     * 企业管理员转让
     * @Description TODO
     * @author puanl
     * @date 2018年3月27日 上午10:53:51 
     * @param newAdminMember
     * @param oldRela
     * @return
     */
    public boolean modifyEntAdminRela(MemberInfo newAdminMember , RelaMemberToAcct oldRela);
    
    /**
     * 查询个人关联企业数量
     * @param query
     * @return
     */
    public Integer getEmployeeEntCount(EmployeeQueryVO query);
    
    /**
     * 查询个人关联所有企业
     * @param query
     * @return
     */
    public List<EmployeeVO> getEmployeeEntList(EmployeeQueryVO query);
    
    
    Integer getPersonCount(PersonQueryVO query);
    
    /**
     * 查询账户会员关系详情数据
     * @param memberId
     * @param acctId
     * @param memberType
     * @return
     */
    List<PersonVO> getPersonList(PersonQueryVO query);
    
}