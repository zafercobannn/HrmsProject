package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Entities.Concretes.CoverLetterForCV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoverLetterForCVDao extends JpaRepository<CoverLetterForCV,Integer> {
    CoverLetterForCV getById(int id);
}
