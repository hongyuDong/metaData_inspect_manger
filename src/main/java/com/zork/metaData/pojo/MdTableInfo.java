package com.sample;


public class MdTableInfo {

  private long id;
  private String dbId;
  private String tableName;
  private java.sql.Timestamp createDate;
  private java.sql.Timestamp lastDate;
  private String tableCmt;
  private long dsId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDbId() {
    return dbId;
  }

  public void setDbId(String dbId) {
    this.dbId = dbId;
  }


  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public java.sql.Timestamp getLastDate() {
    return lastDate;
  }

  public void setLastDate(java.sql.Timestamp lastDate) {
    this.lastDate = lastDate;
  }


  public String getTableCmt() {
    return tableCmt;
  }

  public void setTableCmt(String tableCmt) {
    this.tableCmt = tableCmt;
  }


  public long getDsId() {
    return dsId;
  }

  public void setDsId(long dsId) {
    this.dsId = dsId;
  }

}
