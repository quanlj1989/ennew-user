package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntApplyProdInfoDTO;
import cn.enn.ygego.sunny.user.dto.EntProdApplyDTO;

import java.util.List;

/**
 * ClassName: EntProdApplyVO
 * Description:
 * Author: lizan
 * Date: 2018/3/30 10:03
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntProdApplyVO extends EntProdApplyDTO {
    private static final long serialVersionUID = 5424359541485017071L;
    private List<EntCateCertApplyVO> entCateCertApplyVOList;
    private List<EntApplyProducerAuthVO> entApplyProducerAuthVOList;
    private List<EntApplyProdInfoDTO> entApplyProdInfoDTOList;

    public List<EntCateCertApplyVO> getEntCateCertApplyVOList() {
        return entCateCertApplyVOList;
    }

    public void setEntCateCertApplyVOList(List<EntCateCertApplyVO> entCateCertApplyVOList) {
        this.entCateCertApplyVOList = entCateCertApplyVOList;
    }

    public List<EntApplyProducerAuthVO> getEntApplyProducerAuthVOList() {
        return entApplyProducerAuthVOList;
    }

    public void setEntApplyProducerAuthVOList(List<EntApplyProducerAuthVO> entApplyProducerAuthVOList) {
        this.entApplyProducerAuthVOList = entApplyProducerAuthVOList;
    }

    public List<EntApplyProdInfoDTO> getEntApplyProdInfoDTOList() {
        return entApplyProdInfoDTOList;
    }

    public void setEntApplyProdInfoDTOList(List<EntApplyProdInfoDTO> entApplyProdInfoDTOList) {
        this.entApplyProdInfoDTOList = entApplyProdInfoDTOList;
    }
}
