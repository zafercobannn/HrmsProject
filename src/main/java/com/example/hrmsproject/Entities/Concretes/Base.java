package com.example.hrmsproject.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
@Data
@NoArgsConstructor
public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @JsonIgnore
    @Column(name = "created_at")
    private LocalDate createdAt = LocalDate.now();

    @JsonIgnore
    @Column(name = "is_active" , columnDefinition = "boolean default true")
    private boolean isActive = true;

    @JsonIgnore
    @Column(name = "is_deleted" , columnDefinition = "boolean default false")
    private boolean isDeleted = false;
}
