package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntCustInfo;

/**
 * dal Interface:EntCustInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface EntCustInfoService {

    public List<EntCustInfo> findAll();

    public List<EntCustInfo> findEntCustInfos(EntCustInfo record);

    public EntCustInfo getEntCustInfoByPrimaryKey(Long memberId);

    public Integer createEntCustInfo(EntCustInfo record);

    public Integer removeEntCustInfo(EntCustInfo record);

    public Integer removeByPrimaryKey(Long memberId);

    public Integer modifyEntCustInfoByPrimaryKey(EntCustInfo record);



}