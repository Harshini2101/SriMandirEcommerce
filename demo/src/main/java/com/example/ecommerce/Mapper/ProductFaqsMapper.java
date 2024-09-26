package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.ProductFaqsDTO;
import com.example.ecommerce.Entity.ProductFaqs;

public class ProductFaqsMapper {
    public static ProductFaqsDTO mapToProductFaqsDTO(ProductFaqs productFaqs) {
        return new ProductFaqsDTO(
                productFaqs.getId(),
                productFaqs.getQuestion(),
                productFaqs.getAnswer()
        );
    }

    public static ProductFaqs mapToProductFaqs(ProductFaqsDTO productFaqsDTO) {
        return new ProductFaqs(
                productFaqsDTO.getId(),
                productFaqsDTO.getQuestion(),
                productFaqsDTO.getAnswer()
        );
    }
}
