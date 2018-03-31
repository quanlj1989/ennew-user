/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.supermarket.EntJoinMarketTotalVO;
import cn.enn.ygego.sunny.user.dto.supermarket.EntJoinMarketVO;
import cn.enn.ygego.sunny.user.dto.supermarket.SupermarketDetailsVO;
import cn.enn.ygego.sunny.user.dto.supermarket.SupermarketEnterPageVO;

/**
 * 超市入驻管理
 * ClassName: SupermarketEnterService	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-30 10:02 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-30 10:02      0.0.1             TODO
 */

public interface SupermarketEnterService {

    /**
     * 获取入驻信息列表（分页）Service
     * @Description TODO
     * @author zhangjiaqi
     * @date 2018-03-30 10:36
     * @param checkEnterPage
     * @return
     */
    List<EntJoinMarketVO> getEnterApplyOfSupplierService(SupermarketEnterPageVO supmkEnterPage);

    /**
     * 获取入驻信息列表（分页）及数据总数
     * @Description TODO
     * @author zhangjiaqi
     * @date 2018-03-30 15:58
     * @param supmkEnterPage
     * @return
     */
    EntJoinMarketTotalVO getEnterApplyPageService(SupermarketEnterPageVO supmkEnterPage);

    /**
     * 获取未入驻信息列表（分页）Service
     * @Description TODO
     * @author zhangjiaqi
     * @date 2018-03-30 17:11
     * @param supmkEnterPage
     * @return
     */
    List<EntJoinMarketVO> getNoEnterMarketService(SupermarketEnterPageVO supmkEnterPage);

    /**
     * 获取未入驻信息列表（分页）及数据总数
     * @Description TODO
     * @author zhangjiaqi
     * @date 2018-03-30 17:12
     * @param supmkEnterPage
     * @return
     */
    EntJoinMarketTotalVO getNoEnterMarketPageService(SupermarketEnterPageVO supmkEnterPage);

    /**
     * 入驻申请详情
     * @Description TODO
     * @author zhangjiaqi
     * @date 2018-03-30 19:58
     * @param list
     * @return
     */
    List<SupermarketDetailsVO> getEnterApplyDetailService(List<Integer> list);

    /**
     * 提交入驻网格超市接口(批量)
     * @Description TODO
     * @author zhangjiaqi
     * @date 2018-03-30 21:06
     * @param list
     * @return
     */
    Boolean insertEnterApplyService(List<Integer> list);

}
