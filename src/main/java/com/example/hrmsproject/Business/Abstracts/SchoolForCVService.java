package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.SchoolForCV;

import java.util.List;

public interface SchoolForCVService {
    Result add(SchoolForCV schoolForCV);
    Result update(SchoolForCV schoolForCV);
    Result delete(int id);
    DataResult<SchoolForCV> getById(int id);
    DataResult<List<SchoolForCV>> getAll();
    DataResult<List<SchoolForCV>> getAllByJobSeekerIdOrderByEndAtDesc(int id);
    DataResult<List<SchoolForCV>>getAllByJobSeekerId(int id);
}

