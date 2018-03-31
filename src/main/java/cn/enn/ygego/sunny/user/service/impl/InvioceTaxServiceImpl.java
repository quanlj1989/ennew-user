/*
 * Copyright: Copyright (c) 2017-2020
 * Company: ygego
 */

package cn.enn.ygego.sunny.user.service.impl;

import cn.enn.ygego.sunny.user.dao.EntPaySetDao;
import cn.enn.ygego.sunny.user.dao.EntTaxRateDao;
import cn.enn.ygego.sunny.user.dto.EntPaySetDTO;
import cn.enn.ygego.sunny.user.dto.EntTaxRateDTO;
import cn.enn.ygego.sunny.user.dto.vo.EntTaxRateVO;
import cn.enn.ygego.sunny.user.model.EntPaySet;
import cn.enn.ygego.sunny.user.model.EntTaxRate;
import cn.enn.ygego.sunny.user.service.InvioceTaxService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName: InvioceTaxServiceImpl
 * Description:
 * Author: liangchao
 * Date: 2018/3/23 20:29
 * History:
 * <author>          <time>          <version>          <desc>
 * liangc           修改时间           0.0.1              描述
 */
@Service("invioceTaxService")
public class InvioceTaxServiceImpl implements InvioceTaxService {

    @Autowired
    private EntTaxRateDao entTaxRateDao;

    @Autowired
    private EntPaySetDao entPaySetDao;

    @Override
    public void insertInvoiceTax(EntTaxRateDTO entTaxRateDTO)
            throws InvocationTargetException, IllegalAccessException {
        Date date = new Date();
        Long memberId = entTaxRateDTO.getMemberId();

        EntTaxRate entTaxRate = new EntTaxRate();
        BeanUtils.copyProperties(entTaxRateDTO, entTaxRate);
        //准备参数
        entTaxRate.setCreateTime(date);
        entTaxRate.setMemberId(memberId);


        List<EntPaySetDTO> paySetDTOs = entTaxRateDTO.getPaySets();
        List<EntPaySet> paySets = new ArrayList<>();
        for (EntPaySetDTO entPaySetDTO : paySetDTOs) {
            EntPaySet entPaySet = new EntPaySet();
            BeanUtils.copyProperties(entPaySetDTO, entPaySet);
            //准备参数
            entPaySet.setCreateTime(date);
            entPaySet.setMemberId(memberId);
            paySets.add(entPaySet);
        }

        entTaxRateDao.insertSelective(entTaxRate);
        entPaySetDao.insertBatch(paySets);
    }

    @Override
    public List<EntTaxRate> findPage(EntTaxRateVO entTaxRateVO) {
        List<EntTaxRate> list = entTaxRateDao.findPage(entTaxRateVO);

        return list;
    }

    @Override
    public EntTaxRateDTO queryInvoiceTaxInfo(EntTaxRateVO entTaxRateVO) {
        Long memberId = entTaxRateVO.getMemberId();
        EntTaxRateDTO entTaxRateDTO = entTaxRateDao.getByMemberId(memberId);
        return entTaxRateDTO;
    }

    @Override
    public void modifyInvoiceTax(EntTaxRateDTO entTaxRateDTO) {
        Long memberId = entTaxRateDTO.getMemberId();
        EntTaxRate entTaxRate = new EntTaxRate();
        BeanUtils.copyProperties(entTaxRateDTO, entTaxRate);


        List<EntPaySetDTO> paySetDTOs = entTaxRateDTO.getPaySets();
        List<EntPaySet> paySets = new ArrayList<>();
        for (EntPaySetDTO entPaySetDTO : paySetDTOs) {
            EntPaySet entPaySet = new EntPaySet();
            BeanUtils.copyProperties(entPaySetDTO, entPaySet);
            //准备参数
//            entPaySet.setCreateTime(date);
            entPaySet.setPaySetId(null);
            entPaySet.setMemberId(memberId);
            paySets.add(entPaySet);
        }

        entTaxRateDao.updateByPrimaryKey(entTaxRate);
        entPaySetDao.deleteByMemberId(memberId);
        entPaySetDao.insertBatch(paySets);
    }
}
