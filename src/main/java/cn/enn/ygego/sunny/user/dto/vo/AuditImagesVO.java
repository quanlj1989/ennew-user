/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AuditImagesVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-20 17:28 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-20 17:28      0.0.1             TODO
 */
@ApiModel(description = "用于查看验厂详情的图片信息描述类")
public class AuditImagesVO implements Serializable {

    @ApiModelProperty("图片名称")
    private String imageName; /* 图片名称 */
    @ApiModelProperty("图片路径")
    private String imagePath; /* 图片路径 */
    @ApiModelProperty("备注资料")
    private String imageComment; /*备注资料*/

    public AuditImagesVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public AuditImagesVO(String imageName, String imagePath, String imageComment) {
        super();
        this.imageName = imageName;
        this.imagePath = imagePath;
        this.imageComment = imageComment;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageComment() {
        return imageComment;
    }

    public void setImageComment(String imageComment) {
        this.imageComment = imageComment;
    }

    @Override
    public String toString() {
        return "AuditImagesVO [imageName=" + imageName + ", imagePath=" + imagePath + ", imageComment=" + imageComment
                + "]";
    }

}
