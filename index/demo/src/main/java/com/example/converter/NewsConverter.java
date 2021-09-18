package com.example.converter;

import com.example.dto.NewsDTO;
import com.example.entity.NewsEntity;

public class NewsConverter {
  public NewsDTO toDTO (NewsEntity newsEntity) {
    NewsDTO newsDTO = new NewsDTO();
    if(newsEntity.getId() != null) {
      newsDTO.setId(newsEntity.getId());
    }
    newsDTO.setContent(newsEntity.getContent());
    newsDTO.setTitle(newsEntity.getTitle());
    newsDTO.setThumbnail(newsEntity.getThumbnail());
    newsDTO.setModifiedBy(newsEntity.getModifiedBy());
    newsDTO.setModifiedDate(newsEntity.getModifiedDate());
    newsDTO.setCreatedDate(newsEntity.getCreatedDate());
    newsDTO.setCreatedBy(newsEntity.getCreatedBy());
    return newsDTO;
  }

  public NewsEntity toEntity(NewsDTO newsDTO) {
    NewsEntity newsEntity = new NewsEntity();
    newsEntity.setTitle(newsDTO.getTitle());
		newsEntity.setContent(newsDTO.getContent());
		newsEntity.setThumbnail(newsDTO.getThumbnail());
		return newsEntity;
  }

  public NewsEntity toEntity(NewsDTO newsDTO, NewsEntity currentEntity) {
    currentEntity.setTitle(newsDTO.getTitle());
		currentEntity.setContent(newsDTO.getContent());
		currentEntity.setThumbnail(newsDTO.getThumbnail());
		return currentEntity;
  }
}
