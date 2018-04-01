package cn.enn.ygego.sunny.user.controller.person;

import cn.enn.ygego.sunny.core.log.SearchableLoggerFactory;
import cn.enn.ygego.sunny.user.constant.PersonConstant;
import cn.enn.ygego.sunny.user.dto.DeliverAddressDTO;
import cn.enn.ygego.sunny.user.dto.IndividualCustDTO;
import cn.enn.ygego.sunny.user.dto.ReceiveAddressDTO;
import cn.enn.ygego.sunny.user.dto.vo.BaseQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.EmployeeQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.EmployeeVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.model.BusiAcctInfo;
import cn.enn.ygego.sunny.user.model.DeliverAddress;
import cn.enn.ygego.sunny.user.model.EntCustInfo;
import cn.enn.ygego.sunny.user.model.MemberInfo;
import cn.enn.ygego.sunny.user.model.ReceiveAddress;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcct;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcctApply;
import cn.enn.ygego.sunny.user.service.BusiAcctInfoService;
import cn.enn.ygego.sunny.user.service.DeliverAddressService;
import cn.enn.ygego.sunny.user.service.EntCustInfoService;
import cn.enn.ygego.sunny.user.service.IndividualCustService;
import cn.enn.ygego.sunny.user.service.MemberInfoService;
import cn.enn.ygego.sunny.user.service.ReceiveAddressService;
import cn.enn.ygego.sunny.user.service.RelaMemberToAcctApplyService;
import cn.enn.ygego.sunny.user.service.RelaMemberToAcctService;

import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.vo.PersonVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Date;
import java.util.List;

