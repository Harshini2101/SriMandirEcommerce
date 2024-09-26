package com.example.ecommerce.Entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_benefits")
public class ProductBenefits {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    public ProductBenefits(String id, String description) {
    }

    // Getters and Setters
}

