/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.controller.gridSupermarket;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.jsonzou.jmockdata.JMockData;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.vo.WarehouseDetailVO;
import cn.enn.ygego.sunny.user.dto.vo.WarehouseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/user/warehousemgr/warehouse")
@Api(value = "仓库管理 ", description = "仓库管理 ")
public class WarehouseController {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("wms仓库数据同步接口")
    @RequestMapping(value = "/syncdatas", method = { RequestMethod.POST })
    public JsonResponse syncDatasWarehouse(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询仓库详情信息接口")
    @RequestMapping(value = "/detailquery", method = { RequestMethod.POST })
    public JsonResponse<WarehouseDetailVO> detailQueryWarehouse(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        WarehouseDetailVO warehouseDetailVO = JMockData.mock(WarehouseDetailVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(warehouseDetailVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询仓库列表接口")
    @RequestMapping(value = "/listquery", method = { RequestMethod.POST })
    public JsonResponse<PageDTO<WarehouseVO>> listQueryWarehouse(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        WarehouseVO warehouseVO = JMockData.mock(WarehouseVO.class);
        PageDTO<WarehouseVO> page = new PageDTO<>();
        ArrayList<WarehouseVO> list = new ArrayList<>();
        list.add(warehouseVO);
        page.setResultData(list);// 将结果保存到page对象中
        page.setPageNum(0); // 第0页
        page.setPageSize(10); // 每页显示10条
        page.setTotal(1); // 共1条
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(page); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
}
