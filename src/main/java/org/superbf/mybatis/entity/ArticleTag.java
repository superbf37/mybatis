package org.superbf.mybatis.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "`articletag`")
public class ArticleTag {
    /**
     * 文章Id
     */
    @Column(name = "`articleId`")
    private Integer articleid;

    /**
     * 标签Id
     */
    @Column(name = "`tagId`")
    private Integer tagid;

    @Column(name = "`tagName`")
    private String tagname;

    /**
     * 获取文章Id
     *
     * @return articleId - 文章Id
     */
    public Integer getArticleid() {
        return articleid;
    }

    /**
     * 设置文章Id
     *
     * @param articleid 文章Id
     */
    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    /**
     * 获取标签Id
     *
     * @return tagId - 标签Id
     */
    public Integer getTagid() {
        return tagid;
    }

    /**
     * 设置标签Id
     *
     * @param tagid 标签Id
     */
    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    /**
     * @return tagName
     */
    public String getTagname() {
        return tagname;
    }

    /**
     * @param tagname
     */
    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }
}