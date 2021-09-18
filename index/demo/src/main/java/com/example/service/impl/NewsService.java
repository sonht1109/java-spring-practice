package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.converter.NewsConverter;
import com.example.dto.NewsDTO;
import com.example.entity.CategoryEntity;
import com.example.entity.NewsEntity;
import com.example.repository.CategoryRepo;
import com.example.repository.NewsRepo;
import com.example.service.INewsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class NewsService implements INewsService {

  @Autowired
  private NewsRepo newsRepo;

  @Autowired
  private CategoryRepo categoryRepo;

  @Autowired
  private NewsConverter newsConverter;

  @Override
  public NewsDTO save(NewsDTO newsDTO) {
    NewsEntity newsEntity = new NewsEntity();
    if (newsDTO.getId() != null) {
      NewsEntity currentEntity = newsRepo.findOne(newsDTO.getId());
      newsEntity = newsConverter.toEntity(newsDTO, currentEntity);
    } else {
      newsEntity = newsConverter.toEntity(newsDTO);
    }
    CategoryEntity categoryEntity = categoryRepo.findOneByCode(newsDTO.getCategoryCode());
    newsEntity.setCategory(categoryEntity);
    newsEntity = newsRepo.save(newsEntity);
    return newsConverter.toDTO(newsEntity);
  }

  @Override
  public void delete(long[] ids) {
    for (long id : ids) {
      newsRepo.deleteById(id);
    }

  }

  @Override
  public List<NewsDTO> findAll(Pageable pageable) {
    List<NewsDTO> newsList = new ArrayList<>();
    List<NewsEntity> newsEntities = newsRepo.findAll(pageable).getContent();
    for(NewsEntity newsEntity : newsEntities) {
      NewsDTO newsDTO = newsConverter.toDTO(newsEntity);
      newsList.add(newsDTO);
    }
    return newsList;
  }

  @Override
  public List<NewsDTO> findAll() {
    List<NewsDTO> newsList = new ArrayList<>();
    List<NewsEntity> newsEntities = newsRepo.findAll();
    for(NewsEntity newsEntity : newsEntities) {
      NewsDTO newsDTO = newsConverter.toDTO(newsEntity);
      newsList.add(newsDTO);
    }
    return newsList;
  }

  @Override
  public int totalItem() {
    return (int) newsRepo.count();
  }

}
