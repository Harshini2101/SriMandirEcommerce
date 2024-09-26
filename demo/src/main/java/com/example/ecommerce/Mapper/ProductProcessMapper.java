package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.ProductProcessDTO;
import com.example.ecommerce.Entity.ProductProcess;

public class ProductProcessMapper {
    public static ProductProcessDTO mapToProductProcessDTO(ProductProcess productProcess) {
        return new ProductProcessDTO(
                productProcess.getId(),
                productProcess.getTitle(),
                productProcess.getDescription()
        );
    }

    public static ProductProcess mapToProductProcess(ProductProcessDTO productProcessDTO) {
        return new ProductProcess(
                productProcessDTO.getId(),
                productProcessDTO.getTitle(),
                productProcessDTO.getDescription()
        );
    }
}
