package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.SupplierWhiteList;

/**
 * dal Interface:SupplierWhiteList
 * @author gencode
 */
public interface SupplierWhiteListDao {

	Integer insert(SupplierWhiteList record);

    Integer insertSelective(SupplierWhiteList record);
    
    Integer delete(SupplierWhiteList record);

    Integer deleteByPrimaryKey(@Param("supplierListId") Long supplierListId);
    
    Integer updateByPrimaryKey(SupplierWhiteList record);

    List<SupplierWhiteList> findAll();

    List<SupplierWhiteList> find(SupplierWhiteList record);

    Integer getCount(SupplierWhiteList record);

    SupplierWhiteList getByPrimaryKey(@Param("supplierListId") Long supplierListId);

	


}