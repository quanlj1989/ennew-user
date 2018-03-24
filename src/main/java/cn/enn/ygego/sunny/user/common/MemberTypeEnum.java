package cn.enn.ygego.sunny.user.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  会员类型
 * Created by dongbb on 2018/3/22.
 */
public enum MemberTypeEnum {

    CHANNEL_OPERATION("1", "渠道运营"),
    COMPANY("2", "企业"),
    PERSON("3", "个人"),
    PLATFORM_OPERATION("4", "平台运营");

    private String statusCode;
    private String statusName;

    MemberTypeEnum(String statusCode, String statusName) {
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
        MemberTypeEnum[] statusArr = MemberTypeEnum.values();
        for (MemberTypeEnum status : statusArr) {
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
        MemberTypeEnum[] statusArr = MemberTypeEnum.values();
        for (MemberTypeEnum status : statusArr) {
            Map<String, String> resultMap = new HashMap<>();
            resultMap.put("statusCode", status.statusCode);
            resultMap.put("statusName", status.statusName);
            result.add(resultMap);
        }
        return result;
    }
}
