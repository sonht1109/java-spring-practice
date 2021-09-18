package com.example.service;

import java.util.List;

import com.example.dto.NewsDTO;

import org.springframework.data.domain.Pageable;

public interface INewsService {
  NewsDTO save(NewsDTO newsDTO);
  void delete (long ids[]);
  List<NewsDTO> findAll(Pageable pageable);
  List<NewsDTO> findAll();
  int totalItem();
}
