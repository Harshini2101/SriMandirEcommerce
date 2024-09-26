package com.example.ecommerce.Repository;
import com.example.ecommerce.Entity.ProductOrderPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductOrderPackageRepository extends JpaRepository<ProductOrderPackage, String> {
}