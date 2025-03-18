package com.blandev.productms.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blandev.productms.persistence.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

  boolean existsByName(String name);

  List<CategoryEntity> findByIsActiveTrue();

  List<CategoryEntity> findByIsActiveFalse();

}
