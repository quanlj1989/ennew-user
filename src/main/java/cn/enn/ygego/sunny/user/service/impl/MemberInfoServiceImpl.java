package cn.enn.ygego.sunny.user.service.impl;

import java.util.List;

import cn.enn.ygego.sunny.user.dto.company.CompanyAuthInfo;
import cn.enn.ygego.sunny.user.dto.company.CompanyAuthType;
import cn.enn.ygego.sunny.user.service.MemberInfoService;
import cn.enn.ygego.sunny.user.dao.MemberInfoDao;
import cn.enn.ygego.sunny.user.model.MemberInfo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * dal Interface:MemberInfo
 * @author gencode
 * @date 2018-3-22
 */
@Service
public class MemberInfoServiceImpl implements MemberInfoService{

    @Autowired
    private MemberInfoDao memberInfoDao;

    public List<MemberInfo> findAll(){
       return  memberInfoDao.findAll();
    }

    public List<MemberInfo> findMemberInfos(MemberInfo record){
       return  memberInfoDao.find(record);
    }

    public MemberInfo getMemberInfoByPrimaryKey(Long memberId){
        return memberInfoDao.getByPrimaryKey(memberId);
    }

    public Integer createMemberInfo(MemberInfo record){
        return memberInfoDao.insert(record);
    }

    public Integer removeMemberInfo(MemberInfo record){
        return memberInfoDao.delete(record);
    }
    
    public Integer removeByPrimaryKey(Long memberId){
    	return memberInfoDao.deleteByPrimaryKey(memberId);
    }

    public Integer modifyMemberInfoByPrimaryKey(MemberInfo record){
        return memberInfoDao.updateByPrimaryKey(record);
    }

}