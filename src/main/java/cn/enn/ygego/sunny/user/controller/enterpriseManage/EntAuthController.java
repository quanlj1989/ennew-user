/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.controller.enterpriseManage;

import cn.enn.ygego.sunny.core.log.SearchableLoggerFactory;
import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.JsonResult;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.constant.EntCertApplyTypeEnum;
import cn.enn.ygego.sunny.user.dto.EntAuthTypeApplyDTO;
import cn.enn.ygego.sunny.user.dto.EntBrandAuthApplyDTO;
import cn.enn.ygego.sunny.user.dto.EntBrandInfoDTO;
import cn.enn.ygego.sunny.user.dto.EntCertApplyDTO;
import cn.enn.ygego.sunny.user.dto.EntCertInfoDTO;
import cn.enn.ygego.sunny.user.dto.EntCustInfoDTO;
import cn.enn.ygego.sunny.user.dto.vo.EntAuthTypeApplyVO;
import cn.enn.ygego.sunny.user.dto.vo.EntCateAndBrandVO;
import cn.enn.ygego.sunny.user.dto.vo.EntCertApplyVO;
import cn.enn.ygego.sunny.user.dto.vo.EntProdApplyVO;
import cn.enn.ygego.sunny.user.dto.vo.EntQueryVO;
import cn.enn.ygego.sunny.user.model.EntAuthTypeApply;
import cn.enn.ygego.sunny.user.model.EntBrandAuthApply;
import cn.enn.ygego.sunny.user.model.EntCertApply;
import cn.enn.ygego.sunny.user.service.EntCertApplyService;
import cn.enn.ygego.sunny.user.service.EntProdApplyService;
import com.github.jsonzou.jmockdata.JMockData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName: EntAuthController
 * Description:
 * Author: lizan
 * Date: 2018/3/20 13:51
 * History:
 * <author>          <time>          <version>          <desc>
 * lizan           2018/3/20 13:51   0.0.1              企业认证接口
 */
@RestController
@RequestMapping("/user/enterprise")
@Api(value = "企业认证接口", description = "企业认证接口")
public class EntAuthController {
    static final Logger logger = SearchableLoggerFactory.getDefaultLogger();

    @Autowired
    private EntCertApplyService entCertApplyService;

    @Autowired
    private EntProdApplyService entProdApplyService;


