package cn.enn.ygego.sunny.user.controller.enterpriseManage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.common.utils.StringUtils;

import cn.enn.ygego.sunny.core.log.SearchableLoggerFactory;
import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.constant.JoinEntConstant;
import cn.enn.ygego.sunny.user.dto.EntSetDTO;
import cn.enn.ygego.sunny.user.dto.vo.JoinCompanyQueryVO;
import cn.enn.ygego.sunny.user.dto.vo.JoinCompanyVO;
import cn.enn.ygego.sunny.user.model.EntCustInfo;
import cn.enn.ygego.sunny.user.model.EntSet;
import cn.enn.ygego.sunny.user.service.EntCustInfoService;
import cn.enn.ygego.sunny.user.service.EntSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 子公司授权接口
 * ClassName: SubsidiaryController	
 * Description 
 * Author puanl
 * Date 2018年3月17日 下午5:46:03 
 * History: 
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
@RequestMapping("user/enterprise/subsidiary")
@Api(value = "子公司授权接口", description = "子公司授权接口")
public class SubsidiaryController {
    
    static final Logger logger = SearchableLoggerFactory.getDefaultLogger();
    
    @Autowired
    private EntCustInfoService entCustInfoService;  /* 企业信息服务 */
    @Autowired
    private EntSetService entSetService;  /* 子公司权限设置服务 */
    
    /**
     * @Description  查询子公司授权详情接口（对外封装）
     * @author puanl
     * @date 2018年3月28日 上午10:59:50 
     * @param request
     * @return
     */
    @RequestMapping(value="/getDetail", method = { RequestMethod.POST})
    @ApiOperation("查询子公司授权详情接口（对外封装）")
    @ResponseBody
    public JsonResponse<EntCustInfo> getDetail(@RequestBody JsonRequest<JoinCompanyQueryVO> request){
        JsonResponse<EntCustInfo> result = null;
        JoinCompanyQueryVO query = request.getReqBody();
        if(query == null || query.getMemberId() == null){
            result = new JsonResponse<>("502","查询 子公司ID不能为空");
        }
        EntCustInfo entCustInfo =  entCustInfoService.getEntCustInfoByPrimaryKey(query.getMemberId());
        result = new JsonResponse<>(entCustInfo);
        return result;
    }
    
    /**
     * 
     * @Description 查询可添加子公司列表（父）
     * @author puanl
     * @date 2018年3月28日 上午11:00:30 
     * @param request
     * @return
     */
    @RequestMapping(value="/getCompanyList", method = { RequestMethod.POST})
    @ApiOperation("查询可添加子公司列表（父）")
    @ResponseBody
    public JsonResponse<PageDTO<JoinCompanyVO>> getCompanyList(@RequestBody JsonRequest<JoinCompanyQueryVO> request){
        JsonResponse<PageDTO<JoinCompanyVO>> result = null;
        JoinCompanyQueryVO query = request.getReqBody();
        PageDTO<JoinCompanyVO> pageDto = null;
        
        Integer totalCount = entSetService.getFerrSunCompanyCount(query);
        pageDto = new PageDTO<>(query.getPageNum()==null?1:query.getPageNum(), 
                query.getPageSize()==null?10:query.getPageSize());
        pageDto.setTotal(totalCount);
        query.setStartRow(pageDto.getStartRow());
    
        List<JoinCompanyVO> companyList = entSetService.getFerrSunCompanyList(query);
        pageDto.setResultData(companyList);
        result = new JsonResponse<>(pageDto);
        return result;
    }
    
