package com.zork.metaData.pojo;


import java.util.Date;

public class MdTableInfo {

  private long id;
  private String dbId;
  private String tableName;
  private Date createDate;
  private Date lastDate;
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
