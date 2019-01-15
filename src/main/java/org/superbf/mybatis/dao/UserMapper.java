package org.superbf.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.superbf.mybatis.entity.User;
import org.superbf.mybatis.utils.MyMapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
}