package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntCertInfo;

/**
 * dal Interface:EntCertInfo
 * @author gencode
 * @date 2018-3-28
 */
public interface EntCertInfoService {

    public List<EntCertInfo> findAll();

    public List<EntCertInfo> findEntCertInfos(EntCertInfo record);

    public EntCertInfo getEntCertInfoByPrimaryKey(Long certInfoId);

    public Integer createEntCertInfo(EntCertInfo record);

    public Integer removeEntCertInfo(EntCertInfo record);

    public Integer removeByPrimaryKey(Long certInfoId);

    public Integer modifyEntCertInfoByPrimaryKey(EntCertInfo record);



}