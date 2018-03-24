package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.QuestionFeedback;

/**
 * dal Interface:QuestionFeedback
 * @author gencode
 * @date 2018-3-22
 */
public interface QuestionFeedbackService {

    public List<QuestionFeedback> findAll();

    public List<QuestionFeedback> findQuestionFeedbacks(QuestionFeedback record);

    public QuestionFeedback getQuestionFeedbackByPrimaryKey(Long questionId);

    public Integer createQuestionFeedback(QuestionFeedback record);

    public Integer removeQuestionFeedback(QuestionFeedback record);

    public Integer removeByPrimaryKey(Long questionId);

    public Integer modifyQuestionFeedbackByPrimaryKey(QuestionFeedback record);



}