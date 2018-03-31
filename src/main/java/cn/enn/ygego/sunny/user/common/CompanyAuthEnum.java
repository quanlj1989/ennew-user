package cn.enn.ygego.sunny.user.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 企业认证类型 
 * Created by dongbb on 2018/3/26.
 */
public enum CompanyAuthEnum {

    PURCHASE("1", "采购商"),
    SUPPLIER("2", "供应商"),
    SETTLEMENT("3", "结算商"),
    FACILITATOR("4", "服务商");

    private String statusCode;
    private String statusName;

    CompanyAuthEnum(String statusCode, String statusName) {
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
        CompanyAuthEnum[] statusArr = CompanyAuthEnum.values();
        for (CompanyAuthEnum status : statusArr) {
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
        CompanyAuthEnum[] statusArr = CompanyAuthEnum.values();
        for (CompanyAuthEnum status : statusArr) {
            Map<String, String> resultMap = new HashMap<>();
            resultMap.put("statusCode", status.statusCode);
            resultMap.put("statusName", status.statusName);
            result.add(resultMap);
        }
        return result;
    }
}
