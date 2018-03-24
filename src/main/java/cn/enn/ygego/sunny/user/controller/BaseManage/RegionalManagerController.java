package cn.enn.ygego.sunny.user.controller.BaseManage;

import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base/regionalManager")
@Api(value="地域管理", description = "地域管理测试接口")
public class RegionalManagerController {

    Logger logger = LoggerFactory.getLogger(RegionalManagerController.class);

    @ApiOperation(value="查询地域列表")
    @RequestMapping(value = "/regionalList", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse regionalList() {

        return new JsonResponse();
    }

    @ApiOperation(value="查询地域信息")
    @RequestMapping(value = "/regionalInfo", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse regionalInfo(String provinceId) {
        //StringUtils.is;
        return new JsonResponse();


//        if(null == provinceId || provinceId.equals("")){
//            logger.info("getProvince参数为空");
//            return "1";
//        }
//        int provinceIntVal = 0;
//        try{
//            provinceIntVal = Integer.parseInt(provinceId);
//        }catch (Exception e) {
//            logger.error("转型异常",e.getMessage());
//            return "2";
//        }
//        //TODO: 根据省查询县and/or市
//
//        //返回json数组字符串
//        return  "";
    }

}
