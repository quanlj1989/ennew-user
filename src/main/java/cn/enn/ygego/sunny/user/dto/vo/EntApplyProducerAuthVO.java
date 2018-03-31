package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntApplyProducerAuthDTO;
import cn.enn.ygego.sunny.user.model.EntAuthApplyFile2;

import java.util.List;

/**
 * ClassName: EntApplyProducerAuthVO
 * Description:
 * Author: en3
 * Date: 2018/3/30 10:07
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntApplyProducerAuthVO extends EntApplyProducerAuthDTO {

    private static final long serialVersionUID = 6690554551341464892L;
    private List<EntAuthApplyFile2> entAuthApplyFile2List;

    public List<EntAuthApplyFile2> getEntAuthApplyFile2List() {
        return entAuthApplyFile2List;
    }

    public void setEntAuthApplyFile2List(List<EntAuthApplyFile2> entAuthApplyFile2List) {
        this.entAuthApplyFile2List = entAuthApplyFile2List;
    }
}
