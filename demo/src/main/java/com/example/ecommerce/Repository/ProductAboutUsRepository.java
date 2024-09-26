package com.example.ecommerce.Repository;
import com.example.ecommerce.Entity.ProductAboutUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAboutUsRepository extends JpaRepository<ProductAboutUs, String> {
}
