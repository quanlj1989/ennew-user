package cn.enn.ygego.sunny.user.dto.gridSupermarket;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: DictTreeDTO
 * Description: 字典DTO
 * Author: 杨超
 * Date: 2018/3/30 14:58
 * History:
 * <author>           <time>         <version>           <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class DictTreeDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2477787274313954535L;
    private DictTreeDTO parentNode;		 //	父节点
    private String	dictTreeCode;		 // 节点标识
    private String	parentCode;			 // 上级节点标识
    private String	dictTreeName;		 // 节点名称
    private String  iconUrl;     /*图标*/
    private List<DictTreeDTO> children = new ArrayList<DictTreeDTO>();  // 子节点

    // Constructor
    public DictTreeDTO() {
        this.children = new ArrayList<DictTreeDTO>();
    }

    public List<DictTreeDTO> getChildren() {
        return children;
    }

    public void setChildren(List<DictTreeDTO> children) {
        this.children = children;
    }

    public DictTreeDTO getParentNode() {
        return parentNode;
    }

    public void setParentNode(DictTreeDTO parentNode) {
        this.parentNode = parentNode;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getDictTreeCode() {
        return dictTreeCode;
    }

    public void setDictTreeCode(String dictTreeCode) {
        this.dictTreeCode = dictTreeCode;
    }

    public String getDictTreeName() {
        return dictTreeName;
    }

    public void setDictTreeName(String dictTreeName) {
        this.dictTreeName = dictTreeName;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DictTreeDTO) {
            DictTreeDTO dictTree = (DictTreeDTO)obj;
            return dictTree.getDictTreeCode().equals(this.getDictTreeCode());
        }
        return false;
    }
}
