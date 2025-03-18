package com.blandev.productms.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blandev.productms.persistence.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

  Optional<ProductEntity> findBySku(String sku);

  List<ProductEntity> findByCategoryId(Long categoryId);

  List<ProductEntity> findByIsActiveTrue();

  List<ProductEntity> findByIsActiveFalse();

  boolean existsBySku(String sku);

}
