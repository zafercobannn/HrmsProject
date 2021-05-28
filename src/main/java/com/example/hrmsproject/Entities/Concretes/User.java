package com.example.hrmsproject.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue
    @Column(name= "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String confirmPassword;

    @Column(name = "created_At",columnDefinition = "Date defult CURRENT_DATE")
    private LocalDate createdAt = LocalDate.now();

    @Column(name = "is_active",columnDefinition = "boolean default true")
    private Boolean isActive = true;

    @Column(name = "is_deleted",columnDefinition = "boolean default false")
    private Boolean isDeleted = false;

}
