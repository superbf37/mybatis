package org.superbf.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.superbf.mybatis.entity.UserInfo;
import org.superbf.mybatis.utils.MyMapper;

@Mapper
public interface UserInfoMapper extends MyMapper<UserInfo> {
}