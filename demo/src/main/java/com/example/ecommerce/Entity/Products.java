package com.example.ecommerce.Entity;
import jakarta.persistence.*;
import java.security.Timestamp;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_time")
    private Timestamp createdTime;

    @Column(name = "category")
    private String category;

    @Column(name = "category_type")
    private String categoryType;

    @ManyToOne
    @JoinColumn(name = "temple_id")
    private Temples temple;

    public Products(String id, String category, String description, String shortDescription) {
    }

    public String getDescription() {
        return "";
    }

    // Getters and Setters
}

