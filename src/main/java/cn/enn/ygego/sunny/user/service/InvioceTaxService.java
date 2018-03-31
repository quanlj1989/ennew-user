/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.service;

import cn.enn.ygego.sunny.user.dto.EntTaxRateDTO;
import cn.enn.ygego.sunny.user.dto.vo.EntTaxRateVO;
import cn.enn.ygego.sunny.user.model.EntTaxRate;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * ClassName: InvioceTaxService
 * Description:
 * Author: liangchao
 * Date: 2018/3/23 20:28
 * History:
 * <author>          <time>          <version>          <desc>
 * liangc           修改时间           0.0.1              描述
 */
public interface InvioceTaxService {
    void insertInvoiceTax(EntTaxRateDTO entTaxRateDTO)
            throws InvocationTargetException, IllegalAccessException;

    List<EntTaxRate> findPage(EntTaxRateVO entTaxRateVO);

    EntTaxRateDTO queryInvoiceTaxInfo(EntTaxRateVO entTaxRateVO);

    void modifyInvoiceTax(EntTaxRateDTO entTaxRateDTO);
}
