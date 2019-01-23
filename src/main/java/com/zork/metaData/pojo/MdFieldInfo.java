package com.zork.metaData.pojo;


import java.util.Date;

public class MdFieldInfo {

  private long id;
  private String tableId;
  private String columnName;
  private String dataType;
  private long dataLength;
  private String nullable;
  private Date createDate;
  private Date lastDate;
  private String fieldCmt;
  private double dataScale;
  private String dataKey;
  private long dbId;
  private long dsId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }


  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public long getDataLength() {
    return dataLength;
  }

  public void setDataLength(long dataLength) {
    this.dataLength = dataLength;
  }


  public String getNullable() {
    return nullable;
  }

  public void setNullable(String nullable) {
    this.nullable = nullable;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getLastDate() {
    return lastDate;
  }

  public void setLastDate(Date lastDate) {
    this.lastDate = lastDate;
  }

  public String getFieldCmt() {
    return fieldCmt;
  }

  public void setFieldCmt(String fieldCmt) {
    this.fieldCmt = fieldCmt;
  }


  public double getDataScale() {
    return dataScale;
  }

  public void setDataScale(double dataScale) {
    this.dataScale = dataScale;
  }


  public String getDataKey() {
    return dataKey;
  }

  public void setDataKey(String dataKey) {
    this.dataKey = dataKey;
  }


  public long getDbId() {
    return dbId;
  }

  public void setDbId(long dbId) {
    this.dbId = dbId;
  }


  public long getDsId() {
    return dsId;
  }

  public void setDsId(long dsId) {
    this.dsId = dsId;
  }

}
