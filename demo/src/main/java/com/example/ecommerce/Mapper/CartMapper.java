package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.CartDTO;
import com.example.ecommerce.Entity.Cart;

public class CartMapper {
    public static CartDTO mapToCartDTO(Cart cart) {
        return new CartDTO(
                cart.getUserId(),
                cart.getProductId(),
                cart.getPackageId()
        );
    }

    public static Cart mapToCart(CartDTO cartDTO) {
        return new Cart(
                cartDTO.getUserId(),
                cartDTO.getProductId(),
                cartDTO.getPackageId()
        );
    }
}
