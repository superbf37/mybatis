package org.superbf.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.superbf.mybatis.entity.Log;
import org.superbf.mybatis.utils.MyMapper;

@Mapper
public interface LogMapper extends MyMapper<Log> {
}