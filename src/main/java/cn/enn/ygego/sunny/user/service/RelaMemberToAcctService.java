package cn.enn.ygego.sunny.user.service;

import java.util.List;

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

}