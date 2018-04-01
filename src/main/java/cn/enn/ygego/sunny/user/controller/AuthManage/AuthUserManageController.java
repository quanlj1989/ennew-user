package cn.enn.ygego.sunny.user.controller.AuthManage;


import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.JsonResult;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.common.ResponseCodeEnum;
import cn.enn.ygego.sunny.user.dto.AcctInfoDTO;
import cn.enn.ygego.sunny.user.dto.EntCertApplyDTO;
import cn.enn.ygego.sunny.user.dto.RoleInfoDTO;
import cn.enn.ygego.sunny.user.dto.vo.AcctInfoRoleVO;
import cn.enn.ygego.sunny.user.dto.vo.AppListVO;
import cn.enn.ygego.sunny.user.dto.vo.AuthRoleTreeVO;
import cn.enn.ygego.sunny.user.dto.vo.OperLoginVO;
import cn.enn.ygego.sunny.user.model.AcctInfo;
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

@RestController
@RequestMapping("/user/Auth")
@Api(value = "权限管理", description = "权限管理")
public class AuthUserManageController {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("添加角色接口")
    @RequestMapping(value = "/createRoleInfo", method = { RequestMethod.POST})
    public JsonResponse createRoleInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限添加角色接口
        //TODO 添加渠道角色关系信息
        jsonResponse.setRetDesc("成功");
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询角色接口")
    @RequestMapping(value = "/queryRoleInfo", method = { RequestMethod.POST})
    public JsonResponse<RoleInfoDTO> queryRoleInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限查询角色信息接口
        RoleInfoDTO roleInfoDTO=new RoleInfoDTO();
        roleInfoDTO.setRoleTitle("订单管理");
        roleInfoDTO.setRoleDesc("管理订单信息");
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        roleInfoDTO.setRoleState(1);
        jsonResponse.setRspBody(roleInfoDTO);
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询角色列表接口")
    @RequestMapping(value = "/queryRoleList", method = { RequestMethod.POST})
    public JsonResponse<PageDTO<RoleInfoDTO>> queryRoleList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限查询角色列表接口
        PageDTO<RoleInfoDTO> pageDTO=new PageDTO<>();
        List<RoleInfoDTO> list = new ArrayList<RoleInfoDTO>();
        // JMockData模拟生成随机数据
        RoleInfoDTO roleInfoDTO = JMockData.mock(RoleInfoDTO.class);
        list.add(roleInfoDTO); // 将对象保存到list中
        pageDTO.setResultData(list);// 将结果保存到page对象中
        pageDTO.setPageNum(0); // 第0页
        pageDTO.setPageSize(10); // 每页显示10条
        pageDTO.setTotal(1); //共1条
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode()); // 操作码：操作成功
        jsonResponse.setRspBody(pageDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改角色接口")
    @RequestMapping(value = "/modifyRoleInfo", method = { RequestMethod.POST})
    public JsonResponse modifyRoleInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限
        jsonResponse.setRetDesc("成功");
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("添加授权接口")
    @RequestMapping(value = "/createAuthOptInfo", method = { RequestMethod.POST})
    public JsonResponse createAuthOptInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限
        jsonResponse.setRetDesc("成功");
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改授权接口")
    @RequestMapping(value = "/modifyAuthOptInfo", method = { RequestMethod.POST})
    public JsonResponse modifyAuthOptInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限
        jsonResponse.setRetDesc("成功");
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("添加人员接口")
    @RequestMapping(value = "/createAuthAcctInfo", method = { RequestMethod.POST})
    public JsonResponse createAuthAcctInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        AcctInfoDTO acctInfoDTO=new AcctInfoDTO();
        //TODO 添加三级权限账号信息表
        //TODO 添加用户账户信息表
        jsonResponse.setRetDesc("成功");
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改人员接口")
    @RequestMapping(value = "/modifyAuthAcctInfo", method = { RequestMethod.POST})
    public JsonResponse modifyAuthAcctInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        AcctInfoDTO acctInfoDTO=new AcctInfoDTO();
        //TODO 修改三级权限账号信息表
        //TODO 修改用户账户信息表
        jsonResponse.setRetDesc("成功");
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看人员详情接口")
    @RequestMapping(value = "/queryAuthAcctInfo", method = { RequestMethod.POST})
    public JsonResponse<AcctInfoDTO> queryAuthAcctInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调查看人员详情接口
        AcctInfoDTO acctInfoDTO=new AcctInfoDTO();
        acctInfoDTO.setAcctName("wangfang");
        acctInfoDTO.setAcctCode("10080");
        acctInfoDTO.setEntId(10001l);
        acctInfoDTO.setEmail("1479809991");
        jsonResponse.setRspBody(acctInfoDTO);
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看人员信息列表接口")
    @RequestMapping(value = "/queryAuthAcctList", method = { RequestMethod.POST})
    public JsonResponse<PageDTO<AcctInfoRoleVO>> queryAuthAcctList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        PageDTO<AcctInfoRoleVO> pageDTO=new PageDTO<>();
        //TODO 调查看人员信息列表接口
        List<AcctInfoRoleVO> list = new ArrayList<AcctInfoRoleVO>();
        // JMockData模拟生成随机数据
        AcctInfoRoleVO acctInfoRoleVO = JMockData.mock(AcctInfoRoleVO.class);
        list.add(acctInfoRoleVO); // 将对象保存到list中
        pageDTO.setResultData(list);// 将结果保存到page对象中
        pageDTO.setPageNum(0); // 第0页
        pageDTO.setPageSize(10); // 每页显示10条
        pageDTO.setTotal(1); //共1条
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        jsonResponse.setRspBody(pageDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看功能树列表接口")
    @RequestMapping(value = "/queryUserAuthRoleList", method = { RequestMethod.POST})
    public JsonResponse<List<AuthRoleTreeVO>> queryUserAuthRoleList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        List<AuthRoleTreeVO> authRoleTreeVOS=new ArrayList<>();
        AuthRoleTreeVO authRoleTreeVO=new AuthRoleTreeVO();
        authRoleTreeVO.setEntName("恩牛网");
        authRoleTreeVO.setMemberId(1l);
        authRoleTreeVOS.add(authRoleTreeVO);

        List<AppListVO> appListVOS=new ArrayList<>();
        AppListVO appListVO=new AppListVO();
        appListVO.setAppId(2l);
        appListVOS.add(appListVO);
        authRoleTreeVO.setAppListVOList(appListVOS);
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        jsonResponse.setRspBody(authRoleTreeVOS);
        //TODO 调三级权限
        return jsonResponse;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询用户所有权限列表接口（登录）")
    @RequestMapping(value = "/queryUserAllAuthRoleList", method = { RequestMethod.POST})
    public JsonResponse<List<OperLoginVO>> queryUserAllAuthRoleList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限
        List<OperLoginVO> operLoginVOS=new ArrayList<>();
        OperLoginVO operLoginVO=new OperLoginVO();
        operLoginVO.setOperId(10001l);
        operLoginVO.setOperTitle("订单管理");
        OperLoginVO operLoginVO1=new OperLoginVO();
        operLoginVO1.setOperId(10002l);
        operLoginVO1.setOperTitle("用户管理");
        operLoginVOS.add(operLoginVO);
        operLoginVOS.add(operLoginVO1);
        jsonResponse.setRspBody(operLoginVOS);
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("人员角色赋权接口")
    @RequestMapping(value = "/createAuthAcctRoleRela", method = { RequestMethod.POST})
    public JsonResponse createAuthAcctRoleRela(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        //TODO 调三级权限
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("角色授权接口")
    @RequestMapping(value = "/createRoleAuthRela", method = { RequestMethod.POST})
    public JsonResponse createRoleAuthRela(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("人员角色转让接口")
    @RequestMapping(value = "/changeUserRole", method = { RequestMethod.POST})
    public JsonResponse changeUserRole(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("企业角色切换接口")
    @RequestMapping(value = "/changeEntRole", method = { RequestMethod.POST})
    public JsonResponse changeEntRole(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("渠道后台/超市运营/万象人员管理列表接口")
    @RequestMapping(value = "/acctManageList", method = { RequestMethod.POST})
    public JsonResponse acctManageList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //TODO 调三级权限
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        return jsonResponse;
    }
}
