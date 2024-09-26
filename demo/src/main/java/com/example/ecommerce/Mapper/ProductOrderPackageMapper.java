package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.ProductOrderPackageDTO;
import com.example.ecommerce.Entity.ProductOrderPackage;

public class ProductOrderPackageMapper {
    public static ProductOrderPackageDTO mapToProductOrderPackageDTO(ProductOrderPackage productOrderPackage) {
        return new ProductOrderPackageDTO(
                productOrderPackage.getId(),
                productOrderPackage.getTitle(),
                productOrderPackage.getSubtitle(),
                productOrderPackage.getPrice()
        );
    }

    public static ProductOrderPackage mapToProductOrderPackage(ProductOrderPackageDTO productOrderPackageDTO) {
        return new ProductOrderPackage(
                productOrderPackageDTO.getId(),
                productOrderPackageDTO.getTitle(),
                productOrderPackageDTO.getSubtitle(),
                productOrderPackageDTO.getPrice()
        );
    }
}
