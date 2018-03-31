package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntAuthTypeApplyDTO;
import cn.enn.ygego.sunny.user.model.EntAuthTypeApply;

import java.util.List;

/**
 * ClassName: EntAuthTypeApplyVO
 * Description:
 * Author: en3
 * Date: 2018/3/28 18:57
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntAuthTypeApplyVO extends EntAuthTypeApplyDTO {

    private static final long serialVersionUID = -913741715535429398L;
    private List<EntAuthCertApplyVO> entAuthCertApplyVOList;

    public List<EntAuthCertApplyVO> getEntAuthCertApplyVOList() {
        return entAuthCertApplyVOList;
    }

    public void setEntAuthCertApplyVOList(List<EntAuthCertApplyVO> entAuthCertApplyVOList) {
        this.entAuthCertApplyVOList = entAuthCertApplyVOList;
    }
}
