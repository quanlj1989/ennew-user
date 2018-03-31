package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntCertApplyDTO;

import java.util.List;

/**
 * ClassName: EntCertApplyVO
 * Description:
 * Author: en3
 * Date: 2018/3/28 16:37
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntCertApplyVO extends EntCertApplyDTO {

    private static final long serialVersionUID = -6042262642415642579L;
    private List<EntCertApplyDetailVO> entCertApplyDetailVOList;

    public List<EntCertApplyDetailVO> getEntCertApplyDetailVOList() {
        return entCertApplyDetailVOList;
    }

    public void setEntCertApplyDetailVOList(List<EntCertApplyDetailVO> entCertApplyDetailVOList) {
        this.entCertApplyDetailVOList = entCertApplyDetailVOList;
    }
}
