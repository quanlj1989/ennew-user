package cn.enn.ygego.sunny.user.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户登录方式
 * Created by dongbb on 2018/3/22.
 */
public enum UserLoginWayEnum {

    PLATFORM("1","平台登录"),
    FANNENG_3TH("2","泛能（第三方）"),
    SUN_3TH("3","奥德（第三方）");

    private String statusCode;
    private String statusName;

    UserLoginWayEnum(String statusCode, String statusName) {
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
        UserLoginWayEnum[] statusArr = UserLoginWayEnum.values();
        for (UserLoginWayEnum status : statusArr) {
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
        List<Map<String,String>> result = new ArrayList<>();
        UserLoginWayEnum[] statusArr = UserLoginWayEnum.values();
        for (UserLoginWayEnum status : statusArr) {
            Map<String, String>  resultMap = new HashMap<>();
            resultMap.put("statusCode", status.statusCode);
            resultMap.put("statusName",status.statusName);
            result.add(resultMap);
        }
        return result;
    }
}
