package org.superbf.mybatis.entity;

import javax.persistence.*;

@Table(name = "`category`")
public class Category {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 分类名称  唯一
     */
    @Column(name = "`categoryName`")
    private String categoryname;

    /**
     * 别名  唯一  比如新闻 就用News 代替  栏目Id不显示在url中
     */
    @Column(name = "`aliasName`")
    private String aliasname;

    /**
     * 排序 （0-10）
     */
    @Column(name = "`sort`")
    private Integer sort;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类名称  唯一
     *
     * @return categoryName - 分类名称  唯一
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * 设置分类名称  唯一
     *
     * @param categoryname 分类名称  唯一
     */
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    /**
     * 获取别名  唯一  比如新闻 就用News 代替  栏目Id不显示在url中
     *
     * @return aliasName - 别名  唯一  比如新闻 就用News 代替  栏目Id不显示在url中
     */
    public String getAliasname() {
        return aliasname;
    }

    /**
     * 设置别名  唯一  比如新闻 就用News 代替  栏目Id不显示在url中
     *
     * @param aliasname 别名  唯一  比如新闻 就用News 代替  栏目Id不显示在url中
     */
    public void setAliasname(String aliasname) {
        this.aliasname = aliasname == null ? null : aliasname.trim();
    }

    /**
     * 获取排序 （0-10）
     *
     * @return sort - 排序 （0-10）
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序 （0-10）
     *
     * @param sort 排序 （0-10）
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}