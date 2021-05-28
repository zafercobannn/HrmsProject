package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getall();
    Result add(Employer employer);
}
