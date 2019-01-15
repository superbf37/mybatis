package org.superbf.mybatis.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "`log`")
public class Log {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "`username`")
    private String username;

    @Column(name = "`url`")
    private String url;

    @Column(name = "`ip`")
    private String ip;

    @Column(name = "`method`")
    private String method;

    @Column(name = "`args`")
    private String args;

    @Column(name = "`classMethod`")
    private String classmethod;

    @Column(name = "`exception`")
    private String exception;

    @Column(name = "`operateTime`")
    private Date operatetime;

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
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * @return method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * @return args
     */
    public String getArgs() {
        return args;
    }

    /**
     * @param args
     */
    public void setArgs(String args) {
        this.args = args == null ? null : args.trim();
    }

    /**
     * @return classMethod
     */
    public String getClassmethod() {
        return classmethod;
    }

    /**
     * @param classmethod
     */
    public void setClassmethod(String classmethod) {
        this.classmethod = classmethod == null ? null : classmethod.trim();
    }

    /**
     * @return exception
     */
    public String getException() {
        return exception;
    }

    /**
     * @param exception
     */
    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }

    /**
     * @return operateTime
     */
    public Date getOperatetime() {
        return operatetime;
    }

    /**
     * @param operatetime
     */
    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }
}