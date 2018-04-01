package cn.enn.ygego.sunny.user.controller.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.common.utils.StringUtils;

import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.BusiAcctInfoDTO;
import cn.enn.ygego.sunny.user.model.BusiAcctInfo;
import cn.enn.ygego.sunny.user.service.BusiAcctInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("user/person/busiacct")
@Api(value = "账户信息服务", description = "账户信息服务")
public class BusiAcctInfoController {

	@Autowired
    private BusiAcctInfoService busiAcctInfoService;  /* 业务账户表 */
	
    /**
     * @Description 根据ID查看个人详情接口
     * @author puanl
     * @date 2018年3月30日 下午2:38:00 
     * @param request
     * @return
     */
    @RequestMapping(value="/getAttestDetailByIds", method = { RequestMethod.POST})
    @ApiOperation("根据ID查看个人详情接口")
    @ResponseBody
    public JsonResponse<List<BusiAcctInfo>> getAttestDetail(@RequestBody JsonRequest<BusiAcctInfoDTO> request){
        JsonResponse<List<BusiAcctInfo>> result = null;
        BusiAcctInfoDTO queryDto = request.getReqBody();
        if(queryDto == null || StringUtils.isEmpty(queryDto.getAcctIds())){
            result = new JsonResponse<>("502"," Ids 不能为空");
            return result;
        }
        String[] idArr = queryDto.getAcctIds().split(",");
        List<BusiAcctInfo> acctList = new ArrayList<>();
        for(String id : idArr){
            BusiAcctInfo acct = busiAcctInfoService.getBusiAcctInfoByPrimaryKey(Long.valueOf(id));
            if(acct != null){
            	acctList.add(acct);
            }
        }
        result = new JsonResponse<>(acctList);
        return result;
    }
    
}
