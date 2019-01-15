package org.superbf.mybatis.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "`sign`")
public class Sign {
    @Id
    @Column(name = "`enter_id`")
    private Integer enterId;

    @Id
    @Column(name = "`s_id`")
    private Integer sId;

    @Column(name = "`choice`")
    private String choice;

    @Column(name = "`create_time`")
    private Date createTime;

    /**
     *  笔试情况
     */
    @Column(name = "`type_b`")
    private Integer typeB;

    /**
     *  面试情况
     */
    @Column(name = "`type_m`")
    private Integer typeM;

    /**
     *  薪资范围
     */
    @Column(name = "`money`")
    private String money;

    /**
     *  录取状态0：未录取1：已录取
     */
    @Column(name = "`state`")
    private Integer state;

    /**
     * @return enter_id
     */
    public Integer getEnterId() {
        return enterId;
    }

    /**
     * @param enterId
     */
    public void setEnterId(Integer enterId) {
        this.enterId = enterId;
    }

    /**
     * @return s_id
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * @param sId
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * @return choice
     */
    public String getChoice() {
        return choice;
    }

    /**
     * @param choice
     */
    public void setChoice(String choice) {
        this.choice = choice == null ? null : choice.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 笔试情况
     *
     * @return type_b -  笔试情况
     */
    public Integer getTypeB() {
        return typeB;
    }

    /**
     * 设置 笔试情况
     *
     * @param typeB  笔试情况
     */
    public void setTypeB(Integer typeB) {
        this.typeB = typeB;
    }

    /**
     * 获取 面试情况
     *
     * @return type_m -  面试情况
     */
    public Integer getTypeM() {
        return typeM;
    }

    /**
     * 设置 面试情况
     *
     * @param typeM  面试情况
     */
    public void setTypeM(Integer typeM) {
        this.typeM = typeM;
    }

    /**
     * 获取 薪资范围
     *
     * @return money -  薪资范围
     */
    public String getMoney() {
        return money;
    }

    /**
     * 设置 薪资范围
     *
     * @param money  薪资范围
     */
    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    /**
     * 获取 录取状态0：未录取1：已录取
     *
     * @return state -  录取状态0：未录取1：已录取
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置 录取状态0：未录取1：已录取
     *
     * @param state  录取状态0：未录取1：已录取
     */
    public void setState(Integer state) {
        this.state = state;
    }
}