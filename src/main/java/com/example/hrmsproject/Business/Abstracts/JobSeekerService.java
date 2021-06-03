package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.JobSeeker;
import com.example.hrmsproject.Entities.Dtos.JobSeekerCVDto;

import java.util.List;

public interface JobSeekerService {

    Result add(JobSeeker jobSeeker);
    Result update(JobSeeker jobSeeker);
    Result delete(int id);
    DataResult<JobSeeker> getById(int id);
    DataResult<List<JobSeeker>> getAll();
    DataResult<JobSeeker> getJobSeekerByNationalId(String nationalId);
    DataResult<JobSeekerCVDto> getJobSeekerCVById(int id);
}
