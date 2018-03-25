package cn.enn.ygego.sunny.user.controller.person;

import cn.enn.ygego.sunny.core.log.SearchableLoggerFactory;
import cn.enn.ygego.sunny.user.dto.DeliverAddressDTO;
import cn.enn.ygego.sunny.user.dto.IndividualCustDTO;
import cn.enn.ygego.sunny.user.dto.ReceiveAddressDTO;
import cn.enn.ygego.sunny.user.dto.vo.BaseQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.EmployeeQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.EmployeeVO;
import cn.enn.ygego.sunny.user.dto.vo.IndividualCertApplyVO;
import cn.enn.ygego.sunny.user.dto.vo.PersonQueryVO;
import cn.enn.ygego.sunny.user.model.DeliverAddress;
import cn.enn.ygego.sunny.user.model.IndividualCertApply;
import cn.enn.ygego.sunny.user.model.MemberInfo;
import cn.enn.ygego.sunny.user.model.ReceiveAddress;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcct;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcctApply;
import cn.enn.ygego.sunny.user.service.DeliverAddressService;
import cn.enn.ygego.sunny.user.service.IndividualCertApplyService;
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
    private IndividualCertApplyService individualCertApplyService;  /* 个人认证申请  */ 
    @Autowired
    private RelaMemberToAcctService relaMemberToAcctService; /* 账户会员关系表 */
    @Autowired
    private RelaMemberToAcctApplyService relaMemberToAcctApplyService;  /* 账户申请会员审批表 */
    @Autowired
    private MemberInfoService memberInfoService;  /* 会员数据表 */
    
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
        Integer totalNum = individualCustService.getPersonCount(query);
        PageDTO<PersonVO> page = new PageDTO<>(query.getPageNum(), query.getPageSize());
        page.setTotal(totalNum);
        query.setStartRow(page.getStartRow());
        // 查询列表
        List<PersonVO> queryList = individualCustService.getPersonList(query);
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
        PersonQueryVO personQuery = request.getReqBody();
        if(personQuery == null || (personQuery.getMemberId() == null && personQuery.getAcctId() == null) ){
            result = new JsonResponse<>("502","查询账号不能为空");
        }
        // 根据会员ID与账户ID 查询数据
        PersonVO person = individualCustService.getPersonDetail(personQuery.getMemberId(), personQuery.getAcctId());
        if(person == null){
            result = new JsonResponse<>("502","未查询到相关数据");
        }
        
        if(person.getMemberType() == 3){
            // 查询个人用户审批数据   
            IndividualCustDTO individualCust = individualCustService.getIndividualCustById(person.getMemberId(),true);
            if(individualCust != null){
                person.setCertCode(individualCust.getCertCode()); // 添加身份证号
                person.setCertType(individualCust.getCertType()); // 添加证件类型
                person.setIndividualCust(individualCust);  // 添加附件
            }
        }else if(person.getMemberType() == 2){
            // 查询企业详情
            // TODO
        }
        result = new JsonResponse<>(person);
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
    public JsonResponse exportList(@RequestBody JsonRequest request){
        
        JsonResponse result = new JsonResponse();
        
        return result;
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
    public JsonResponse<Boolean> attornAdmin(@RequestBody JsonRequest request){
        
        JsonResponse<Boolean> result = new JsonResponse<Boolean>();
        
        return result;
    }
    
    /**
     * @Description 查看企业员工列表
     * @author "quanlinjie"
     * @date 2018年3月19日 下午7:48:58 
     * @param request
     * @return
     */
    @RequestMapping(value="/getEntEmployeeList", method = { RequestMethod.POST})
    @ApiOperation("查看企业员工列表")
    @ResponseBody
    public JsonResponse<PageDTO<EmployeeVO>> getEmployeeApplyList(@RequestBody JsonRequest<EmployeeQueryVO> request){
    	logger.info("PersonManagerController.getEmployeeApplyList request= {}",request);
    	// memberId, 必填 （ TODO 账户表中添加一个，认证是否通过的状态）
        /* 1.查看用户申请列表，关联用户个人审批表，未审批通过的（不能审批）不能显示
         * */
        JsonResponse<PageDTO<EmployeeVO>> result = new JsonResponse<PageDTO<EmployeeVO>>();
        EmployeeQueryVO query = request.getReqBody();
        Integer totalNum = relaMemberToAcctApplyService.getEmployeeApplyCount(query);
        PageDTO<EmployeeVO> page = new PageDTO<>(query.getPageNum(), query.getPageSize());
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
    @RequestMapping(value="/getEntEmployeeDetail", method = { RequestMethod.POST})
    @ApiOperation("查看个人申请企业申请详情")
    @ResponseBody
    public JsonResponse<EmployeeVO> getEmployeeApplyDetail(@RequestBody JsonRequest<EmployeeQueryVO> request){
    	logger.info("PersonManagerController.getEmployeeApplyDetail request= {}",request);
        JsonResponse<EmployeeVO> result = null;
        EmployeeQueryVO query = request.getReqBody();
        if(query == null || query.getRelaId() == null){
        	result = new JsonResponse<>("502","企业申请ID不能为空");
            return result;
        }
        EmployeeVO employee = relaMemberToAcctApplyService.getEmployeeApplyDetail(query.getRelaId());
        result = new JsonResponse<>(employee);
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
    	EmployeeVO empolyee = request.getReqBody();
    	// 验证账号是否申请个人认证
    	IndividualCertApply personApply = individualCertApplyService.getIndividualCertApplyByMemberId(empolyee.getMemberId());
    	if(personApply == null){
    		result = new JsonResponse<>("502","请先申请个人资质认证，再选择加入企业");
    		return result;
    	}
    	// 验证是否为企业
    	MemberInfo member = memberInfoService.getMemberInfoByPrimaryKey(empolyee.getMemberId());
    	if(member == null || member.getMemberType() != 4){
    		result = new JsonResponse<>("502","请选择正确的企业");
    		return result;
    	}
    	// 验证账户关系
    	RelaMemberToAcct relaCheck = new RelaMemberToAcct();
    	relaCheck.setAcctId(empolyee.getAcctId());      // 账户ID
    	relaCheck.setMemberId(empolyee.getMemberId());  // 企业会员ID
    	List<RelaMemberToAcct> relaList = relaMemberToAcctService.findRelaMemberToAccts(relaCheck);
    	if(relaList == null || relaList.size() == 0 ){
    		result = new JsonResponse<>("502", "已经加入企业，不能重复申请");
    		return result;
    	}
    	// 验证是否申请企业
    	RelaMemberToAcctApply applyCheck = new RelaMemberToAcctApply();
    	applyCheck.setAcctId(empolyee.getAcctId());      // 账户ID
    	applyCheck.setMemberId(empolyee.getMemberId());  // 企业会员ID
    	List<RelaMemberToAcctApply> applyList = relaMemberToAcctApplyService.findRelaMemberToAcctApplys(applyCheck);
    	if(applyList != null && applyList.size() > 0 ){
    		result = new JsonResponse<>("502", "不能重复申请企业");
    		return result;
    	}
    	// 保存数据
    	empolyee.setMemberType(4); // 会员类型：企业
    	empolyee.setStatus(2);     // 状态：提交申请
    	empolyee.setAuditTime(new Date());  // 创建时间
    	RelaMemberToAcctApply addApply = new RelaMemberToAcctApply();
    	BeanUtils.copyProperties(empolyee, addApply);
    	Integer operation = relaMemberToAcctApplyService.createRelaMemberToAcctApply(addApply);
        if(operation > 0){
        	result = new JsonResponse<>(empolyee);
        }else{
        	result = new JsonResponse<>("502","申请提交失败");
        }
        return result;
    }
    
    /**
     * @Description TODO
     * @author "quanlinjie"
     * @date 2018年3月19日 下午8:00:22 
     * @param request
     * @return
     */
    @RequestMapping(value="/examineJoinEnt", method = { RequestMethod.POST})
    @ApiOperation("企业审批员工加入")
    @ResponseBody
    public JsonResponse<EmployeeVO> examineJoinEnt(@RequestBody JsonRequest<EmployeeVO> request){
        
        JsonResponse<EmployeeVO> result = new JsonResponse<>();
        
        return result;
    }

    /**
     * @Description TODO
     * @author puanl
     * @date 2018年3月24日 下午3:51:00 
     * @param request
     * @return
     */
    @RequestMapping(value="/reapplicationJoinEnt", method = { RequestMethod.POST})
    @ApiOperation("重新申请加入企业")
    @ResponseBody
    public JsonResponse<EmployeeVO> reapplicationJoinEnt(@RequestBody JsonRequest<EmployeeVO> request){
        
        JsonResponse<EmployeeVO> result = new JsonResponse<>();
        
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
    public JsonResponse<ReceiveAddress> createReceiveAddress(@RequestBody JsonRequest<ReceiveAddressDTO> request){
        ReceiveAddressDTO receiveAddressDTO = request.getReqBody();
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
        PageDTO<DeliverAddressDTO> pageDTO = new PageDTO<DeliverAddressDTO>(baseQueryVO.getPageNum(),baseQueryVO.getPageSize()); // 返回的PageDTO对象
        baseQueryVO.setStartRow(pageDTO.getStartRow());//插入首行
        try {
            List<DeliverAddressDTO> list = deliverAddressService.findDeliverAddresssPage(baseQueryVO);
            pageDTO.setResultData(list);
            if(list != null && list.size() > 0){
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
        PageDTO<ReceiveAddressDTO> pageDTO = new PageDTO<ReceiveAddressDTO>(baseQueryVO.getPageNum(),baseQueryVO.getPageSize()); // 返回的PageDTO对象
        baseQueryVO.setStartRow(pageDTO.getStartRow());//插入首行
        try {
            List<ReceiveAddressDTO> list = receiveAddressService.findReceiveAddresssPage(baseQueryVO);
            pageDTO.setResultData(list);
            if(list != null && list.size() > 0){
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
