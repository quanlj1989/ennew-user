package cn.enn.ygego.sunny.user.controller.BaseManage;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.QuestionFeedbackDTO;
import cn.enn.ygego.sunny.user.dto.vo.QuestionFeedbackVO;
import cn.enn.ygego.sunny.user.dto.vo.QuestionResponseVO;
import cn.enn.ygego.sunny.user.service.QuestionFeedbackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName: QuestionFeedbackController
 * Description:
 * Author: liangchao
 * Date: 2018/3/17 13:30
 * History:
 * <author>          <time>          <version>          <desc>
 * liangchao           修改时间           版本号              描述
 */
@RestController
@RequestMapping("/base/questionFeedback")
@Api(value="客服管理", description = "客服管理测试接口")

public class QuestionFeedbackController {
    Logger logger = LoggerFactory.getLogger(QuestionFeedbackController.class);

    @Autowired
    private QuestionFeedbackService questionFeedbackService;

    /**
     * @Description  分页信息
     * @author liangchao
     * @date 2018/3/28 14:03
     */
    private static final Integer DEFAULT_PAGESIZE = 10;
    private static final Integer DEFAULT_PAGE_NUM = 1;

    /**
     * @Description
     * @author liangchao 
     * @date 2018/3/17
     * @param  * @param jsonRequest
     * @return
     */
    @ApiOperation(value="提交问题反馈信息")
    @RequestMapping(value = "/insertQuestion", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse insertQuestion(@RequestBody JsonRequest<QuestionFeedbackDTO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        QuestionFeedbackDTO questionFeedback = jsonRequest.getReqBody();
        Date date = new Date();
        questionFeedback.setCreateTime(date);
        try {
            //保存问题反馈对象
            questionFeedbackService.insertQuestion(questionFeedback);
        } catch (Exception e) {
            logger.error("提交问题反馈信息出错",e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }
        return jsonResponse;
    }

    /**
     * @Description
     * @author liangchao
     * @date 2018/3/17
     * @param  * @param jsonRequest
     * @return
     */
    @ApiOperation(value="获取反馈问题列表")
    @RequestMapping(value = "/questionList", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse<PageDTO<List<QuestionFeedbackDTO>>> questionList(@RequestBody JsonRequest<QuestionFeedbackVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            QuestionFeedbackVO questionVO = jsonRequest.getReqBody();
            Integer pageNum = questionVO.getPageNum();
            Integer pageSize = questionVO.getPageSize();
            if(null == pageNum || pageNum.intValue() < 1) {
                pageNum = this.DEFAULT_PAGE_NUM;
                questionVO.setPageNum(this.DEFAULT_PAGE_NUM);
            }
            if(null == pageSize || pageSize.intValue() < 1) {
                pageSize = this.DEFAULT_PAGESIZE;
                questionVO.setPageSize(this.DEFAULT_PAGESIZE);
            }

            PageDTO pageDTO = new PageDTO(pageNum, pageSize);
            questionVO.setStartRow(pageDTO.getStartRow());
            Long pageCount = questionFeedbackService.findPageCount(questionVO);
            List<QuestionFeedbackDTO> list = null;
            if(pageCount.intValue() > 0) {

                list = questionFeedbackService.findPage(questionVO);
            } else {
                list = new ArrayList<>();
            }
            pageDTO.setTotal(pageCount);
            pageDTO.setResultData(list);
            jsonResponse.setRspBody(pageDTO);
        } catch (Exception e) {
            logger.error("获取反馈问题列表失败", e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }

        return jsonResponse;
    }

    /**
     * @Description
     * @author liangchao
     * @date 2018/3/17
     * @param  * @param jsonRequest
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation(value="获取反馈问题信息详情")
    @RequestMapping(value = "/questionInfo", method = { RequestMethod.POST}) //Information details
    @ResponseBody
    public JsonResponse<QuestionFeedbackDTO> questionInfo(@RequestBody JsonRequest<QuestionFeedbackVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        //获取反馈详细信息
        QuestionFeedbackVO questionFeedbackVO = jsonRequest.getReqBody();
        try {
            QuestionFeedbackDTO returnQuestionFeedback = questionFeedbackService.findQuestion(questionFeedbackVO);
            jsonResponse.setRspBody(returnQuestionFeedback);
        } catch (Exception e) {
            logger.error("获取反馈问题信息详情失败", e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());

        }
        return jsonResponse;
    }

    /**
     * @Description 
     * @author liangchao
     * @date 2018/3/24 15:31
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="批量修改反馈问题信息状态")
    @RequestMapping(value = "/updateStatusBatch", method = { RequestMethod.POST}) //Information details
    @ResponseBody
    public JsonResponse updateStatusBatch(@RequestBody JsonRequest<QuestionFeedbackVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        QuestionFeedbackVO questionFeedbackVO= jsonRequest.getReqBody();

        try {
            Integer status = questionFeedbackVO.getStatus();
            Integer isResponse = questionFeedbackVO.getIsResponse();
            List idList = questionFeedbackVO.getIdList();
            if(null == status && null == isResponse || null == idList || idList.isEmpty()) {

                logger.error("修改反馈问题信息状态为空");
                jsonResponse.setRetCode("0111111");
                jsonResponse.setRetDesc("修改反馈问题信息参数出错！");
            } else {

                questionFeedbackService.updateBatchQuestion(questionFeedbackVO);
            }
        } catch (Exception e) {
            logger.error("修改反馈问题信息出错", e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }

        return jsonResponse;
    }

    /**
     * @Description 批量回复客服问题反馈
     * @author liangchao
     * @date 2018/3/24 15:21
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="批量回复客服问题反馈")
    @RequestMapping(value = "/replyBatchQuestion", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse replyBatchQuestion(@RequestBody JsonRequest<QuestionResponseVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();

        QuestionResponseVO questionResponseVO = jsonRequest.getReqBody();
        List<Long> idList = questionResponseVO.getIdList();
        if(null == idList || idList.isEmpty()) {
            logger.error("提交回复客服反馈idList为空");
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc("提交回复客服反馈参数信息出错");
        }
        try {
            questionFeedbackService.insertBatchQuestionResponse(questionResponseVO);
        } catch (Exception e) {
            logger.error("提交回复客服反馈信息出错",e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }

        return jsonResponse;
    }


    /**
     * @Description 
     * @author liangchao
     * @date 2018/3/26 19:02
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="批量回复游客客服问题反馈")
    @RequestMapping(value = "/replyTouristQuestion", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse<QuestionFeedbackDTO> replyTouristQuestion(@RequestBody JsonRequest<QuestionResponseVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        //TODO：回复游客  通过邮箱  发送"问题信息"以及"回复内容"

        return jsonResponse;
    }

    //    /**
    //     * @Description 修改反馈问题信息
    //     * @author liangchao
    //     * @date 2018/3/24 15:47
    //     * @param jsonRequest
    //     * @return
    //     */
    //    @ApiOperation(value="修改反馈问题信息")
    //    @RequestMapping(value = "/updateQuestion", method = { RequestMethod.POST}) //Information details
    //    @ResponseBody
    //    public JsonResponse updateQuestion(@RequestBody JsonRequest<QuestionFeedbackDTO> jsonRequest) {
    //        JsonResponse jsonResponse = new JsonResponse();
    //        QuestionFeedbackDTO questionFeedbackDTO = jsonRequest.getReqBody();
    //        QuestionFeedback questionFeedback = new QuestionFeedback();
    //        try {
    //            BeanUtils.copyProperties(questionFeedbackDTO ,questionFeedback);
    //            questionFeedbackService.modifyQuestionFeedbackByPrimaryKey(questionFeedback);
    //        } catch (Exception e) {
    //            logger.error("修改反馈问题信息", e.getMessage());
    //            jsonResponse.setRetCode("0111111");
    //            jsonResponse.setRetDesc(e.getMessage());
    //        }
    //        return jsonResponse;
    //    }

    //    /**
    //     * @Description
    //     * @author liangchao
    //     * @date 2018/3/17
    //     * @param  * @param jsonRequest
    //     * @return
    //     */
    //    @SuppressWarnings({ "rawtypes", "unchecked" })
    //    @ApiOperation(value="回复客服反馈")
    //    @RequestMapping(value = "/replyQuestion", method = { RequestMethod.POST})
    //    @ResponseBody
    //    public JsonResponse replyQuestion(@RequestBody JsonRequest<QuestionResponseDTO> jsonRequest) {
    //        JsonResponse jsonResponse = new JsonResponse();
    //
    //        QuestionResponseDTO questionResponse = jsonRequest.getReqBody();
    //        Date date = new Date();
    //        questionResponse.setCreateTime(date);
    //        try {
    //            questionFeedbackService.insertQuestionResponse(questionResponse);
    //        } catch (Exception e) {
    //            logger.error("提交回复客服反馈信息出错",e.getMessage());
    //            jsonResponse.setRetCode("0111111");
    //            jsonResponse.setRetDesc(e.getMessage());
    //        }
    //
    //        return jsonResponse;
    //    }

}
