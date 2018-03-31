package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntCertApplyDetailDTO;
import cn.enn.ygego.sunny.user.model.EntCertApplyFile;

import java.util.List;

/**
 * ClassName: EntCertApplyDetailVO
 * Description:
 * Author: en3
 * Date: 2018/3/28 16:34
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntCertApplyDetailVO extends EntCertApplyDetailDTO {

    private static final long serialVersionUID = -5177030253890710275L;
    private List<EntCertApplyFile> entCertApplyFileList;

    public List<EntCertApplyFile> getEntCertApplyFileList() {
        return entCertApplyFileList;
    }

    public void setEntCertApplyFileList(List<EntCertApplyFile> entCertApplyFileList) {
        this.entCertApplyFileList = entCertApplyFileList;
    }
}
