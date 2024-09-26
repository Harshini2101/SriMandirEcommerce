package com.example.ecommerce.DTO;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {
    private String userId;
    private String productId;
    private String packageId;
}
