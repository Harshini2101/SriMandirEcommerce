package com.example.ecommerce.Entity;
import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDetails userDetails;

    @ManyToOne
    @JoinColumn(name = "package_id")
    private ProductPackages productPackages;

    public Cart(String userId, String productId, String packageId) {
    }

    public String getUserId() {
        return "";
    }

    public String getProductId() {
        return "";
    }

    public String getPackageId() {
        return "";
    }


    // Getters and Setters
}
