package com.example.ecommerce.Mapper;

import com.example.ecommerce.DTO.OrdersDTO;
import com.example.ecommerce.Entity.Orders;

public class OrdersMapper {
    public static OrdersDTO mapToOrdersDTO(Orders orders) {
        return new OrdersDTO(
                orders.getId(),
                orders.getUserId(),
                orders.getProductId(),
                orders.getStatus()
        );
    }

    public static Orders mapToOrders(OrdersDTO ordersDTO) {
        return new Orders(
                ordersDTO.getId(),
                ordersDTO.getUserId(),
                ordersDTO.getProductId(),
                ordersDTO.getStatus()
        );
    }
}
