package com.example.hrmsproject.Api.Conrollers;

import com.example.hrmsproject.Business.Abstracts.JobSeekerService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobSeekers")
@CrossOrigin
public class JobSeekersController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobSeeker>> getall(){
        return this.jobSeekerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobSeeker jobseeker){
        return this.jobSeekerService.add(jobseeker);
    }

}
