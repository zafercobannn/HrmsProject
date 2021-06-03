package com.example.hrmsproject.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_cover_letters")
public class CoverLetterForCV extends Base{

    @Column(name = "content")
    private String content;


    @ManyToOne()
    @JoinColumn(name = "jobSeeker_id")
    @JsonIgnore
    private JobSeeker jobSeeker;
}
