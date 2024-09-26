package com.example.ecommerce.DTO;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDTO {
    private String id;
    private String userId;
    private String productId;
    private String status;
}
