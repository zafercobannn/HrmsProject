package com.example.hrmsproject.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="verification_codes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerificationCode {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int userId;

    @Column(name="code")
    private String code;

    @Column(name="is_confirmed")
    private boolean isConfirmed;

    @Column(name="created_at", columnDefinition = "Date defult CURRENT_DATE")
    private LocalDate createAt = LocalDate.now();

    public VerificationCode(int userId, String code, boolean isConfirmed, LocalDate createAt) {
        super();
        this.userId = userId;
        this.code = code;
        this.isConfirmed = isConfirmed;
        this.createAt = createAt;
    }


}
