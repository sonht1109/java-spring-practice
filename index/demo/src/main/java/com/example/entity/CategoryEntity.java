package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {
  @Column
  private String code;

  @Column
  private String name;

  @OneToMany(mappedBy = "category")
  private List<NewsEntity> newsList = new ArrayList<>();


  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<NewsEntity> getNewsList() {
    return this.newsList;
  }

  public void setNewsList(List<NewsEntity> newsList) {
    this.newsList = newsList;
  }

}
