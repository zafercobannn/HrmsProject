package com.example.hrmsproject.Api.Conrollers;

import com.example.hrmsproject.Business.Abstracts.JobPositionService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {

        private JobPositionService jobPositionService;

        @Autowired
        public JobPositionsController(JobPositionService jobPositionService) {
            this.jobPositionService = jobPositionService;
        }

        @GetMapping("/getall")
        public DataResult<List<JobPosition>> getAll(){
            return this.jobPositionService.getAll();
        }

        @PostMapping("/add")
        public Result add(@RequestBody JobPosition jobPosition){
            return this.jobPositionService.add(jobPosition);
        }

}
