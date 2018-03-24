package cn.enn.ygego.sunny.user.controller.brand;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.BrandApplyDTO;

/**
 * 
 * ClassName: DictBrandController	
 * Description 
 * Author LiuLei
 * Date 2018年3月20日 上午10:46:53 
 * History: 
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
@RequestMapping("/brandApply")
public class BrandApplyController {

    static Logger logger = LoggerFactory.getLogger(BrandApplyController.class);

    /**
     * 
     * @Description 查询审核品牌列表
     * @author LiuLei
     * @date 2018年3月20日 上午10:47:13 
     * @param jsonRequest
     * @return
     */
    @RequestMapping("/listPage")
	public JsonResponse listPage(JsonRequest<BrandApplyDTO> jsonRequest) {

    	BrandApplyDTO reqBody = jsonRequest.getReqBody();

		JsonResponse jsonResponse = new JsonResponse();
		PageDTO<BrandApplyDTO> pageDTO = new PageDTO<BrandApplyDTO>(1, 10);

		pageDTO.setResultData(attrList());
		pageDTO.setTotal(3);

		jsonResponse.setRspBody(pageDTO);

		return jsonResponse;
	}

    /**
     * 
     * @Description 查询审核品牌详情
     * @author LiuLei
     * @date 2018年3月20日 上午11:07:53 
     * @param jsonRequest
     * @return
     */
    @RequestMapping("/detail")
    public JsonResponse detail(JsonRequest<BrandApplyDTO> jsonRequest) {

    	BrandApplyDTO reqBody = jsonRequest.getReqBody();
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setRspBody(attrEntity(1L));
        return jsonResponse;
    }
    
    /**
     * @Author: LiuLei
     * @Description：审核品牌
     * @Return:
     * @Date: 14:38 2018/3/17
     */
    @RequestMapping("/approve")
    public JsonResponse approve(JsonRequest<BrandApplyDTO> jsonRequest) {
    	
    	JsonResponse jsonResponse = new JsonResponse();
    	return jsonResponse;
    }

    /**
     * @Author: LiuLei
     * @Description：申请品牌
     * @Return:
     * @Date: 14:38 2018/3/17
     */
    @RequestMapping("/create")
    public JsonResponse create(JsonRequest<BrandApplyDTO> jsonRequest) {

        JsonResponse jsonResponse = new JsonResponse();
        return jsonResponse;
    }

	private List<BrandApplyDTO> attrList() {
		List<BrandApplyDTO> list = new ArrayList<BrandApplyDTO>();
		for (Long i = 1L; i < 4L; i++) {
			list.add(attrEntity(i));
		}
		return list;
	}
    private BrandApplyDTO attrEntity(Long i){
    	BrandApplyDTO dto = new BrandApplyDTO();
        dto.setApplyId(i);
        dto.setBrandName("品牌" + i);
        dto.setBrandLogo("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521524621110&di=93ff130c5775a988727a842ef3e88d8a&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F013163554d72630000007cd0560ece.jpg%40900w_1l_2o_100sh.jpg");
        dto.setCompanyName("公司" + i);
        dto.setCreateTime(new Date());
        dto.setStatus(1);
        dto.setBrandEnName("pinpai" + i);
        dto.setBrandAlias("别名" + i);
        dto.setCountry(1);
        dto.setBrandDesc("描述");
        return dto;
    }
}
