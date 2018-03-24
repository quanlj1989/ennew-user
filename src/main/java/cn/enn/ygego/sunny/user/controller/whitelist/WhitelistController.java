package cn.enn.ygego.sunny.user.controller.whitelist;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.common.ResponseCodeEnum;
import cn.enn.ygego.sunny.user.dto.EntCertInfoDTO;
import cn.enn.ygego.sunny.user.dto.MaterialBlackListDTO;
import cn.enn.ygego.sunny.user.dto.MaterialWhiteListDTO;
import cn.enn.ygego.sunny.user.dto.SupplierBlackListDTO;
import com.github.jsonzou.jmockdata.JMockData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: EntAuthController
 * Description:
 * Author: dongbingbing
 * Date: 2018/3/20 13:51
 * History:
 * <author>          <time>          <version>          <desc>
 * dongbingbing    2018/3/20 18:51    0.0.1            企业白名单接口
 */
@RequestMapping("/whitelist")
@RestController
@Api(value = "用户服务白名单接口", description = "用户服务白名单接口")
public class WhitelistController {

    /**
     * 查看白名单列表分页接口
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ApiOperation("查看白名单列表分页接口")
    public JsonResponse<PageDTO<MaterialWhiteListDTO>> list(@RequestBody JsonRequest jsonRequest){

        JsonResponse<PageDTO<MaterialWhiteListDTO>> jsonResponse = new JsonResponse();
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        PageDTO<MaterialWhiteListDTO> pageDTO = new PageDTO();
        pageDTO.setPageSize(10);
        pageDTO.setTotal(3);
        pageDTO.setPageNum(1);
        pageDTO.setPages(1);
        List<MaterialWhiteListDTO> list = new ArrayList<>();
        for(int i = 0; i<3 ;i ++){
            MaterialWhiteListDTO material = JMockData.mock(MaterialWhiteListDTO.class);
            list.add(material);
        }
        pageDTO.setResultData(list);
        jsonResponse.setRspBody(pageDTO);
        return jsonResponse;
    }

    /**
     * 查看白名单信息详情接口
     * @return
     */
    @RequestMapping(value = "/info",method = RequestMethod.POST)
    @ApiOperation("查看白名单信息详情接口")
    public JsonResponse<List<SupplierBlackListDTO>> info(@RequestBody JsonRequest jsonRequest){

        JsonResponse<List<SupplierBlackListDTO>> jsonResponse = new JsonResponse();
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        List<SupplierBlackListDTO> list = new ArrayList<>();
        for(int i = 0; i<3 ;i ++){
            SupplierBlackListDTO SupplierBlackListDTO = JMockData.mock(SupplierBlackListDTO.class);
            list.add(SupplierBlackListDTO);
        }
        jsonResponse.setRspBody(list);
        return jsonResponse;
    }

    /**
     * 修改白名单信息接口
     * @return
     */
    @ApiOperation("修改白名单信息接口")
    @RequestMapping(value = "/updateInfo",method = RequestMethod.POST)
    public JsonResponse updateInfo(@RequestBody JsonRequest jsonRequest){
        return new JsonResponse();
    }

    /**
     * 查询是否添加过白名单接口
     * @return
     */
    @ApiOperation("查询是否添加过白名单接口")
    @RequestMapping(value = "/whetherAdd",method = RequestMethod.POST)
    public JsonResponse whetherAdd(@RequestBody JsonRequest jsonRequest){
        return new JsonResponse();
    }

    /**
     * 导出白名单Excel接口
     * @return
     */
    @RequestMapping(value = "/exportExcel",method = RequestMethod.POST)
    public JsonResponse exportExcel(@RequestBody JsonRequest jsonRequest){
        return new JsonResponse();
    }

    /**
     * 按物料添加白名单接口
     * @return
     */
    @ApiOperation("按物料添加白名单接口")
    @RequestMapping(value = "/addForMaterial",method = RequestMethod.POST)
    public JsonResponse addForMaterial(@RequestBody JsonRequest jsonRequest){
        return new JsonResponse();
    }

    /**
     * 按供应商添加白名单接口
     * @return
     */
    @ApiOperation("按供应商添加白名单接口")
    @RequestMapping(value = "/addForSupplier",method = RequestMethod.POST)
    public JsonResponse addForSupplier(@RequestBody JsonRequest jsonRequest){
        return new JsonResponse();
    }

    /**
     * 批量删除白名单接口
     * @return
     */
    @ApiOperation("批量删除白名单接口")
    @RequestMapping(value = "/batchDelete",method = RequestMethod.POST)
    public JsonResponse batchDelete(@RequestBody JsonRequest jsonRequest){
        return new JsonResponse();
    }

    /**
     * 按物料筛选白名单供应商接口
     * @return
     */
    @ApiOperation("按物料筛选白名单供应商接口")
    @RequestMapping(value = "/filterSupplier",method = RequestMethod.POST)
    public JsonResponse<List<SupplierBlackListDTO>> filterSupplier(@RequestBody JsonRequest jsonRequest){
        JsonResponse<List<SupplierBlackListDTO>> jsonResponse = new JsonResponse();
        jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
        List<SupplierBlackListDTO> list = new ArrayList<>();
        for(int i = 0; i<4 ;i ++){
            SupplierBlackListDTO SupplierBlackListDTO = JMockData.mock(SupplierBlackListDTO.class);
            list.add(SupplierBlackListDTO);
        }
        jsonResponse.setRspBody(list);
        return jsonResponse;
    }
}
