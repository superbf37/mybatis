package org.superbf.mybatis.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "`user`")
public class User {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "`username`")
    private String username;

    @Column(name = "`password`")
    private String password;

    /**
     * 是否被禁用
     */
    @Column(name = "`enabled`")
    private String enabled;

    /**
     * 凭证是否过期
     */
    @Column(name = "`credential`")
    private String credential;

    /**
     * 是否被锁
     */
    @Column(name = "`locked`")
    private String locked;

    /**
     * 是否过期
     */
    @Column(name = "`expired`")
    private String expired;

    @Column(name = "`createTime`")
    private Date createtime;

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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取是否被禁用
     *
     * @return enabled - 是否被禁用
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * 设置是否被禁用
     *
     * @param enabled 是否被禁用
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    /**
     * 获取凭证是否过期
     *
     * @return credential - 凭证是否过期
     */
    public String getCredential() {
        return credential;
    }

    /**
     * 设置凭证是否过期
     *
     * @param credential 凭证是否过期
     */
    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }

    /**
     * 获取是否被锁
     *
     * @return locked - 是否被锁
     */
    public String getLocked() {
        return locked;
    }

    /**
     * 设置是否被锁
     *
     * @param locked 是否被锁
     */
    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }

    /**
     * 获取是否过期
     *
     * @return expired - 是否过期
     */
    public String getExpired() {
        return expired;
    }

    /**
     * 设置是否过期
     *
     * @param expired 是否过期
     */
    public void setExpired(String expired) {
        this.expired = expired == null ? null : expired.trim();
    }

    /**
     * @return createTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}