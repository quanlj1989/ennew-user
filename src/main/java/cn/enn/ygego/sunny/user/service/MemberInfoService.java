package cn.enn.ygego.sunny.user.service;

import java.util.List;

import cn.enn.ygego.sunny.user.model.MemberInfo;

/**
 * dal Interface:MemberInfo
 * @author gencode
 * @date 2018-3-22
 */
public interface MemberInfoService {

    public List<MemberInfo> findAll();

    public List<MemberInfo> findMemberInfos(MemberInfo record);

    public MemberInfo getMemberInfoByPrimaryKey(Long memberId);

    public Integer createMemberInfo(MemberInfo record);

    public Integer removeMemberInfo(MemberInfo record);

    public Integer removeByPrimaryKey(Long memberId);

    public Integer modifyMemberInfoByPrimaryKey(MemberInfo record);

}