package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntBrandAuthApplyDTO;

import java.util.List;

/**
 * ClassName: EntBrandAuthApplyVO
 * Description:
 * Author: en3
 * Date: 2018/3/28 16:47
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntBrandAuthApplyVO extends EntBrandAuthApplyDTO {

    private static final long serialVersionUID = 8488800850662990515L;
    private List<EntBrandAuthApplyCertVO> entBrandAuthApplyCertVOList;

    public List<EntBrandAuthApplyCertVO> getEntBrandAuthApplyCertVOList() {
        return entBrandAuthApplyCertVOList;
    }

    public void setEntBrandAuthApplyCertVOList(List<EntBrandAuthApplyCertVO> entBrandAuthApplyCertVOList) {
        this.entBrandAuthApplyCertVOList = entBrandAuthApplyCertVOList;
    }
}
