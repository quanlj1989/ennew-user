/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.controller.gridSupermarket;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ClassName: SupermarketAllianceController	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-28 20:04 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-28 20:04      0.0.1             TODO
 */
@RestController
@RequestMapping(value = "/user/supermarket/marketAlliancemgr")
@Api(value = "超市加盟管理 ", description = "超市加盟管理 ")
public class SupermarketAllianceController {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("获取所有超市加盟商的接口")
    @RequestMapping(value = "/getAllMarketAlliance", method = { RequestMethod.POST })
    public JsonResponse getAllMarketAlliance(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核加盟超市申请-超市信息接口（批量）")
    @RequestMapping(value = "/getMarketInfoOfAllianceApply", method = { RequestMethod.POST })
    public JsonResponse getMarketInfoOfAllianceApply(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核加盟超市申请-寄售商品类目接口（批量）")
    @RequestMapping(value = "/getGoodsCategoriesOfAllianceApply", method = { RequestMethod.POST })
    public JsonResponse getGoodsCategoriesOfAllianceApply(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核加盟超市-自营品牌接口（批量）")
    @RequestMapping(value = "/getGoodsBrandsOfAllianceApply", method = { RequestMethod.POST })
    public JsonResponse getGoodsBrandsOfAllianceApply(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询所有加盟审核信息状态列表")
    @RequestMapping(value = "/getAllianceApplyStatus", method = { RequestMethod.POST })
    public JsonResponse getAllianceApplyStatus(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询所有加盟申请信息列表（分页）")
    @RequestMapping(value = "/getAllianceApplyList", method = { RequestMethod.POST })
    public JsonResponse getAllianceApplyList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交准售类目资料接口")
    @RequestMapping(value = "/sumbitGoodsCategoriesOfAllianceApply", method = { RequestMethod.POST })
    public JsonResponse sumbitGoodsCategoriesOfAllianceApply(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交准售品牌资质接口")
    @RequestMapping(value = "/sumbitGoodsBrandsOfAllianceApply", method = { RequestMethod.POST })
    public JsonResponse sumbitGoodsBrandsOfAllianceApply(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交加盟申请信息接口")
    @RequestMapping(value = "/sumbitAllianceApply", method = { RequestMethod.POST })
    public JsonResponse sumbitAllianceApply(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
}
