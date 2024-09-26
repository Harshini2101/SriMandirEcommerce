package com.example.ecommerce.Repository;
import com.example.ecommerce.Entity.ProductProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductProcessRepository extends JpaRepository<ProductProcess, String> {
}