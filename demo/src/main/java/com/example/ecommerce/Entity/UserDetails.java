package com.example.ecommerce.Entity;
import jakarta.persistence.*;

import lombok.*;

import java.security.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "user_details")
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "time_zone")
    private String timeZone;

    @Column(name = "created_time")
    private Timestamp createdTime;

    @Column(name = "password")
    private String password;

    public UserDetails(String userId, String email, String phoneNumber, String name) {
    }

    public String getUserId() {
        return "";
    }

    // Getters and Setters
}

