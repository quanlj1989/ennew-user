package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntBrandInfo;

/**
 * dal Interface:EntBrandInfo
 * @author gencode
 * @date 2018-3-28
 */
public interface EntBrandInfoService {

    public List<EntBrandInfo> findAll();

    public List<EntBrandInfo> findEntBrandInfos(EntBrandInfo record);

    public EntBrandInfo getEntBrandInfoByPrimaryKey(Long entBrandId);

    public Integer createEntBrandInfo(EntBrandInfo record);

    public Integer removeEntBrandInfo(EntBrandInfo record);

    public Integer removeByPrimaryKey(Long entBrandId);

    public Integer modifyEntBrandInfoByPrimaryKey(EntBrandInfo record);



}