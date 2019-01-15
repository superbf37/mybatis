package org.superbf.mybatis.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "`article`")
public class Article {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 分类Id
     */
    @Column(name = "`categoryId`")
    private Integer categoryid;

    /**
     * 标题
     */
    @Column(name = "`title`")
    private String title;

    /**
     * 文章简介  用于列表显示
     */
    @Column(name = "`description`")
    private String description;

    /**
     * 状态 0：正常  1：不可用
     */
    @Column(name = "`status`")
    private Integer status;

    /**
     * 作者
     */
    @Column(name = "`author`")
    private String author;

    /**
     * 发表时间
     */
    @Column(name = "`createTime`")
    private Date createtime;

    /**
     * 发表时间
     */
    @Column(name = "`updateTime`")
    private Date updatetime;

    /**
     * 浏览量
     */
    @Column(name = "`showCount`")
    private Integer showcount;

    /**
     * 内容
     */
    @Column(name = "`content`")
    private String content;

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
     * 获取分类Id
     *
     * @return categoryId - 分类Id
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * 设置分类Id
     *
     * @param categoryid 分类Id
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取文章简介  用于列表显示
     *
     * @return description - 文章简介  用于列表显示
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置文章简介  用于列表显示
     *
     * @param description 文章简介  用于列表显示
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取状态 0：正常  1：不可用
     *
     * @return status - 状态 0：正常  1：不可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0：正常  1：不可用
     *
     * @param status 状态 0：正常  1：不可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 获取发表时间
     *
     * @return createTime - 发表时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置发表时间
     *
     * @param createtime 发表时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取发表时间
     *
     * @return updateTime - 发表时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置发表时间
     *
     * @param updatetime 发表时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取浏览量
     *
     * @return showCount - 浏览量
     */
    public Integer getShowcount() {
        return showcount;
    }

    /**
     * 设置浏览量
     *
     * @param showcount 浏览量
     */
    public void setShowcount(Integer showcount) {
        this.showcount = showcount;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}