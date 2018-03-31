/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.controller.channelManage;

/**
 * ClassName: ChannelAuditController
 * Description:
 * Author: lizan
 * Date: 2018/3/20 13:51
 * History:
 * <author>          <time>          <version>          <desc>
 * lizan           2018/3/20 13:51   0.0.1              渠道审核接口
 */
import cn.enn.ygego.sunny.core.log.SearchableLoggerFactory;
import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.JsonResult;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.constant.ChannelAuthStatusEnum;
import cn.enn.ygego.sunny.user.constant.StatusConstant;
import cn.enn.ygego.sunny.user.dto.EntChannelPermitApplyDTO;
import cn.enn.ygego.sunny.user.dto.EntChannelPermitDTO;
import cn.enn.ygego.sunny.user.dto.vo.EntChannelPermitApplyVO;
import cn.enn.ygego.sunny.user.dto.vo.EntChannelPermitVO;
import cn.enn.ygego.sunny.user.model.EntChannelPermit;
import cn.enn.ygego.sunny.user.model.EntChannelPermitApply;
import cn.enn.ygego.sunny.user.service.EntChannelPermitApplyService;
import com.github.jsonzou.jmockdata.JMockData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user/channelAuth")
@Api(value = "渠道审核", description = "渠道审核")
public class ChannelAuditController {
    static final Logger logger = SearchableLoggerFactory.getDefaultLogger();
    @Autowired
    private EntChannelPermitApplyService entChannelPermitApplyService;

    /**
     * @Description 提交渠道准入申请
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/createAuth", method = { RequestMethod.POST})
    @ApiOperation("提交渠道准入申请")
    @ResponseBody
    public JsonResponse addDeliverAddress(@RequestBody JsonRequest<EntChannelPermitApplyDTO> request){
        EntChannelPermitApplyDTO entChannelPermitApplyDTO = request.getReqBody();
        JsonResponse jsonResponse = new JsonResponse();
        EntChannelPermitApply result = new EntChannelPermitApply();
        //设置状态为待审批
        entChannelPermitApplyDTO.setStatus(ChannelAuthStatusEnum.APPLY_STATUS_SUBMIT.getCode());
        //查询如果已经有待审批或，不准许再提交
        EntChannelPermitApply temp = new EntChannelPermitApply();
        temp.setChannelId(entChannelPermitApplyDTO.getChannelId());
        temp.setMemberId(entChannelPermitApplyDTO.getMemberId());
        temp.setStatus(ChannelAuthStatusEnum.APPLY_STATUS_SUBMIT.getCode());
        List list = entChannelPermitApplyService.findEntChannelPermitApplys(temp);
        if(list != null && list.size() > 0){
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc("该渠道申请正在审核中...");
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        Date date = new Date();
        entChannelPermitApplyDTO.setCreateTime(date);
        EntChannelPermitApply entChannelPermitApply = new EntChannelPermitApply();
        BeanUtils.copyProperties(entChannelPermitApplyDTO,entChannelPermitApply);
        try {
            int operation = entChannelPermitApplyService.createEntChannelPermitApply(entChannelPermitApply);
            if(operation == 1){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("提交渠道准入申请成功");
                result.setChannelApplyId(entChannelPermitApply.getChannelApplyId());
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("提交渠道准入申请失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("addDeliverAddress: 提交渠道准入申请接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }


    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("个人准入渠道列表")
    @RequestMapping(value = "/channelList", method = { RequestMethod.POST})
    public JsonResponse<List<EntChannelPermitApply>> channelList(@RequestBody JsonRequest<EntChannelPermitApply> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        EntChannelPermitApply entChannelPermitApply = jsonRequest.getReqBody();
        try {
            EntChannelPermitApplyVO entChannelPermitApplyVO = JMockData.mock(EntChannelPermitApplyVO.class);
            List<EntChannelPermitApplyVO> list = new ArrayList<EntChannelPermitApplyVO>();
            list.add(entChannelPermitApplyVO);
            //entChannelPermitApplyService.findEntChannelPermitApplys(entChannelPermitApply);
            if(list != null && list.size() > 0){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("个人准入渠道列表成功");
                jsonResponse.setRspBody(list);
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("个人准入渠道列表失败");
                jsonResponse.setRspBody(new ArrayList());
            }
        } catch (RuntimeException ex) {
            logger.error("findReceiveAddressInfo: 个人准入渠道列表报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(new ArrayList());
            return jsonResponse;
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("配置结算商接口")
    @RequestMapping(value = "/addPayment", method = { RequestMethod.POST})
    public JsonResponse addPayment(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改准入接口")
    @RequestMapping(value = "/modifyChannel", method = { RequestMethod.POST})
    public JsonResponse modifyChannel(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询入驻渠道的结算商接口")
    @RequestMapping(value = "/paymentMemberId", method = { RequestMethod.POST})
    public JsonResponse paymentMemberId(@RequestBody JsonRequest jsonRequest) {
        JsonResponse<Boolean> jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("提交准入接口")
    @RequestMapping(value = "/addChannel", method = { RequestMethod.POST})
    public JsonResponse addChannel(@RequestBody JsonRequest jsonRequest) {
        JsonResponse<Boolean> jsonResponse = new JsonResponse(); // 返回的对象
        jsonResponse.setRspBody(true);
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("添加渠道内超市接口")
    @RequestMapping(value = "/addMarket", method = { RequestMethod.POST})
    public JsonResponse addMarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看准入企业列表接口")
    @RequestMapping(value = "/entList", method = { RequestMethod.POST})
    public JsonResponse entList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改渠道内超市接口")
    @RequestMapping(value = "/modifyMarket", method = { RequestMethod.POST})
    public JsonResponse modifyMarket(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("审核准入接口")
    @RequestMapping(value = "/audit", method = { RequestMethod.POST})
    public JsonResponse audit(@RequestBody JsonRequest<EntChannelPermitVO> request) {
        EntChannelPermitVO entChannelPermitVO =  request.getReqBody();
        entChannelPermitVO.setCreateTime(new Date());
        List<EntChannelPermitApply> result = new ArrayList<EntChannelPermitApply>();
        JsonResponse jsonResponse = new JsonResponse();
        try {
            int operation = entChannelPermitApplyService.modifyEntChannelPermitApplyByPrimaryKey(entChannelPermitVO);
            if(operation == StatusConstant.VALID){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("审核准入接口成功");
                result = entChannelPermitVO.getEntChannelPermitApplyList();
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("审核准入接口失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("addDeliverAddress: 审核准入接口接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("渠道超市列表")
    @RequestMapping(value = "/marketList", method = { RequestMethod.POST})
    public JsonResponse marketList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

}
