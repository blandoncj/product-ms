package com.blandev.productms.dto;

public record ProductResponseDTO(
    Long id, String name, String sku, Long categoryId, String description, Double price, Boolean isActive) {
}
