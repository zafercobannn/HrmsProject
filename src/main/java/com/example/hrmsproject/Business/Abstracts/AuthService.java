package com.example.hrmsproject.Business.Abstracts;


import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.Employer;
import com.example.hrmsproject.Entities.Concretes.JobSeeker;

public interface AuthService {
    Result registerEmployer(Employer employer,String confirmPassword);
    Result registerJobSeeker(JobSeeker jobSeeker,String confirmPassword);
}
