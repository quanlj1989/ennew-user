package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;
import cn.enn.ygego.sunny.user.service.AcctOperPrivRelaService;
import cn.enn.ygego.sunny.user.dao.AcctOperPrivRelaDao;
import cn.enn.ygego.sunny.user.model.AcctOperPrivRela;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:AcctOperPrivRela
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class AcctOperPrivRelaServiceImpl implements AcctOperPrivRelaService{

    @Autowired
    private AcctOperPrivRelaDao acctOperPrivRelaDao;

    public List<AcctOperPrivRela> findAll(){
       return  acctOperPrivRelaDao.findAll();
    }

    public List<AcctOperPrivRela> findAcctOperPrivRelas(AcctOperPrivRela record){
       return  acctOperPrivRelaDao.find(record);
    }

    public AcctOperPrivRela getAcctOperPrivRelaByPrimaryKey(Long relaId){
        return acctOperPrivRelaDao.getByPrimaryKey(relaId);
    }

    public Integer createAcctOperPrivRela(AcctOperPrivRela record){
        return acctOperPrivRelaDao.insert(record);
    }

    public Integer removeAcctOperPrivRela(AcctOperPrivRela record){
        return acctOperPrivRelaDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long relaId){
    	return acctOperPrivRelaDao.deleteByPrimaryKey(relaId);
    }

    public Integer modifyAcctOperPrivRelaByPrimaryKey(AcctOperPrivRela record){
        return acctOperPrivRelaDao.updateByPrimaryKey(record);
    }









}