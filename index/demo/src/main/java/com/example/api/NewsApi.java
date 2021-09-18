package com.example.api;

import com.example.api.output.NewsOutput;
import com.example.dto.NewsDTO;
import com.example.service.impl.NewsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class NewsApi {

  @Autowired
  private NewsService newService;

  @PostMapping(value = "/api/news")
  public NewsDTO createNews(@RequestBody NewsDTO newsDTO) {
    return newService.save(newsDTO);
  }

  @PutMapping(value = "/api/news/{id}")
  public NewsDTO updateNews(@RequestBody NewsDTO newsDTO, @PathVariable("id") long id) {
    newsDTO.setId(id);
    return newService.save(newsDTO);
  }

  @DeleteMapping(value = "/api/new")
  public void deleteNews(@RequestBody long[] ids) {
    newService.delete(ids);
  }

  @GetMapping(value = "/api/news")
  public NewsOutput showNew(@RequestParam(value = "page", required = false) Integer page,
      @RequestParam(value = "limit", required = false) Integer limit) {
    NewsOutput newsOutput = new NewsOutput();
    if (page != null && limit != null) {
      newsOutput.setPage(page);
      Pageable pageable = PageRequest.of(page - 1, limit);
      newsOutput.setData(newService.findAll(pageable));
      newsOutput.setTotalPage((int) Math.ceil((double) (newService.totalItem()) / limit));
    } else {
      newsOutput.setData(newService.findAll());
    }
    return newsOutput;
  }

}
