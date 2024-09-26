package com.example.ecommerce.DTO;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductPackagesDTO {
    private String id;
    private String title;
    private String description;
    private long price;

    public ProductPackagesDTO(String id, String title, String description, BigDecimal price) {
    }
}
