/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.controller.gridSupermarket;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.supermarket.EntJoinMarketTotalVO;
import cn.enn.ygego.sunny.user.dto.supermarket.EntJoinMarketVO;
import cn.enn.ygego.sunny.user.dto.supermarket.SupermarketDetailsVO;
import cn.enn.ygego.sunny.user.dto.supermarket.SupermarketEnterPageVO;
import cn.enn.ygego.sunny.user.service.SupermarketEnterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ClassName: SupermarketEnterController	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-28 20:15 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-28 20:15      0.0.1             TODO
 */
@RestController
@RequestMapping(value = "/user/supermarket/marketEntermgr")
@Api(value = "超市入驻管理", description = "超市入驻管理")
public class SupermarketEnterController {

    Logger logger = LoggerFactory.getLogger(SupermarketEnterController.class);

    @Autowired
    private SupermarketEnterService supermarketEnterServiceImpl;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("入驻申请详情页")
    @RequestMapping(value = "/getEnterApplyDetail", method = { RequestMethod.POST })
    public JsonResponse<List<SupermarketDetailsVO>> getEnterApplyDetail(
            @RequestBody JsonRequest<List<Integer>> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        List<Integer> list = jsonRequest.getReqBody();

        try {
            List<SupermarketDetailsVO> enterApplyDetail = supermarketEnterServiceImpl.getEnterApplyDetailService(list);
            if (null != enterApplyDetail && enterApplyDetail.size() > 0) {
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("成功");
                jsonResponse.setRspBody(enterApplyDetail);
                jsonResponse.setTimestamp(new Date());
            } else {
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("查询不到数据");
                jsonResponse.setTimestamp(new Date());
            }
        } catch (Exception e) {
            logger.error("入驻申请详情页错误！" + e.getMessage());
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(e.getMessage());
            jsonResponse.setTimestamp(new Date());
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据供应商获取入驻信息列表（分页）")
    @RequestMapping(value = "/getEnterApplyOfSupplier", method = { RequestMethod.POST })
    public JsonResponse<PageDTO<EntJoinMarketVO>> getEnterApplyOfSupplier(
            @RequestBody JsonRequest<SupermarketEnterPageVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        SupermarketEnterPageVO reqBody = jsonRequest.getReqBody();
        PageDTO<EntJoinMarketVO> page = new PageDTO<>(reqBody.getPageNum(), reqBody.getPageSize());
        reqBody.setStartRow(page.getStartRow());
        try {
            EntJoinMarketTotalVO enterApplyTotal = supermarketEnterServiceImpl.getEnterApplyPageService(reqBody);
            if (enterApplyTotal != null && enterApplyTotal.getTotal() > 0) {
                page.setResultData(enterApplyTotal.getEntJoinMarket());
                page.setTotal(enterApplyTotal.getTotal());
                jsonResponse.setRetCode("0000000"); // 操作码：操作成功
                jsonResponse.setRetDesc("成功"); // 返回值信息
                jsonResponse.setRspBody(page);
                jsonResponse.setTimestamp(new Date()); // 接口响应的时间
            } else {
                jsonResponse.setRetCode("0000000"); // 操作码：操作成功
                jsonResponse.setRetDesc("查询不到数据"); // 返回值信息
                jsonResponse.setTimestamp(new Date()); // 接口响应的时间
            }
        } catch (Exception e) {
            logger.error("根据供应商获取入驻信息列表（分页）错误！" + e.getMessage());
            jsonResponse.setRetCode("0100000"); // 操作码：操作成功
            jsonResponse.setRetDesc(e.getMessage()); // 返回值信息
            jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据供应商获取所有未入驻超市列表（分页）")
    @RequestMapping(value = "/getNoEnterMarketOfSupplier", method = { RequestMethod.POST })
    public JsonResponse<PageDTO<EntJoinMarketVO>> getNoEnterMarketOfSupplier(
            @RequestBody JsonRequest<SupermarketEnterPageVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        SupermarketEnterPageVO reqBody = jsonRequest.getReqBody();
        PageDTO<EntJoinMarketVO> page = new PageDTO<>(reqBody.getPageNum(), reqBody.getPageSize());
        reqBody.setStartRow(page.getStartRow());
        try {
            EntJoinMarketTotalVO noEnterMarketTotal = supermarketEnterServiceImpl.getNoEnterMarketPageService(reqBody);
            if (noEnterMarketTotal != null && noEnterMarketTotal.getTotal() > 0) {
                page.setResultData(noEnterMarketTotal.getEntJoinMarket());
                page.setTotal(noEnterMarketTotal.getTotal());
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("成功");
                jsonResponse.setRspBody(page);
                jsonResponse.setTimestamp(new Date());
            } else {
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("查询不到数据");
                jsonResponse.setTimestamp(new Date());
            }
        } catch (Exception e) {
            logger.error("根据供应商获取所有未入驻超市列表（分页）错误！" + e.getMessage());
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(e.getMessage());
            jsonResponse.setTimestamp(new Date());
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交入驻网格超市接口(批量)")
    @RequestMapping(value = "/sumbitEnterApply", method = { RequestMethod.POST })
    public JsonResponse sumbitEnterApply(@RequestBody JsonRequest<List<Integer>> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        List<Integer> reqBody = jsonRequest.getReqBody();
        try {
            Boolean result = supermarketEnterServiceImpl.insertEnterApplyService(reqBody);
            if (true == result) {
                jsonResponse.setRetCode("0000000"); // 操作码：操作成功
                jsonResponse.setRetDesc("成功"); // 返回值信息
                jsonResponse.setTimestamp(new Date()); // 接口响应的时间
            } else {
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("提交失败！");
                jsonResponse.setTimestamp(new Date());
            }
        } catch (Exception e) {
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc("提交失败！");
            jsonResponse.setTimestamp(new Date());
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据加盟商获取所有入驻超市")
    @RequestMapping(value = "/getAllMarketOfAlliance", method = { RequestMethod.POST })
    public JsonResponse getAllMarketOfAlliance(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据超市id获取所有入驻供应商")
    @RequestMapping(value = "/getSupplierOfMarket", method = { RequestMethod.POST })
    public JsonResponse getSupplierOfMarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据加盟商获取所有审核入驻申请列表")
    @RequestMapping(value = "/getAllEnterApplyOfAlliance", method = { RequestMethod.POST })
    public JsonResponse getAllEnterApplyOfAlliance(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核供应商准入接口")
    @RequestMapping(value = "/checkSupplierEnter", method = { RequestMethod.POST })
    public JsonResponse checkSupplierEnter(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
}
