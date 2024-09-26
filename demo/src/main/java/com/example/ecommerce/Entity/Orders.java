package com.example.ecommerce.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "status")
    private String status;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "payment_identifier")
    private String paymentIdentifier;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDetails userDetails;

    public Orders(String id, String userId, String productId, String status) {
    }

    public String getUserId() {
        return "";
    }

    public String getProductId() {
        return "";
    }

    // Getters and Setters
}
