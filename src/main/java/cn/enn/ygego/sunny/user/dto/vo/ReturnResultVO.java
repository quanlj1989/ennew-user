/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: ReturnResultVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 19:07 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 19:07      0.0.1             TODO
 */
@ApiModel(description = "用于返回结果的描述类")
public class ReturnResultVO implements Serializable {

    @ApiModelProperty("执行结果")
    private String retResult; /*执行结果：1.成功 0.失败*/
    @ApiModelProperty("提示信息")
    private String retMsg; /*提示信息*/

    public ReturnResultVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ReturnResultVO(String retResult, String retMsg) {
        super();
        this.retResult = retResult;
        this.retMsg = retMsg;
    }

    public String getRetResult() {
        return retResult;
    }

    public void setRetResult(String retResult) {
        this.retResult = retResult;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    @Override
    public String toString() {
        return "ReturnResultVO [retResult=" + retResult + ", retMsg=" + retMsg + "]";
    }

}
