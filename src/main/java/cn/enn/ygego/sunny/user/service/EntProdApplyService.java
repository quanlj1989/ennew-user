package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.EntProdApplyDTO;
import cn.enn.ygego.sunny.user.dto.vo.EntProdApplyVO;
import cn.enn.ygego.sunny.user.model.EntProdApply;

/**
 * dal Interface:EntProdApply
 * @author gencode
 * @date 2018-3-30
 */
public interface EntProdApplyService {

    public List<EntProdApply> findAll();

    public List<EntProdApply> findEntProdApplys(EntProdApply record);

    public EntProdApply getEntProdApplyByPrimaryKey(Long applyId);

    public Integer createEntProdApply(EntProdApply record);

    public Integer removeEntProdApply(EntProdApply record);

    public Integer removeByPrimaryKey(Long applyId);

    public Integer modifyEntProdApplyByPrimaryKey(EntProdApply record);

    public Integer createEntProdApplyVO(EntProdApplyVO record);

    public EntProdApplyVO getEntProdApplyVO(EntProdApplyDTO entProdApplyDTO);



}