package cn.enn.ygego.sunny.user.controller.enterpriseManage;

import cn.enn.ygego.sunny.user.dto.EntMaterialDTO;
import com.github.jsonzou.jmockdata.JMockData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.*;

import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *    
 * 项目名称：services-users   
 * 类名称：EntCategoryController   
 * 类描述：   企业类目
 * 创建人：杨清泉   
 * 创建时间：2018年3月28日 下午2:23:17   
 * 修改人：杨清泉    
 * 修改时间：2018年3月28日 下午2:23:17   
 * 修改备注：   
 * @version    
 *
 */
@SuppressWarnings("all")
@RestController
@RequestMapping(value = {"/user/entGc"})
@Api(value = "企业类目", description = "企业类目接口")
public class EntCategoryController {
	
	
	@ApiOperation("增加类目接口")
    @RequestMapping(value = {"/addEntGc"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse addEntGc(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }
	
	@ApiOperation("增加子类目接口")
    @RequestMapping(value = {"/addEntChildGc"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse addEntChildGc(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }
	@ApiOperation("删除类目接口")
    @RequestMapping(value = {"/delEntGc"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse delEntGc(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }
	@ApiOperation("删除类目根据子公司授权解绑接口")
    @RequestMapping(value = {"/delEntChildGc"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse delEntChildGc(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }
	@ApiOperation("修改类目接口")
    @RequestMapping(value = {"/modifyEntGc"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse modifyEntGc(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }
	@ApiOperation("查询类目列表(包括对外提供接口)")
    @RequestMapping(value = {"/getEntGcList"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse getEntGcList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }
	@ApiOperation("查询类目详情接口")
    @RequestMapping(value = {"/getEntGcDetails"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse getEntGcDetails(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }
	@ApiOperation("添加物料接口")
    @RequestMapping(value = {"/addMateriel"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse addMateriel(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        //        jsonResponse.setRspBody(); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
	@ApiOperation("删除物料接口")
    @RequestMapping(value = {"/delMateriel"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse delMateriel(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        //        jsonResponse.setRspBody(); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
	@ApiOperation("删除物料根据子公司授权解绑接口")
    @RequestMapping(value = {"/delMaterielBySubsidiary"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse delMaterielBySubsidiary(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        //        jsonResponse.setRspBody(); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
	@ApiOperation("修改物料接口")
    @RequestMapping(value = {"/updateMateriel"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse updateMateriel(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        //        jsonResponse.setRspBody(); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
	@ApiOperation("查询物料列表(包括对外提供接口)接口")
    @RequestMapping(value = {"/getMaterielList"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse getMaterielList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        List<EntMaterialDTO> list = new ArrayList<EntMaterialDTO>();
        //JMockData生成模拟数据
        EntMaterialDTO entMaterialDTO = JMockData.mock(EntMaterialDTO.class);
        list.add(entMaterialDTO);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(list); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
	@ApiOperation("查询物料详情接口")
    @RequestMapping(value = {"/getMaterielDetails"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse getMaterielDetails(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //JMockData生成模拟数据
        EntMaterialDTO entMaterialDTO = JMockData.mock(EntMaterialDTO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(entMaterialDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
	@ApiOperation("批量导入物料接口")  
    @RequestMapping(value = {"/batchImportMaterials"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse batchImportMaterials(@RequestParam(value = "file") MultipartFile file) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        //        jsonResponse.setRspBody(); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
	@ApiOperation("导出物料接口")
    @RequestMapping(value = {"/exportMaterial"}, method = { RequestMethod.POST})
    public @ResponseBody JsonResponse exportMaterial(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        //        jsonResponse.setRspBody(); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }
}
