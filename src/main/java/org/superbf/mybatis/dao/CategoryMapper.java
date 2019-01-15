package org.superbf.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.superbf.mybatis.entity.Category;
import org.superbf.mybatis.utils.MyMapper;

@Mapper
public interface CategoryMapper extends MyMapper<Category> {
}