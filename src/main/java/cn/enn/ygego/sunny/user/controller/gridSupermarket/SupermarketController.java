/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.controller.gridSupermarket;

import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.utils.HTTPUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 超市管理
 * ClassName: SupermarketController	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 19:18 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 19:18      0.0.1             TODO
 */
@RestController
@RequestMapping(value = "/user/supermarket/marketmgr")
@Api(value = "超市管理", description = "超市管理")
public class SupermarketController {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据城市获取所有超市接口")
    @RequestMapping(value = "/getMarketByCity", method = { RequestMethod.POST })
    public JsonResponse getMarketbyCity(@RequestBody JsonRequest<Map> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        Map reqBody = jsonRequest.getReqBody();
        String result = HTTPUtil.get("http://www.ennew.alpha/business/warehouse/get/warehouseByRegionCode",reqBody);
        JSONObject jsonObject = JSON.parseObject(result);
        Object results = jsonObject.get("results");
        jsonResponse.setRspBody(results);
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("获取根据城市聚合的所有超市")
    @RequestMapping(value = "/getMarketOfCity", method = { RequestMethod.POST })
    public JsonResponse getMarketOfCity(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        String result = HTTPUtil.get("http://www.ennew.alpha/business/warehouse/area/list", new HashMap<String, String>());
        JSONObject jsonObject = JSON.parseObject(result);
        Object results = jsonObject.get("results");
        jsonResponse.setRspBody(results);
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据IP定位当前城市接口")
    @RequestMapping(value = "/getCityByIP", method = { RequestMethod.POST })
    public JsonResponse getCityByIP(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        String result = HTTPUtil.get("http://www.ennew.alpha/business/warehouse/area/info", new HashMap<String, String>());
        JSONObject jsonObject = JSON.parseObject(result);
        Object results = jsonObject.get("results");
        jsonResponse.setRspBody(results);
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询超市信息详情接口")
    @RequestMapping(value = "/getMarketDetail", method = { RequestMethod.POST })
    public JsonResponse getMarketDetail(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("网格超市基本信息接口")
    @RequestMapping(value = "/getMarketInfo", method = { RequestMethod.POST })
    public JsonResponse getMarketInfo(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据当前IP定位省级单位")
    @RequestMapping(value = "/getProvinceByIp", method = { RequestMethod.POST })
    public JsonResponse getProvinceByIp(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询超市列表接口")
    @RequestMapping(value = "/getMarketList", method = { RequestMethod.POST })
    public JsonResponse getMarketList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("超市设置结算商的接口")
    @RequestMapping(value = "/setMarketSettlement", method = { RequestMethod.POST })
    public JsonResponse setMarketSettlement(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("超市设置收费标准的接口")
    @RequestMapping(value = "/setMarketCostType", method = { RequestMethod.POST })
    public JsonResponse setMarketCostType(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("获取仓储收费类型接口")
    @RequestMapping(value = "/getCostType", method = { RequestMethod.POST })
    public JsonResponse getCostType(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据超市获取仓储服务费用接口")
    @RequestMapping(value = "/getMarketCost", method = { RequestMethod.POST })
    public JsonResponse getMarketCost(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据超市id获取超市信息和可售类目信息（批量）")
    @RequestMapping(value = "/getMarketByIds", method = { RequestMethod.POST })
    public JsonResponse getMarketByIds(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("添加超市接口（批量）")
    @RequestMapping(value = "/addMarket", method = { RequestMethod.POST })
    public JsonResponse addMarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("获取当前超市所有入驻渠道")
    @RequestMapping(value = "/getChannelOfMarket", method = { RequestMethod.POST })
    public JsonResponse getChannelOfMarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据加盟商获取所有超市接口（分页）")
    @RequestMapping(value = "/getMarketOfAlliance", method = { RequestMethod.POST })
    public JsonResponse getMarketOfAlliance(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据省级单位标识获取当前省份所有网格超市")
    @RequestMapping(value = "/getMarketByProvince", method = { RequestMethod.POST })
    public JsonResponse getMarketByProvince(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询所有超市列表接口(不分页)")
    @RequestMapping(value = "/getMarketAllList", method = { RequestMethod.POST })
    public JsonResponse getMarketAllList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据超市名称模糊查询超市id集合")
    @RequestMapping(value = "/getMarketIds", method = { RequestMethod.POST })
    public JsonResponse getMarketIds(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象

        return jsonResponse;
    }

}
