package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.EntTaxRate;

/**
 * dal Interface:EntTaxRate
 * @author gencode
 * @date 2018-3-22
 */
public interface EntTaxRateService {

    public List<EntTaxRate> findAll();

    public List<EntTaxRate> findEntTaxRates(EntTaxRate record);

    public EntTaxRate getEntTaxRateByPrimaryKey(Long taxRateId);

    public Integer createEntTaxRate(EntTaxRate record);

    public Integer removeEntTaxRate(EntTaxRate record);

    public Integer removeByPrimaryKey(Long taxRateId);

    public Integer modifyEntTaxRateByPrimaryKey(EntTaxRate record);



}