package com.example.ecommerce.DTO;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductOrderPackageDTO {
    private String id;
    private String title;
    private String subtitle;
    private long price;
}
