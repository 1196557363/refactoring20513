package com.wpj.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * @author WuPeiJie
 * @date 2020/5/13 13:29
 * @version 1.0
 *     用户实体类
**/
@TableName(value = "user")
public class User implements Serializable {

  private static final long serialVersionUID = 2275606873780492614L;
  @TableId(type = IdType.AUTO)
  private long id;
  private String email;
  private String department;
  private long role;
  @TableField(value = "createdAt")
  private long createAt;
  @TableField(value = "lastLogin")
  private long lastLogin;
  @TableField(value = "isDeleted")
  private long isDeleted;
  private long organization;
  private String name;
  @TableField(value = "updatedAt")
  private long updateAt;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public long getRole() {
    return role;
  }

  public void setRole(long role) {
    this.role = role;
  }

  public long getCreateAt() {
    return createAt;
  }

  public void setCreateAt(long createAt) {
    this.createAt = createAt;
  }

  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }

  public long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(long updateAt) {
    this.updateAt = updateAt;
  }

  public long getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(long lastLogin) {
    this.lastLogin = lastLogin;
  }


  public long getOrganization() {
    return organization;
  }

  public void setOrganization(long organization) {
    this.organization = organization;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
