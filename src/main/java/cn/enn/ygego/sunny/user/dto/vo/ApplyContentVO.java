/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */
package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: ApplyContentVO	
 * Description 
 * Author zhangjiaqi
 * Date 2018-03-21 09:58 
 * History: 
 * <author>          <time>          <version>          <desc>
 * zhangjiaqi    2018-03-21 09:58      0.0.1             TODO
 */
@ApiModel(description = "仓库申请内容的描述类")
public class ApplyContentVO implements Serializable {

    @ApiModelProperty("角色名称")
    private String characterName; /*角色名称*/
    @ApiModelProperty("角色码")
    private String characterCode; /*角色码*/
    @ApiModelProperty("所属部门")
    private String department; /*所属部门*/
    @ApiModelProperty("过期时间")
    private Date expirationTime; /*过期时间*/
    @ApiModelProperty("描述")
    private String description; /*描述*/

    public ApplyContentVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ApplyContentVO(String characterName, String characterCode, String department, Date expirationTime,
            String description) {
        super();
        this.characterName = characterName;
        this.characterCode = characterCode;
        this.department = department;
        this.expirationTime = expirationTime;
        this.description = description;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterCode() {
        return characterCode;
    }

    public void setCharacterCode(String characterCode) {
        this.characterCode = characterCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ApplyContentVO [characterName=" + characterName + ", characterCode=" + characterCode + ", department="
                + department + ", expirationTime=" + expirationTime + ", description=" + description + "]";
    }

}
