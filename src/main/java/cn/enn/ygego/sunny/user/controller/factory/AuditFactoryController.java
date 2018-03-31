/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.controller.factory;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Date;

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
import cn.enn.ygego.sunny.user.dto.factory.CategoryQueryVO;
import cn.enn.ygego.sunny.user.dto.factory.InspectFactoryApplyInfoVO;
import cn.enn.ygego.sunny.user.service.InspectFactoryApplyInfoService;

import com.alibaba.fastjson.JSONObject;

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
	 private static final Integer DEFALUT_PAGE_SIZE = 10;
	 private static final Integer DEFALUT_PAGE_NUM = 1;
	 Logger logger = LoggerFactory.getLogger(AuditFactoryController.class);
	 @Autowired
	 private InspectFactoryApplyInfoService inspectFactoryApplyInfoService;

    /**
     * @Description 供应航验厂类目列表查询
     * @author zhengyang
     * @date 2018年3月30日 下午8:31:01 
     * @param jsonRequest
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @RequestMapping(value = "/list", method = RequestMethod.POST)
	public JsonResponse<PageDTO<InspectFactoryApplyInfoVO>> list(
			@RequestBody JsonRequest<CategoryQueryVO> jsonRequest) {
		JsonResponse jsonResponse = new JsonResponse();
		CategoryQueryVO query = jsonRequest.getReqBody();
		// 分页参数校验
		if (query.getPageSize() == null) {
			query.setPageSize(DEFALUT_PAGE_SIZE);
		}
		if (query.getPageNum() == null) {
			query.setPageNum(DEFALUT_PAGE_NUM);
		}
		try {
			PageDTO<InspectFactoryApplyInfoVO> page = inspectFactoryApplyInfoService
					.getAuditCategoryList(query);
			jsonResponse.setRetCode("0000000");
			jsonResponse.setRspBody(page);
			jsonResponse.setRetDesc("查询列表数据成功!");
		} catch (Exception e) {
			logger.error("查询列表数据，入参：{},方法名：{},异常信息：{}",
					JSONObject.toJSONString(jsonRequest), "list",
					e.getMessage());
			jsonResponse.setRetCode("0000001"); // 操作码：操作成功
			jsonResponse.setRetDesc("接口调用失败！"); // 返回值信息
		}
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
    public JsonResponse info(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
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
    public JsonResponse updateInfo(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
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
    public JsonResponse audit(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
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
    public JsonResponse commit(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
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
    public JsonResponse download(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

}
