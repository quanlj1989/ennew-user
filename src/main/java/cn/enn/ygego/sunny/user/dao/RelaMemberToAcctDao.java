package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.enn.ygego.sunny.user.dto.vo.EmployeeQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.EmployeeVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonVO;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcct;

/**
 * dal Interface:RelaMemberToAcct
 * @author gencode
 */
public interface RelaMemberToAcctDao {

	Integer insert(RelaMemberToAcct record);

    Integer insertSelective(RelaMemberToAcct record);
    
    Integer delete(RelaMemberToAcct record);

    Integer deleteByPrimaryKey(@Param("relaId") Long relaId);
    
    Integer updateByPrimaryKey(RelaMemberToAcct record);

    List<RelaMemberToAcct> findAll();

    List<RelaMemberToAcct> find(RelaMemberToAcct record);

    Integer getCount(RelaMemberToAcct record);

    RelaMemberToAcct getByPrimaryKey(@Param("relaId") Long relaId);

    /**
     *  清空之前设置的默认企业
     * @param acctId
     * @return
     */
    int cleanDefaultCompany(@Param("acctId") Long acctId);

    /**
     * 设置默认企业
     * @return
     */
    int setDefaultCompany(@Param("acctId") Long acctId,@Param("companyMemberId") Long companyMemberId);

    /**
     * 查询个人关联企业数量
     * @param query
     * @return
     */
    Integer getEmployeeEntCount(EmployeeQueryVO query);
    
    /**
     * 获取个人关联所有企业
     * @param query
     * @return
     */
    List<EmployeeVO> getEmployeeEntList(EmployeeQueryVO query);
    
    /**
     * 
     * @param query
     * @return
     */
    Integer getPersonCount(PersonQueryVO query);
    
    /**
     * 查看会员账户关系详情列表
     * @param memberId
     * @param acctId
     * @param memberType
     * @return
     */
    List<PersonVO> getPersonList(PersonQueryVO query);
    
}