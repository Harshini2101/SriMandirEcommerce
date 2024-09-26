package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.ProductsDTO;
import com.example.ecommerce.Entity.Products;

public class ProductsMapper {
    public static ProductsDTO mapToProductsDTO(Products products) {
        return new ProductsDTO(
                products.getId(),
                products.getCategory(),
                products.getDescription(),
                products.getShortDescription()
        );
    }

    public static Products mapToProducts(ProductsDTO productsDTO) {
        return new Products(
                productsDTO.getId(),
                productsDTO.getCategory(),
                productsDTO.getDescription(),
                productsDTO.getShortDescription()
        );
    }
}
