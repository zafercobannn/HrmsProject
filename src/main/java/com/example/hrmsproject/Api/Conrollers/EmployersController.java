package com.example.hrmsproject.Api.Conrollers;

import com.example.hrmsproject.Business.Abstracts.EmployerService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin
public class EmployersController {
    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        super();
        this.employerService = employerService;
    }


    @PostMapping("/add")
    public Result add(@RequestBody Employer employer){
        return this.employerService.add(employer);
    }

    @GetMapping("/getall")
    public DataResult<List<Employer>> getall(){
        return this.employerService.getall();
    }
}
