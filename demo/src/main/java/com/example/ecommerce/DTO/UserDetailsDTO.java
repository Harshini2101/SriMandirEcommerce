package com.example.ecommerce.DTO;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsDTO {
    private String userId;
    private String email;
    private String phoneNumber;
    private String name;
}
