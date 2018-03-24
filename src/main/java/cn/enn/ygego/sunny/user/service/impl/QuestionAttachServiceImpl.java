package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.QuestionAttachService;
import cn.enn.ygego.sunny.user.dao.QuestionAttachDao;
import cn.enn.ygego.sunny.user.model.QuestionAttach;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:QuestionAttach
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class QuestionAttachServiceImpl implements QuestionAttachService{

    @Autowired
    private QuestionAttachDao questionAttachDao;

    public List<QuestionAttach> findAll(){
       return  questionAttachDao.findAll();
    }

    public List<QuestionAttach> findQuestionAttachs(QuestionAttach record){
       return  questionAttachDao.find(record);
    }

    public QuestionAttach getQuestionAttachByPrimaryKey(Long questionAttachId){
        return questionAttachDao.getByPrimaryKey(questionAttachId);
    }

    public Integer createQuestionAttach(QuestionAttach record){
        return questionAttachDao.insert(record);
    }

    public Integer removeQuestionAttach(QuestionAttach record){
        return questionAttachDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long questionAttachId){
    	return questionAttachDao.deleteByPrimaryKey(questionAttachId);
    }

    public Integer modifyQuestionAttachByPrimaryKey(QuestionAttach record){
        return questionAttachDao.updateByPrimaryKey(record);
    }









}