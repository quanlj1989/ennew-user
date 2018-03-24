package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 查看验厂列表的描述类
 * ClassName: SupplierDTO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 16:06 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 16:06      0.0.1             TODO
 */
@ApiModel(description = "用于查看验厂列表的描述类")
public class SupplierVO implements Serializable {

    @ApiModelProperty("供应商id")
    private Long supplierId; /* 供应商id */
    @ApiModelProperty("验证品类名称")
    private String verifyCategory; /* 验证品类名称 */
    @ApiModelProperty("供应商名称")
    private String supplierName; /* 供应商名称 */
    @ApiModelProperty("审核状态")
    private Integer status; /* 审核状态 */
    @ApiModelProperty("申请时间")
    private Date applyTime; /* 申请时间 */

    public SupplierVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SupplierVO(Long supplierId, String verifyCategory, String supplierName, Integer status, Date applyTime) {
        super();
        this.supplierId = supplierId;
        this.verifyCategory = verifyCategory;
        this.supplierName = supplierName;
        this.status = status;
        this.applyTime = applyTime;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getVerifyCategory() {
        return verifyCategory;
    }

    public void setVerifyCategory(String verifyCategory) {
        this.verifyCategory = verifyCategory;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    @Override
    public String toString() {
        return "supplierDTO [supplierId=" + supplierId + ", verifyCategory=" + verifyCategory + ", supplierName="
                + supplierName + ", status=" + status + ", applyTime=" + applyTime + "]";
    }

}
