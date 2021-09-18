package com.example.dto;

public class NewsDTO extends BaseDTO<NewsDTO> {
  private String title;
  private String content;
  private String thumbnail;
  private String categoryCode;

  public NewsDTO() {

  }

  public String getThumbnail() {
    return this.thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public String getCategoryCode() {
    return this.categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public String getContent() {
    return content;
  }

  public String getTitle() {
    return title;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setTitle(String title) {
    this.title = title;
  }

}
