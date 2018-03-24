package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.QuestionFeedbackService;
import cn.enn.ygego.sunny.user.dao.QuestionFeedbackDao;
import cn.enn.ygego.sunny.user.model.QuestionFeedback;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:QuestionFeedback
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class QuestionFeedbackServiceImpl implements QuestionFeedbackService{

    @Autowired
    private QuestionFeedbackDao questionFeedbackDao;

    public List<QuestionFeedback> findAll(){
       return  questionFeedbackDao.findAll();
    }

    public List<QuestionFeedback> findQuestionFeedbacks(QuestionFeedback record){
       return  questionFeedbackDao.find(record);
    }

    public QuestionFeedback getQuestionFeedbackByPrimaryKey(Long questionId){
        return questionFeedbackDao.getByPrimaryKey(questionId);
    }

    public Integer createQuestionFeedback(QuestionFeedback record){
        return questionFeedbackDao.insert(record);
    }

    public Integer removeQuestionFeedback(QuestionFeedback record){
        return questionFeedbackDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long questionId){
    	return questionFeedbackDao.deleteByPrimaryKey(questionId);
    }

    public Integer modifyQuestionFeedbackByPrimaryKey(QuestionFeedback record){
        return questionFeedbackDao.updateByPrimaryKey(record);
    }









}