/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.service;

import cn.enn.ygego.sunny.user.dto.vo.AcctLoginLogVO;
import cn.enn.ygego.sunny.user.dto.vo.AcctOperLogVO;
import cn.enn.ygego.sunny.user.model.AcctLoginLog;
import cn.enn.ygego.sunny.user.model.AcctOperLog;

import java.util.List;

/**
 * ClassName: LogService
 * Description:
 * Author: liangchao
 * Date: 2018/3/28 18:54
 * History:
 * <author>          <time>          <version>          <desc>
 * liangc           修改时间           0.0.1              描述
 */
public interface LogService {
    void insertLoginLog(AcctLoginLog acctLoginLog);

    void addOperationLog(AcctOperLog acctOperLog);

    List<AcctLoginLog> queryLoginLog(AcctLoginLogVO acctLoginLogVO);

    Long queryOperLogCount(AcctOperLogVO acctOperLogVO);

    List<AcctOperLog> queryOperLog(AcctOperLogVO acctOperLogVO);

    Long queryLoginLogCount(AcctLoginLogVO acctLoginLogVO);
}
