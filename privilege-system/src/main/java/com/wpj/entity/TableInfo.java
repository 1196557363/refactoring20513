package com.wpj.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * @author WuPeiJie
 * @version 1.0
 *
**/
@TableName(value = "table_info")
public class TableInfo {
  @TableId(type = IdType.AUTO)
  private String id;
  private String enName;
  private String zhName;
  private long createdAt;
  private long updateAt;
  private String description;
  private long sort;
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

}
