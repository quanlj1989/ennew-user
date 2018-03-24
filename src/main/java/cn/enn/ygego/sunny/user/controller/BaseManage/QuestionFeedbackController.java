package cn.enn.ygego.sunny.user.controller.BaseManage;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.QuestionFeedbackDTO;
import cn.enn.ygego.sunny.user.dto.QuestionResponseDTO;
import com.github.jsonzou.jmockdata.JMockData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/base/questionFeedback")
@Api(value="客服管理", description = "客服管理测试接口")
public class QuestionFeedbackController {
    Logger logger = LoggerFactory.getLogger(QuestionFeedbackController.class);

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation(value="提交问题反馈信息")
    @RequestMapping(value = "/submitQuestion", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse submitQuestion(JsonRequest jsonRequest) {
        QuestionFeedbackDTO questionFeedbackDTO = JMockData.mock(QuestionFeedbackDTO.class);
        jsonRequest.setReqBody(questionFeedbackDTO);
        //TODO：检查参数必填项
        //TODO：上传照片
        //TODO：保存问题反馈对象
        //TODO: return 失败 成功
        return new JsonResponse();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @RequestMapping(value = "/sendMessage", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse sendMessage(JsonRequest jsonRequest) {//参数问题反馈对象
        //TODO：检查mail是否正确
        //TODO：发送验证码
        //TODO: return 失败 成功返回验证码
        return new JsonResponse();
    }

    @ApiOperation(value="获取反馈问题列表")
    @RequestMapping(value = "/questionList", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse<PageDTO<QuestionFeedbackDTO>> questionList(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();

        PageDTO<QuestionFeedbackDTO> pageDTO = new PageDTO<>();
        ArrayList list = new ArrayList<QuestionFeedbackDTO>();

        QuestionFeedbackDTO questionFeedbackDTO = JMockData.mock(QuestionFeedbackDTO.class);
        list.add(questionFeedbackDTO);

        pageDTO.setResultData(list);
        pageDTO.setPageNum(0); // 第0页
        pageDTO.setPageSize(10); // 每页显示10条
        pageDTO.setTotal(1); //共1条

        jsonResponse.setRspBody(pageDTO);

        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation(value="反馈问题信息详情")
    @RequestMapping(value = "/questionInfo", method = { RequestMethod.POST}) //Information details
    @ResponseBody
    public JsonResponse<QuestionFeedbackDTO> questionInfo(@RequestBody JsonRequest jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        //TODO：获取反馈详细信息
        //JMockData.mock(QuestionFeedbackDTO.class);  模拟数据
        QuestionFeedbackDTO questionFeedbackDTO = JMockData.mock(QuestionFeedbackDTO.class);

        jsonResponse.setRspBody(questionFeedbackDTO);
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation(value="回复客服反馈")
    @RequestMapping(value = "/replyQuestion", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse<QuestionResponseDTO> replyQuestion(@RequestBody JsonRequest jsonRequest) {
        QuestionResponseDTO reqBody = (QuestionResponseDTO) jsonRequest.getReqBody();
        Long questionId = reqBody.getQuestionId();
        String responseContent = reqBody.getResponseContent();

        JsonResponse jsonResponse = new JsonResponse();

        return jsonResponse;
    }

}
