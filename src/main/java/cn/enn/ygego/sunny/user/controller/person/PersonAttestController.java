package cn.enn.ygego.sunny.user.controller.person;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.constant.ExamineStatusEnum;
import cn.enn.ygego.sunny.user.dto.IndividualCertApplyDTO;
import cn.enn.ygego.sunny.user.dto.vo.IndividualCertApplyVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonVO;
import cn.enn.ygego.sunny.user.model.IndividualCertApply;
import cn.enn.ygego.sunny.user.service.IndividualCertApplyService;
import cn.enn.ygego.sunny.user.service.IndividualCustService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 个人认证接口
 * ClassName: OersonAttestController	
 * Description 
 * Author puanl
 * Date 2018年3月17日 下午5:41:25 
 * History: 
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
@RequestMapping("user/person/attest")
@Api(value = "个人认证接口", description = "个人认证接口")
public class PersonAttestController {

    private Logger logger = LoggerFactory.getLogger(PersonAttestController.class);
    
    @Autowired
    private IndividualCertApplyService individualCertApplyService;  /* 个人认证申请  */ 
    @Autowired
    private IndividualCustService individualCustService;  /* 客户个人信息服务 */
    
    /**
     * 查询个人认证数据列表
     * @Description 查询个人认证数据列表
     * @author puanl
     * @date 2018年3月21日 下午7:32:25 
     * @param request
     * @return
     */
    @RequestMapping(value="/getList", method = { RequestMethod.POST})
    @ApiOperation("查看个人认证列表接口")
    @ResponseBody
    public JsonResponse<PageDTO<IndividualCertApplyVO>> getList(@RequestBody JsonRequest<PersonQueryVO> request){
        logger.info("PersonAttestController.getList request= {}",request);
        JsonResponse<PageDTO<IndividualCertApplyVO>> result = null;
        // 入参条件
        PersonQueryVO query = request.getReqBody();
        // 处理查询条件，计算分页
        Integer totalNum = individualCertApplyService.getAcctCertApplyCount(query);
        PageDTO<IndividualCertApplyVO> page = new PageDTO<>(query.getPageNum(), query.getPageSize());
        page.setTotal(totalNum);
        query.setStartRow(page.getStartRow());
        // 查询列表
        List<IndividualCertApplyVO> queryList = individualCertApplyService.getAcctCertApplyList(query);
        page.setResultData(queryList);
        // 返回分页对象
        result = new JsonResponse<PageDTO<IndividualCertApplyVO>>(page);
        return result;
    }
    
    /**
     * @Description 查看个人认证 申请详情接口（审批详情）
     * @author puanl
     * @date 2018年3月21日 下午7:37:19 
     * @param request
     * @return
     */
    @RequestMapping(value="/getAttestDetail", method = { RequestMethod.POST})
    @ApiOperation("查看个人认证详情接口（审批详情） 申请")
    @ResponseBody
    public JsonResponse<IndividualCertApplyVO> getAttestDetail(@RequestBody JsonRequest<IndividualCertApplyVO> request){
        logger.info("PersonAttestController.getAttestDetail request= {}",request);
        JsonResponse<IndividualCertApplyVO> result = null;
        IndividualCertApplyVO query = request.getReqBody();
        IndividualCertApplyVO detail = individualCertApplyService.getCertApplyByMemberId(query,true);
        result = new JsonResponse<IndividualCertApplyVO>(detail);
        return result;
    }
    
    /**
     * @Description 申请个人实名认证接口
     * @author puanl
     * @date 2018年3月22日 下午5:09:08 
     * @param request
     * @return
     */
    @RequestMapping(value="/apply", method = { RequestMethod.POST})
    @ApiOperation("申请个人实名认证接口")
    @ResponseBody
    public JsonResponse<IndividualCertApplyDTO> apply(@RequestBody JsonRequest<IndividualCertApplyDTO> request){
        logger.info("PersonAttestController.apply request= {}",request);
        JsonResponse<IndividualCertApplyDTO> result = null;
        IndividualCertApplyDTO applyData = request.getReqBody();
        // 判断会员ID与账户ID是否一致，且会员ID为
        PersonVO person = individualCustService.getPersonDetail(applyData.getMemberId(), null);
        if(person == null || person.getMemberType() != 3 ){
            result = new JsonResponse<>("502", "会员信息不正确！");
            return result;
        }
        // 验证是否已经申请认证
        IndividualCertApply record = new IndividualCertApply();
        record.setMemberId(applyData.getMemberId()); //会员id
        List<IndividualCertApply> recordIdList = individualCertApplyService.findIndividualCertApplys(record);
        if(recordIdList.size() > 0){
            result = new JsonResponse<>("502", "已经申请认证，不能重复申请。");
            return result;
        }
        // 根据身份证号 验证是否重复
        record.setMemberId(null);
        record.setCertType(applyData.getCertType()); // 证件类型
        record.setCertCode(applyData.getCertCode()); // 证件号码
        record.setStatus(ExamineStatusEnum.APPLY_STATUS_AGREE.getCode());                         // 审批通过的
        List<IndividualCertApply> recordCodeList = individualCertApplyService.findIndividualCertApplys(record);
        if(recordCodeList.size() > 0){
            result = new JsonResponse<>("502", "身份证件号重复已经申请认证，不能重复。");
            return result;
        }
        // 新增认证信息
        try{
            applyData.setStatus(ExamineStatusEnum.APPLY_STATUS_SUBMIT.getCode());  // 申请个人认证
            
            individualCertApplyService.addIndividualCertApply(applyData);
        }catch (Exception e) {
            e.printStackTrace();
            result = new JsonResponse<>("502", "提交异常，个人资质申请失败。");
            return result;
        }
        
        result = new JsonResponse<>(applyData);
        return result;
    }
    
