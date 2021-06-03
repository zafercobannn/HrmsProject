package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Entities.Concretes.ForeignLanguageForCV;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ForeignLanguageForCVDao extends JpaRepository<ForeignLanguageForCV, Integer> {
    ForeignLanguageForCV getById(int id);
    List<ForeignLanguageForCV> getAllByJobSeeker_id(int id);
}
