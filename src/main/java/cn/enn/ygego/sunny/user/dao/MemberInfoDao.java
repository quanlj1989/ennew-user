package cn.enn.ygego.sunny.user.dao;

import java.util.List;

import cn.enn.ygego.sunny.user.model.RelaMemberToAcct;
import org.apache.ibatis.annotations.Param;

import cn.enn.ygego.sunny.user.model.MemberInfo;

/**
 * dal Interface:MemberInfo
 * @author gencode
 */
public interface MemberInfoDao {

	Integer insert(MemberInfo record);

    Integer insertSelective(MemberInfo record);
    
    Integer delete(MemberInfo record);

    Integer deleteByPrimaryKey(@Param("memberId") Long memberId);
    
    Integer updateByPrimaryKey(MemberInfo record);

    List<MemberInfo> findAll();

    List<MemberInfo> find(MemberInfo record);

    Integer getCount(MemberInfo record);

    MemberInfo getByPrimaryKey(@Param("memberId") Long memberId);

    /**
     * 根据acctId查询所有关联的审核通过并且可用的会员信息
     * @param acctId 账号id
     * @return
     */
    List<MemberInfo> findMemberInfosByAcctId(@Param("acctId") Long acctId);

    /**
     * 根据acctId查询所对应的个人会员信息
     * @param acctId 账号id
     * @return
     */
    MemberInfo findPersonMember(@Param("acctId") Long acctId);

}