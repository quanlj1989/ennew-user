package cn.enn.ygego.sunny.user.controller.channelManage;


import cn.enn.ygego.sunny.core.log.SearchableLoggerFactory;
import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.JsonResult;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.common.ResponseCodeEnum;
import cn.enn.ygego.sunny.user.dto.ChannelManageDTO;
import cn.enn.ygego.sunny.user.dto.EntCustInfoDTO;
import cn.enn.ygego.sunny.user.dto.MemberInfoDTO;
import cn.enn.ygego.sunny.user.dto.vo.ChannelManRequestVO;
import cn.enn.ygego.sunny.user.dto.vo.ChannelRquestVO;
import cn.enn.ygego.sunny.user.model.ChannelManage;
import cn.enn.ygego.sunny.user.model.MemberInfo;
import cn.enn.ygego.sunny.user.model.RelaChannelToRole;
import cn.enn.ygego.sunny.user.model.RelaMemberToAcct;
import cn.enn.ygego.sunny.user.service.ChannelManageService;
import cn.enn.ygego.sunny.user.service.MemberInfoService;
import cn.enn.ygego.sunny.user.service.RelaChannelToRoleService;
import cn.enn.ygego.sunny.user.service.RelaMemberToAcctService;
import com.github.jsonzou.jmockdata.JMockData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.net.www.http.HttpClient;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/channelMan")
@Api(value = "添加渠道管理", description = "添加渠道管理")
public class ChannelManageController {
    static final Logger logger = SearchableLoggerFactory.getDefaultLogger();
    @Autowired
     private ChannelManageService channelManageService;
    @Autowired
    private MemberInfoService memberInfoService;
    @Autowired
    private RelaMemberToAcctService relaMemberToAcctService;
    @Autowired
    private RelaChannelToRoleService relaChannelToRoleService;
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("创建渠道接口")
    @RequestMapping(value = "/createChannel", method = { RequestMethod.POST})
    public JsonResponse createChannelManInfo(@RequestBody JsonRequest<ChannelManRequestVO> jsonRequest) {
        logger.info("创建渠道接口");
        JsonResponse jsonResponse = null; // 返回的对象
        try {
            jsonResponse = new JsonResponse();
            ChannelManRequestVO channelManageDTO=new ChannelManRequestVO();
            channelManageDTO=jsonRequest.getReqBody();
            if(channelManageDTO==null){
                logger.info("参数不能为空，请重新输入");
                jsonResponse.setRetDesc("参数不能为空，请重新输入");
                jsonResponse.setRetCode("0");
                return jsonResponse;
            }
            //添加会员信息表
            MemberInfo memberInfo=new MemberInfo();
            memberInfo.setMemberType(1);
            memberInfo.setStatus(1);
            memberInfoService.createMemberInfo(memberInfo);
            //添加会员与账户关系表（渠道管理员）
            RelaMemberToAcct relaMemberToAcct=new RelaMemberToAcct();
            relaMemberToAcct.setMemberId(memberInfo.getMemberId());
            relaMemberToAcct.setAcctId(channelManageDTO.getChannelOperAcctId());
            relaMemberToAcct.setMemberType(1);
            relaMemberToAcct.setIsDefaultEnt(0);
            relaMemberToAcctService.createRelaMemberToAcct(relaMemberToAcct);
            //添加渠道信息
            ChannelManage channelManage=new ChannelManage();
            BeanUtils.copyProperties(channelManageDTO,channelManage);
            channelManage.setChannelOperMemberId(memberInfo.getMemberId());
            channelManageService.createChannelManage(channelManage);
            //添加渠道与角色关系表
            RelaChannelToRole relaChannelToRole=new RelaChannelToRole();
            relaChannelToRole.setChannelId(channelManage.getChannelId());
            relaChannelToRole.setRoleId(channelManageDTO.getRoleId());
            Integer chInt=relaChannelToRoleService.createRelaChannelToRole(relaChannelToRole);
            //TODO 添加账户角色关系表 调三级权限
            if(chInt>0){
                jsonResponse.setRetDesc("添加渠道成功！"); // 返回值信息
                jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
                return jsonResponse;
            }
            jsonResponse.setRetDesc("添加渠道失败！"); // 返回值信息
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
        } catch (BeansException e) {
            e.printStackTrace();
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改渠道接口")
    @RequestMapping(value = "/modifyChannel", method = { RequestMethod.POST})
    public JsonResponse modifyChannelManInfo(@RequestBody JsonRequest<ChannelManageDTO> jsonRequest) {
        logger.info("修改渠道接口");
        JsonResponse jsonResponse = null; // 返回的对象
        try {
            jsonResponse = new JsonResponse();
            ChannelManageDTO channelManageDTO=new ChannelManageDTO();
            channelManageDTO=jsonRequest.getReqBody();
            if(channelManageDTO==null){
                logger.info("参数不能为空，请重新输入");
                jsonResponse.setRetDesc("参数不能为空，请重新输入");
                jsonResponse.setRetCode("0");
                return jsonResponse;
            }
            //修改渠道基本信息
            ChannelManage channelManage=new ChannelManage();
            BeanUtils.copyProperties(channelManageDTO,channelManage);
            Integer chInt=channelManageService.modifyChannelManageByPrimaryKey(channelManage);
            if(chInt>0){
                jsonResponse.setRetDesc("修改渠道接口成功"); // 返回值信息
                jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
                return jsonResponse;
            }
            jsonResponse.setRetDesc("修改渠道接口失败！"); // 返回值信息
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
        } catch (BeansException e) {
            e.printStackTrace();
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询渠道详情的接口")
    @RequestMapping(value = "/queryChannel", method = { RequestMethod.POST})
    public JsonResponse<ChannelManageDTO> queryChannelManInfo(@RequestBody JsonRequest<ChannelRquestVO> channelRquestVO) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        logger.info("查询渠道详情的接口");
        Long channelId=channelRquestVO.getReqBody().getChannelId();
        if (channelId==null) {
            logger.info("参数不能为空，请重新输入");
            jsonResponse.setRetDesc("参数不能为空，请重新输入");
            jsonResponse.setRetCode("0");
            return jsonResponse;
        }
        try {
            ChannelManRequestVO channelManageDTO = new ChannelManRequestVO();
            ChannelManage channelManage=channelManageService.getChannelManageByPrimaryKey(Long.valueOf(channelId));
            if (channelManage!=null) {
                BeanUtils.copyProperties(channelManage,channelManageDTO);
                //TODO 三级权限查询角色名称接口
//                channelManageDTO.setRoleTitle();
                jsonResponse.setRspBody(channelManageDTO);
                jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
                return jsonResponse;
            }
            jsonResponse.setRetDesc("查询渠道详情的接口失败！"); // 返回值信息
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
        } catch (BeansException e) {
            e.printStackTrace();
        }
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看渠道列表接口")
    @RequestMapping(value = "/queryChannelList", method = { RequestMethod.POST})
    public JsonResponse<PageDTO<ChannelManage>> queryChannelManList(@RequestBody JsonRequest<ChannelRquestVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        logger.info("查看渠道列表接口");
        ChannelRquestVO channelRquestVO=new ChannelRquestVO();
        channelRquestVO=jsonRequest.getReqBody();
        ChannelManage channelManage= new ChannelManage();
        //组合查询条件
        BeanUtils.copyProperties(channelRquestVO,channelManage);
        try {
            //分页查询
            PageDTO<ChannelManage> page = new PageDTO<>(channelRquestVO.getPageNum(),channelRquestVO.getPageSize());
            ArrayList list = new ArrayList<ChannelManage>();
            page.setStartRow(channelRquestVO.getStartRow());
            //统计总数
            Integer total=channelManageService.getCount(channelManage);
            List<ChannelManage> channelManages=channelManageService.findChannelManagesPage(channelRquestVO);
            page.setResultData(channelManages);
            page.setTotal(total);
            jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
            jsonResponse.setRetDesc("查询列表成功！");
            jsonResponse.setRspBody(page);
        } catch (Exception e) {
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
            jsonResponse.setRetDesc("查询列表失败！");
            e.printStackTrace();
        }
        return jsonResponse;
    }
    
    /**
     * TODO 通过渠道ID，查询渠道详情（集合）
     * @Description TODO  接口定义
     * @author puanl
     * @date 2018年3月30日 下午12:58:39 
     * @param
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("通过渠道ID，查询渠道详情（集合）")
    @RequestMapping(value = "/queryChannelByIds", method = { RequestMethod.POST})
    public JsonResponse<ArrayList<ChannelManageDTO>> queryChannelManInfoByIds(@RequestBody JsonRequest<ChannelRquestVO> channelRquestVO) {
        JsonResponse<ArrayList<ChannelManageDTO>>  jsonResponse = new JsonResponse<>(); // 返回的对象
        String[] channelId = new String[0];
        ArrayList<ChannelManageDTO> result = new ArrayList<ChannelManageDTO>();
        String channelIds=channelRquestVO.getReqBody().getChannelIds();
        if (channelIds==null) {
            try {
                //查询所有列表
                List<ChannelManage> channelManages=channelManageService.findAll();
                if(channelManages!=null){
                    for (ChannelManage dto:channelManages) {
                        ChannelManageDTO channelManageDTO=new ChannelManageDTO();
                        BeanUtils.copyProperties(dto,channelManageDTO);
                        result.add(channelManageDTO);
                    }
                    jsonResponse.setRspBody(result);
                    jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
                    jsonResponse.setRetDesc("查询渠道列表成功！");
                    return jsonResponse;
                }
            } catch (BeansException e) {
                jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
                jsonResponse.setRetDesc("查询列表失败！");
                e.printStackTrace();
            }
        }
        try {
            //根据id查询渠道
            channelId = channelIds.split(",");
            for(String id : channelId){
                ChannelManageDTO dto = new ChannelManageDTO();
                ChannelManage channelManage=new ChannelManage();
                channelManage=channelManageService.getChannelManageByPrimaryKey(Long.valueOf(id));
                if (channelManage!=null) {
                    BeanUtils.copyProperties(channelManage,dto);
                }
                result.add(dto);
            }
            jsonResponse.setRspBody(result);
            jsonResponse.setRetCode(ResponseCodeEnum.SUCCESS.getStatusCode());
            jsonResponse.setRetDesc("查询渠道列表成功！");
        } catch (BeansException e) {
            jsonResponse.setRetCode(ResponseCodeEnum.FAIL.getStatusCode());
            jsonResponse.setRetDesc("查询列表失败！");
            e.printStackTrace();
        }
        return jsonResponse;
    }
}
