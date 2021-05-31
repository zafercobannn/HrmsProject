package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Entities.Concretes.City;

import java.util.List;

public interface CityService {
    DataResult<List<City>> getAll();
}