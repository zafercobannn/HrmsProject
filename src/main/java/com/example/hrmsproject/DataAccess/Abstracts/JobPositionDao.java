package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Entities.Concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {

    JobPosition findByJobTitle(String title);
    JobPosition getById(int id);
}