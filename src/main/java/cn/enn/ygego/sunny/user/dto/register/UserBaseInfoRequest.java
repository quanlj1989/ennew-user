package cn.enn.ygego.sunny.user.dto.register;

import java.io.Serializable;

/**
 *  用户基本信息（封装对多个请求通用参数的封装）
 * Created by dongbb on 2018/3/26.
 */
public class UserBaseInfoRequest implements Serializable {

    private Long acctId; //账号id
    private Long memberId; //个人会员id
    private Long companyMemberId; //企业会员id

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getCompanyMemberId() {
        return companyMemberId;
    }

    public void setCompanyMemberId(Long companyMemberId) {
        this.companyMemberId = companyMemberId;
    }
}
