package cn.enn.ygego.sunny.user.constant;

/**
 * ClassName: EntCertApplyTypeEnum
 * Description:
 * Author: en3
 * Date: 2018/3/26 17:13
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public enum EntCertApplyTypeEnum {

    // 申请状态：  1申请2变更3认证升级
    APPLY_STATUS_APPLY(1,"申请"),
    APPLY_STATUS_CHANGE(2,"变更"),
    APPLY_STATUS_UP(3,"认证升级");

    private Integer code;
    private String desc;

    EntCertApplyTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ChannelAuthStatusEnum getByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (ChannelAuthStatusEnum reasonEnum : ChannelAuthStatusEnum.values()) {
            if (reasonEnum.getCode() == code) {
                return reasonEnum;
            }
        }
        return null;
    }
}
