package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.SupplierBlackList;

/**
 * dal Interface:SupplierBlackList
 * @author gencode
 * @date 2018-3-22
 */
public interface SupplierBlackListService {

    public List<SupplierBlackList> findAll();

    public List<SupplierBlackList> findSupplierBlackLists(SupplierBlackList record);

    public SupplierBlackList getSupplierBlackListByPrimaryKey(Long supplierListId);

    public Integer createSupplierBlackList(SupplierBlackList record);

    public Integer removeSupplierBlackList(SupplierBlackList record);

    public Integer removeByPrimaryKey(Long supplierListId);

    public Integer modifySupplierBlackListByPrimaryKey(SupplierBlackList record);



}