package cn.enn.ygego.sunny.user.dto.company;

import cn.enn.ygego.sunny.user.common.CompanyAuthEnum;

import java.io.Serializable;

/**
 * 公司认证类型（采购商，供应商）
 * Created by dongbb on 2018/3/26.
 */
public class CompanyAuthType implements Serializable {

    private Integer authType; //认证类型
    private String authTypeName;//认证类型名称

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }

    public String getAuthTypeName() {
        return authTypeName = CompanyAuthEnum.getStatusName(authType.toString());
    }

    public void setAuthTypeName(String authTypeName) {
        this.authTypeName = authTypeName;
    }
}
