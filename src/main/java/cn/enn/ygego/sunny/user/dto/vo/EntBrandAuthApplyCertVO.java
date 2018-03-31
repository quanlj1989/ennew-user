package cn.enn.ygego.sunny.user.dto.vo;

import cn.enn.ygego.sunny.user.dto.EntBrandAuthApplyCertDTO;
import cn.enn.ygego.sunny.user.model.EntBrandApplyCertFile;

import java.util.List;

/**
 * ClassName: EntBrandAuthApplyCertVO
 * Description:
 * Author: en3
 * Date: 2018/3/28 16:49
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class EntBrandAuthApplyCertVO extends EntBrandAuthApplyCertDTO {

    private static final long serialVersionUID = 2942067275327738035L;
    private List<EntBrandApplyCertFile> entBrandApplyCertFileList;

    public List<EntBrandApplyCertFile> getEntBrandApplyCertFileList() {
        return entBrandApplyCertFileList;
    }

    public void setEntBrandApplyCertFileList(List<EntBrandApplyCertFile> entBrandApplyCertFileList) {
        this.entBrandApplyCertFileList = entBrandApplyCertFileList;
    }
}
