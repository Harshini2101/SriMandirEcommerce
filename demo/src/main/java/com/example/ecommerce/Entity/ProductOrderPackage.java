package com.example.ecommerce.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "product_order_package")
@AllArgsConstructor
@NoArgsConstructor
public class ProductOrderPackage {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "sub_title")
    private String subTitle;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "package_id")
    private ProductPackages productPackages;

    public ProductOrderPackage(String id, String title, String subtitle, long price) {
    }

    public String getId() {
        return "";
    }

    public String getTitle() {
        return "";
    }

    public String getSubtitle() {
        return "";
    }

    public long getPrice() {
        return 0;
    }


    // Getters and Setters
}

