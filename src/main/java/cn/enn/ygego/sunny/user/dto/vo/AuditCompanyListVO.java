/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: CompanyListVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 17:25 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 17:25      0.0.1             TODO
 */
@ApiModel(description = "用于查看验厂详情的企业信息描述类")
public class AuditCompanyListVO implements Serializable {

    @ApiModelProperty("企业信息类型")
    private String companyType; /* 企业信息类型 */
    @ApiModelProperty("照片类型")
    private String imageType; /*照片类型*/
    @ApiModelProperty("企业相关图片")
    private List<AuditImagesVO> imageList; /*企业相关图片*/

    public AuditCompanyListVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public AuditCompanyListVO(String companyType, String imageType, List<AuditImagesVO> imageList) {
        super();
        this.companyType = companyType;
        this.imageType = imageType;
        this.imageList = imageList;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public List<AuditImagesVO> getImageList() {
        return imageList;
    }

    public void setImageList(List<AuditImagesVO> imageList) {
        this.imageList = imageList;
    }

    @Override
    public String toString() {
        return "AuditCompanyListVO [companyType=" + companyType + ", imageType=" + imageType + ", imageList="
                + imageList + "]";
    }

}
