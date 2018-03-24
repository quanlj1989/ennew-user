package cn.enn.ygego.sunny.user.controller.AuthManage;


import cn.enn.ygego.sunny.core.web.JsonResult;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/Auth")
@Api(value = "权限管理", description = "权限管理")
public class AuthUserManageController {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("添加角色接口")
    @RequestMapping(value = "/createRoleInfo", method = { RequestMethod.POST})
    public JsonResponse createRoleInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询角色接口")
    @RequestMapping(value = "/queryRoleInfo", method = { RequestMethod.POST})
    public JsonResponse queryRoleInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询角色列表接口")
    @RequestMapping(value = "/queryRoleList", method = { RequestMethod.POST})
    public JsonResponse queryRoleList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改角色接口")
    @RequestMapping(value = "/modifyRoleInfo", method = { RequestMethod.POST})
    public JsonResponse modifyRoleInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("添加授权接口")
    @RequestMapping(value = "/createAuthOptInfo", method = { RequestMethod.POST})
    public JsonResponse createAuthOptInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改授权接口")
    @RequestMapping(value = "/modifyAuthOptInfo", method = { RequestMethod.POST})
    public JsonResponse modifyAuthOptInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("添加人员接口")
    @RequestMapping(value = "/createAuthAcctInfo", method = { RequestMethod.POST})
    public JsonResponse createAuthAcctInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看人员详情接口")
    @RequestMapping(value = "/queryAuthAcctInfo", method = { RequestMethod.POST})
    public JsonResponse queryAuthAcctInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看功能树列表接口")
    @RequestMapping(value = "/queryUserAuthRoleList", method = { RequestMethod.POST})
    public JsonResponse queryUserAuthRoleList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看人员信息列表接口")
    @RequestMapping(value = "/queryAuthAcctList", method = { RequestMethod.POST})
    public JsonResponse queryAuthAcctList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询用户所有权限列表接口（登录）")
    @RequestMapping(value = "/queryUserAllAuthRoleList", method = { RequestMethod.POST})
    public JsonResponse queryUserAllAuthRoleList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }


}
