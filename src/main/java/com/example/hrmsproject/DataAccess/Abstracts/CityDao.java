package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Entities.Concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {
    City getById(int id);
}