    /**
     * @Description 审核个人认证接口
     * @author puanl
     * @date 2018年3月22日 下午5:11:05 
     * @param request
     * @return
     */
    @RequestMapping(value="/examine", method = { RequestMethod.POST})
    @ApiOperation("审核个人认证接口")
    @ResponseBody
    public JsonResponse<IndividualCertApply> examine(@RequestBody JsonRequest<IndividualCertApplyDTO> request){
        logger.info("PersonAttestController.examine request= {}",request);
        JsonResponse<IndividualCertApply> result = null;
        
        IndividualCertApplyDTO applyData = request.getReqBody();
        
        // 获取个人资质申请信息
        IndividualCertApply record = individualCertApplyService.getIndividualCertApplyByPrimaryKey(applyData.getCertApplyId());
        // 验证个人资质申请信息是否存在
        if(record == null || record.getCertApplyId() == null){
            result = new JsonResponse<>("502", "资质审核信息不存在。");
            return result;
        }
        // 验证个人资质申请信息状态 
        if(record.getStatus() != ExamineStatusEnum.APPLY_STATUS_SUBMIT.getCode() ){
            result = new JsonResponse<>("502", "资质审核信息不能重复审批");
            return result;
        }
        
        record.setStatus(applyData.getStatus()); // 设置状态
        record.setApproveAcctId(applyData.getApproveAcctId());  /* 审核人账户ID */ 
        record.setApproveName(applyData.getApproveName());   /* 审核人姓名 */ 
        record.setApproveMemberId(applyData.getApproveMemberId());  /* 审核人会员ID */ 
        record.setApproveDesc(applyData.getApproveDesc());  /* 审核结果描述 */ 
        record.setAuditTime(new Date());  /* 审核时间 */ 
        
        if(record.getStatus() == ExamineStatusEnum.APPLY_STATUS_AGREE.getCode()){ 
            try{
                // 审批通过，更新审批表信息
                individualCertApplyService.modifyIndividualCertApplyByPrimaryKey(record);
                // 复制数据 添加到正式表
                individualCertApplyService.copyApplyToIndividualCust(record);
                
                // TODO 更新账户表用户信息
                
            }catch (Exception e) {
                e.printStackTrace();
                result = new JsonResponse<>("502", "保存失败");
                return result;
            }
        }else if(record.getStatus() == ExamineStatusEnum.APPLY_STATUS_REFUSE.getCode()){ 
            // 审批不通过，更新数据
            individualCertApplyService.modifyIndividualCertApplyByPrimaryKey(record);
        }
        
        result = new JsonResponse<>(record);
        
        return result;
    }
    
    /**
     * @Description 修改（重新申请）个人认证接口
     * @author puanl
     * @date 2018年3月22日 下午5:13:01 
     * @param request
     * @return
     */
    @RequestMapping(value="/reapplication", method = { RequestMethod.POST})
    @ApiOperation("修改（重新申请）个人认证接口")
    @ResponseBody
    public JsonResponse<IndividualCertApplyDTO> reapplication(@RequestBody JsonRequest<IndividualCertApplyDTO> request){
        logger.info("PersonAttestController.reapplication request= {}",request);
        
        JsonResponse<IndividualCertApplyDTO> result = null;
        
        IndividualCertApplyDTO applyData = request.getReqBody();
        
        // 获取资质信息
        IndividualCertApply apply = individualCertApplyService.getIndividualCertApplyByPrimaryKey(applyData.getCertApplyId());
        if(apply == null){
            result = new JsonResponse<>("502","资质申请不存在。");
            return result;
        }
        // 根据身份证号 验证是否重复
        IndividualCertApply record = new IndividualCertApply();
        record.setCertType(applyData.getCertType()); // 证件类型
        record.setCertCode(applyData.getCertCode()); // 证件号码
        record.setStatus(ExamineStatusEnum.APPLY_STATUS_AGREE.getCode()); // 审批通过的
        List<IndividualCertApply> recordCodeList = individualCertApplyService.findIndividualCertApplys(record);
        if(recordCodeList.size() > 0){
            result = new JsonResponse<>("502", "身份证件号重复已经申请认证，不能重复。");
            return result;
        }
        // 更新申请数据
        try {
            applyData.setStatus(ExamineStatusEnum.APPLY_STATUS_SUBMIT.getCode());  // 设置待审批状态
            individualCertApplyService.updateIndividualCertApply(applyData);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
        result = new JsonResponse<>(applyData);
        return result;
        
    }
    
}
