package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntBrandAuthApplyCert;

/**
 * dal Interface:EntBrandAuthApplyCert
 * @author gencode
 * @date 2018-3-22
 */
public interface EntBrandAuthApplyCertService {

    public List<EntBrandAuthApplyCert> findAll();

    public List<EntBrandAuthApplyCert> findEntBrandAuthApplyCerts(EntBrandAuthApplyCert record);

    public EntBrandAuthApplyCert getEntBrandAuthApplyCertByPrimaryKey(Long brandApplyCertId);

    public Integer createEntBrandAuthApplyCert(EntBrandAuthApplyCert record);

    public Integer removeEntBrandAuthApplyCert(EntBrandAuthApplyCert record);

    public Integer removeByPrimaryKey(Long brandApplyCertId);

    public Integer modifyEntBrandAuthApplyCertByPrimaryKey(EntBrandAuthApplyCert record);



}