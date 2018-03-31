package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntCateCertApplyDTO;
import cn.enn.ygego.sunny.user.model.EntCateCertApplyFile;

import java.util.List;

/**
 * ClassName: EntCateCertApplyVO
 * Description:
 * Author: en3
 * Date: 2018/3/28 16:44
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntCateCertApplyVO extends EntCateCertApplyDTO {

    private static final long serialVersionUID = -2980109041050163916L;

    private List<EntCateCertApplyFile> entCateCertApplyFileList;

    public List<EntCateCertApplyFile> getEntCateCertApplyFileList() {
        return entCateCertApplyFileList;
    }

    public void setEntCateCertApplyFileList(List<EntCateCertApplyFile> entCateCertApplyFileList) {
        this.entCateCertApplyFileList = entCateCertApplyFileList;
    }
}
