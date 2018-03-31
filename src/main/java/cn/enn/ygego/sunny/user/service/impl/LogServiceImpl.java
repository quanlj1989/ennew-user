/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.service.impl;

import cn.enn.ygego.sunny.user.dao.AcctLoginLogDao;
import cn.enn.ygego.sunny.user.dao.AcctOperLogDao;
import cn.enn.ygego.sunny.user.dto.vo.AcctLoginLogVO;
import cn.enn.ygego.sunny.user.dto.vo.AcctOperLogVO;
import cn.enn.ygego.sunny.user.model.AcctLoginLog;
import cn.enn.ygego.sunny.user.model.AcctOperLog;
import cn.enn.ygego.sunny.user.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: LogServiceImpl
 * Description:
 * Author: liangchao
 * Date: 2018/3/28 18:55
 * History:
 * <author>          <time>          <version>          <desc>
 * liangc           修改时间           0.0.1              描述
 */
@Service("logService")
public class LogServiceImpl implements LogService {

    @Autowired
    private AcctLoginLogDao acctLoginLogDao;

    @Autowired
    private AcctOperLogDao acctOperLogDao;

    @Override
    public void insertLoginLog(AcctLoginLog acctLoginLog) {
        acctLoginLogDao.insertSelective(acctLoginLog);
    }

    @Override
    public void addOperationLog(AcctOperLog acctOperLog) {
        acctOperLogDao.insertSelective(acctOperLog);
    }

    @Override
    public Long queryLoginLogCount(AcctLoginLogVO acctLoginLogVO) {
        Long listCount = acctLoginLogDao.findPageCount(acctLoginLogVO);
        return listCount;
    }

    @Override
    public List<AcctLoginLog> queryLoginLog(AcctLoginLogVO acctLoginLogVO) {
        List<AcctLoginLog> list = acctLoginLogDao.findPage(acctLoginLogVO);
        return list;
    }

    @Override
    public Long queryOperLogCount(AcctOperLogVO acctOperLogVO) {
        Long listCount = acctOperLogDao.findPageCount(acctOperLogVO);
        return listCount;
    }

    @Override
    public List<AcctOperLog> queryOperLog(AcctOperLogVO acctOperLogVO) {
        List<AcctOperLog> list = acctOperLogDao.findPage(acctOperLogVO);
        return list;
    }

}
