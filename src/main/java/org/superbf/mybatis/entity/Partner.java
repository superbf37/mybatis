package org.superbf.mybatis.entity;

import javax.persistence.*;

@Table(name = "`partner`")
public class Partner {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 站点名
     */
    @Column(name = "`siteName`")
    private String sitename;

    /**
     * 站点地址
     */
    @Column(name = "`siteUrl`")
    private String siteurl;

    /**
     * 站点描述  简单备注 
     */
    @Column(name = "`siteDesc`")
    private String sitedesc;

    /**
     * 排序
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
     * 获取站点名
     *
     * @return siteName - 站点名
     */
    public String getSitename() {
        return sitename;
    }

    /**
     * 设置站点名
     *
     * @param sitename 站点名
     */
    public void setSitename(String sitename) {
        this.sitename = sitename == null ? null : sitename.trim();
    }

    /**
     * 获取站点地址
     *
     * @return siteUrl - 站点地址
     */
    public String getSiteurl() {
        return siteurl;
    }

    /**
     * 设置站点地址
     *
     * @param siteurl 站点地址
     */
    public void setSiteurl(String siteurl) {
        this.siteurl = siteurl == null ? null : siteurl.trim();
    }

    /**
     * 获取站点描述  简单备注 
     *
     * @return siteDesc - 站点描述  简单备注 
     */
    public String getSitedesc() {
        return sitedesc;
    }

    /**
     * 设置站点描述  简单备注 
     *
     * @param sitedesc 站点描述  简单备注 
     */
    public void setSitedesc(String sitedesc) {
        this.sitedesc = sitedesc == null ? null : sitedesc.trim();
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}