package com.haibao.xrules.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table( name ="SYS_CONFIG" , schema = "")
public class SysConfig {

  @Id
  @Column(name = "id" )
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "key" )
  private String key;

  @Column(name = "value" )
  private String value;

  @LastModifiedDate
  @Column(name="time",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP",insertable = false,updatable = false)
  private java.sql.Timestamp time;

  @Column(name = "detail" )
  private String detail;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  @Override
  public String toString() {
    return "SysConfig{" +
            "id=" + id +
            ", key='" + key + '\'' +
            ", value='" + value + '\'' +
            ", time=" + time +
            ", detail='" + detail + '\'' +
            '}';
  }
}
