package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.SupplierWhiteList;

/**
 * dal Interface:SupplierWhiteList
 * @author gencode
 * @date 2018-3-22
 */
public interface SupplierWhiteListService {

    public List<SupplierWhiteList> findAll();

    public List<SupplierWhiteList> findSupplierWhiteLists(SupplierWhiteList record);

    public SupplierWhiteList getSupplierWhiteListByPrimaryKey(Long supplierListId);

    public Integer createSupplierWhiteList(SupplierWhiteList record);

    public Integer removeSupplierWhiteList(SupplierWhiteList record);

    public Integer removeByPrimaryKey(Long supplierListId);

    public Integer modifySupplierWhiteListByPrimaryKey(SupplierWhiteList record);



}