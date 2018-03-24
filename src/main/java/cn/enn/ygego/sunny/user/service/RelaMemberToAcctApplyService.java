package cn.enn.ygego.sunny.user.service;

import java.util.List;
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



}