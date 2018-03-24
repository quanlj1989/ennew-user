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
import cn.enn.ygego.sunny.user.dto.EntChannelPermitApplyDTO;
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
        Date date = new Date();
        entChannelPermitApplyDTO.setCreateTime(date);
        //设置状态为有效
        entChannelPermitApplyDTO.setStatus(1);
        JsonResponse jsonResponse = new JsonResponse();
        EntChannelPermitApply entChannelPermitApply = new EntChannelPermitApply();
        BeanUtils.copyProperties(entChannelPermitApplyDTO,entChannelPermitApply);
        EntChannelPermitApply result = new EntChannelPermitApply();
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
    public JsonResponse channelList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        PageDTO pageDTO = new PageDTO(); // 返回的PageDTO对象
        List<EntChannelPermitApplyDTO> list = new ArrayList<EntChannelPermitApplyDTO>();
        // JMockData模拟生成随机数据
        EntChannelPermitApplyDTO entCertApplyDTO = JMockData.mock(EntChannelPermitApplyDTO.class);
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
    public JsonResponse audit(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
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
