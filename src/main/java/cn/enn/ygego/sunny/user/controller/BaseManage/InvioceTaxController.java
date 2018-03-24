package cn.enn.ygego.sunny.user.controller.BaseManage;

import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base/tax")
@Api(value="发票税率管理", description = "发票税率管理")
public class InvioceTaxController {
    Logger logger = LoggerFactory.getLogger(InvioceTaxController.class);

    @ApiOperation(value="新建发票税率接口")
    @RequestMapping("/createInvoiceTax")
    @ResponseBody
    public JsonResponse createInvoiceTax() {//参数问题反馈对象
        return new JsonResponse();
    }
    @ApiOperation(value="查询发票税率信息接口")
    @RequestMapping("/queryInvoiceTaxInfo")
    @ResponseBody
    public JsonResponse queryInvoiceTaxInfo() {//参数问题反馈对象
        return new JsonResponse();
    }

    @ApiOperation(value="查询发票税率列表")
    @RequestMapping("/queryInvoiceTaxList")
    @ResponseBody
    public JsonResponse queryInvoiceTaxList() {
        //TODO：获取所有反馈列表

        return new JsonResponse();
    }

    @ApiOperation(value="修改发票税率信息")
    @RequestMapping("/modifyInvoiceTax") //Information details
    @ResponseBody
    public JsonResponse modifyInvoiceTax() {
        //TODO：获取反馈详细信息
        return new JsonResponse();
    }

}
