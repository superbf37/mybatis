package org.superbf.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.superbf.mybatis.entity.Tag;
import org.superbf.mybatis.utils.MyMapper;

@Mapper
public interface TagMapper extends MyMapper<Tag> {
}