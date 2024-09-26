package com.example.ecommerce.Repository;
import com.example.ecommerce.Entity.ProductPackages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductPackagesRepository extends JpaRepository<ProductPackages, String> {
}
