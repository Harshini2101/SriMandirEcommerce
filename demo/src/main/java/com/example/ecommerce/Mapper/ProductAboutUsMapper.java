package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.ProductAboutUsDTO;
import com.example.ecommerce.Entity.ProductAboutUs;

public class ProductAboutUsMapper {
    public static ProductAboutUsDTO mapToProductAboutUsDTO(ProductAboutUs productAboutUs) {
        return new ProductAboutUsDTO(
                productAboutUs.getId(),
                productAboutUs.getDescription()
        );
    }

    public static ProductAboutUs mapToProductAboutUs(ProductAboutUsDTO productAboutUsDTO) {
        return new ProductAboutUs(
                productAboutUsDTO.getId(),
                productAboutUsDTO.getDescription()
        );
    }
}
