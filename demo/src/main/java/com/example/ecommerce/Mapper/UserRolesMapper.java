package com.example.ecommerce.Mapper;
import com.example.ecommerce.DTO.UserRolesDTO;
import com.example.ecommerce.Entity.UserRoles;

public class UserRolesMapper {
    public static UserRolesDTO mapToUserRolesDto(UserRoles userRoles) {
        return new UserRolesDTO(
                userRoles.getUserId(),
                userRoles.getName()
        );
    }

    public static UserRoles mapToUserRoles(UserRolesDTO userRolesDto) {
        return new UserRoles(
                userRolesDto.getUserId(),
                userRolesDto.getName()
        );
    }
}
