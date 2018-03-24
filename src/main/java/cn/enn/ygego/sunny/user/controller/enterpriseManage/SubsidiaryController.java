package cn.enn.ygego.sunny.user.controller.enterpriseManage;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.EntCustInfoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 子公司授权接口
 * ClassName: SubsidiaryController	
 * Description 
 * Author puanl
 * Date 2018年3月17日 下午5:46:03 
 * History: 
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
@RequestMapping("user/enterprise/subsidiary")
@Api(value = "子公司授权接口", description = "子公司授权接口")
public class SubsidiaryController {
    
    @RequestMapping(value="/detail", method = { RequestMethod.POST})
    @ApiOperation("授权详情查询")
    @ResponseBody
    public JsonResponse<EntCustInfoDTO> detail(@RequestBody JsonRequest request){
        
        return new JsonResponse();
    }
    
    @RequestMapping(value="/permissionAgree", method = { RequestMethod.POST})
    @ApiOperation("子公司同意授权")
    @ResponseBody
    public JsonResponse<Boolean> permissionAgree(@RequestBody JsonRequest request){
        
        return new JsonResponse();
    }
    
    @RequestMapping(value="/permissionSet", method = { RequestMethod.POST})
    @ApiOperation("父公司授权子公司权限")
    @ResponseBody
    public JsonResponse<Boolean> permissionSet(@RequestBody JsonRequest request){
        
        return new JsonResponse();
    }
    
    @RequestMapping(value="/join", method = { RequestMethod.POST})
    @ApiOperation("添加子公司")
    @ResponseBody
    public JsonResponse<Boolean> join(@RequestBody JsonRequest request){
        
        return new JsonResponse();
    }
    
    @RequestMapping(value="/getList", method = { RequestMethod.POST})
    @ApiOperation("企业组织管理子公司列表")
    @ResponseBody
    public JsonResponse<PageDTO<EntCustInfoDTO>> getList(@RequestBody JsonRequest request){
        
        return new JsonResponse();
    }

}
