package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntAuthCertApplyDTO;
import cn.enn.ygego.sunny.user.model.EntAuthApplyFile;
import cn.enn.ygego.sunny.user.model.EntAuthCertApply;

import java.util.List;

/**
 * ClassName: EntAuthCertApplyVO
 * Description:
 * Author: en3
 * Date: 2018/3/28 16:30
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntAuthCertApplyVO extends EntAuthCertApplyDTO {

    private static final long serialVersionUID = 8529218964724872904L;
    private List<EntAuthApplyFile> entAuthApplyFileList;

    public List<EntAuthApplyFile> getEntAuthApplyFileList() {
        return entAuthApplyFileList;
    }

    public void setEntAuthApplyFileList(List<EntAuthApplyFile> entAuthApplyFileList) {
        this.entAuthApplyFileList = entAuthApplyFileList;
    }
}
