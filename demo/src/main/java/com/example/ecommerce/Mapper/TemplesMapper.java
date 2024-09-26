package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.TemplesDTO;
import com.example.ecommerce.Entity.Temples;

public class TemplesMapper {
    public static TemplesDTO mapToTemplesDTO(Temples temples) {
        return new TemplesDTO(
                temples.getId(),
                temples.getName(),
                temples.getDescription()
        );
    }

    public static Temples mapToTemples(TemplesDTO templesDTO) {
        return new Temples(
                templesDTO.getId(),
                templesDTO.getName(),
                templesDTO.getDescription()
        );
    }
}
