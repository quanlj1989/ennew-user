package cn.enn.ygego.sunny.user.controller;

import cn.enn.ygego.sunny.core.exception.BusinessException;
import cn.enn.ygego.sunny.core.log.SearchableLoggerFactory;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.common.ResponseCodeEnum;
import cn.enn.ygego.sunny.user.dto.login.LoginRequest;
import cn.enn.ygego.sunny.user.dto.login.LoginResponse;
import cn.enn.ygego.sunny.user.dto.register.UserRegisterRequest;
import cn.enn.ygego.sunny.user.service.UserService;
import com.github.jsonzou.jmockdata.JMockData;
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
@Api(value = "登录方法", description = "主要用于登录等验证")
public class LoginController {

	private static final Logger logger = SearchableLoggerFactory.getDefaultLogger();

	@Autowired
	private UserService userService;

	/**
	 * 用户登录
	 * @param jsonRequest
	 * @return
	 */
	@ApiOperation(value = "登录接口", notes = "验证是否能登录")
	@RequestMapping(value = "/login", method = { RequestMethod.POST})
	public JsonResponse<LoginResponse> login(@RequestBody JsonRequest<LoginRequest> jsonRequest){

		JsonResponse<LoginResponse> jsonResponse = new JsonResponse<>();
		try{
			LoginRequest request = jsonRequest.getReqBody();
		    LoginResponse response = userService.login(request);
		    jsonResponse.setRspBody(response);
		}catch (BusinessException e){
			logger.error(e.getErrorCode());
			jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
			jsonResponse.setRetDesc(e.getErrorCode());
		}catch (Exception e){
			logger.error("用户登录异常",e);
			jsonResponse.setRetCode(ResponseCodeEnum.EXCEPTION.getStatusCode());
			jsonResponse.setRetDesc(ResponseCodeEnum.EXCEPTION.getStatusName());
		}
		return jsonResponse;
	}

	@ApiOperation(value = "超级登录", notes = "超级登录")
	@RequestMapping(value = "/superLogin", method = { RequestMethod.POST})
	public JsonResponse superLogin(@RequestBody JsonRequest jsonRequest){
		return new JsonResponse();
	}

	@ApiOperation(value = "企业切换接口", notes = "企业切换接口")
	@RequestMapping(value = "/user/switch", method = { RequestMethod.POST})
	public JsonResponse userSwitch(@RequestBody JsonRequest jsonRequest){
		return new JsonResponse();
	}


}
