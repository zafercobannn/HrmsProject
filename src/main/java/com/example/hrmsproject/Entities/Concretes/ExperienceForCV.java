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
@Table(name = "cv_experiences")
public class ExperienceForCV extends Base{

    @Column(name = "working_place")
    private String workingPlace;

    @Column(name = "position")
    private String position;

    @Column(name = "start_at")
    private LocalDate startAt;

    @Column(name = "end_at" ,nullable = true)
    private LocalDate endAt;

    @ManyToOne()
    @JoinColumn(name = "jobSeeker_id")
    private JobSeeker jobSeeker;

}
