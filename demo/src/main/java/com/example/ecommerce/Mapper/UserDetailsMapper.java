package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.UserDetailsDTO;
import com.example.ecommerce.Entity.UserDetails;

public class UserDetailsMapper {
    public static UserDetailsDTO mapToUserDetailsDTO(UserDetails userDetails) {
        return new UserDetailsDTO(
                userDetails.getUserId(),
                userDetails.getEmail(),
                userDetails.getPhoneNumber(),
                userDetails.getName()
        );
    }

    public static UserDetails mapToUserDetails(UserDetailsDTO userDetailsDTO) {
        return new UserDetails(
                userDetailsDTO.getUserId(),
                userDetailsDTO.getEmail(),
                userDetailsDTO.getPhoneNumber(),
                userDetailsDTO.getName()
        );
    }
}
