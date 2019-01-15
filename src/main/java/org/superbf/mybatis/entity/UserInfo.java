package org.superbf.mybatis.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "`user_info`")
public class UserInfo {
    @Column(name = "`username`")
    private String username;

    @Column(name = "`avatar`")
    private String avatar;

    /**
     * 昵称
     */
    @Column(name = "`nickname`")
    private String nickname;

    /**
     * 电话号码
     */
    @Column(name = "`phone`")
    private String phone;

    /**
     * 邮箱
     */
    @Column(name = "`email`")
    private String email;

    /**
     * 个性签名
     */
    @Column(name = "`signature`")
    private String signature;

    /**
     * 地址
     */
    @Column(name = "`address`")
    private String address;

    /**
     * 公告
     */
    @Column(name = "`announcement`")
    private String announcement;

    /**
     * telegram账号
     */
    @Column(name = "`telegram`")
    private String telegram;

    /**
     * 微信账号
     */
    @Column(name = "`wechart`")
    private String wechart;

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
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取电话号码
     *
     * @return phone - 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话号码
     *
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取个性签名
     *
     * @return signature - 个性签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置个性签名
     *
     * @param signature 个性签名
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取公告
     *
     * @return announcement - 公告
     */
    public String getAnnouncement() {
        return announcement;
    }

    /**
     * 设置公告
     *
     * @param announcement 公告
     */
    public void setAnnouncement(String announcement) {
        this.announcement = announcement == null ? null : announcement.trim();
    }

    /**
     * 获取telegram账号
     *
     * @return telegram - telegram账号
     */
    public String getTelegram() {
        return telegram;
    }

    /**
     * 设置telegram账号
     *
     * @param telegram telegram账号
     */
    public void setTelegram(String telegram) {
        this.telegram = telegram == null ? null : telegram.trim();
    }

    /**
     * 获取微信账号
     *
     * @return wechart - 微信账号
     */
    public String getWechart() {
        return wechart;
    }

    /**
     * 设置微信账号
     *
     * @param wechart 微信账号
     */
    public void setWechart(String wechart) {
        this.wechart = wechart == null ? null : wechart.trim();
    }
}