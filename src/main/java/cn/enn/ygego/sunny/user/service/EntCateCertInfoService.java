package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntCateCertInfo;

/**
 * dal Interface:EntCateCertInfo
 * @author gencode
 * @date 2018-3-28
 */
public interface EntCateCertInfoService {

    public List<EntCateCertInfo> findAll();

    public List<EntCateCertInfo> findEntCateCertInfos(EntCateCertInfo record);

    public EntCateCertInfo getEntCateCertInfoByPrimaryKey(Long certInfoId);

    public Integer createEntCateCertInfo(EntCateCertInfo record);

    public Integer removeEntCateCertInfo(EntCateCertInfo record);

    public Integer removeByPrimaryKey(Long certInfoId);

    public Integer modifyEntCateCertInfoByPrimaryKey(EntCateCertInfo record);



}