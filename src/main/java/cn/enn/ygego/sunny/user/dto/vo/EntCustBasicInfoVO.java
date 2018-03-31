package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntCustInfoDTO;

import java.util.List;

/**
 * ClassName: EntCustBasicInfoVO
 * Description:
 * Author: en3
 * Date: 2018/3/28 16:23
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntCustBasicInfoVO extends EntCustInfoDTO {

    private static final long serialVersionUID = -4143007245624690585L;

    private List<EntCertInfoVO> entCertInfoVOList;

    public List<EntCertInfoVO> getEntCertInfoVOList() {
        return entCertInfoVOList;
    }

    public void setEntCertInfoVOList(List<EntCertInfoVO> entCertInfoVOList) {
        this.entCertInfoVOList = entCertInfoVOList;
    }
}