    /**
     *个人认证企业状态列表入口
     * @param jsonRequest
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("个人认证企业状态列表入口")
    @RequestMapping(value = "/personalEntAuthList", method = { RequestMethod.POST})
    public JsonResponse<List<EntAuthTypeApplyDTO>> personalEntAuthList(@RequestBody JsonRequest<EntAuthTypeApplyDTO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        List<EntAuthTypeApplyDTO> list = new ArrayList<EntAuthTypeApplyDTO>();
        // JMockData模拟生成随机数据
        EntAuthTypeApplyDTO entAuthTypeApplyDTO = JMockData.mock(EntAuthTypeApplyDTO.class);
        list.add(entAuthTypeApplyDTO); // 将对象保存到list中
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(list); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交企业认证接口")
    @RequestMapping(value = "/createAuth", method = { RequestMethod.POST})
    public JsonResponse createAuth(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }



    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("供应商入驻信息(类目品牌，渠道，验厂)")
    @RequestMapping(value = "/getSupplierAuthInfo", method = { RequestMethod.POST})
    public JsonResponse getSupplierAuthInfo(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("供应商认证类目列表")
    @RequestMapping(value = "/getGcAuthList", method = { RequestMethod.POST})
    public JsonResponse<PageDTO<EntBrandInfoDTO>> getGcAuthList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        PageDTO pageDTO = new PageDTO(); // 返回的PageDTO对象
        List<EntBrandInfoDTO> list = new ArrayList<EntBrandInfoDTO>();
        // JMockData模拟生成随机数据
        EntBrandInfoDTO entBrandInfoDTO = JMockData.mock(EntBrandInfoDTO.class);
        list.add(entBrandInfoDTO); // 将对象保存到list中
        pageDTO.setResultData(list);// 将结果保存到page对象中
        pageDTO.setPageNum(0); // 第0页
        pageDTO.setPageSize(10); // 每页显示10条
        pageDTO.setTotal(1); //共1条
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(pageDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交企业资质认证（结算商）")
    @RequestMapping(value = "/getClearAuth", method = { RequestMethod.POST})
    public JsonResponse getClearAuth(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交企业资质认证（服务商）")
    @RequestMapping(value = "/createProviderAuth", method = { RequestMethod.POST})
    public JsonResponse createProviderAuth(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业资质认证（服务商）")
    @RequestMapping(value = "/getProviderAuth", method = { RequestMethod.POST})
    public JsonResponse<EntAuthTypeApplyVO> getProviderAuth(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        EntAuthTypeApplyVO entAuthTypeApplyVO = JMockData.mock(EntAuthTypeApplyVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(entAuthTypeApplyVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }


    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业资质认证（结算商）")
    @RequestMapping(value = "/createClearAuth", method = { RequestMethod.POST})
    public JsonResponse createClearAuth(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        EntAuthTypeApplyVO entAuthTypeApplyVO = JMockData.mock(EntAuthTypeApplyVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(entAuthTypeApplyVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交企业类目及品牌认证")
    @RequestMapping(value = "/createBrandAuth", method = { RequestMethod.POST})
    public JsonResponse createBrandAuth(@RequestBody JsonRequest<EntProdApplyVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        //-------------------TODO 传入会员信息等--------------------------
        Long memberId = 9454l;
        Long acctId = 9454l;
        String name = "测试";
        //--------------------------------------------------------------
        Date date = new Date();
        EntProdApplyVO entProdApplyVO = jsonRequest.getReqBody();
        entProdApplyVO.setCreateTime(date);
        entProdApplyVO.setCreateAcctId(acctId);
        entProdApplyVO.setMemberId(memberId);
        entProdApplyVO.setCreateName(name);
        int result = -1;
        try {
                result = entProdApplyService.createEntProdApplyVO(entProdApplyVO);
            if(result == 1){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("提交企业类目及品牌认证成功");
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("提交企业类目及品牌认证失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("addDeliverAddress: 提交企业类目及品牌认证接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业类目及品牌认证")
    @RequestMapping(value = "/getBrandAuth", method = { RequestMethod.POST})
    public JsonResponse<EntProdApplyVO> getBrandAuth(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("设置结算账户")
    @RequestMapping(value = "/setClearAccount", method = { RequestMethod.POST})
    public JsonResponse setClearAccount(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交企业基本信息认证接口")
    @RequestMapping(value = "/createEcInfo", method = { RequestMethod.POST})
    public JsonResponse createEcInfo(@RequestBody JsonRequest<EntCertApply> jsonRequest) {
        EntCertApply entCertApply = jsonRequest.getReqBody();
        JsonResponse jsonResponse = new JsonResponse();
        EntCertApply result = new EntCertApply();
        //设置为申请状态
        entCertApply.setStatus(EntCertApplyTypeEnum.APPLY_STATUS_APPLY.getCode());
        Date date = new Date();
        entCertApply.setCreateTime(date);
        try {
            int operation = entCertApplyService.createEntCertApply(entCertApply);
            if(operation == 1){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("提交企业基本信息认证接口成功");
                result.setCertApplyId(entCertApply.getCertApplyId());
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("提交企业基本信息认证接口失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("addDeliverAddress: 提交企业基本信息认证接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交采购商申请角色接口")
    @RequestMapping(value = "/applyPurchase", method = { RequestMethod.POST})
    public JsonResponse applyPurchase(@RequestBody JsonRequest<EntCertApply> jsonRequest) {
        EntCertApply entCertApply = jsonRequest.getReqBody();
        JsonResponse jsonResponse = new JsonResponse();
        EntCertApply result = new EntCertApply();
        //设置为申请状态
        entCertApply.setStatus(EntCertApplyTypeEnum.APPLY_STATUS_APPLY.getCode());
        Date date = new Date();
        entCertApply.setCreateTime(date);
        try {
            int operation = entCertApplyService.createEntCertApply(entCertApply);
            if(operation == 1){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("提交企业基本信息认证接口成功");
                result.setCertApplyId(entCertApply.getCertApplyId());
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("提交企业基本信息认证接口失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("addDeliverAddress: 提交企业基本信息认证接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业详情")
    @RequestMapping(value = "/entInfo", method = { RequestMethod.POST})
    public JsonResponse<EntCertApplyVO> entInfo(@RequestBody JsonRequest<EntCertApplyDTO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        EntCertApplyVO entCertApplyVO = JMockData.mock(EntCertApplyVO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(entCertApplyVO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业认证详情接口")
    @RequestMapping(value = "/entAuthInfo", method = { RequestMethod.POST})
    public JsonResponse entAuthInfo(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        EntCertInfoDTO entCertInfoDTO = JMockData.mock(EntCertInfoDTO.class);
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(entCertInfoDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("导出企业认证列表Excel接口")
    @RequestMapping(value = "/expEntAuthList", method = { RequestMethod.POST})
    public JsonResponse expEntAuthList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("更新用户质量接入标识接口")
    @RequestMapping(value = "/updateQualityFlag", method = { RequestMethod.POST})
    public JsonResponse updateQualityFlag(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    /**
     * 个人企业列表
     * 平台企业列表
     * @param jsonRequest
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业列表接口")
    @RequestMapping(value = "/entList", method = { RequestMethod.POST})
    public JsonResponse<PageDTO<EntCustInfoDTO>> entList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        PageDTO pageDTO = new PageDTO(); // 返回的PageDTO对象
        List<EntCustInfoDTO> list = new ArrayList<EntCustInfoDTO>();
        // JMockData模拟生成随机数据
        EntCustInfoDTO entCustInfoDTO = JMockData.mock(EntCustInfoDTO.class);
        list.add(entCustInfoDTO); // 将对象保存到list中
        pageDTO.setResultData(list);// 将结果保存到page对象中
        pageDTO.setPageNum(0); // 第0页
        pageDTO.setPageSize(10); // 每页显示10条
        pageDTO.setTotal(1); //共1条
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(pageDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间

        return jsonResponse;
    }

    /**
     * 个人查看企业认证列表
     * 平台查看企业认证列表
     * @param jsonRequest
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业认证列表接口")
    @RequestMapping(value = "/entAuthList", method = { RequestMethod.POST})
    public JsonResponse<PageDTO<EntCertApplyDTO>> entAuthList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        PageDTO pageDTO = new PageDTO(); // 返回的PageDTO对象
        List<EntCertApplyDTO> list = new ArrayList<EntCertApplyDTO>();
        // JMockData模拟生成随机数据
        EntCertApplyDTO entCertApplyDTO = JMockData.mock(EntCertApplyDTO.class);
        list.add(entCertApplyDTO); // 将对象保存到list中
        pageDTO.setResultData(list);// 将结果保存到page对象中
        pageDTO.setPageNum(0); // 第0页
        pageDTO.setPageSize(10); // 每页显示10条
        pageDTO.setTotal(1); //共1条
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(pageDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间

        return jsonResponse;
    }


    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("通过类目查看企业列表（对外）")
    @RequestMapping(value = "/getEntListByGcId", method = { RequestMethod.POST})
    public JsonResponse<EntCustInfoDTO> getEntListByGcId(@RequestBody JsonRequest<EntQueryVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        PageDTO pageDTO = new PageDTO(); // 返回的PageDTO对象
        List<EntCustInfoDTO> list = new ArrayList<EntCustInfoDTO>();
        // JMockData模拟生成随机数据
        EntCustInfoDTO entCustInfoDTO = JMockData.mock(EntCustInfoDTO.class);
        list.add(entCustInfoDTO); // 将对象保存到list中
        pageDTO.setResultData(list);// 将结果保存到page对象中
        pageDTO.setPageNum(0); // 第0页
        pageDTO.setPageSize(10); // 每页显示10条
        pageDTO.setTotal(1); //共1条
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(pageDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看供应商企业认证审核列表接口")
    @RequestMapping(value = "/getSupplierList", method = { RequestMethod.POST})
    public JsonResponse getSupplierList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看结算商企业认证审核列表接口")
    @RequestMapping(value = "/getClearList", method = { RequestMethod.POST})
    public JsonResponse getClearList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看服务商企业认证审核列表接口")
    @RequestMapping(value = "/getProviderList", method = { RequestMethod.POST})
    public JsonResponse getProviderList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("个人查看企业类目及品牌认证资质列表")
    @RequestMapping(value = "/getPersonalBrand", method = { RequestMethod.POST})
    public JsonResponse getPersonalBrand(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核企业资质认证（服务商结算商）")
    @RequestMapping(value = "/auditEntCert", method = { RequestMethod.POST})
    public JsonResponse auditEntCert(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核企业基本信息认证接口（兼修改）")
    @RequestMapping(value = "/updateEntAuth", method = { RequestMethod.POST})
    public JsonResponse updateEntAuth(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核企业类目及品牌认证接口（兼修改）")
    @RequestMapping(value = "/auditEntBrand", method = { RequestMethod.POST})
    public JsonResponse auditEntBrand(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业认证大详情")
    @RequestMapping(value = "/getEntInfoAndAuth", method = { RequestMethod.POST})
    public JsonResponse getEntInfoAndAuth(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看企业列表接口")
    @RequestMapping(value = "/entListByAuthenType", method = { RequestMethod.POST})
    public JsonResponse<PageDTO<EntCustInfoDTO>> entListByAuthenType(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        PageDTO pageDTO = new PageDTO(); // 返回的PageDTO对象
        List<EntCustInfoDTO> list = new ArrayList<EntCustInfoDTO>();
        // JMockData模拟生成随机数据
        EntCustInfoDTO entCustInfoDTO = JMockData.mock(EntCustInfoDTO.class);
        list.add(entCustInfoDTO); // 将对象保存到list中
        pageDTO.setResultData(list);// 将结果保存到page对象中
        pageDTO.setPageNum(0); // 第0页
        pageDTO.setPageSize(10); // 每页显示10条
        pageDTO.setTotal(1); //共1条
        jsonResponse.setRetCode("0103001"); // 操作码：操作成功
        jsonResponse.setRspBody(pageDTO); // 将查询到的对象返回去
        jsonResponse.setRetDesc("成功"); // 返回值信息
        jsonResponse.setTimestamp(new Date()); // 接口响应的时间

        return jsonResponse;
    }
    
}
