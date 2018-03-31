package cn.enn.ygego.sunny.user.constant;

/**
 * 用户
 * ClassName: PersonEmum	
 * Description 
 * Author puanl
 * Date 2018年3月23日 下午12:51:47 
 * History: 
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class PersonConstant {
    
    // 会员类型
    public static final int MEMBER_TYPE_COMPANY = 2 ; // 企业
    public static final int MEMBER_TYPE_PERSON = 3 ;  // 个人
    
    // 申请状态：  0待提交 1审批通过 2待审批 3审批拒绝
    public static final int AUTH_STATUS_UNSUBMIT = 0 ;  // "未提交"
    public static final int AUTH_STATUS_AGREE = 1 ;  // "审批通过"
    public static final int AUTH_STATUS_SUBMIT = 2 ; // "待审批"
    public static final int AUTH_STATUS_REFUSE = 3;  // "审批拒绝"
    
    // 申请企业状态： 1：待审核 2：审核通过 3：审核失败
    public static final int EMPLOYEE_STATUS_SUBMIT = 1; // 待审核
    public static final int EMPLOYEE_STATUS_AGREE = 2;  // "审批通过"
    public static final int EMPLOYEE_STATUS_REFUSE = 3;  // "审批拒绝"
}
