package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.ExperienceForCV;

import javax.xml.crypto.Data;
import java.util.List;

public interface ExperienceForCVService {
    Result add(ExperienceForCV experienceForCV);
    Result update(ExperienceForCV experienceForCV);
    Result delete(int id);
    DataResult<ExperienceForCV> getById(int id);
    DataResult<List<ExperienceForCV>> getAll();
    DataResult<List<ExperienceForCV>> getAllByJobSeeker_idOrderByEndAtDesc(int id);
    DataResult<List<ExperienceForCV>> getAllByJobSeekerId(int id);
}
