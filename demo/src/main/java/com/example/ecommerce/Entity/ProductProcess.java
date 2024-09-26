package com.example.ecommerce.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;


@Getter
@Setter
@Entity
@Table(name = "product_process")
@AllArgsConstructor
@NoArgsConstructor
public class ProductProcess {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "description")
    private String description;

    @Column(name = "step")
    private BigInteger step;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    public ProductProcess(String id, String title, String description) {
    }

    public String getTitle() {
        return "";
    }

    // Getters and Setters
}

