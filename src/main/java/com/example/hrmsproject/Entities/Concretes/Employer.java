package com.example.hrmsproject.Entities.Concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employers")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class Employer extends User{

//	@Id
//	@GeneratedValue
//	@Column(name= "user_id")
//	private int userId;

    @Column(name= "company_name")
    private String companyName;

    @Column(name= "website")
    private String website;

    @Column(name= "phone_number")
    private String phoneNumber;

    @Column(name = "is_verified", columnDefinition = "boolean default false")
    private boolean isVerified = false;

    @OneToMany(mappedBy = "employer")
    private List<JobAdvert> jobAdverts;

}