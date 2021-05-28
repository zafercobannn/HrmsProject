package com.example.hrmsproject.Entities.Concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Table(name="job_positions")
@AllArgsConstructor
@NoArgsConstructor

public class JobPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="created_at")
    private LocalDate createdDate;

    @Column(name="is_active")
    private boolean isActive;

    @Column(name="is_deleted")
    private boolean isDeleted;
}