    /**
     * @Description 申请添加子公司 批量（父）
     * @author puanl
     * @date 2018年3月28日 上午11:00:46 
     * @param request
     * @return
     */
    @RequestMapping(value="/applyAddSumCompany", method = { RequestMethod.POST})
    @ApiOperation("申请添加子公司（父）")
    @ResponseBody
    public JsonResponse<Boolean> applyAddSumCompany(@RequestBody JsonRequest<EntSetDTO> request){
        JsonResponse<Boolean> result = null;
        EntSetDTO joinQuery = request.getReqBody();
        if(joinQuery == null || StringUtils.isEmpty(joinQuery.getMemberIds()) ){
            result =  new JsonResponse<>("502","memberIds 不能为空");
            return result;
        }
        try {
            String[] memberIds = joinQuery.getMemberIds().split(",");
            List<EntSet> entSetList = new ArrayList<>(memberIds.length);
            for(String memberId : memberIds){
                EntSet entSet = new EntSet();
                entSet.setMemberId(Long.valueOf(memberId));  // 子公司ID
                entSet.setPareMemberId(joinQuery.getPareMemberId());  // 父公司ID
                entSet.setApplyType(JoinEntConstant.SET_APPLYTYPE_SUBMIT);  //申请状态
                entSet.setCreateTime(new Date());
                entSet.setCateMateId(joinQuery.getCateMateId());
                entSet.setCreateName(joinQuery.getCreateName());
                entSetList.add(entSet);
            }
            Integer operation =  entSetService.createEntSetList(entSetList);
            if(operation > 0){
                result = new JsonResponse<>(true);
            }else{
                result = new JsonResponse<>("502","保存失败",false);
            }
        } catch (Exception e) {
            logger.error("SubsidiaryController.applyAddSumCompany: 申请添加子公司报错!" + e.getMessage(), e);
            result = new JsonResponse<>("0100502",e.getMessage());
            return result;
        }
        return result;
    }
    
    /**
     * @Description 【查询子公司列表（父）】企业组织管理子公司
     * @author puanl
     * @date 2018年3月28日 上午11:00:50 
     * @param request
     * @return
     */
    @RequestMapping(value="/getSunCompanyList", method = { RequestMethod.POST})
    @ApiOperation("企业组织管理子公司")
    @ResponseBody
    public JsonResponse<PageDTO<JoinCompanyVO>> getSunCompanyList(@RequestBody JsonRequest<JoinCompanyQueryVO> request){
        JsonResponse<PageDTO<JoinCompanyVO>> result = null;
        JoinCompanyQueryVO query = request.getReqBody();
        
        if(query == null || query.getPareMemberId() == null ){
            result = new JsonResponse<>("502"," PareMemberId 不能为空");
            return result;
        }
        
        query.setMemberId(null);  // 清空子公司ID条件
        PageDTO<JoinCompanyVO> pageDto = null;
        Integer totalCount = entSetService.getJoinCompanyCount(query);
        pageDto = new PageDTO<>(query.getPageNum()==null?1:query.getPageNum(), 
                query.getPageSize()==null?10:query.getPageSize());
        pageDto.setTotal(totalCount);
        query.setStartRow(pageDto.getStartRow());
        List<JoinCompanyVO> companyList = entSetService.getJoinCompanyList(query);
        pageDto.setResultData(companyList);
        result = new JsonResponse<>(pageDto);
        return result;
    }
    
    /**
     * @Description 查询子公司详情（父）
     * @author puanl
     * @date 2018年3月28日 上午11:12:20 
     * @param request
     * @return
     */
    @RequestMapping(value="/getSunCompanyDetail", method = { RequestMethod.POST})
    @ApiOperation("查询子公司详情（父）")
    @ResponseBody
    public JsonResponse<JoinCompanyVO> getSunCompanyDetail(@RequestBody JsonRequest<JoinCompanyQueryVO> request){
        JsonResponse<JoinCompanyVO> result = null;
        JoinCompanyQueryVO query = request.getReqBody();
        if(query == null || query.getSetId() == null){
            result = new JsonResponse<>("502","SetId 不能为空");
            return result;
        }
        JoinCompanyVO sunCompany = entSetService.getSunCompanyDetail(query);
        result = new JsonResponse<>(sunCompany);
        return result;
    }
    
