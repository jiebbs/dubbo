package com.jiebbs.model.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItemInfo {
    private Integer id;

    private String code;

    private String name;

    private BigDecimal price;

    private Integer isActive;

    private Date createTime;

    private Date updateTime;

    public ItemInfo(Integer id, String code, String name, BigDecimal price, Integer isActive, Date createTime, Date updateTime) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.isActive = isActive;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ItemInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}