/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AuditCredentialsVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 17:39 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 17:39      0.0.1             TODO
 */
@ApiModel(description = "查看验厂详情的认证证件描述类")
public class AuditCredentialsVO implements Serializable {

    @ApiModelProperty("证件类型")
    private String credentialType; /*证件类型*/
    @ApiModelProperty("证件图片信息")
    private List<AuditCredentialImageVO> credentialImage; /*证件图片信息*/

    public AuditCredentialsVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public AuditCredentialsVO(String credentialType, List<AuditCredentialImageVO> credentialImage) {
        super();
        this.credentialType = credentialType;
        this.credentialImage = credentialImage;
    }

    public String getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(String credentialType) {
        this.credentialType = credentialType;
    }

    public List<AuditCredentialImageVO> getCredentialImage() {
        return credentialImage;
    }

    public void setCredentialImage(List<AuditCredentialImageVO> credentialImage) {
        this.credentialImage = credentialImage;
    }

    @Override
    public String toString() {
        return "AuditCredentialsVO [credentialType=" + credentialType + ", credentialImage=" + credentialImage + "]";
    }

}
