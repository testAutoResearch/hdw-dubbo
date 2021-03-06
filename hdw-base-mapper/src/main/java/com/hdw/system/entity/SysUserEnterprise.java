package com.hdw.system.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.hdw.common.util.JacksonUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 监管用户与企业关联表
 *
 * @author TuMinglong
 * @date 2018-12-11 11:35:15
 */
@ApiModel(value = "监管用户与企业关联表")
@TableName("t_sys_user_enterprise")
public class SysUserEnterprise extends Model<SysUserEnterprise> {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    @JsonSerialize(using = ToStringSerializer.class)
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 角色id
     */
    @ApiModelProperty(value = "角色id")
    @TableField("user_id")
    private Long userId;
    /**
     * 企业id列表(;分割)
     */
    @ApiModelProperty(value = "企业id列表(;分割)")
    @TableField("enterprise_id")
    private String enterpriseId;

    /**
     * 设置：主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：角色id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：角色id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：企业id列表(;分割)
     */
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * 获取：企业id列表(;分割)
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return JacksonUtil.toJson(this);
    }
}
