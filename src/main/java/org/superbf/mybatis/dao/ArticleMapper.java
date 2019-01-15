package org.superbf.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.superbf.mybatis.entity.Article;
import org.superbf.mybatis.utils.MyMapper;

@Mapper
public interface ArticleMapper extends MyMapper<Article> {
}