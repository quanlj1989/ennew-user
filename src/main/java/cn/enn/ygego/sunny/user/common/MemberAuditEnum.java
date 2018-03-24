package cn.enn.ygego.sunny.user.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  会员状态审核
 * Created by dongbb on 2018/3/23.
 */
public enum MemberAuditEnum {

    CHECK_AUDIT("1", "审核中"),
    PASS_AUDIT("2", "审核通过"),
    NO_PASS_AUDIT("2", "审核不通过");

    private String statusCode;
    private String statusName;

    MemberAuditEnum(String statusCode, String statusName) {
        this.statusCode = statusCode;
        this.statusName = statusName;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getStatusName() {
        return statusName;
    }


    /**
     * 根据key查找对应的value
     *
     * @return
     */
    public static String getStatusName(String statusCode) {
        MemberAuditEnum[] statusArr = MemberAuditEnum.values();
        for (MemberAuditEnum status : statusArr) {
            if (status.getStatusCode().equals(statusCode)) {
                return status.statusName;
            }
        }
        return "";
    }

    /**
     * 把数据封装成一个List
     *
     * @return
     */
    public static List<Map<String, String>> convertToList() {
        List<Map<String, String>> result = new ArrayList<>();
        MemberAuditEnum[] statusArr = MemberAuditEnum.values();
        for (MemberAuditEnum status : statusArr) {
            Map<String, String> resultMap = new HashMap<>();
            resultMap.put("statusCode", status.statusCode);
            resultMap.put("statusName", status.statusName);
            result.add(resultMap);
        }
        return result;
    }
}
