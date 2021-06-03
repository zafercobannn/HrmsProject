package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Entities.Concretes.ImageForCV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageForCVDao extends JpaRepository<ImageForCV, Integer>{

    ImageForCV getById(int id);
    ImageForCV getByJobSeeker_id(int id);
}