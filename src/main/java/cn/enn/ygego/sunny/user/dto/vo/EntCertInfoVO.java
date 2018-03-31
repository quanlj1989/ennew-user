/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntCertInfoDTO;
import cn.enn.ygego.sunny.user.model.EntCertFile;

import java.util.List;

/**
 * ClassName: EntCertInfoVO
 * Description:
 * Author: en3
 * Date: 2018/3/20 15:34
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntCertInfoVO extends EntCertInfoDTO {

    private static final long serialVersionUID = -3487920352291293366L;

    private List<EntCertFile> entCertFileList;

    public List<EntCertFile> getEntCertFileList() {
        return entCertFileList;
    }

    public void setEntCertFileList(List<EntCertFile> entCertFileList) {
        this.entCertFileList = entCertFileList;
    }
}
