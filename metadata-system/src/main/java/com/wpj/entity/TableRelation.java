package com.wpj.entity;

import com.baomidou.mybatisplus.annotations.TableName;


/**
 * @author WuPeiJie
 * @version 1.0
 *     表关系实体类
**/
@TableName(value = "table_relation")
public class TableRelation {

  private String fromTable;
  private String fromColumn;
  private String toTble;
  private String toColumn;


  public String getFromTable() {
    return fromTable;
  }

  public void setFromTable(String fromTable) {
    this.fromTable = fromTable;
  }


  public String getFromColumn() {
    return fromColumn;
  }

  public void setFromColumn(String fromColumn) {
    this.fromColumn = fromColumn;
  }


  public String getToTble() {
    return toTble;
  }

  public void setToTble(String toTble) {
    this.toTble = toTble;
  }


  public String getToColumn() {
    return toColumn;
  }

  public void setToColumn(String toColumn) {
    this.toColumn = toColumn;
  }

}
