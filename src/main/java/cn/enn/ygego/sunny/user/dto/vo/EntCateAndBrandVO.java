package cn.enn.ygego.sunny.user.dto.vo;

import java.io.Serializable;

/**
 * ClassName: EntCateAndBrandVO
 * Description: 供应商资质认证类目及品牌申请包参
 * Author: lizan
 * Date: 2018/3/29 10:43
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntCateAndBrandVO implements Serializable{
    private static final long serialVersionUID = -153634365447336998L;
    private EntCateCertApplyVO entCateCertApplyVO;
    private EntBrandAuthApplyVO entBrandAuthApplyVO;

    public EntCateCertApplyVO getEntCateCertApplyVO() {
        return entCateCertApplyVO;
    }

    public void setEntCateCertApplyVO(EntCateCertApplyVO entCateCertApplyVO) {
        this.entCateCertApplyVO = entCateCertApplyVO;
    }

    public EntBrandAuthApplyVO getEntBrandAuthApplyVO() {
        return entBrandAuthApplyVO;
    }

    public void setEntBrandAuthApplyVO(EntBrandAuthApplyVO entBrandAuthApplyVO) {
        this.entBrandAuthApplyVO = entBrandAuthApplyVO;
    }
}