    /**
     * 
     * @Description 【申请设置授权，或变更授权（父）】父公司授权子公司权限
     * @author puanl
     * @date 2018年3月28日 上午11:17:59 
     * @param request
     * @return
     */
    @RequestMapping(value="/applySetAccredit", method = { RequestMethod.POST})
    @ApiOperation("父公司授权子公司权限")
    @ResponseBody
    public JsonResponse<EntSet> applySetAccredit(@RequestBody JsonRequest<JoinCompanyVO> request){
        
        JsonResponse<EntSet> result = null;
        JoinCompanyVO entSetDto = request.getReqBody();
        if(entSetDto == null || entSetDto.getSetId() == null){
            result = new JsonResponse<>("502","SetId 不能为空");
            return result;
        }
        try{
            // 获取企业设置申请
            EntSet entSet =  entSetService.getEntSetByPrimaryKey(entSetDto.getSetId());
            if(entSet.getApplyType() == JoinEntConstant.SET_APPLYTYPE_REFUSE){
                result = new JsonResponse<>("502","子公司拒绝加入，无法配置授权信息");
                return result;
            }
            // 更新设置信息
            entSet.setBlackWhiteListSet(entSetDto.getSetBlackWhiteListSet()); // 黑白名单设置
            entSet.setAgreementPriceId(entSetDto.getSetAgreementPriceId());   // 协议价设置
            entSet.setCateMateId(entSetDto.getSetCateMateId());               // 类目物料设置 
            entSet.setStatus(JoinEntConstant.SET_STATUS_SUBMIT);  // 申请状态为：待确认
            
            Integer operation = entSetService.modifyEntSetByPrimaryKey(entSet);
            
            if(operation > 0){
                result = new JsonResponse<>(entSet);
            }else{
                result = new JsonResponse<>("502","修改失败");
            }
        } catch (Exception e) {
            logger.error("SubsidiaryController.applySetAccredit: 设置子公司授权报错!" + e.getMessage(), e);
            result = new JsonResponse<>("0100502",e.getMessage());
            return result;
        }
        
        return result;
    }
    
    /**
     * 
     * @Description 授权申请详情查询
     * @author puanl
     * @date 2018年3月28日 上午11:18:17 
     * @param request
     * @return
     */
    @RequestMapping(value="/getApplySetDetail", method = { RequestMethod.POST})
    @ApiOperation("授权申请详情查询")
    @ResponseBody
    public JsonResponse<JoinCompanyVO> getApplySetDetail(@RequestBody JsonRequest<JoinCompanyQueryVO> request){
        JsonResponse<JoinCompanyVO> result = null;
        JoinCompanyQueryVO query = request.getReqBody();
        if(query == null || query.getSetId() == null){
            result = new JsonResponse<>("502","SetId 不能为空");
            return result;
        }
        JoinCompanyVO sunCompany = entSetService.getSunCompanyDetail(query);
        result = new JsonResponse<>(sunCompany);
        return result;
    }
    
