package com.sample;


public class MdDbInfo {

  private long id;
  private String product;
  private String dbVersion;
  private String dsId;
  private java.sql.Timestamp createDate;
  private java.sql.Timestamp lastDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }


  public String getDbVersion() {
    return dbVersion;
  }

  public void setDbVersion(String dbVersion) {
    this.dbVersion = dbVersion;
  }


  public String getDsId() {
    return dsId;
  }

  public void setDsId(String dsId) {
    this.dsId = dsId;
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

}
