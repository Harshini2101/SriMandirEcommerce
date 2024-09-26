package com.example.ecommerce.Entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "product_about_us")
@AllArgsConstructor
@NoArgsConstructor
public class ProductAboutUs {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    public ProductAboutUs(String id, String description) {
    }

    // Getters and Setters
}

