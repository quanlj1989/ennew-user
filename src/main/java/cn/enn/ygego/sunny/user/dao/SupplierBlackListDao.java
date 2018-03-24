package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.SupplierBlackList;

/**
 * dal Interface:SupplierBlackList
 * @author gencode
 */
public interface SupplierBlackListDao {

	Integer insert(SupplierBlackList record);

    Integer insertSelective(SupplierBlackList record);
    
    Integer delete(SupplierBlackList record);

    Integer deleteByPrimaryKey(@Param("supplierListId") Long supplierListId);
    
    Integer updateByPrimaryKey(SupplierBlackList record);

    List<SupplierBlackList> findAll();

    List<SupplierBlackList> find(SupplierBlackList record);

    Integer getCount(SupplierBlackList record);

    SupplierBlackList getByPrimaryKey(@Param("supplierListId") Long supplierListId);

	


}