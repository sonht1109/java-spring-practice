package com.example.repository;

import com.example.entity.CategoryEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Long>  {

  CategoryEntity findOneByCode(String categoryCode);
  
}
