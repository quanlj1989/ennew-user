package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.QuestionResponse;

/**
 * dal Interface:QuestionResponse
 * @author gencode
 * @date 2018-3-22
 */
public interface QuestionResponseService {

    public List<QuestionResponse> findAll();

    public List<QuestionResponse> findQuestionResponses(QuestionResponse record);

    public QuestionResponse getQuestionResponseByPrimaryKey(Long responseId);

    public Integer createQuestionResponse(QuestionResponse record);

    public Integer removeQuestionResponse(QuestionResponse record);

    public Integer removeByPrimaryKey(Long responseId);

    public Integer modifyQuestionResponseByPrimaryKey(QuestionResponse record);



}