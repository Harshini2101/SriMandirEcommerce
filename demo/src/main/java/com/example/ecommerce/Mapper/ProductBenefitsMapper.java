package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.ProductBenefitsDTO;
import com.example.ecommerce.Entity.ProductBenefits;

public class ProductBenefitsMapper {
    public static ProductBenefitsDTO mapToProductBenefitsDTO(ProductBenefits productBenefits) {
        return new ProductBenefitsDTO(
                productBenefits.getId(),
                productBenefits.getDescription()
        );
    }

    public static ProductBenefits mapToProductBenefits(ProductBenefitsDTO productBenefitsDTO) {
        return new ProductBenefits(
                productBenefitsDTO.getId(),
                productBenefitsDTO.getDescription()
        );
    }
}
