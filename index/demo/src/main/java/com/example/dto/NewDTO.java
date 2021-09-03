package com.example.dto;

public class NewDTO {
  private String title;
  private String content;

  public NewDTO() {

  }

  public NewDTO(String title, String content) {
    this.content = content;
    this.title = title;
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
