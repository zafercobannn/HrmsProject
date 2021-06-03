package com.example.hrmsproject.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_foreign_languages")
public class ForeignLanguageForCV extends Base{

    @Column(name = "language")
    private String language;

    @Min(value=1)
    @Max(value=5)
    @Column(name = "level")
    private int level;

    @ManyToOne()
    @JoinColumn(name = "jobSeeker_id")
    private JobSeeker jobSeeker;
}
