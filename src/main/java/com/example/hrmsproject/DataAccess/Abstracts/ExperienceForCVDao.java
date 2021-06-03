package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Entities.Concretes.ExperienceForCV;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperienceForCVDao extends JpaRepository<ExperienceForCV,Integer> {
    ExperienceForCV getById(int id);
    List<ExperienceForCV> getAllByJobSeeker_idOrderByEndAtDesc(int id);
    List<ExperienceForCV> getAllByJobSeeker_id(int id);
}
