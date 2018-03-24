package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.QuestionResponseService;
import cn.enn.ygego.sunny.user.dao.QuestionResponseDao;
import cn.enn.ygego.sunny.user.model.QuestionResponse;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:QuestionResponse
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class QuestionResponseServiceImpl implements QuestionResponseService{

    @Autowired
    private QuestionResponseDao questionResponseDao;

    public List<QuestionResponse> findAll(){
       return  questionResponseDao.findAll();
    }

    public List<QuestionResponse> findQuestionResponses(QuestionResponse record){
       return  questionResponseDao.find(record);
    }

    public QuestionResponse getQuestionResponseByPrimaryKey(Long responseId){
        return questionResponseDao.getByPrimaryKey(responseId);
    }

    public Integer createQuestionResponse(QuestionResponse record){
        return questionResponseDao.insert(record);
    }

    public Integer removeQuestionResponse(QuestionResponse record){
        return questionResponseDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long responseId){
    	return questionResponseDao.deleteByPrimaryKey(responseId);
    }

    public Integer modifyQuestionResponseByPrimaryKey(QuestionResponse record){
        return questionResponseDao.updateByPrimaryKey(record);
    }









}