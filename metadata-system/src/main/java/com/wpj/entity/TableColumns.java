package com.wpj.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;


/**
 * @author WuPeiJie
 * @version 1.0
 *     列表实体类
**/
@TableName(value = "table_columns")
public class TableColumns {
  @TableId
  private String tableId;
  @TableId
  private String columns;
  private String enName;
  private String zhName;
  private String type;
  private String description;
  private long ordinalPosition;


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


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getOrdinalPosition() {
    return ordinalPosition;
  }

  public void setOrdinalPosition(long ordinalPosition) {
    this.ordinalPosition = ordinalPosition;
  }

}
