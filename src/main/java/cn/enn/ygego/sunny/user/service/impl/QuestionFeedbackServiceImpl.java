package cn.enn.ygego.sunny.user.service.impl;

import cn.enn.ygego.sunny.user.dao.QuestionAttachDao;
import cn.enn.ygego.sunny.user.dao.QuestionFeedbackDao;
import cn.enn.ygego.sunny.user.dao.QuestionResponseDao;
import cn.enn.ygego.sunny.user.dto.QuestionAttachDTO;
import cn.enn.ygego.sunny.user.dto.QuestionFeedbackDTO;
import cn.enn.ygego.sunny.user.dto.QuestionResponseDTO;
import cn.enn.ygego.sunny.user.dto.vo.QuestionFeedbackVO;
import cn.enn.ygego.sunny.user.dto.vo.QuestionResponseVO;
import cn.enn.ygego.sunny.user.model.QuestionAttach;
import cn.enn.ygego.sunny.user.model.QuestionFeedback;
import cn.enn.ygego.sunny.user.model.QuestionResponse;
import cn.enn.ygego.sunny.user.service.QuestionFeedbackService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * dal Interface:QuestionFeedback
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class QuestionFeedbackServiceImpl implements QuestionFeedbackService{

    @Autowired
    private QuestionFeedbackDao questionFeedbackDao;

    @Autowired
    private QuestionAttachDao questionAttachDao;

    @Autowired
    private QuestionResponseDao questionResponseDao;

    /**
     * @Description 回复状态 0：未回复   1：已回复
     * @author liangchao
     * @date 2018/3/26 11:13
     */
    private static final Integer DIDREPLY = 0;
    private static final Integer HAVEREPLY = 1;

    private static final Integer DEFAULTSTATUS = 0;

    /**
     * @Description 问题编号前缀
     * @author liangchao
     * @date 2018/3/26 17:47
     */
    private static final String CODEPREFIX = "WT_";

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

    /**
     * @Description
     * @author liangchao
     * @date 2018/3/23 15:12
     * @param  questionFeedbackDTO
     * @return
     */
    @Override
    public void insertQuestion(QuestionFeedbackDTO questionFeedbackDTO) {
        QuestionFeedback questionFeedback =new QuestionFeedback();
        BeanUtils.copyProperties(questionFeedbackDTO, questionFeedback);
        //TODO：CODEPREFIX  QuestionCode .
        questionFeedback.setQuestionCode(this.CODEPREFIX);
        questionFeedback.setStatus(this.DEFAULTSTATUS);
        questionFeedback.setIsResponse(this.DIDREPLY);

        //保存反馈问题信息
        questionFeedbackDao.insertReturnIdSelective(questionFeedback);

        Long questionId = questionFeedback.getQuestionId();
        List<QuestionAttachDTO> attachDTOList = questionFeedbackDTO.getAttachList();

        if(null != attachDTOList && !attachDTOList.isEmpty()) {
            List<QuestionAttach> attachDTOS = new ArrayList<>();

            for (QuestionAttachDTO questionAttachDTO : attachDTOList) {

                questionAttachDTO.setQuestionId(questionId);

                QuestionAttach questionAttach = new QuestionAttach();
                BeanUtils.copyProperties(questionAttachDTO, questionAttach);

                attachDTOS.add(questionAttach);
            }
            questionAttachDao.insertBatch(attachDTOS);
        }
    }

    /**
     * @Description
     * @author liangchao
     * @date 2018/3/23 15:02
     * @param questionFeedbackDTO
     * @return
     */
    @Override
    public List<QuestionFeedback> questionList(QuestionFeedbackDTO questionFeedbackDTO) {
        QuestionFeedback questionFeedback = new QuestionFeedback();
        BeanUtils.copyProperties(questionFeedbackDTO, questionFeedback);
        return questionFeedbackDao.find(questionFeedback);
    }

    /**
     * @Description 回复反馈问题
     * @author liangchao
     * @date 2018/3/22 15:01
     * @param questionResponseDTO
     * @return
     */
    @Override
    public void insertQuestionResponse(QuestionResponseDTO questionResponseDTO) {

        QuestionResponse questionResponse = new QuestionResponse();
        BeanUtils.copyProperties(questionResponseDTO, questionResponse);

        questionResponseDao.insertSelective(questionResponse);
    }

    /**
     * @Description 批量回复信息 并更新信息状态和回复状态
     * @author liangchao
     * @date 2018/3/26 11:13
     * @param questionResponseVO
     * @return
     */
    @Override
    public void insertBatchQuestionResponse(QuestionResponseVO questionResponseVO) {
        List<QuestionResponse> list = new ArrayList<>();

        List<Long> idList = questionResponseVO.getIdList();
        Date date = new Date();
        for (Long questionId : idList) {
            QuestionResponse questionResponse = new QuestionResponse();
            BeanUtils.copyProperties(questionResponseVO, questionResponse);
            questionResponse.setQuestionId(questionId);
            questionResponse.setCreateTime(date);
            list.add(questionResponse);
        }
        if(null != list && !list.isEmpty()) {

            //准备批量更改问题状态
            QuestionFeedbackVO questionFeedbackVO = new QuestionFeedbackVO();
            questionFeedbackVO.setStatus(questionResponseVO.getStatus());
            questionFeedbackVO.setIsResponse(this.HAVEREPLY);
            questionFeedbackVO.setIdList(idList);

            //批量保存问题回复信息
            questionResponseDao.insertBatch(list);
            //批量修改“问题状态”“回复状态” 问题状态前台传入  *回复状态还未有字段更改为已回复  0：未回复 1：已回复
            questionFeedbackDao.updateBatchQuestion(questionFeedbackVO);
        }
    }

    @Override
    public void updateBatchQuestion(QuestionFeedbackVO questionFeedbackVO) {
        questionFeedbackDao.updateBatchQuestion(questionFeedbackVO);
    }

    /**
     * @Description 反馈问题分页查询
     * @author liangchao
     * @date 2018/3/22 14:59
     * @param questionVO
     * @return
     */
    @Override
    public List<QuestionFeedbackDTO> findPage(QuestionFeedbackVO questionVO) {
        List<QuestionFeedbackDTO> questionFeedbackList = questionFeedbackDao.findPage(questionVO);
        return questionFeedbackList;
    }

    @Override
    public Long findPageCount(QuestionFeedbackVO questionVO) {
        Long pageCount = questionFeedbackDao.findPageCount(questionVO);
        return pageCount;
    }

    /**
     * @Description 反馈问题信息详情
     * @author liangchao
     * @date 2018/3/23 14:59
     * @param questionFeedbackVO
     * @return
     */
    @Override
    public QuestionFeedbackDTO findQuestion(QuestionFeedbackVO questionFeedbackVO) {

        return questionFeedbackDao.getQuestionInfo(questionFeedbackVO);
    }

    /**
     * @Description questionAttachList转换questionAttachDTOList
     * @author liangchao
     * @date 2018/3/23 15:13
     * @param  questionAttachList
     * @return
     */
    private List<QuestionAttachDTO> converQuestionAttachList(List<QuestionAttach> questionAttachList) {
        List<QuestionAttachDTO> questionAttachDTOList = new ArrayList<>();
        for (QuestionAttach questionAttach : questionAttachList) {
            QuestionAttachDTO questionAttachDTO = new QuestionAttachDTO();
            BeanUtils.copyProperties(questionAttach, questionAttachDTO);
            questionAttachDTOList.add(questionAttachDTO);
        }
        return questionAttachDTOList;
    }

    /**
     * @Description questionResponseList转换questionResponseDTOList
     * @author liangchao
     * @date 2018/3/23 15:13
     * @param questionResponseList
     * @return
     */
    private List<QuestionResponseDTO> converQuestionResponseDTOList(List<QuestionResponse> questionResponseList) {
        List<QuestionResponseDTO> questionAttachDTOList = new ArrayList<>();
        for (QuestionResponse questionResponse : questionResponseList) {
            QuestionResponseDTO questionResponseDTO = new QuestionResponseDTO();
            BeanUtils.copyProperties(questionResponse, questionResponseDTO);
            questionAttachDTOList.add(questionResponseDTO);
        }

        return questionAttachDTOList;
    }

}