package cn.enn.ygego.sunny.user.controller.BaseManage;

import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.EntTaxRateDTO;
import cn.enn.ygego.sunny.user.dto.vo.EntTaxRateVO;
import cn.enn.ygego.sunny.user.service.InvioceTaxService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/base/tax")
@Api(value="发票税率管理", description = "发票税率管理")
public class InvioceTaxController {
    Logger logger = LoggerFactory.getLogger(InvioceTaxController.class);

    @Autowired
    private InvioceTaxService invioceTaxService;

    /**
     * @Description 
     * @author liangchao
     * @date 2018/3/30 11:07
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="新建发票税率接口")
    @RequestMapping(value = "/createInvoiceTax", method = {RequestMethod.POST})
    @ResponseBody
    public JsonResponse createInvoiceTax(@RequestBody JsonRequest<EntTaxRateDTO> jsonRequest) {//参数问题反馈对象
        JsonResponse jsonResponse = new JsonResponse();
        try{
            EntTaxRateDTO entTaxRateDTO = jsonRequest.getReqBody();
            invioceTaxService.insertInvoiceTax(entTaxRateDTO);
        } catch (Exception e) {
            logger.error("新建发票税率失败", e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }

        return jsonResponse;
    }

    /**
     * @Description 
     * @author liangchao
     * @date 2018/3/30 11:07
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="查询发票税率信息接口")
    @RequestMapping(value = "/queryInvoiceTaxInfo", method = { RequestMethod.POST })
    @ResponseBody
    public JsonResponse queryInvoiceTaxInfo(@RequestBody JsonRequest<EntTaxRateVO> jsonRequest) {//参数问题反馈对象
        JsonResponse jsonResponse = new JsonResponse();
        try {
            EntTaxRateVO entTaxRateVO = jsonRequest.getReqBody();
            EntTaxRateDTO entTaxRateDTO = invioceTaxService.queryInvoiceTaxInfo(entTaxRateVO);

            jsonResponse.setRspBody(entTaxRateDTO);
        } catch (Exception e) {
            logger.error("查询发票税率信息失败", e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }
        return jsonResponse;
    }

//    @ApiOperation(value="查询发票税率列表")
//    @RequestMapping("/queryInvoiceTaxList")
//    @ResponseBody
    public JsonResponse queryInvoiceTaxList(@RequestBody JsonRequest<EntTaxRateDTO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();

        return jsonResponse;
    }

    @ApiOperation(value="修改发票税率信息")
    @RequestMapping(value = "/modifyInvoiceTax", method = { RequestMethod.POST }) //Information details
    @ResponseBody
    public JsonResponse modifyInvoiceTax(@RequestBody JsonRequest<EntTaxRateDTO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            EntTaxRateDTO entTaxRateDTO = jsonRequest.getReqBody();
            invioceTaxService.modifyInvoiceTax(entTaxRateDTO);
        } catch (Exception e) {
            logger.error("修改发票税率信息失败", e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }
        return jsonResponse;
    }

}
