package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Entities.Concretes.ProgrammingSkillForCV;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgrammingSkillForCVDao extends JpaRepository<ProgrammingSkillForCV,Integer> {
    ProgrammingSkillForCV getById(int id);
    List<ProgrammingSkillForCV> getAllByJobSeeker_id(int id);
}
