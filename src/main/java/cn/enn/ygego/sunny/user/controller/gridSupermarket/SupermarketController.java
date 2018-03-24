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
import cn.enn.ygego.sunny.user.dto.vo.ReturnResultVO;
import cn.enn.ygego.sunny.user.dto.vo.SupermarketDetailVO;
import cn.enn.ygego.sunny.user.dto.vo.SupermarketVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

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
@RequestMapping(value = "/user/supermarketmgr/supermarket")
@Api(value = "超市管理", description = "超市管理")
public class SupermarketController {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核超市允许入驻接口")
    @RequestMapping(value = "/check", method = { RequestMethod.POST })
    public JsonResponse checkSupermarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改超市仓储接口")
    @RequestMapping(value = "/alter", method = { RequestMethod.POST })
    public JsonResponse alterSupermarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("添加超市仓储接口")
    @RequestMapping(value = "/add", method = { RequestMethod.POST })
    public JsonResponse<ReturnResultVO> addSupermarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        ReturnResultVO returnResultVO = JMockData.mock(ReturnResultVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(returnResultVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询超市仓储列表接口")
    @RequestMapping(value = "/listquery", method = { RequestMethod.POST })
    public JsonResponse<PageDTO<SupermarketVO>> listQuerySupermarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        SupermarketVO supermarketVO = JMockData.mock(SupermarketVO.class);
        PageDTO<SupermarketVO> page = new PageDTO<>();
        ArrayList<SupermarketVO> list = new ArrayList<>();
        list.add(supermarketVO);
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

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询超市仓储信息详情接口")
    @RequestMapping(value = "/detailquery", method = { RequestMethod.POST })
    public JsonResponse<SupermarketDetailVO> detailQuerySupermarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        SupermarketDetailVO supermarketDetailVO = JMockData.mock(SupermarketDetailVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(supermarketDetailVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
}
