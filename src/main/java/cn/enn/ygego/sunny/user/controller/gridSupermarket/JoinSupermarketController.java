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
import cn.enn.ygego.sunny.user.dto.vo.ChannelSupermarketVO;
import cn.enn.ygego.sunny.user.dto.vo.ReturnResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/user/joinsupermarketmgr/joinsupermarket")
@Api(value = "加盟超市管理 ", description = "加盟超市管理 ")
public class JoinSupermarketController {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("申请加盟超市接口")
    @RequestMapping(value = "/joinin", method = { RequestMethod.POST })
    public JsonResponse<ReturnResultVO> joinInSupermarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        ReturnResultVO returnResultVO = JMockData.mock(ReturnResultVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(returnResultVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看加盟超市信息详情接口")
    @RequestMapping(value = "/detailquery", method = { RequestMethod.POST })
    public JsonResponse detailQuerySupermarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看加盟超市信息列表")
    @RequestMapping(value = "/listquery", method = { RequestMethod.POST })
    public JsonResponse<PageDTO<ChannelSupermarketVO>> listQuerySupermarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        ChannelSupermarketVO channelSupermarketVO = JMockData.mock(ChannelSupermarketVO.class);
        PageDTO<ChannelSupermarketVO> page = new PageDTO<>();
        ArrayList<ChannelSupermarketVO> list = new ArrayList<>();
        list.add(channelSupermarketVO);
        page.setResultData(list);
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
    @ApiOperation("修改加盟超市信息列表")
    @RequestMapping(value = "/alter", method = { RequestMethod.POST })
    public JsonResponse alterSupermarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }
}
