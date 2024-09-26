package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.ProductPackagesDTO;
import com.example.ecommerce.Entity.ProductPackages;

public class ProductPackagesMapper {
    public static ProductPackagesDTO mapToProductPackagesDTO(ProductPackages productPackages) {
        return new ProductPackagesDTO(
                productPackages.getId(),
                productPackages.getTitle(),
                productPackages.getDescription(),
                productPackages.getPrice()
        );
    }

    public static ProductPackages mapToProductPackages(ProductPackagesDTO productPackagesDTO) {
        return new ProductPackages(
                productPackagesDTO.getId(),
                productPackagesDTO.getTitle(),
                productPackagesDTO.getDescription(),
                productPackagesDTO.getPrice()
        );
    }
}
