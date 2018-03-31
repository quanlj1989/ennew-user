package cn.enn.ygego.sunny.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.enn.ygego.sunny.user.model.SellerProd;

/**
 * dal Interface:SellerProd
 * @author gencode
 */
public interface SellerProdDao {

	Integer insert(SellerProd record);

    Integer insertSelective(SellerProd record);
    
    Integer delete(SellerProd record);

    Integer deleteByPrimaryKey(@Param("sellerProdId") Long sellerProdId);
    
    Integer updateByPrimaryKey(SellerProd record);

    List<SellerProd> findAll();

    List<SellerProd> find(SellerProd record);

    Integer getCount(SellerProd record);

    SellerProd getByPrimaryKey(@Param("sellerProdId") Long sellerProdId);

	


}