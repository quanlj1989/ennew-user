/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.enn.ygego.sunny.user.dto.supermarket.EntJoinMarketTotalVO;
import cn.enn.ygego.sunny.user.dto.supermarket.EntJoinMarketVO;
import cn.enn.ygego.sunny.user.dto.supermarket.SupermarketDetailsVO;
import cn.enn.ygego.sunny.user.dto.supermarket.SupermarketEnterPageVO;
import cn.enn.ygego.sunny.user.service.SupermarketEnterService;

/**
 * ClassName: SupermarketEnterServiceImpl	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-30 10:37 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-30 10:37      0.0.1             TODO
 */
@Service
public class SupermarketEnterServiceImpl implements SupermarketEnterService {

    /**
     * Description 
     * @param supmkEnterPage
     * @return 
     * @see cn.enn.ygego.sunny.user.service.SupermarketEnterService#getEnterApplyOfSupplierService(cn.enn.ygego.sunny.user.dto.supermarket.SupermarketEnterPageVO) 
     */

    @Override
    public List<EntJoinMarketVO> getEnterApplyOfSupplierService(SupermarketEnterPageVO supmkEnterPage) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Description 
     * @param supmkEnterPage
     * @return 
     * @see cn.enn.ygego.sunny.user.service.SupermarketEnterService#getEnterApplyPageService(cn.enn.ygego.sunny.user.dto.supermarket.SupermarketEnterPageVO) 
     */

    @Override
    public EntJoinMarketTotalVO getEnterApplyPageService(SupermarketEnterPageVO supmkEnterPage) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Description 
     * @param supmkEnterPage
     * @return 
     * @see cn.enn.ygego.sunny.user.service.SupermarketEnterService#getNoEnterMarketService(cn.enn.ygego.sunny.user.dto.supermarket.SupermarketEnterPageVO) 
     */

    @Override
    public List<EntJoinMarketVO> getNoEnterMarketService(SupermarketEnterPageVO supmkEnterPage) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Description 
     * @param supmkEnterPage
     * @return 
     * @see cn.enn.ygego.sunny.user.service.SupermarketEnterService#getNoEnterMarketPageService(cn.enn.ygego.sunny.user.dto.supermarket.SupermarketEnterPageVO) 
     */

    @Override
    public EntJoinMarketTotalVO getNoEnterMarketPageService(SupermarketEnterPageVO supmkEnterPage) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Description 
     * @param list
     * @return 
     * @see cn.enn.ygego.sunny.user.service.SupermarketEnterService#getEnterApplyDetailService(java.util.List) 
     */

    @Override
    public List<SupermarketDetailsVO> getEnterApplyDetailService(List<Integer> list) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Description 
     * @param list
     * @return 
     * @see cn.enn.ygego.sunny.user.service.SupermarketEnterService#sumbitEnterApplyService(java.util.List) 
     */

    @Override
    public Boolean insertEnterApplyService(List<Integer> list) {
        // TODO 查询超市表中的信息存储到超市申请表
        return null;
    }

}
