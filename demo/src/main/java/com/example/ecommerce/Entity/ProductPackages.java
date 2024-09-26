package com.example.ecommerce.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "product_packages")
@AllArgsConstructor
@NoArgsConstructor
public class ProductPackages {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "sub_title")
    private String subTitle;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    public ProductPackages(String id, String title, String description, long price) {
    }

    // Getters and Setters
}
