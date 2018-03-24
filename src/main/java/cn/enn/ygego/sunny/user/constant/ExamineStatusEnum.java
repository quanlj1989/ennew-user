package cn.enn.ygego.sunny.user.constant;

/**
 * 用户枚举类
 * ClassName: PersonEmum	
 * Description 
 * Author puanl
 * Date 2018年3月23日 下午12:51:47 
 * History: 
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public enum ExamineStatusEnum {
    
    // 申请状态：  0待提交 1审批通过 2待审批 3审批拒绝
    APPLY_STATUS_AGREE(1,"审批通过"),
    APPLY_STATUS_SUBMIT(2,"待审批"),
    APPLY_STATUS_REFUSE(3,"审批拒绝");
    
    private Integer code;
    private String desc;

    ExamineStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ExamineStatusEnum getByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (ExamineStatusEnum reasonEnum : ExamineStatusEnum.values()) {
            if (reasonEnum.getCode() == code) {
                return reasonEnum;
            }
        }
        return null;
    }
    
}
