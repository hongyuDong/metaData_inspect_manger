package com.zork.metaData.pojo;


import java.util.Date;

public class DbSourceConfig {

  private String id;
  private String dbName;
  private String dbPassword;
  private String dbIp;
  private String dbPort;
  private String dbSchema;
  private String dbType;
  private String dbVersion;
  private String collectFrequency;
  private String collectBeginDate;
  private Date createDate;
  private Date updateDate;
  private String dbStatus;
  private String dbUsername;
  private long dbSign;
  private String collectName;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }


  public String getDbPassword() {
    return dbPassword;
  }

  public void setDbPassword(String dbPassword) {
    this.dbPassword = dbPassword;
  }


  public String getDbIp() {
    return dbIp;
  }

  public void setDbIp(String dbIp) {
    this.dbIp = dbIp;
  }


  public String getDbPort() {
    return dbPort;
  }

  public void setDbPort(String dbPort) {
    this.dbPort = dbPort;
  }


  public String getDbSchema() {
    return dbSchema;
  }

  public void setDbSchema(String dbSchema) {
    this.dbSchema = dbSchema;
  }


  public String getDbType() {
    return dbType;
  }

  public void setDbType(String dbType) {
    this.dbType = dbType;
  }


  public String getDbVersion() {
    return dbVersion;
  }

  public void setDbVersion(String dbVersion) {
    this.dbVersion = dbVersion;
  }


  public String getCollectFrequency() {
    return collectFrequency;
  }

  public void setCollectFrequency(String collectFrequency) {
    this.collectFrequency = collectFrequency;
  }


  public String getCollectBeginDate() {
    return collectBeginDate;
  }

  public void setCollectBeginDate(String collectBeginDate) {
    this.collectBeginDate = collectBeginDate;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public String getDbStatus() {
    return dbStatus;
  }

  public void setDbStatus(String dbStatus) {
    this.dbStatus = dbStatus;
  }


  public String getDbUsername() {
    return dbUsername;
  }

  public void setDbUsername(String dbUsername) {
    this.dbUsername = dbUsername;
  }


  public long getDbSign() {
    return dbSign;
  }

  public void setDbSign(long dbSign) {
    this.dbSign = dbSign;
  }


  public String getCollectName() {
    return collectName;
  }

  public void setCollectName(String collectName) {
    this.collectName = collectName;
  }

}
