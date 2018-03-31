package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.SellerProd;

/**
 * dal Interface:SellerProd
 * @author gencode
 * @date 2018-3-28
 */
public interface SellerProdService {

    public List<SellerProd> findAll();

    public List<SellerProd> findSellerProds(SellerProd record);

    public SellerProd getSellerProdByPrimaryKey(Long sellerProdId);

    public Integer createSellerProd(SellerProd record);

    public Integer removeSellerProd(SellerProd record);

    public Integer removeByPrimaryKey(Long sellerProdId);

    public Integer modifySellerProdByPrimaryKey(SellerProd record);



}