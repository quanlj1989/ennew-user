package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.QuestionFeedbackDTO;
import cn.enn.ygego.sunny.user.dto.QuestionResponseDTO;
import cn.enn.ygego.sunny.user.dto.vo.QuestionFeedbackVO;
import cn.enn.ygego.sunny.user.dto.vo.QuestionResponseVO;
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

    void insertQuestion(QuestionFeedbackDTO questionFeedbackDTO);

    List<QuestionFeedback> questionList(QuestionFeedbackDTO questionFeedbackDTO);

    void insertQuestionResponse(QuestionResponseDTO questionResponseDTO);

    List<QuestionFeedbackDTO> findPage(QuestionFeedbackVO questionVO);

    QuestionFeedbackDTO findQuestion(QuestionFeedbackVO questionFeedbackVO);

    void insertBatchQuestionResponse(QuestionResponseVO questionResponseVO);

    void updateBatchQuestion(QuestionFeedbackVO questionFeedbackVO);

    Long findPageCount(QuestionFeedbackVO questionVO);
}