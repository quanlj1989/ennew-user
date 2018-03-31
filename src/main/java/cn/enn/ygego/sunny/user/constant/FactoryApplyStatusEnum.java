package cn.enn.ygego.sunny.user.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: FactoryApplyStatusEnum	
 * Description 验厂审核状态类
 * Author zhengyang
 * Date 2018年3月30日 下午7:22:07 
 */
public enum FactoryApplyStatusEnum {

    FACTORY_VERIFICATION("0", "验证中"),
    FACTORY_PASS("1", "审核通过"),
    FACTORY_FAILURE("2", "审核失败"),
    FACILITATOR("3", "已过期");

    private String statusCode;
    private String statusName;

    FactoryApplyStatusEnum(String statusCode, String statusName) {
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
        FactoryApplyStatusEnum[] statusArr = FactoryApplyStatusEnum.values();
        for (FactoryApplyStatusEnum status : statusArr) {
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
        FactoryApplyStatusEnum[] statusArr = FactoryApplyStatusEnum.values();
        for (FactoryApplyStatusEnum status : statusArr) {
            Map<String, String> resultMap = new HashMap<>();
            resultMap.put("statusCode", status.statusCode);
            resultMap.put("statusName", status.statusName);
            result.add(resultMap);
        }
        return result;
    }
}
