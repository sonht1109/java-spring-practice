package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

  @ManyToOne
  @JoinColumn(name = "category_id")
  private CategoryEntity category;


  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getThumbnail() {
    return this.thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public CategoryEntity getCategory() {
    return this.category;
  }

  public void setCategory(CategoryEntity category) {
    this.category = category;
  }

}
