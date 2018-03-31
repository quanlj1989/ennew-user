package cn.enn.ygego.sunny.user.constant;

/**
 * 用户枚举类
 * ClassName: ChannelAuthStatusEnum
 * Description
 * Author lzan
 * Date 2018年3月24日 下午12:51:47
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public enum ChannelAuthStatusEnum {

    // 申请状态：  0待提交 1审批通过 2待审批 3审批拒绝
    APPLY_STATUS_AGREE(1,"审批通过"),
    APPLY_STATUS_SUBMIT(2,"待审批"),
    APPLY_STATUS_REFUSE(3,"审批拒绝");

    private Integer code;
    private String desc;

    ChannelAuthStatusEnum(Integer code, String desc) {
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
