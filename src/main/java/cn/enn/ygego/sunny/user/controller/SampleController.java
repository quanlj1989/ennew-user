package cn.enn.ygego.sunny.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
@Api(value = "用户测试接口", description = "用户测试接口")
public class SampleController {

	@ApiOperation("你好的方法")
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello, world!";
	}


	@RequestMapping("test")
	@ResponseBody
	public String test(){
		return "test";
	}

}
