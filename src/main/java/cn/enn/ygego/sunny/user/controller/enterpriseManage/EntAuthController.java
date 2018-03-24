/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.controller.enterpriseManage;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.JsonResult;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.EntCertApplyDTO;
import cn.enn.ygego.sunny.user.dto.EntCertInfoDTO;
import cn.enn.ygego.sunny.user.dto.EntCustInfoDTO;
import com.github.jsonzou.jmockdata.JMockData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName: EntAuthController
 * Description:
 * Author: lizan
 * Date: 2018/3/20 13:51
 * History:
 * <author>          <time>          <version>          <desc>
 * lizan           2018/3/20 13:51   0.0.1              企业认证接口
 */
@RestController
@RequestMapping("/enterprise")
@Api(value = "企业认证接口", description = "企业认证接口")
public class EntAuthController {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交企业认证接口")
    @RequestMapping(value = "/createAuth", method = { RequestMethod.POST})
    public JsonResponse createAuth(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业详情")
    @RequestMapping(value = "/entInfo", method = { RequestMethod.POST})
    public JsonResponse<EntCustInfoDTO> entInfo(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        EntCustInfoDTO entCustInfoDTO = JMockData.mock(EntCustInfoDTO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(entCustInfoDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业认证详情接口")
    @RequestMapping(value = "/entAuthInfo", method = { RequestMethod.POST})
    public JsonResponse entAuthInfo(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        EntCertInfoDTO entCertInfoDTO = JMockData.mock(EntCertInfoDTO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(entCertInfoDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("导出企业认证列表Excel接口")
    @RequestMapping(value = "/expEntAuthList", method = { RequestMethod.POST})
    public JsonResponse expEntAuthList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("更新用户质量接入标识接口")
    @RequestMapping(value = "/updateQualityFlag", method = { RequestMethod.POST})
    public JsonResponse updateQualityFlag(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    /**
     * 个人企业列表
     * 平台企业列表
     * @param jsonRequest
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业列表接口")
    @RequestMapping(value = "/entList", method = { RequestMethod.POST})
    public JsonResponse<PageDTO<EntCustInfoDTO>> entList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        PageDTO pageDTO = new PageDTO(); // 返回的PageDTO对象
        List<EntCustInfoDTO> list = new ArrayList<EntCustInfoDTO>();
        // JMockData模拟生成随机数据
        EntCustInfoDTO entCustInfoDTO = JMockData.mock(EntCustInfoDTO.class);
        list.add(entCustInfoDTO); // 将对象保存到list中
        pageDTO.setResultData(list);// 将结果保存到page对象中
        pageDTO.setPageNum(0); // 第0页
        pageDTO.setPageSize(10); // 每页显示10条
        pageDTO.setTotal(1); //共1条
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(pageDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核企业认证接口")
    @RequestMapping(value = "/updateEntAuth", method = { RequestMethod.POST})
    public JsonResponse updateEntAuth(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    /**
     * 个人查看企业认证列表
     * 平台查看企业认证列表
     * @param jsonRequest
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业认证列表接口")
    @RequestMapping(value = "/entAuthList", method = { RequestMethod.POST})
    public JsonResponse<PageDTO<EntCertApplyDTO>> entAuthList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        PageDTO pageDTO = new PageDTO(); // 返回的PageDTO对象
        List<EntCertApplyDTO> list = new ArrayList<EntCertApplyDTO>();
        // JMockData模拟生成随机数据
        EntCertApplyDTO entCertApplyDTO = JMockData.mock(EntCertApplyDTO.class);
        list.add(entCertApplyDTO); // 将对象保存到list中
        pageDTO.setResultData(list);// 将结果保存到page对象中
        pageDTO.setPageNum(0); // 第0页
        pageDTO.setPageSize(10); // 每页显示10条
        pageDTO.setTotal(1); //共1条
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(pageDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间

        return jsonResponse;
    }

}
