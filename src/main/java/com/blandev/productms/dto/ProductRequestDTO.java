package com.blandev.productms.dto;

public record ProductRequestDTO(
    String name, String sku, Long categoryId, String description, Double price, Boolean isActive) {
}
