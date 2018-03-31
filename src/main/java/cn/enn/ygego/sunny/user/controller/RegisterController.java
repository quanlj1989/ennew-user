package cn.enn.ygego.sunny.user.controller;

import cn.enn.ygego.sunny.core.exception.BusinessException;
import cn.enn.ygego.sunny.core.log.SearchableLoggerFactory;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.common.ResponseCodeEnum;
import cn.enn.ygego.sunny.user.dto.register.*;
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
@RequestMapping("/user/")
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
            UserRegisterRequest request = jsonRequest.getReqBody();
            boolean checkOldPhone = userService.checkValidCode(request.getMobilePhone(), request.getValidCode(), request.getSmsType());
            if (checkOldPhone == false) {
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("手机号验证码输入有误！");
                return jsonResponse;
            }
            userService.registerUser(request);
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
     * 更改密码
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "更改密码")
    @RequestMapping(value = "/changePassword", method = {RequestMethod.POST})
    public JsonResponse changePassword(@RequestBody JsonRequest<ChangePasswordRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            ChangePasswordRequest request = jsonRequest.getReqBody();
            userService.changePassword(request.getAcctId(), request.getOldPassword(), request.getNewPassword());
            jsonResponse.setRetDesc("更改密码成功！");
        } catch (BusinessException e) {
            logger.error(e.getErrorCode());
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
            jsonResponse.setRetDesc(e.getErrorCode());
        } catch (Exception e) {
            logger.error("更改密码异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 更改邮件
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "更改邮件")
    @RequestMapping(value = "/changeEmail", method = {RequestMethod.POST})
    public JsonResponse changeEmail(@RequestBody JsonRequest<ChangeEmailRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            ChangeEmailRequest request = jsonRequest.getReqBody();
            userService.changeEmail(request.getAcctId(), request.getEmail());
            jsonResponse.setRetDesc("更改邮件成功！");
        } catch (BusinessException e) {
            logger.error(e.getErrorCode());
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
            jsonResponse.setRetDesc(e.getErrorCode());
        } catch (Exception e) {
            logger.error("更改邮件异常", e);
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
    public JsonResponse<SendSmsResponse> sendSms(@RequestBody JsonRequest<SendSmsRequest> jsonRequest) {
        JsonResponse<SendSmsResponse> jsonResponse = new JsonResponse();
        try {
            SendSmsRequest request = jsonRequest.getReqBody();
            SendSmsResponse response = userService.sendSms(request.getMobilePhone(), request.getSmsType());
            jsonResponse.setRspBody(response);
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
            } else {
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
            } else {
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
            } else {
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

    /**
     * 校验手机验证码输入是否正确
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "校验验证码是否正确", notes = "校验验证码是否正确")
    @RequestMapping(value = "/checkValidCode", method = {RequestMethod.POST})
    public JsonResponse checkValidCode(@RequestBody JsonRequest<SendSmsResponse> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            SendSmsResponse request = jsonRequest.getReqBody();
            boolean result = userService.checkValidCode(request.getMobilePhone(), request.getValidCode(), request.getSmsType());
            if (result) {
                jsonResponse.setRetDesc("验证码校验通过！");
            } else {
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("验证码输入错误！");
            }
        } catch (Exception e) {
            logger.error("校验邮箱是否已注册异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 重置密码（找回密码）
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "重置密码（找回密码）")
    @RequestMapping(value = "/resetPassword", method = {RequestMethod.POST})
    public JsonResponse resetPassword(@RequestBody JsonRequest<ChangePasswordRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            ChangePasswordRequest request = jsonRequest.getReqBody();
            boolean result = userService.resetPassword(request.getAcctId(), request.getNewPassword());
            if (result) {
                jsonResponse.setRetDesc("重置密码成功!");
            } else {
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("重置密码失败！");
            }
        } catch (Exception e) {
            logger.error("重置密码异常", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

    /**
     * 绑定手机号(修改手机号)
     *
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value = "绑定手机号(修改手机号)")
    @RequestMapping(value = "/bindPhone", method = {RequestMethod.POST})
    public JsonResponse bindPhone(@RequestBody JsonRequest<BindPhoneRequest> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            BindPhoneRequest request = jsonRequest.getReqBody();
            boolean checkOldPhone = userService.checkValidCode(request.getOldPhone(), request.getOldVaildCode(), request.getSmsType());
            if (checkOldPhone == false) {
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("原手机号验证码输入有误！");
                return jsonResponse;
            }
            boolean checkNewPhone = userService.checkValidCode(request.getNewPhone(), request.getNewValidCode(), request.getSmsType());
            if (checkNewPhone == false) {
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("新手机号验证码输入有误！");
                return jsonResponse;
            }
            boolean result = userService.changePhone(request.getAcctId(), request.getNewPhone());
            if (result) {
                jsonResponse.setRetDesc("绑定新手机号成功！");
            } else {
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("绑定新手机号失败！");
            }
        } catch (Exception e) {
            logger.error("绑定新手机号异常！", e);
            jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
            jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
        }
        return jsonResponse;
    }

}
