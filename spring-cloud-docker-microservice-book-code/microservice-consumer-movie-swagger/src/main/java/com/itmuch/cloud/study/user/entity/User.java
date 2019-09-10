package com.itmuch.cloud.study.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel(value = "User",description = "用户信息")
public class User {
    @ApiModelProperty(value = "用户ID",name = "id")
    private Long id;
    @ApiModelProperty(value = "用户username",name = "username")
    private String username;
    @ApiModelProperty(value = "用户name",name = "name")
    private String name;
    @ApiModelProperty(value = "用户age",name = "age")
    private Integer age;
    @ApiModelProperty(value = "用户balance",name = "balance")
    private BigDecimal balance;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}