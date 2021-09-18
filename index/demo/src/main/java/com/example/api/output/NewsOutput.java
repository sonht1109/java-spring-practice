package com.example.api.output;

import java.util.ArrayList;
import java.util.List;

import com.example.dto.NewsDTO;


public class NewsOutput {
  private int page;
  private int totalPage;
  private List<NewsDTO> data = new ArrayList<>();

  public int getPage() {
    return this.page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getTotalPage() {
    return this.totalPage;
  }

  public void setTotalPage(int totalPage) {
    this.totalPage = totalPage;
  }

  public List<NewsDTO> getData() {
    return this.data;
  }

  public void setData(List<NewsDTO> data) {
    this.data = data;
  }

}
