package com.example.ecommerce.Repository;
import com.example.ecommerce.Entity.ProductBenefits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductBenefitsRepository extends JpaRepository<ProductBenefits, String> {
}