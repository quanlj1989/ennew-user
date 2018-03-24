package cn.enn.ygego.sunny.user.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 短信类型
 * Created by dongbb on 2018/3/24.
 */
public enum SmsTypeEnum {

    REGISTER("1", "注册"),
    FAND_PASSWORD("2", "找回密码"),
    CHANGE_PHONE("3", "更改绑定手机号");

    private String statusCode;
    private String statusName;

    SmsTypeEnum(String statusCode, String statusName) {
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
        SmsTypeEnum[] statusArr = SmsTypeEnum.values();
        for (SmsTypeEnum status : statusArr) {
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
        SmsTypeEnum[] statusArr = SmsTypeEnum.values();
        for (SmsTypeEnum status : statusArr) {
            Map<String, String> resultMap = new HashMap<>();
            resultMap.put("statusCode", status.statusCode);
            resultMap.put("statusName", status.statusName);
            result.add(resultMap);
        }
        return result;
    }
}
