package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Entities.Concretes.SchoolForCV;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolForCVDao extends JpaRepository<SchoolForCV,Integer> {
    SchoolForCV getById(int id);
    List<SchoolForCV> getAllByJobSeeker_idOrderByEndAtDesc(int id);
    List<SchoolForCV> getAllByJobSeeker_id(int id);
}
