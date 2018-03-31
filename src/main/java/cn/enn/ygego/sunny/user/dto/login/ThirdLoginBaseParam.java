package cn.enn.ygego.sunny.user.dto.login;

import java.io.Serializable;

/**
 * 第三方登陆基本参数信息
 * Created by dongbb on 2018/3/30.
 */
public class ThirdLoginBaseParam implements Serializable {

    private Long configId; //配置ID
    private String thirdLoginUri; //请求登陆第三方地址

    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public String getThirdLoginUri() {
        return thirdLoginUri;
    }

    public void setThirdLoginUri(String thirdLoginUri) {
        this.thirdLoginUri = thirdLoginUri;
    }
}