/**
 * 个人管理接口
 * ClassName: PersonController	
 * Description 
 * Author "quanlinjie"
 * Date 2018年3月17日 下午3:49:21 
 * History: 
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
@RequestMapping("user/personManager")
@Api(value = "个人管理接口", description = "个人管理接口")
public class PersonManagerController {
    static final Logger logger = SearchableLoggerFactory.getDefaultLogger();

    @Autowired
    private ReceiveAddressService receiveAddressService;
    @Autowired
    private DeliverAddressService deliverAddressService;
    @Autowired
    private IndividualCustService individualCustService;  /* 客户个人信息服务 */
    @Autowired
    private RelaMemberToAcctService relaMemberToAcctService; /* 账户会员关系表 */
    @Autowired
    private RelaMemberToAcctApplyService relaMemberToAcctApplyService;  /* 账户申请会员审批表 */
    @Autowired
    private MemberInfoService memberInfoService;  /* 会员数据表 */
    @Autowired
    private BusiAcctInfoService busiAcctInfoService;  /* 业务账户表 */
    @Autowired
    private EntCustInfoService entCustInfoService;   /* 企业信息表 */

    private int defaultPageNum = 1;
    private int defaultPageSize = 10;
    
    /**
     * @Description 查看个人用户列表接口
     * @author "quanlinjie"
     * @date 2018年3月17日 下午6:01:31 
     * @param request
     * @return
     */
    @RequestMapping(value="/getList", method = { RequestMethod.POST})
    @ApiOperation("查看个人用户列表接口")
    @ResponseBody
    public JsonResponse<PageDTO<PersonVO>> getList(@RequestBody JsonRequest<PersonQueryVO> request){
        logger.info("PersonManagerController.getList request = {}" , request);
        JsonResponse<PageDTO<PersonVO>> result = null;
        // 入参条件
        PersonQueryVO query = request.getReqBody();
        // 处理查询条件，计算分页
        Integer totalNum = relaMemberToAcctService.getPersonCount(query);
        PageDTO<PersonVO> page = new PageDTO<>(query.getPageNum()==null?defaultPageNum:query.getPageNum(), 
                query.getPageSize()==null?defaultPageSize:query.getPageSize());
        page.setTotal(totalNum);
        query.setStartRow(page.getStartRow());
        // 查询列表
        List<PersonVO> queryList = relaMemberToAcctService.getPersonList(query);
        page.setResultData(queryList);
        result = new JsonResponse<>(page);
        return result;
    }

    /**
     * @Description 查看个人用户详情接口（对外封装）
     * @author "quanlinjie"
     * @date 2018年3月17日 下午5:57:00 
     * @param request
     * @return
     */
    @RequestMapping(value="/getDetail", method = { RequestMethod.POST})
    @ApiOperation("查看个人用户详情接口")
    @ResponseBody
    public JsonResponse<PersonVO> getDetail(@RequestBody JsonRequest<PersonQueryVO> request){
    	logger.info("PersonManagerController.getDetail request= {}",request);
        JsonResponse<PersonVO> result = null;
        // 获取参数，验证传入查询ID
        PersonQueryVO query = request.getReqBody();
        if(query == null || (query.getMemberId() == null && query.getAcctId() == null) ){
            result = new JsonResponse<>("502","查询账号不能为空");
            return result;
        }
        PersonQueryVO personQuery = null;
        PersonVO resultPerson = null;
        // 根据账户ID，查询用户账户ID
        if(query.getAcctId() != null){
        	personQuery = new PersonQueryVO();
        	personQuery.setAcctId(query.getAcctId());
        	personQuery.setMemberType(PersonConstant.MEMBER_TYPE_PERSON);
        	List<PersonVO> queryList = relaMemberToAcctService.getPersonList(personQuery);
        	if(queryList != null && queryList.size() > 0){
        		resultPerson = queryList.get(0);
            }
        }
        // 根据会员ID，查询账户信息
        if(resultPerson == null && query.getMemberId() != null){
        	personQuery = new PersonQueryVO();
        	personQuery.setMemberId(query.getMemberId());
        	personQuery.setMemberType(PersonConstant.MEMBER_TYPE_PERSON);
        	List<PersonVO> queryList = relaMemberToAcctService.getPersonList(personQuery);
        	if(queryList != null && queryList.size() > 0 ){
        		resultPerson = queryList.get(0);
        	}
        }
        // 查询个人资质认证信息
        if(resultPerson != null){
        	IndividualCustDTO individualCust = individualCustService.getIndividualCustById(resultPerson.getMemberId(),true);
            if(individualCust != null){
            	resultPerson.setCertCode(individualCust.getCertCode()); // 添加身份证号
            	resultPerson.setCertType(individualCust.getCertType()); // 添加证件类型
            	resultPerson.setIndividualCust(individualCust);  // 添加附件
            }
        }
        // 若会员ID为企业会员ID,则查询企业信息
        if(resultPerson != null && resultPerson.getMemberId() != query.getMemberId()){
    		EntCustInfo entCustInfo = entCustInfoService.getEntCustInfoByPrimaryKey(query.getMemberId());
    		resultPerson.setEntCustInfo(entCustInfo);
    	}
        result = new JsonResponse<>(resultPerson);
        return result;
    }
    
    /**
     * TODO
     * @Description 导出个人用户列表EXCEL接口
     * @author "quanlinjie"
     * @date 2018年3月17日 下午5:55:52 
     * @param request
     * @return
     */
    @RequestMapping(value="/exportList", method = { RequestMethod.POST})
    @ApiOperation("导出个人用户列表EXCEL接口")
    @ResponseBody
    public void exportList(@RequestBody JsonRequest<PersonQueryVO> request){
        //TODO
    }
    
    /**
     * TODO
     * @Description 企业管理员转让接口（只能转让该企业下个人认证的用户）
     * @author "quanlinjie"
     * @date 2018年3月17日 下午5:54:40 
     * @param request
     * @return
     */
    @RequestMapping(value="/attornAdmin", method = { RequestMethod.POST})
    @ApiOperation("企业管理员转让接口")
    @ResponseBody
    public JsonResponse<Boolean> attornAdmin(@RequestBody JsonRequest<PersonQueryVO> request){
        JsonResponse<Boolean> result = null;
        /* 入参：
         *  entMemberId;        企业会员id 
         *  newAdminMemberId;   转让的 个人会员id 
         *  acctId;             账户ID 
         *  memberId;           会员ID 
         */
        PersonQueryVO query = request.getReqBody();
        
        // 验证个人用户与企业是否有关联
        RelaMemberToAcct relaQuery = new RelaMemberToAcct();
        relaQuery.setAcctId(query.getAcctId());
        relaQuery.setMemberId(query.getEntMemberId());
        relaQuery.setMemberType(PersonConstant.MEMBER_TYPE_COMPANY);
        List<RelaMemberToAcct> relaList = relaMemberToAcctService.findRelaMemberToAccts(relaQuery);
        if(relaList == null || relaList.size() <= 0){
            result = new JsonResponse<>("502","当前操作账户与企业没有关联！");
            return result;
        }
        
        // TODO 基于上面的关系 验证当前人是否为企业管理员；
        
        // TODO 验证转让是否为个人 （ 被传让人只能为企业下的员工 ）
        MemberInfo newAdminMember = memberInfoService.getMemberInfoByPrimaryKey(query.getNewAdminMemberId());
        if(newAdminMember == null || newAdminMember.getMemberType() != PersonConstant.MEMBER_TYPE_PERSON){
            result = new JsonResponse<>("502","转让会员不存在，或不为个人会员ID");
            return result;
        }
        
        // TODO 转让管理员身份
        Boolean success = relaMemberToAcctService.modifyEntAdminRela(newAdminMember, relaList.get(0));
        result = new JsonResponse<>(success);
        return result;
    }
    
    /**
     * @Description 查看企业员工列表 
     * @author "quanlinjie"
     * @date 2018年3月19日 下午7:48:58 
     * @param request
     * @return
     */
    @RequestMapping(value="/getEntEmployeeApplyList", method = { RequestMethod.POST})
    @ApiOperation("获取企业员工申请列表")
    @ResponseBody
    public JsonResponse<PageDTO<EmployeeVO>> getEntEmployeeApplyList(@RequestBody JsonRequest<EmployeeQueryVO> request){
    	logger.info("PersonManagerController.getEmployeeApplyList request= {}",request);
        /* 1.查看用户申请列表，关联用户个人审批表，未审批通过的（不能审批）不能显示
         * */
        JsonResponse<PageDTO<EmployeeVO>> result = new JsonResponse<PageDTO<EmployeeVO>>();
        EmployeeQueryVO query = request.getReqBody();
        Integer totalNum = relaMemberToAcctApplyService.getEmployeeApplyCount(query);
        PageDTO<EmployeeVO> page = new PageDTO<>(query.getPageNum()==null?1:query.getPageNum(), 
                query.getPageSize()==null?10:query.getPageSize());
        page.setTotal(totalNum);
        query.setStartRow(page.getStartRow());
        // 查询列表
        List<EmployeeVO> queryList = relaMemberToAcctApplyService.getEmployeeApplyList(query);
        page.setResultData(queryList);
        result = new JsonResponse<>(page);
        return result;
    }
    
    /**
     * @Description 查看个人申请企业申请详情
     * @author puanl
     * @date 2018年3月24日 下午3:51:22 
     * @param request
     * @return
     */
    @RequestMapping(value="/getEmployeeApplyDetail", method = { RequestMethod.POST})
    @ApiOperation("获取企业员工申请详情")
    @ResponseBody
    public JsonResponse<EmployeeVO> getEntEmployeeApplyDetail(@RequestBody JsonRequest<EmployeeQueryVO> request){
    	logger.info("PersonManagerController.getEmployeeApplyDetail request= {}",request);
        JsonResponse<EmployeeVO> result = null;
        EmployeeQueryVO query = request.getReqBody();
        if(query == null ){
        	result = new JsonResponse<>("502","查询ID不能为空");
            return result;
        }
        EmployeeVO employee = relaMemberToAcctApplyService.getEmployeeApplyDetail(query);
        result = new JsonResponse<>(employee);
        return result;
    }
    
    /**
     * @Description 
     * @author puanl
     * @date 2018年3月28日 下午6:58:32 
     * @param request
     * @return
     */
    /*@RequestMapping(value="/getApplyJoinEntDetail", method = { RequestMethod.POST})
    @ApiOperation("查询个人申请加入企业详情")
    @ResponseBody
    public JsonResponse<EmployeeVO> getApplyJoinEntDetail(@RequestBody JsonRequest<EmployeeQueryVO> request){
    	// 同 方法： getEntEmployeeApplyDetail； 需求变化再改
    	JsonResponse<EmployeeVO> result = null;
        EmployeeQueryVO query = request.getReqBody();
        if(query == null ){
        	result = new JsonResponse<>("502","查询ID不能为空");
            return result;
        }
        EmployeeVO employee = relaMemberToAcctApplyService.getEmployeeApplyDetail(query);
        result = new JsonResponse<>(employee);
        return result;
    }*/
    
    /**
     * 
     * @Description 
     * @author puanl
     * @date 2018年3月28日 下午6:58:36 
     * @param request
     * @return
     */
    /*@RequestMapping(value="/getApplyJoinEntList", method = { RequestMethod.POST})
    @ApiOperation("查询个人申请加入企业列表")
    @ResponseBody
    public JsonResponse<PageDTO<EmployeeVO>> getApplyJoinEntList(@RequestBody JsonRequest<EmployeeQueryVO> request){
        JsonResponse<PageDTO<EmployeeVO>> result = new JsonResponse<PageDTO<EmployeeVO>>();
        return result;
    }*/
    
    /**
     * @Description 个人加入企业 或 企业查询员工
     * @author puanl
     * @date 2018年3月28日 下午6:58:39 
     * @param request
     * @return
     */
    @RequestMapping(value="/getJoinEntList", method = { RequestMethod.POST})
    @ApiOperation("个人加入企业 或 企业查询员工")
    @ResponseBody
    public JsonResponse<PageDTO<EmployeeVO>> getJoinEntList(@RequestBody JsonRequest<EmployeeQueryVO> request){
        JsonResponse<PageDTO<EmployeeVO>> result = null;
        EmployeeQueryVO query = request.getReqBody();
        if(query == null || query.getMemberId() == null || query.getAcctId() == null){
        	result = new JsonResponse<>("502","请输入查询用户或企业会员ID");
        	return result;
        }
        Integer totalNum = relaMemberToAcctService.getEmployeeEntCount(query);
        PageDTO<EmployeeVO> page = new PageDTO<>(query.getPageNum()==null?1:query.getPageNum(), 
                query.getPageSize()==null?10:query.getPageSize());
        page.setTotal(totalNum);
        query.setStartRow(page.getStartRow());
        List<EmployeeVO> JoinEntList = relaMemberToAcctService.getEmployeeEntList(query);
        page.setResultData(JoinEntList);
        result = new JsonResponse<>(page);
        return result;
    }
    
    /**
     * @Description 个人申请加入企业员工接口
     * @author "quanlinjie"
     * @date 2018年3月19日 下午7:46:30 
     * @param request
     * @return
     */
    @RequestMapping(value="/applyJoinEnt", method = { RequestMethod.POST})
    @ApiOperation("个人申请加入企业员工接口")
    @ResponseBody
    public JsonResponse<EmployeeVO> applyJoinEnt(@RequestBody JsonRequest<EmployeeVO> request){
    	logger.info("PersonManagerController.applyJoinEnt request= {}",request);
    	JsonResponse<EmployeeVO> result = new JsonResponse<>();
        /*
         *  账号未申请个人认证不能申请企业
         */
    	EmployeeVO employee = request.getReqBody();
    	// 验证账号是否申请个人认证   
    	BusiAcctInfo acct = busiAcctInfoService.getBusiAcctInfoByPrimaryKey(employee.getAcctId());
    	if(acct == null || acct.getAuthState() == null || acct.getAuthState() == PersonConstant.AUTH_STATUS_UNSUBMIT){
    	    result = new JsonResponse<>("502","尚未申请个人认证");
            return result;
    	}
    	// 验证是否为企业
    	MemberInfo member = memberInfoService.getMemberInfoByPrimaryKey(employee.getMemberId());
    	if(member == null || member.getMemberType() != PersonConstant.MEMBER_TYPE_COMPANY){  // 2，企业   3，个人
    		result = new JsonResponse<>("502","请选择正确的企业");
    		return result;
    	}
    	// 验证账户关系
    	RelaMemberToAcct relaCheck = new RelaMemberToAcct();
    	relaCheck.setAcctId(employee.getAcctId());      // 账户ID
    	relaCheck.setMemberId(employee.getMemberId());  // 企业会员ID
    	List<RelaMemberToAcct> relaList = relaMemberToAcctService.findRelaMemberToAccts(relaCheck);
    	if(relaList != null && relaList.size() > 0 ){
    		result = new JsonResponse<>("502", "已经加入企业，不能重复申请");
    		return result;
    	}
    	// 验证是否申请企业
    	RelaMemberToAcctApply applyCheck = new RelaMemberToAcctApply();
    	applyCheck.setAcctId(employee.getAcctId());      // 账户ID
    	applyCheck.setMemberId(employee.getMemberId());  // 企业会员ID
    	List<RelaMemberToAcctApply> applyList = relaMemberToAcctApplyService.findRelaMemberToAcctApplys(applyCheck);
    	if(applyList != null && applyList.size() > 0 ){
    		result = new JsonResponse<>("502", "不能重复申请企业");
    		BeanUtils.copyProperties(applyList.get(0), employee);
    		result.setRspBody(employee);
    		return result;
    	}
    	try{
    		// 保存数据
        	employee.setMemberType(PersonConstant.MEMBER_TYPE_COMPANY); // 会员类型：企业
        	employee.setStatus(PersonConstant.EMPLOYEE_STATUS_SUBMIT);     // 状态：提交申请
        	RelaMemberToAcctApply addApply = new RelaMemberToAcctApply();
        	BeanUtils.copyProperties(employee, addApply);
        	Integer operation = relaMemberToAcctApplyService.createRelaMemberToAcctApply(addApply);
            if(operation > 0){
            	result = new JsonResponse<>(employee);
            }else{
            	result = new JsonResponse<>("502","申请提交失败");
            }
    	}catch (Exception ex) {
    		logger.error("applyJoinEnt: 个人申请加入企业员工接口报错!" + ex.getMessage(), ex);
    		result = new JsonResponse<>("0100502", ex.getMessage());
            return result;
		}
        return result;
    }
    
    /**
     * @Description 企业审批员工加入
     * @author "quanlinjie"
     * @date 2018年3月19日 下午8:00:22 
     * @param request
     * @return
     */
    @RequestMapping(value="/examineJoinEnt", method = { RequestMethod.POST})
    @ApiOperation("企业审批员工加入")
    @ResponseBody
    public JsonResponse<RelaMemberToAcctApply> examineJoinEnt(@RequestBody JsonRequest<EmployeeVO> request){
    	logger.info("PersonManagerController.examineJoinEnt request= {}",request);
        JsonResponse<RelaMemberToAcctApply> result = null;
        EmployeeVO employee = request.getReqBody();
        RelaMemberToAcctApply relaApply = relaMemberToAcctApplyService.getRelaMemberToAcctApplyByPrimaryKey(employee.getRelaId());
        if(relaApply == null || relaApply.getStatus() != PersonConstant.EMPLOYEE_STATUS_SUBMIT){
        	result = new JsonResponse<>("502","申请信息不存再，已经通过或已被驳回。");
        	return result;
        }
        // 验证账号是否申请个人认证   ( 个人未认证不能审批 )
        BusiAcctInfo acct = busiAcctInfoService.getBusiAcctInfoByPrimaryKey(relaApply.getAcctId());
        if(acct.getAuthState() == null || acct.getAuthState() != PersonConstant.AUTH_STATUS_AGREE){
            result = new JsonResponse<>("502","尚未申请个人认证，或认证尚未通过");
            return result;
        }
        // 验证账户关系
    	RelaMemberToAcct relaCheck = new RelaMemberToAcct();
    	relaCheck.setAcctId(relaApply.getAcctId());      // 账户ID
    	relaCheck.setMemberId(relaApply.getMemberId());  // 企业会员ID
    	List<RelaMemberToAcct> relaList = relaMemberToAcctService.findRelaMemberToAccts(relaCheck);
    	if(relaList != null && relaList.size() > 0 ){
    		result = new JsonResponse<>("502", "已经加入企业，不能重复申请");
    		return result;
    	}
    	try{
	    	// 更新数据
	    	relaApply.setAuditTime(new Date());  // 审批时间
	    	relaApply.setApproveAcctId(employee.getApproveAcctId()); // 审核人账户ID
	    	relaApply.setApproveName(employee.getApproveName());  // 审核人姓名 
	    	relaApply.setStatus(employee.getStatus());  // 状态
	    	relaMemberToAcctApplyService.examineJoinEnt(relaApply);
	        result = new JsonResponse<>(relaApply);
	    }catch (Exception ex) {
			logger.error("reapplicationJoinEnt: 重新申请加入企业接口报错!" + ex.getMessage(), ex);
			result = new JsonResponse<>("0100502", ex.getMessage());
	        return result;
		}
        return result;
    }

    /**
     * @Description 重新申请加入企业
     * @author puanl
     * @date 2018年3月24日 下午3:51:00 
     * @param request
     * @return
     */
    @RequestMapping(value="/reapplicationJoinEnt", method = { RequestMethod.POST})
    @ApiOperation("重新申请加入企业")
    @ResponseBody
    public JsonResponse<RelaMemberToAcctApply> reapplicationJoinEnt(@RequestBody JsonRequest<EmployeeVO> request){
    	logger.info("PersonManagerController.reapplicationJoinEnt request= {}",request);
        JsonResponse<RelaMemberToAcctApply> result = null;
        EmployeeVO employee = request.getReqBody();
        // 获取申请信息
        RelaMemberToAcctApply relaApply = relaMemberToAcctApplyService.getRelaMemberToAcctApplyByPrimaryKey(employee.getRelaId());
        if(relaApply == null || relaApply.getStatus() != PersonConstant.EMPLOYEE_STATUS_REFUSE){
        	result = new JsonResponse<>("502","申请信息不存再，或已经申请");
        	return result;
        }
        // 验证账户关系
        RelaMemberToAcct relaCheck = new RelaMemberToAcct();
        relaCheck.setAcctId(relaApply.getAcctId());      // 账户ID
        relaCheck.setMemberId(relaApply.getMemberId());  // 企业会员ID
        List<RelaMemberToAcct> relaList = relaMemberToAcctService.findRelaMemberToAccts(relaCheck);
        if(relaList != null && relaList.size() > 0 ){
            result = new JsonResponse<>("502", "已经加入企业，不能重复申请");
            return result;
        }
	    try{    
        	// 修改申请数据
	        relaApply.setApplySpec(employee.getApplySpec());  // 申请意见
	        relaApply.setAuditTime(null);  // 审批时间
	    	relaApply.setApproveAcctId(null); // 审核人账户ID
	    	relaApply.setApproveName(null);  // 审核人姓名 
	    	relaApply.setStatus(PersonConstant.EMPLOYEE_STATUS_SUBMIT);  // 状态
	    	relaMemberToAcctApplyService.modifyRelaAllByPrimaryKey(relaApply);
	    	result = new JsonResponse<>(relaApply);
	    }catch (Exception ex) {
			logger.error("reapplicationJoinEnt: 重新申请加入企业接口报错!" + ex.getMessage(), ex);
			result = new JsonResponse<>("0100502", ex.getMessage());
	        return result;
		}
        return result;
    }
    
    /**
     * @Description 新增收货地址接口
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/addReceiveAddress", method = { RequestMethod.POST})
    @ApiOperation("新增收货地址接口")
    @ResponseBody
    public JsonResponse<ReceiveAddress> addReceiveAddress(@RequestBody JsonRequest<ReceiveAddressDTO> request){
        ReceiveAddressDTO receiveAddressDTO = request.getReqBody();
        //TODO
        receiveAddressDTO.setMemberId(9454l);
        Date date = new Date();
        receiveAddressDTO.setCreateTime(date);
        JsonResponse<ReceiveAddress> jsonResponse = new JsonResponse<>();
        ReceiveAddress receiveAddress = new ReceiveAddress();
        BeanUtils.copyProperties(receiveAddressDTO,receiveAddress);
        ReceiveAddress result = new ReceiveAddress();
        try {
            int operation = receiveAddressService.createReceiveAddress(receiveAddress);
            if(operation == 1){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("新增收货地址成功");
                result.setReceiveAddressId(receiveAddress.getReceiveAddressId());
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("新增收货地址失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("addReceiveAddress: 新增收货地址接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }

    /**
     * @Description 新增发货地址接口
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/addDeliverAddress", method = { RequestMethod.POST})
    @ApiOperation("新增发货地址接口")
    @ResponseBody
    public JsonResponse<DeliverAddress> addDeliverAddress(@RequestBody JsonRequest<DeliverAddressDTO> request){
        DeliverAddressDTO deliverAddressDTO = request.getReqBody();
        //TODO
        deliverAddressDTO.setMemberId(9454l);
        Date date = new Date();
        deliverAddressDTO.setCreateTime(date);
        JsonResponse<DeliverAddress> jsonResponse = new JsonResponse<>();
        DeliverAddress deliverAddress = new DeliverAddress();
        BeanUtils.copyProperties(deliverAddressDTO,deliverAddress);
        DeliverAddress result = new DeliverAddress();
        try {
            int operation = deliverAddressService.createDeliverAddress(deliverAddress);
            if(operation == 1){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("新增发货地址成功");
                result.setDeliverAddressId(deliverAddress.getDeliverAddressId());
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("新增发货地址失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("addDeliverAddress: 新增发货地址接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }

    /**
     * @Description 修改收货地址接口
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/editReceiveAddress", method = { RequestMethod.POST})
    @ApiOperation("修改收货地址接口")
    @ResponseBody
    public JsonResponse<ReceiveAddress> modifyReceiveAddress(@RequestBody JsonRequest<ReceiveAddressDTO> request){
        ReceiveAddressDTO receiveAddressDTO = request.getReqBody();
        //TODO
        receiveAddressDTO.setMemberId(9454l);
        Date date = new Date();
        receiveAddressDTO.setCreateTime(date);
        JsonResponse<ReceiveAddress> jsonResponse = new JsonResponse<>();
        ReceiveAddress receiveAddress = new ReceiveAddress();
        BeanUtils.copyProperties(receiveAddressDTO,receiveAddress);
        ReceiveAddress result = new ReceiveAddress();
        try {
            int operation = receiveAddressService.modifyReceiveAddressByPrimaryKey(receiveAddress);
            if(operation == 1){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("修改收货地址成功");
                result.setReceiveAddressId(receiveAddress.getReceiveAddressId());
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("修改收货地址失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("editReceiveAddress: 修改收货地址接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }

    /**
     * @Description 修改发货地址接口
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/editDeliverAddress", method = { RequestMethod.POST})
    @ApiOperation("修改发货地址接口")
    @ResponseBody
    public JsonResponse<DeliverAddress>  modifyDeliverAddress(@RequestBody JsonRequest<DeliverAddressDTO> request){
        DeliverAddressDTO deliverAddressDTO = request.getReqBody();
        //TODO
        deliverAddressDTO.setMemberId(9454l);
        Date date = new Date();
        deliverAddressDTO.setCreateTime(date);
        JsonResponse<DeliverAddress> jsonResponse = new JsonResponse<>();
        DeliverAddress deliverAddress = new DeliverAddress();
        BeanUtils.copyProperties(deliverAddressDTO,deliverAddress);
        DeliverAddress result = new DeliverAddress();
        try {
            int operation = deliverAddressService.modifyDeliverAddressByPrimaryKey(deliverAddress);
            if(operation == 1){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("修改发货地址成功");
                result.setDeliverAddressId(deliverAddress.getDeliverAddressId());
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("修改发货地址失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("editDeliverAddress: 修改发货地址接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }

    /**
     * @Description 删除收货地址接口
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/deleteReceiveAddress", method = { RequestMethod.POST})
    @ApiOperation("删除收货地址接口")
    @ResponseBody
    public JsonResponse<Integer> delReceiveAddress(@RequestBody JsonRequest<ReceiveAddressDTO> request){
        ReceiveAddressDTO receiveAddressDTO = request.getReqBody();
        JsonResponse<Integer> jsonResponse = new JsonResponse<>();
        int operation = -1;
        try {
            operation = receiveAddressService.removeByPrimaryKey(receiveAddressDTO.getReceiveAddressId());
            if(operation == 1){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("删除收货地址接口");
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("删除收货地址接口");
            }
            jsonResponse.setRspBody(operation);
        } catch (RuntimeException ex) {
            logger.error("delReceiveAddress: 删除收货地址接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(operation);
            return jsonResponse;
        }
        return jsonResponse;
    }

    /**
     * @Description 删除发货地址接口
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/deleteDeliverAddress", method = { RequestMethod.POST})
    @ApiOperation("删除发货地址接口")
    @ResponseBody
    public JsonResponse<Integer>  delDeliverAddress(@RequestBody JsonRequest<DeliverAddressDTO> request){
        DeliverAddressDTO deliverAddressDTO = request.getReqBody();
        JsonResponse<Integer> jsonResponse = new JsonResponse<>();
        int operation = -1;
        try {
            operation = deliverAddressService.removeByPrimaryKey(deliverAddressDTO.getDeliverAddressId());
            if(operation == 1){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("删除发货地址成功");
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("删除发货地址失败");
            }
            jsonResponse.setRspBody(operation);
        } catch (RuntimeException ex) {
            logger.error("delDeliverAddress: 删除发货地址接口报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(operation);
            return jsonResponse;
        }
        return jsonResponse;
    }

    /**
     * @Description 查看发货地址详情接口
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/findDeliverAddressInfo", method = { RequestMethod.POST})
    @ApiOperation("查看发货地址详情接口")
    @ResponseBody
    public JsonResponse<DeliverAddressDTO>  findDeliverAddressInfo(@RequestBody JsonRequest<DeliverAddressDTO> request){
        DeliverAddressDTO deliverAddressDTO = request.getReqBody();
        JsonResponse<DeliverAddressDTO> jsonResponse = new JsonResponse<>();
        DeliverAddressDTO result = new DeliverAddressDTO();
        try {
            DeliverAddress deliverAddress = deliverAddressService.getDeliverAddressByPrimaryKey(deliverAddressDTO.getDeliverAddressId());
            if(deliverAddress != null){
                BeanUtils.copyProperties(deliverAddress,result);
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("查看发货地址详情成功");
                jsonResponse.setRspBody(result);
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("查看发货地址详情失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("findDeliverAddressInfo: 查看发货地址详情报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }


    /**
     * @Description 查看收货地址详情接口
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/findReceiveAddressInfo", method = { RequestMethod.POST})
    @ApiOperation("查看收货地址详情接口")
    @ResponseBody
    public JsonResponse<ReceiveAddressDTO>  findReceiveAddressInfo(@RequestBody JsonRequest<ReceiveAddressDTO> request){
        ReceiveAddressDTO receiveAddressDTO = request.getReqBody();
        JsonResponse<ReceiveAddressDTO> jsonResponse = new JsonResponse<>();
        ReceiveAddressDTO result = new ReceiveAddressDTO();
        try {
            ReceiveAddress receiveAddress = receiveAddressService.getReceiveAddressByPrimaryKey(receiveAddressDTO.getReceiveAddressId());
            if(receiveAddress != null){
                BeanUtils.copyProperties(receiveAddress,result);
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("查看收货地址详情成功");
                jsonResponse.setRspBody(result);
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("查看收货地址详情失败");
            }
            jsonResponse.setRspBody(result);
        } catch (RuntimeException ex) {
            logger.error("findReceiveAddressInfo: 查看收货地址详情报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(result);
            return jsonResponse;
        }
        return jsonResponse;
    }

    /**
     * @Description 查看发货地址列表接口
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/findDeliverAddressList", method = { RequestMethod.POST})
    @ApiOperation("查看发货地址列表接口")
    @ResponseBody
    public JsonResponse<PageDTO<DeliverAddressDTO>>  findDeliverAddressList(@RequestBody JsonRequest<BaseQueryVO> request){
        JsonResponse<PageDTO<DeliverAddressDTO>> jsonResponse = new JsonResponse<PageDTO<DeliverAddressDTO>>(); // 返回的对象
        BaseQueryVO baseQueryVO = request.getReqBody();
        //TODO
        baseQueryVO.setMemberId(9454l);
        baseQueryVO.setPageNum(baseQueryVO.getPageNum() != null ? baseQueryVO
                .getPageNum() : defaultPageNum);
        baseQueryVO.setPageSize(baseQueryVO.getPageSize() != null ? baseQueryVO
                .getPageSize() : defaultPageSize);
        PageDTO<DeliverAddressDTO> pageDTO = new PageDTO<DeliverAddressDTO>(baseQueryVO.getPageNum(),baseQueryVO.getPageSize()); // 返回的PageDTO对象
        DeliverAddress deliverAddress = new DeliverAddress();
        deliverAddress.setMemberId(baseQueryVO.getMemberId());
        int total = deliverAddressService.getCount(deliverAddress);
        pageDTO.setTotal(total);
        baseQueryVO.setStartRow(pageDTO.getStartRow());//插入首行
        try {
            List<DeliverAddressDTO> list = deliverAddressService.findDeliverAddresssPage(baseQueryVO);
            pageDTO.setResultData(list);
            if(list != null){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("查看发货地址列表成功");
                jsonResponse.setRspBody(pageDTO);
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("查看发货地址列表失败");
                jsonResponse.setRspBody(pageDTO);
            }
        } catch (RuntimeException ex) {
            logger.error("findReceiveAddressInfo: 查看发货地址列表报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(pageDTO);
            return jsonResponse;
        }
        return jsonResponse;
    }

    /**
     * @Description 查看收货地址列表接口
     * @author "lizan"
     * @date 2018年3月17日 下午5:57:00
     * @param request
     * @return
     */
    @RequestMapping(value="/findReceiveAddressList", method = { RequestMethod.POST})
    @ApiOperation("查看收货地址列表接口")
    @ResponseBody
    public JsonResponse<PageDTO<ReceiveAddressDTO>>  findReceiveAddressList(@RequestBody JsonRequest<BaseQueryVO> request){
        JsonResponse<PageDTO<ReceiveAddressDTO>> jsonResponse = new JsonResponse<PageDTO<ReceiveAddressDTO>>(); // 返回的对象
        BaseQueryVO baseQueryVO = request.getReqBody();
        //TODO
        baseQueryVO.setMemberId(9454l);
        baseQueryVO.setPageNum(baseQueryVO.getPageNum() != null ? baseQueryVO
                .getPageNum() : defaultPageNum);
        baseQueryVO.setPageSize(baseQueryVO.getPageSize() != null ? baseQueryVO
                .getPageSize() : defaultPageSize);
        PageDTO<ReceiveAddressDTO> pageDTO = new PageDTO<ReceiveAddressDTO>(baseQueryVO.getPageNum(),baseQueryVO.getPageSize()); // 返回的PageDTO对象
        baseQueryVO.setStartRow(pageDTO.getStartRow());//插入首行
        try {
            List<ReceiveAddressDTO> list = receiveAddressService.findReceiveAddresssPage(baseQueryVO);
            pageDTO.setResultData(list);
            if(list != null){
                jsonResponse.setRetCode("0000000");
                jsonResponse.setRetDesc("查看收货地址列表成功");
                jsonResponse.setRspBody(pageDTO);
            }else{
                jsonResponse.setRetCode("0100000");
                jsonResponse.setRetDesc("查看收货地址列表失败");
                jsonResponse.setRspBody(pageDTO);
            }
        } catch (RuntimeException ex) {
            logger.error("findReceiveAddressInfo: 查看收货地址列表报错!" + ex.getMessage(), ex);
            jsonResponse.setRetCode("0100000");
            jsonResponse.setRetDesc(ex.getMessage());
            jsonResponse.setRspBody(pageDTO);
            return jsonResponse;
        }
        return jsonResponse;
    }

    
}
