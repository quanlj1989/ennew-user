package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
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

}