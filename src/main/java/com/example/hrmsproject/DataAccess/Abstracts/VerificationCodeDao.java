package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Entities.Concretes.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer> {
    VerificationCode getById(int id);
}
