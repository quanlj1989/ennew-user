package cn.enn.ygego.sunny.user.controller;

import cn.enn.ygego.sunny.core.exception.BusinessException;
import cn.enn.ygego.sunny.core.log.SearchableLoggerFactory;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.common.ResponseCodeEnum;
import cn.enn.ygego.sunny.user.common.UserLoginWayEnum;
import cn.enn.ygego.sunny.user.dto.company.CompanyAuthInfo;
import cn.enn.ygego.sunny.user.dto.login.LoginRequest;
import cn.enn.ygego.sunny.user.dto.login.LoginResponse;
import cn.enn.ygego.sunny.user.dto.login.ThirdLoginBaseParam;
import cn.enn.ygego.sunny.user.dto.login.ThirdLoginConfigResponse;
import cn.enn.ygego.sunny.user.dto.register.UserBaseInfoRequest;
import cn.enn.ygego.sunny.user.service.ThirdLoginConfigService;
import cn.enn.ygego.sunny.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/")
@Api(value = "登录方法", description = "主要用于登录等验证")
public class LoginController {

    private static final Logger logger = SearchableLoggerFactory.getDefaultLogger();

    @Autowired
    private UserService userService;

    @Autowired
    private ThirdLoginConfigService thirdLoginConfigService;

    /**
     * 用户登录
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "登录接口", notes = "验证是否能登录")
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public JsonResponse<LoginResponse> login(@RequestBody JsonRequest<LoginRequest> jsonRequest) {

        JsonResponse<LoginResponse> jsonResponse = new JsonResponse<>();
        try {
            LoginRequest request = jsonRequest.getReqBody();
            //平台登录
            if (request.getLoginType().toString().equals(UserLoginWayEnum.PLATFORM.getStatusCode())) {
                LoginResponse response = userService.login(request.getUsername(), request.getPassword());
                jsonResponse.setRspBody(response);
            }
        } catch (BusinessException e) {
            logger.error(e.getErrorCode());
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
            jsonResponse.setRetDesc(e.getErrorCode());
        } catch (Exception e) {
            logger.error("用户登录异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 查询所对应的企业信息以及企业对应的认证信息
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "查询所对应的企业信息以及企业对应的认证信息")
    @RequestMapping(value = "/findCompanyMember", method = {RequestMethod.POST})
    public JsonResponse<List<CompanyAuthInfo>> findCompanyMember(@RequestBody JsonRequest<UserBaseInfoRequest> jsonRequest) {
        JsonResponse<List<CompanyAuthInfo>> jsonResponse = new JsonResponse<>();
        try {
            UserBaseInfoRequest request = jsonRequest.getReqBody();
            List<CompanyAuthInfo> companyAuthInfos = userService.findCompanyMember(request.getAcctId());
            jsonResponse.setRspBody(companyAuthInfos);
        } catch (BusinessException e) {
            logger.error(e.getErrorCode());
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
            jsonResponse.setRetDesc(e.getErrorCode());
        } catch (Exception e) {
            logger.error(" 查询所对应的企业信息以及企业对应的认证信息异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 设置默认企业
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "设置默认企业")
    @RequestMapping(value = "/setDefaultCompany", method = {RequestMethod.POST})
    public JsonResponse setDefaultCompany(@RequestBody JsonRequest<UserBaseInfoRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse<>();
        try {
            UserBaseInfoRequest request = jsonRequest.getReqBody();
            boolean result = userService.setDefaultCompany(request.getAcctId(), request.getCompanyMemberId());
            if (result) {
                jsonResponse.setRetCode("设置默认企业成功!");
            } else {
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetCode("设置默认企业失败!");
            }
        } catch (Exception e) {
            logger.error(" 查询所对应的企业信息以及企业对应的认证信息异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }


    /**
     * 获取第三方登陆配置信息接口
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "获取第三方登陆信息接口", notes = "获取第三方登陆信息接口")
    @RequestMapping(value = "/thirdLoginConfig", method = {RequestMethod.POST})
    public JsonResponse<List<ThirdLoginConfigResponse>> thirdLoginConfig(@RequestBody JsonRequest jsonRequest) {
        JsonResponse<List<ThirdLoginConfigResponse>> jsonResponse = new JsonResponse<>();
        try {
            List<ThirdLoginConfigResponse> response = thirdLoginConfigService.findEnabledConfigs();
            jsonResponse.setRetCode("查询第三方登陆配置信息成功！");
            jsonResponse.setRspBody(response);
        } catch (Exception e) {
            logger.error("获取第三方登陆配置信息接口异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }


    /**
     * 获取第三方登陆地址
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "获取第三方登陆地址", notes = "获取第三方登陆地址")
    @RequestMapping(value = "/thirdLoginUri", method = {RequestMethod.POST})
    public JsonResponse<ThirdLoginBaseParam> thirdLoginUri(@RequestBody JsonRequest<ThirdLoginBaseParam> jsonRequest) {
        JsonResponse<ThirdLoginBaseParam> jsonResponse = new JsonResponse<>();
        try {
            ThirdLoginBaseParam request = jsonRequest.getReqBody();
            String thirdLoginUri = userService.getThirdLoginUri(request.getConfigId());
            if (StringUtils.isBlank(thirdLoginUri)) {
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("获取第三方登陆地址失败！");
            } else {
                ThirdLoginBaseParam response = new ThirdLoginBaseParam();
                response.setThirdLoginUri(thirdLoginUri);
                jsonResponse.setRspBody(response);
                jsonResponse.setRetDesc("获取第三方登陆地址成功！");
            }
        } catch (Exception e) {
            logger.error("获取第三方登陆地址异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }


    /**
     * 获取第三方是否已在平台注册
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "获取第三方是否已在平台注册", notes = "获取第三方是否已在平台注册")
    @RequestMapping(value = "/isRegisterThird", method = {RequestMethod.POST})
    public JsonResponse isRegisterThird(@RequestBody JsonRequest jsonRequest) {
        return new JsonResponse();
    }

    /**
     * 超级登录
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "超级登录", notes = "超级登录")
    @RequestMapping(value = "/superLogin", method = {RequestMethod.POST})
    public JsonResponse superLogin(@RequestBody JsonRequest jsonRequest) {
        return new JsonResponse();
    }


}
