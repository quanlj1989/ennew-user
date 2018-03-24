/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.controller.factory;

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
import cn.enn.ygego.sunny.user.dto.vo.AuditFactoryDetailVO;
import cn.enn.ygego.sunny.user.dto.vo.ReturnResultVO;
import cn.enn.ygego.sunny.user.dto.vo.SupplierVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 验厂管理
 * ClassName: AuditFactoryController	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 15:35 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 15:35      0.0.1             TODO
 */
@RequestMapping("/audit/factory")
@RestController
@Api(value = "验厂管理", description = "验厂管理")
public class AuditFactoryController {

    /**
     * 查看验厂列表分页接口
     * 
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看验厂列表分页接口")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JsonResponse<PageDTO<SupplierVO>> list(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        PageDTO<SupplierVO> page = new PageDTO<>();
        ArrayList<SupplierVO> list = new ArrayList<SupplierVO>();
        // JMockData模拟生成随机数据
        SupplierVO supplierVO = JMockData.mock(SupplierVO.class);
        list.add(supplierVO);
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

    /**
     * 查看验厂详情接口
     * 
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看验厂详情")
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public JsonResponse<PageDTO<AuditFactoryDetailVO>> info(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        PageDTO<AuditFactoryDetailVO> page = new PageDTO<>();
        ArrayList<AuditFactoryDetailVO> list = new ArrayList<>();
        // JMockData模拟生成随机数据
        AuditFactoryDetailVO auditFactoryDetailVO = JMockData.mock(AuditFactoryDetailVO.class);
        list.add(auditFactoryDetailVO);
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

    /**
     * 修改验厂信息接口
     * 
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改验厂信息")
    @RequestMapping(value = "/updateInfo", method = RequestMethod.POST)
    public JsonResponse<ReturnResultVO> updateInfo(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        ReturnResultVO returnResultVO = JMockData.mock(ReturnResultVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(returnResultVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    /**
     * 审核验厂接口
     * 
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核验厂信息")
    @RequestMapping(value = "/audit", method = RequestMethod.POST)
    public JsonResponse<ReturnResultVO> audit(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        ReturnResultVO returnResultVO = JMockData.mock(ReturnResultVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(returnResultVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    /**
     * 提交验厂接口
     * 
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交验厂信息")
    @RequestMapping(value = "/commit", method = RequestMethod.POST)
    public JsonResponse<ReturnResultVO> commit(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        ReturnResultVO returnResultVO = JMockData.mock(ReturnResultVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(returnResultVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    /**
     * 下载验厂资料接口
     * 
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("下载验厂资料")
    @RequestMapping(value = "/download", method = RequestMethod.POST)
    public JsonResponse<ReturnResultVO> download(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        ReturnResultVO returnResultVO = JMockData.mock(ReturnResultVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(returnResultVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

}
