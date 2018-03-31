package cn.enn.ygego.sunny.user.dto.factory;

import cn.enn.ygego.sunny.user.model.InspectFactoryApplyInfo;
/**
 * 
 * ClassName: InspectFactoryApplyInfoVO	
 * Description 验证类目返回实体类
 * Author zhengyang
 * Date 2018年3月30日 下午7:57:52 
 */
public class InspectFactoryApplyInfoVO extends InspectFactoryApplyInfo{
	private static final long serialVersionUID = -5587804359610218552L;
	/**验厂类目的产品数量*/
	private Integer productCount;
	/**审核时间显示字符串*/
	private String createTimeStr;
	/**审核状态显示字符串*/
	private String applyStatusStr;
	public Integer getProductCount() {
		return productCount;
	}
	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}
	public String getCreateTimeStr() {
		return createTimeStr;
	}
	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}
	public String getApplyStatusStr() {
		return applyStatusStr;
	}
	public void setApplyStatusStr(String applyStatusStr) {
		this.applyStatusStr = applyStatusStr;
	}
}
