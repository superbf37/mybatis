package org.superbf.mybatis.entity;

import javax.persistence.*;

@Table(name = "`tag`")
public class Tag {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标签名称  唯一
     */
    @Column(name = "`tagName`")
    private String tagname;

    /**
     * 标签别名 唯一
     */
    @Column(name = "`aliasName`")
    private String aliasname;

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
     * 获取标签名称  唯一
     *
     * @return tagName - 标签名称  唯一
     */
    public String getTagname() {
        return tagname;
    }

    /**
     * 设置标签名称  唯一
     *
     * @param tagname 标签名称  唯一
     */
    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    /**
     * 获取标签别名 唯一
     *
     * @return aliasName - 标签别名 唯一
     */
    public String getAliasname() {
        return aliasname;
    }

    /**
     * 设置标签别名 唯一
     *
     * @param aliasname 标签别名 唯一
     */
    public void setAliasname(String aliasname) {
        this.aliasname = aliasname == null ? null : aliasname.trim();
    }
}