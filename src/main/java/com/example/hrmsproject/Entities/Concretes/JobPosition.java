package com.example.hrmsproject.Entities.Concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="job_positions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name= "created_at", columnDefinition = "Date default CURRENT_DATE")
    private LocalDate createdDate = LocalDate.now();

    @Column(name= "is_active", columnDefinition = "boolean default true")
    private boolean isActive = true;

    @Column(name= "is_deleted", columnDefinition = "boolean default false")
    private boolean isDeleted = false;

    @OneToMany(mappedBy = "jobPosition")
    private List<JobAdvert> jobAdverts;

}