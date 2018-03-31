package cn.enn.ygego.sunny.user.dto.login;

import java.io.Serializable;

/**
 * 查询第三方登陆配置信息
 * Created by dongbb on 2018/3/30.
 */
public class ThirdLoginConfigResponse implements Serializable {

    private Long configId;		 /* 配置ID */
    private String companyShortName;		 /* 公司简称 */
    private String companyIconUri;		 /* 公司图标路径 */

    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }

    public String getCompanyIconUri() {
        return companyIconUri;
    }

    public void setCompanyIconUri(String companyIconUri) {
        this.companyIconUri = companyIconUri;
    }
}
