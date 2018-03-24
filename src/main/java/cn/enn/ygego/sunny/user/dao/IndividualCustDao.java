package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.enn.ygego.sunny.user.dto.IndividualCustDTO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonVO;
import cn.enn.ygego.sunny.user.model.IndividualCust;

/**
 * dal Interface:IndividualCust
 * @author gencode
 */
public interface IndividualCustDao {

	Integer insert(IndividualCust record);

    Integer insertSelective(IndividualCust record);
    
    Integer delete(IndividualCust record);

    Integer deleteByPrimaryKey(@Param("memberId") Long memberId);
    
    Integer updateByPrimaryKey(IndividualCust record);

    List<IndividualCust> findAll();

    List<IndividualCust> find(IndividualCust record);

    Integer getCount(IndividualCust record);

    IndividualCust getByPrimaryKey(@Param("memberId") Long memberId);
    
    IndividualCustDTO getIndividualCustById(@Param("memberId") Long memberId);
    
    /**
     * 会员表与账户表关联查询
     * @Description TODO
     * @author "quanlinjie"
     * @date 2018年3月20日 下午7:52:14 
     * @param memberId
     * @param acctId
     * @return
     */
    PersonVO getPersonById(@Param("memberId") Long memberId , @Param("acctId") Long acctId);
    
    Integer getPersonCount(PersonQueryVO query);
    
    List<PersonVO> getPersonList(PersonQueryVO query);

}