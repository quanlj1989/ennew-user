package cn.enn.ygego.sunny.user.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  删除状态
 *
 * Created by dongbb on 2018/3/22.
 */
public enum DeleteStatusEnum {

    NO_DELETE("0","未删除"),
    DELETE("1","删除");

    private String statusCode;
    private String statusName;

    DeleteStatusEnum(String statusCode, String statusName) {
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
        DeleteStatusEnum[] statusArr = DeleteStatusEnum.values();
        for (DeleteStatusEnum status : statusArr) {
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
        DeleteStatusEnum[] statusArr = DeleteStatusEnum.values();
        for (DeleteStatusEnum status : statusArr) {
            Map<String, String>  resultMap = new HashMap<>();
            resultMap.put("statusCode", status.statusCode);
            resultMap.put("statusName",status.statusName);
            result.add(resultMap);
        }
        return result;
    }
}
