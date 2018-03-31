package cn.enn.ygego.sunny.user.dto.company;

import java.io.Serializable;
import java.util.List;

/**
 * 公司对应的多个认证
 * Created by dongbb on 2018/3/26.
 */
public class CompanyAuthInfo implements Serializable {

    private Long memberId; //会员id
    private String companyName; //公司名称
    private List<CompanyAuthType> authTypes; //企业认证类型集合

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<CompanyAuthType> getAuthTypes() {
        return authTypes;
    }

    public void setAuthTypes(List<CompanyAuthType> authTypes) {
        this.authTypes = authTypes;
    }
}
