/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AuditCredentialImageVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 17:43 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 17:43      0.0.1             TODO
 */
@ApiModel(description = "查看验厂详情的认证证件图片描述类")
public class AuditCredentialImageVO implements Serializable {

    @ApiModelProperty("证件名称")
    private String credentialName; /*证件名称*/
    @ApiModelProperty("证件图片路径")
    private String credentialImagePath; /*证件图片路径*/

    public AuditCredentialImageVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public AuditCredentialImageVO(String credentialName, String credentialImagePath) {
        super();
        this.credentialName = credentialName;
        this.credentialImagePath = credentialImagePath;
    }

    public String getCredentialName() {
        return credentialName;
    }

    public void setCredentialName(String credentialName) {
        this.credentialName = credentialName;
    }

    public String getCredentialImagePath() {
        return credentialImagePath;
    }

    public void setCredentialImagePath(String credentialImagePath) {
        this.credentialImagePath = credentialImagePath;
    }

    @Override
    public String toString() {
        return "AuditCredentialImageVO [credentialName=" + credentialName + ", credentialImagePath="
                + credentialImagePath + "]";
    }

}
