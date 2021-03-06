package org.superbf.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.superbf.mybatis.entity.ArticleTag;
import org.superbf.mybatis.utils.MyMapper;

@Mapper
public interface ArticleTagMapper extends MyMapper<ArticleTag> {
}