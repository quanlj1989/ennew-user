/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.controller.BaseManage;

import cn.enn.ygego.sunny.core.page.PageDTO;
import cn.enn.ygego.sunny.core.web.json.JsonRequest;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import cn.enn.ygego.sunny.user.dto.vo.AcctLoginLogVO;
import cn.enn.ygego.sunny.user.dto.vo.AcctOperLogVO;
import cn.enn.ygego.sunny.user.model.AcctLoginLog;
import cn.enn.ygego.sunny.user.model.AcctOperLog;
import cn.enn.ygego.sunny.user.service.impl.LogServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: LogController
 * Description:
 * Author: liangchao
 * Date: 2018/3/28 16:55
 * History:
 * <author>          <time>          <version>          <desc>
 * liangc           修改时间           0.0.1              描述
 */
@RestController
@RequestMapping("/base/logOperation")
@Api(value = "用户操作日志", description = "用户操作日志")
public class LogController {
    Logger logger = LoggerFactory.getLogger(LogController.class);

    @Autowired
    private LogServiceImpl logService;

    /**
     * @Description  分页信息
     * @author liangchao
     * @date 2018/3/28 14:03
     */
    private static final Integer DEFAULT_PAGESIZE = 10;
    private static final Integer DEFAULT_PAGE_NUM = 1;

    /**
     * @Description 
     * @author liangchao
     * @date 2018/3/28 17:01
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="增加登陆日志")
    @RequestMapping(value = "/addLoginLog", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse addLoginLog(@RequestBody JsonRequest<AcctLoginLog> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        //AcctLoginLog
        AcctLoginLog acctLoginLog = jsonRequest.getReqBody();
        try {
            logService.insertLoginLog(acctLoginLog);
        } catch (Exception e) {
            logger.error("增加登陆日志失败", e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }
        return jsonResponse;
    }

    /**
     * @Description
     * @author liangchao
     * @date 2018/3/28 17:01
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="查询登陆日志")
    @RequestMapping(value = "/queryLoginLog", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse<AcctLoginLog> queryLoginLog(@RequestBody JsonRequest<AcctLoginLogVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            AcctLoginLogVO acctLoginLogVO = jsonRequest.getReqBody();
            Integer pageNum = acctLoginLogVO.getPageNum();
            Integer pageSize = acctLoginLogVO.getPageSize();
            if(null == pageNum || pageNum.intValue() < 1) {
                pageNum = this.DEFAULT_PAGE_NUM;
                acctLoginLogVO.setPageNum(this.DEFAULT_PAGE_NUM);
            }
            if(null == pageSize || pageSize.intValue() < 1) {
                pageSize = this.DEFAULT_PAGESIZE;
                acctLoginLogVO.setPageSize(this.DEFAULT_PAGESIZE);
            }

            PageDTO pageDTO = new PageDTO(pageNum ,pageSize);
            acctLoginLogVO.setStartRow(pageDTO.getStartRow());

            Long pageTotal = logService.queryLoginLogCount(acctLoginLogVO);

            List<AcctLoginLog> list = null;
            if ( pageTotal.intValue() > 0 ) {
                list = logService.queryLoginLog(acctLoginLogVO);
            } else {
                list = new ArrayList<>();
            }
            pageDTO.setTotal(pageTotal);
            pageDTO.setResultData(list);
            jsonResponse.setRspBody(pageDTO);
        } catch (Exception e) {
            logger.error("查询登陆日志失败", e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }
        return jsonResponse;
    }

    /**
     * @Description
     * @author liangchao
     * @date 2018/3/28 17:01
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="导出登陆日志")
    @RequestMapping(value = "/exportLoginLog", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse exportLoginLog(@RequestBody JsonRequest<AcctLoginLogVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();

        return jsonResponse;
    }

    /**
     * @Description
     * @author liangchao
     * @date 2018/3/28 17:01
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="增加操作日志")
    @RequestMapping(value = "/addOperationLog", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse addOperationLog(@RequestBody JsonRequest<AcctOperLog> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        //AcctLoginLog
        try {
            AcctOperLog acctOperLog = jsonRequest.getReqBody();
            logService.addOperationLog(acctOperLog);
        } catch (Exception e) {
            logger.error("增加操作日志失败", e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }
        return jsonResponse;
    }

    /**
     * @Description
     * @author liangchao
     * @date 2018/3/28 17:01
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="查询操作日志")
    @RequestMapping(value = "/queryOperationLog", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse queryOperationLog(@RequestBody JsonRequest<AcctOperLogVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();
        try {
            AcctOperLogVO acctOperLogVO = jsonRequest.getReqBody();
            Integer pageNum = acctOperLogVO.getPageNum();
            Integer pageSize = acctOperLogVO.getPageSize();
            if(null == pageNum || pageNum.intValue() < 1) {
                pageNum = this.DEFAULT_PAGE_NUM;
                acctOperLogVO.setPageNum(this.DEFAULT_PAGE_NUM);
            }
            if(null == pageSize || pageSize.intValue() < 1) {
                pageSize = this.DEFAULT_PAGESIZE;
                acctOperLogVO.setPageSize(this.DEFAULT_PAGESIZE);
            }

            PageDTO pageDTO = new PageDTO(pageNum ,pageSize);
            acctOperLogVO.setStartRow(pageDTO.getStartRow());

            Long pageTotal = logService.queryOperLogCount(acctOperLogVO);

            List<AcctOperLog> list = null;
            if ( pageTotal.intValue() > 0 ) {
                list = logService.queryOperLog(acctOperLogVO);
            } else {
                list = new ArrayList<>();
            }
            pageDTO.setTotal(pageTotal);
            pageDTO.setResultData(list);
            jsonResponse.setRspBody(pageDTO);
        } catch (Exception e) {
            logger.error("查询操作日志失败", e.getMessage());
            jsonResponse.setRetCode("0111111");
            jsonResponse.setRetDesc(e.getMessage());
        }
        return jsonResponse;
    }

    /**
     * @Description
     * @author liangchao
     * @date 2018/3/28 17:01
     * @param jsonRequest
     * @return
     */
    @ApiOperation(value="导出操作日志")
    @RequestMapping(value = "/exportOperationLog", method = { RequestMethod.POST})
    @ResponseBody
    public JsonResponse exportOperationLog(@RequestBody JsonRequest<AcctOperLogVO> jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse();

        return jsonResponse;
    }

}
