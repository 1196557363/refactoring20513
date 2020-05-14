package com.wpj.entity;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * @author WuPeiJie
 * @version 1.0
 *    权限应用实体
**/
@TableName(value = "privilege_apply")
public class PrivilegeApply {

  @TableId(type = IdType.AUTO)
  private long id;
  private String oaId;
  private long userId;
  private String tableId;
  private String columns;
  private long status;
  private long type;
  private String remarks;
  private String auditorId;
  private String auditRemarks;
  private long createdAt;
  private long updatedAt;
  private long expiredAt;
  private long expiredType;
  private long expiredTime;
  private long isInvalid;
  private long isDeleted;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOaId() {
    return oaId;
  }

  public void setOaId(String oaId) {
    this.oaId = oaId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }


  public String getColumns() {
    return columns;
  }

  public void setColumns(String columns) {
    this.columns = columns;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public String getAuditorId() {
    return auditorId;
  }

  public void setAuditorId(String auditorId) {
    this.auditorId = auditorId;
  }


  public String getAuditRemarks() {
    return auditRemarks;
  }

  public void setAuditRemarks(String auditRemarks) {
    this.auditRemarks = auditRemarks;
  }


  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }


  public long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(long updatedAt) {
    this.updatedAt = updatedAt;
  }


  public long getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(long expiredAt) {
    this.expiredAt = expiredAt;
  }


  public long getExpiredType() {
    return expiredType;
  }

  public void setExpiredType(long expiredType) {
    this.expiredType = expiredType;
  }


  public long getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(long expiredTime) {
    this.expiredTime = expiredTime;
  }


  public long getIsInvalid() {
    return isInvalid;
  }

  public void setIsInvalid(long isInvalid) {
    this.isInvalid = isInvalid;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }

}
