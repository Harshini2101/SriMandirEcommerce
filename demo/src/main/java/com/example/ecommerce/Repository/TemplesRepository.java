package com.example.ecommerce.Repository;
import com.example.ecommerce.Entity.Temples;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplesRepository extends JpaRepository<Temples, String> {
}