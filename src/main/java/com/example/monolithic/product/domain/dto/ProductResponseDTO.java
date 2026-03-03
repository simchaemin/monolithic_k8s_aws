package com.example.monolithic.product.domain.dto;

import com.example.monolithic.product.domain.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDTO {

    private String name;
    private Integer price;
    private Integer stockQty;
    private Long id;

    public static ProductResponseDTO fromEntity(ProductEntity entity) {
        return ProductResponseDTO.builder()
                .name(entity.getName())
                .price(entity.getPrice())
                .stockQty(entity.getStockQty())
                .id(entity.getId())
                .build();
    }
    
}
