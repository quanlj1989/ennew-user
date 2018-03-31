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

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/user/supermarket/warehousemgr")
@Api(value = "仓库管理 ", description = "仓库管理 ")
public class WarehouseController {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("wms仓库数据同步接口")
    @RequestMapping(value = "/syncWarehouseInfoForWMS", method = { RequestMethod.POST })
    public JsonResponse syncWarehouseInfoForWMS(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询库房详情")
    @RequestMapping(value = "/getWarehouseDetail", method = { RequestMethod.POST })
    public JsonResponse getWarehouseDetail(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询所有库房列表（分页）")
    @RequestMapping(value = "/getWarehouseList", method = { RequestMethod.POST })
    public JsonResponse<PageDTO> getWarehouseList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("根据仓库id获取超市信息接口")
    @RequestMapping(value = "/getMarketByWarehouse", method = { RequestMethod.POST })
    public JsonResponse getMarketByWarehouse(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("wms客商数据同步接口")
    @RequestMapping(value = "/syncBusinessInfoForWMS", method = { RequestMethod.POST })
    public JsonResponse syncBusinessInfoForWMS(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("新增库房接口（批量新增）")
    @RequestMapping(value = "/addWarehouse", method = { RequestMethod.POST })
    public JsonResponse<PageDTO> addWarehouse(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0000000"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
}
