package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntBrandAuthApply;

/**
 * dal Interface:EntBrandAuthApply
 * @author gencode
 * @date 2018-3-28
 */
public interface EntBrandAuthApplyService {

    public List<EntBrandAuthApply> findAll();

    public List<EntBrandAuthApply> findEntBrandAuthApplys(EntBrandAuthApply record);

    public EntBrandAuthApply getEntBrandAuthApplyByPrimaryKey(Long brandApplyId);

    public Integer createEntBrandAuthApply(EntBrandAuthApply record);

    public Integer removeEntBrandAuthApply(EntBrandAuthApply record);

    public Integer removeByPrimaryKey(Long brandApplyId);

    public Integer modifyEntBrandAuthApplyByPrimaryKey(EntBrandAuthApply record);



}