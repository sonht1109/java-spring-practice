package com.example.repository;

import com.example.entity.NewsEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepo extends JpaRepository<NewsEntity, Long> {

  NewsEntity findOne(Long id);
  
}
