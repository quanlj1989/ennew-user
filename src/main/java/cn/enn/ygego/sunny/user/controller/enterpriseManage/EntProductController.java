package cn.enn.ygego.sunny.user.controller.enterpriseManage;

import cn.enn.ygego.sunny.user.dto.ProdInfoDTO;
import cn.enn.ygego.sunny.user.dto.SellerProdDTO;
import com.github.jsonzou.jmockdata.JMockData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("all")
@RestController
@RequestMapping(value = {"/user/product"})
@Api(value = "企业认证的下的产品管理 ", description = "企业认证的下的产品管理")
public class EntProductController {
	

    
    @ApiOperation("增加产品接口")
    @RequestMapping(value = "/addProduct", method = { RequestMethod.POST})
    public JsonResponse addProduct(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
//        jsonResponse.setRspBody(); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
    @ApiOperation("修改产品接口")
    @RequestMapping(value = "/modifyProduct", method = { RequestMethod.POST})
    public JsonResponse modifyProduct(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
//        jsonResponse.setRspBody(); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
    @ApiOperation("查看产品详情接口")
    @RequestMapping(value = "/getProductInfo", method = { RequestMethod.POST})
    public JsonResponse getProductInfo(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //JMockData生成模拟数据
        ProdInfoDTO prodInfoDTO = JMockData.mock(ProdInfoDTO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(prodInfoDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
    @ApiOperation("查看产品列表接口")
    @RequestMapping(value = "/getProductList", method = { RequestMethod.POST})
    public JsonResponse getProductList(@RequestBody JsonRequest jsonRequest) {
		JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        List<ProdInfoDTO> list = new ArrayList<ProdInfoDTO>();
        //JMockData生成模拟数据
        ProdInfoDTO prodInfoDTO = JMockData.mock(ProdInfoDTO.class);
        list.add(prodInfoDTO);//生成对象添加到list中
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(list); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
	
}
