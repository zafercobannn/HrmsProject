package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Entities.Concretes.LinkForCV;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkForCVDao extends JpaRepository<LinkForCV,Integer> {
        LinkForCV getById(int id);
        List<LinkForCV> getAllByJobSeeker_id(int id);
}

