package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class NewsEntity extends BaseEntity {
  
  @Column
  private String title;

  @Column
  private String content;

  @Column
  private String thumbnail;

}
