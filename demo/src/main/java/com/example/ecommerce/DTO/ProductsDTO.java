package com.example.ecommerce.DTO;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDTO {
    private String id;
    private String category;
    private String description;
    private String shortDescription;
}
