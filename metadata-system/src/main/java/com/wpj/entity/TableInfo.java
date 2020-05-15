package com.wpj.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;


/**
 * @author WuPeiJie
 * @version 1.0
 *     表信息实体类
**/
@TableName(value = "table_info")
public class TableInfo {
  @TableId
  private String id;
  @TableField(value = "enName")
  private String enName;
  @TableField(value = "zhName")
  private String zhName;
  @TableField(value = "createdAt")
  private long createdAt;
  @TableField(value = "updateAt")
  private long updateAt;
  private String description;
  private long sort;
  @TableField(value = "dbName")
  private String dbName;
  private long storage;
  private long rows;
  private long privilege;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getEnName() {
    return enName;
  }

  public void setEnName(String enName) {
    this.enName = enName;
  }


  public String getZhName() {
    return zhName;
  }

  public void setZhName(String zhName) {
    this.zhName = zhName;
  }


  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }


  public long getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(long updateAt) {
    this.updateAt = updateAt;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getSort() {
    return sort;
  }

  public void setSort(long sort) {
    this.sort = sort;
  }


  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }


  public long getStorage() {
    return storage;
  }

  public void setStorage(long storage) {
    this.storage = storage;
  }


  public long getRows() {
    return rows;
  }

  public void setRows(long rows) {
    this.rows = rows;
  }


  public long getPrivilege() {
    return privilege;
  }

  public void setPrivilege(long privilege) {
    this.privilege = privilege;
  }

  @Override
  public String toString() {
    return "TableInfo{" +
            "id='" + id + '\'' +
            ", enName='" + enName + '\'' +
            ", zhName='" + zhName + '\'' +
            ", createdAt=" + createdAt +
            ", updateAt=" + updateAt +
            ", description='" + description + '\'' +
            ", sort=" + sort +
            ", dbName='" + dbName + '\'' +
            ", storage=" + storage +
            ", rows=" + rows +
            ", privilege=" + privilege +
            '}';
  }
}
