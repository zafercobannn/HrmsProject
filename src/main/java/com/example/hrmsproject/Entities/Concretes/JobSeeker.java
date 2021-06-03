package com.example.hrmsproject.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "jobSeekers")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User{

//	@Id
//	@GeneratedValue
//	@Column(name= "user_id")
//	private int userId;

    @Column(name= "first_name")
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    @Column(name= "national_id")
    private String nationalId;

    @Column(name= "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "is_verified", columnDefinition = "boolean default false")
    private boolean isVerified = false;

}
