package com.gomcarter.developer.params;

import java.util.Date;

/**
 * @ClassName JValidator
 * @Description
 * @author gomcarter
 * @date 2019-06-17 16:41:02
 */
public class JValidatorQueryParams {

    /**
     * @Description 主键
     */
    private Long id;

    /**
     * @Description 规则名称
     */
    private String name;
    /**
     * @Description 验证值的javascript脚本
     */
    private String handler;
    /**
     * @Description
     */
    private Date createTime;
    /**
     * @Description
     */
    private Date modifyTime;

    public Long getId() {
       	return id;
    }

    public JValidatorQueryParams setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public JValidatorQueryParams setName(String name) {
        this.name = name;
        return this;
    }

    public String getHandler() {
        return handler;
    }

    public JValidatorQueryParams setHandler(String handler) {
        this.handler = handler;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public JValidatorQueryParams setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public JValidatorQueryParams setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

}
