package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.AcctOperPrivRela;

/**
 * dal Interface:AcctOperPrivRela
 * @author gencode
 * @date 2018-3-22
 */
public interface AcctOperPrivRelaService {

    public List<AcctOperPrivRela> findAll();

    public List<AcctOperPrivRela> findAcctOperPrivRelas(AcctOperPrivRela record);

    public AcctOperPrivRela getAcctOperPrivRelaByPrimaryKey(Long relaId);

    public Integer createAcctOperPrivRela(AcctOperPrivRela record);

    public Integer removeAcctOperPrivRela(AcctOperPrivRela record);

    public Integer removeByPrimaryKey(Long relaId);

    public Integer modifyAcctOperPrivRelaByPrimaryKey(AcctOperPrivRela record);



}