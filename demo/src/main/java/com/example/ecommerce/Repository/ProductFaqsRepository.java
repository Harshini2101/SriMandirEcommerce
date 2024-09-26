package com.example.ecommerce.Repository;
import com.example.ecommerce.Entity.ProductFaqs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductFaqsRepository extends JpaRepository<ProductFaqs, String> {
}