    /**
     * @Description 子公司审核（同意/不同意）授权（子）
     * @author puanl
     * @date 2018年3月28日 上午11:19:09 
     * @param request
     * @return
     */
    @RequestMapping(value="/examineApplySet", method = { RequestMethod.POST})
    @ApiOperation("子公司审核（同意/不同意）授权（子）")
    @ResponseBody
    public JsonResponse<Boolean> examineApplySet(@RequestBody JsonRequest<JoinCompanyVO> request){
        JsonResponse<Boolean> result = null;
        JoinCompanyVO entSetDto = request.getReqBody();
        if(entSetDto == null || entSetDto.getSetId() == null){
            result = new JsonResponse<>("502","SetId 不能为空");
            return result;
        }
        if(entSetDto.getStatus() == null || entSetDto.getStatus() == JoinEntConstant.SET_STATUS_SUBMIT){
            result = new JsonResponse<>("502","请选择同意或拒绝");
            return result;
        }
        // 获取企业设置申请
        EntSet entSet =  entSetService.getEntSetByPrimaryKey(entSetDto.getSetId());
        if(entSet == null || entSet.getApplyType() == null || entSet.getApplyType() == JoinEntConstant.SET_APPLYTYPE_REFUSE){
            result = new JsonResponse<>("502","已经拒绝加入企业");
            return result;
        }
        
        try{
            // 处理逻辑
            Integer operation = null;
            
            if(entSet.getApplyType() == JoinEntConstant.SET_APPLYTYPE_AGREE
                    && entSetDto.getStatus() == JoinEntConstant.SET_STATUS_AGREE){
                // 已加入企业， 同意授权
                operation = entSetService.agreeSetAccredit(entSet); 
                
            }else if(entSet.getApplyType() == JoinEntConstant.SET_APPLYTYPE_AGREE
                    && entSetDto.getStatus() == JoinEntConstant.SET_STATUS_REFUSE){
                // 已加入企业， 拒绝授权
                entSet.setStatus(JoinEntConstant.SET_STATUS_REFUSE);
                operation = entSetService.modifyEntSetByPrimaryKey(entSet);
                
            }else if(entSet.getApplyType() == JoinEntConstant.SET_APPLYTYPE_SUBMIT
                    && entSetDto.getStatus() == JoinEntConstant.SET_STATUS_AGREE){
                // 未加入企业， 同意授权
                operation = entSetService.agreeJoinCompanyAndSet(entSet);  
                
            }else if(entSet.getApplyType() == JoinEntConstant.SET_APPLYTYPE_SUBMIT
                    && entSetDto.getStatus() == JoinEntConstant.SET_STATUS_REFUSE){
                // 未加入企业， 拒绝授权    
                entSet.setApplyType(JoinEntConstant.SET_APPLYTYPE_REFUSE);
                entSet.setStatus(JoinEntConstant.SET_STATUS_REFUSE);
                operation = entSetService.modifyEntSetByPrimaryKey(entSet);
            }
            
            if(operation > 0){
                result = new JsonResponse<>(true);
            }else{
                result = new JsonResponse<>("502","审批失败",false);
            }
        
        }catch (Exception e) {
            logger.error("SubsidiaryController.examineApplySet: 子公司审核授权报错!" + e.getMessage(), e);
            result = new JsonResponse<>("0100502",e.getMessage());
            return result;
        }
        
        return result;
    }
    
    /**
     * @Description 查询父公司列表，含未通过的（子）
     * @author puanl
     * @date 2018年3月28日 上午11:20:24 
     * @param request
     * @return
     */
    @RequestMapping(value="/getParentEntList", method = { RequestMethod.POST})
    @ApiOperation("查询父公司列表，含未通过的（子）")
    @ResponseBody
    public JsonResponse<PageDTO<JoinCompanyVO>> getParentEntList(@RequestBody JsonRequest<JoinCompanyQueryVO> request){
        JsonResponse<PageDTO<JoinCompanyVO>> result = null;
        JoinCompanyQueryVO query = request.getReqBody();
        
        if(query == null || query.getMemberId() == null ){
            result = new JsonResponse<>("502"," MemberId 不能为空");
            return result;
        }
        
        // 查询当前公司信息，判断是否存在父公司
        EntCustInfo entCustInfo =  entCustInfoService.getEntCustInfoByPrimaryKey(query.getMemberId());
        // 添加父公司ID
        if(entCustInfo.getPareMemberId() != null){
            query.setPareMemberId(entCustInfo.getPareMemberId());  
        }else{
            query.setPareMemberId(null);  // 清空父公司ID条件
        }
        
        PageDTO<JoinCompanyVO> pageDto = null;
        Integer totalCount = entSetService.getJoinCompanyCount(query);
        pageDto = new PageDTO<>(query.getPageNum()==null?1:query.getPageNum(), 
                query.getPageSize()==null?10:query.getPageSize());
        pageDto.setTotal(totalCount);
        query.setStartRow(pageDto.getStartRow());
            
        List<JoinCompanyVO> companyList = entSetService.getJoinCompanyList(query);
        pageDto.setResultData(companyList);
        result = new JsonResponse<>(pageDto);
        return result;
    }

}
