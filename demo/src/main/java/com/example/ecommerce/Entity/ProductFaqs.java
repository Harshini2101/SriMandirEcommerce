package com.example.ecommerce.Entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "product_faqs")
@NoArgsConstructor
@AllArgsConstructor
public class ProductFaqs {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "question")
    private String question;

    @Column(name = "answer")
    private String answer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    public ProductFaqs(String id, String question, String answer) {
    }

    // Getters and Setters
}
