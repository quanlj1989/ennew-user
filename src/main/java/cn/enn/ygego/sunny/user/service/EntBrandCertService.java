package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntBrandCert;

/**
 * dal Interface:EntBrandCert
 * @author gencode
 * @date 2018-3-28
 */
public interface EntBrandCertService {

    public List<EntBrandCert> findAll();

    public List<EntBrandCert> findEntBrandCerts(EntBrandCert record);

    public EntBrandCert getEntBrandCertByPrimaryKey(Long brandCertId);

    public Integer createEntBrandCert(EntBrandCert record);

    public Integer removeEntBrandCert(EntBrandCert record);

    public Integer removeByPrimaryKey(Long brandCertId);

    public Integer modifyEntBrandCertByPrimaryKey(EntBrandCert record);



}