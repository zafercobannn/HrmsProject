package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Entities.Concretes.Employee;

import java.util.List;

public interface EmployeeService {
    DataResult<List<Employee>> getall();
}
