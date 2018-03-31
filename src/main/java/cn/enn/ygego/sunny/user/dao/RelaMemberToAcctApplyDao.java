package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.enn.ygego.sunny.user.dto.vo.EmployeeQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.EmployeeVO;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcctApply;

/**
 * dal Interface:RelaMemberToAcctApply
 * @author gencode
 */
public interface RelaMemberToAcctApplyDao {

	Integer insert(RelaMemberToAcctApply record);

    Integer insertSelective(RelaMemberToAcctApply record);
    
    Integer delete(RelaMemberToAcctApply record);

    Integer deleteByPrimaryKey(@Param("relaId") Long relaId);
    
    Integer updateByPrimaryKey(RelaMemberToAcctApply record);

    Integer updateAllByPrimaryKey(RelaMemberToAcctApply record);
    
    List<RelaMemberToAcctApply> findAll();

    List<RelaMemberToAcctApply> find(RelaMemberToAcctApply record);

    Integer getCount(RelaMemberToAcctApply record);

    RelaMemberToAcctApply getByPrimaryKey(@Param("relaId") Long relaId);

    Integer getEmployeeApplyCount(EmployeeQueryVO query);
    
	List<EmployeeVO> getEmployeeApplyList(EmployeeQueryVO query);
	
	EmployeeVO getEmployeeApplyDetail(EmployeeQueryVO query);

}