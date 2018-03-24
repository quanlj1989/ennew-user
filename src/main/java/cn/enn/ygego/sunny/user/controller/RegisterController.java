package cn.enn.ygego.sunny.user.controller;

import cn.enn.ygego.sunny.core.exception.BusinessException;
import cn.enn.ygego.sunny.core.log.SearchableLoggerFactory;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.common.ResponseCodeEnum;
import cn.enn.ygego.sunny.user.dto.register.SendSmsRequest;
import cn.enn.ygego.sunny.user.dto.register.UpdateEmailRequest;
import cn.enn.ygego.sunny.user.dto.register.UpdatePasswordRequest;
import cn.enn.ygego.sunny.user.dto.register.UserRegisterRequest;
import cn.enn.ygego.sunny.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
@Api(value = "平台注册、发送接口、验证接口", description = "平台注册、发送接口、验证接口")
public class RegisterController {

    private static final Logger logger = SearchableLoggerFactory.getDefaultLogger();

    @Autowired
    private UserService userService;

    /**
     * 用户注册接口
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "注册接口", notes = "输入用户名、密码等信息")
    @RequestMapping(value = "/register", method = {RequestMethod.POST})
    public JsonResponse register(@RequestBody JsonRequest<UserRegisterRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            UserRegisterRequest userRegisterRequest = jsonRequest.getReqBody();
            userService.registerUser(userRegisterRequest);
            jsonResponse.setRetDesc("恭喜注册成功！");
        } catch (BusinessException e) {
            logger.error(e.getErrorCode());
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
            jsonResponse.setRetDesc(e.getErrorCode());
        } catch (Exception e) {
            logger.error("注册用户信息异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 更新密码
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "更新密码")
    @RequestMapping(value = "/updatePassword", method = {RequestMethod.POST})
    public JsonResponse updatePassword(@RequestBody JsonRequest<UpdatePasswordRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            UpdatePasswordRequest request = jsonRequest.getReqBody();
            userService.updatePassword(request);
            jsonResponse.setRetDesc("更新密码成功！");
        } catch (BusinessException e) {
            logger.error(e.getErrorCode());
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
            jsonResponse.setRetDesc(e.getErrorCode());
        } catch (Exception e) {
            logger.error("更新密码异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 更新邮件
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "更新邮件")
    @RequestMapping(value = "/updateEmail", method = {RequestMethod.POST})
    public JsonResponse updateEmail(@RequestBody JsonRequest<UpdateEmailRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            UpdateEmailRequest request = jsonRequest.getReqBody();
            userService.updateEmail(request);
            jsonResponse.setRetDesc("更新邮箱成功！");
        } catch (BusinessException e) {
            logger.error(e.getErrorCode());
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
            jsonResponse.setRetDesc(e.getErrorCode());
        } catch (Exception e) {
            logger.error("更新邮件异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 发送短信
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "发送短信接口", notes = "根据不同业务类型发送不同模板的短信")
    @RequestMapping(value = "/sendSms", method = {RequestMethod.POST})
    public JsonResponse sendSms(@RequestBody JsonRequest<SendSmsRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            SendSmsRequest request = jsonRequest.getReqBody();
            userService.sendSms(request);
        } catch (BusinessException e) {
            logger.error(e.getErrorCode());
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
            jsonResponse.setRetDesc(e.getErrorCode());
        } catch (Exception e) {
            logger.error("更新邮件异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 校验用户名是否已注册
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "校验用户名是否已注册", notes = "校验用户名是否已注册")
    @RequestMapping(value = "/checkUsername", method = {RequestMethod.POST})
    public JsonResponse checkUsername(@RequestBody JsonRequest<UserRegisterRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            UserRegisterRequest request = jsonRequest.getReqBody();
            boolean result = userService.checkUsername(request.getUsername());
            if (result) {
                jsonResponse.setRetDesc("该用户名可以注册！");
            }else{
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("该用户名已注册！");
            }
        } catch (Exception e) {
            logger.error("校验用户名是否已注册异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 校验手机号是否已注册
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "校验手机号是否已注册", notes = "校验手机号是否已注册")
    @RequestMapping(value = "/checkMobilePhone", method = {RequestMethod.POST})
    public JsonResponse checkMobilePhone(@RequestBody JsonRequest<UserRegisterRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            UserRegisterRequest request = jsonRequest.getReqBody();
            boolean result = userService.checkMobilePhone(request.getMobilePhone());
            if (result) {
                jsonResponse.setRetDesc("该手机号可以注册！");
            }else{
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("该手机号已注册！");
            }
        } catch (Exception e) {
            logger.error("校验手机号是否已注册异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 校验邮箱是否已注册
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "校验邮箱是否已注册", notes = "校验手机号是否已注册")
    @RequestMapping(value = "/checkEmail", method = {RequestMethod.POST})
    public JsonResponse checkEmail(@RequestBody JsonRequest<UserRegisterRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            UserRegisterRequest request = jsonRequest.getReqBody();
            boolean result = userService.checkEmail(request.getEmail());
            if (result) {
                jsonResponse.setRetDesc("该邮箱可以注册！");
            }else{
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("该邮箱已注册！");
            }
        } catch (Exception e) {
            logger.error("校验邮箱是否已注册异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }



    @ApiOperation(value = "验证短信", notes = "验证不同业务类型的验证码是否正确")
    @RequestMapping(value = "/checkMsg", method = {RequestMethod.POST})
    public JsonResponse checkMsg(@RequestBody JsonRequest jsonRequest) {
        return new JsonResponse();
    }


    @ApiOperation(value = "验证密码是否正确", notes = "验证密码是否正确")
    @RequestMapping(value = "/checkPasswd", method = {RequestMethod.POST})
    public JsonResponse checkPasswd(@RequestBody JsonRequest jsonRequest) {
        return new JsonResponse();
    }

    @ApiOperation(value = "更新用户信息包括密码、手机号等", notes = "更新用户信息包括密码、手机号等")
    @RequestMapping(value = "/updateAcct", method = {RequestMethod.POST})
    public JsonResponse updateAcct(@RequestBody JsonRequest jsonRequest) {
        return new JsonResponse();
    }

}
