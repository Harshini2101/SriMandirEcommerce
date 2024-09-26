package com.example.ecommerce.Repository;
import com.example.ecommerce.Entity.Cart;
import com.example.ecommerce.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, String> {
}
