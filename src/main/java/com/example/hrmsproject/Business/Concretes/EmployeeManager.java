package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.EmployeeService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.SuccessDataResult;
import com.example.hrmsproject.DataAccess.Abstracts.EmployeeDao;
import com.example.hrmsproject.Entities.Concretes.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getall() {
        return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
    }
}
