package cn.enn.ygego.sunny.user.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: EntAuthController
 * Description: 用户服务响应编码共7位，1,2位表示用户服务，3,4位表示功能业务，5，6,7位自定义异常变量，如定义其他功能需要在下面
 *              备注一下，防止重复
 * {23：白名单业务类型}
 * Author: dongbingbing
 * Date: 2018/3/20 18:51
 * History:
 * <author>          <time>          <version>          <desc>
 * dongbingbing    2018/3/20 18:51    0.0.1          用户服务响应编码
 */
public enum ResponseCodeEnum {

    //通用响应信息
    SUCCESS("0000000","处理成功！"), //处理成功
    FAIL("0100001","处理失败！"), //处理失败（自定义抛出异常）
    EXCEPTION("0100002","服务器异常！"),//服务器异常

    WHITE_LIST_FAIL("0123001","处理白名单失败"),
    WHITE_LIST_EXCEPTION("0123002","处理白名单服务器异常");

    private String statusCode;
    private String statusName;

    ResponseCodeEnum(String statusCode, String statusName) {
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
        ResponseCodeEnum[] statusArr = ResponseCodeEnum.values();
        for (ResponseCodeEnum status : statusArr) {
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
        ResponseCodeEnum[] statusArr = ResponseCodeEnum.values();
        for (ResponseCodeEnum status : statusArr) {
            Map<String, String>  resultMap = new HashMap<>();
            resultMap.put("statusCode", status.statusCode);
            resultMap.put("statusName",status.statusName);
            result.add(resultMap);
        }
        return result;
    }
}
