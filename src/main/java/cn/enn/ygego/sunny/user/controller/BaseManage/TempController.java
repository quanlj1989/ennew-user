package cn.enn.ygego.sunny.user.controller.BaseManage;

import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base/temp")
@Api(value="基础模板配置管理", description = "基础模板配置管理")
public class TempController {
    Logger logger = LoggerFactory.getLogger(TempController.class);

    @ApiOperation(value="新建基础模板配置接口")
    @RequestMapping("/createTempleInfo")
    @ResponseBody
    public JsonResponse createTempleInfo() {//参数问题反馈对象
        return new JsonResponse();
    }
    @ApiOperation(value="修改基础模板配置接口")
    @RequestMapping("/modifyTempleList")
    @ResponseBody
    public JsonResponse modifyTempleList() {//参数问题反馈对象
        return new JsonResponse();
    }

    @ApiOperation(value="查询基础模板配置列表接口")
    @RequestMapping("/queryTempleList")
    @ResponseBody
    public JsonResponse queryTempleList() {
        //TODO：获取所有反馈列表

        return new JsonResponse();
    }

    @ApiOperation(value="查询基础模板配置接口")
    @RequestMapping("/queryTempleInfo") //Information details
    @ResponseBody
    public JsonResponse queryTempleInfo() {
        //TODO：获取反馈详细信息
        return new JsonResponse();
    }
    
}
