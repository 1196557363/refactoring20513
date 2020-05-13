package com.wpj.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * @author WuPeiJie
 * @date 2020/5/13 13:28
 * @version 1.0
 *     组织实体类
**/
@TableName(value = "organization")
public class Organization implements Serializable {

  private static final long serialVersionUID = -1864112138239884282L;
  @TableId(type = IdType.AUTO)
  private long id;
  private String name;
  private String path;
  @TableField(value = "updatedAt")
  private long updatedAt;
  @TableField(value = "createdAt")
  private long createdAt;
  @TableField(value = "isDeleted")
  private long isDeleted;
  @TableField(value = "parentId")
  private long parentId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }

  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }

  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }

}
