package com.example.hrmsproject.Api.Conrollers;

import com.example.hrmsproject.Business.Abstracts.JobAdvertService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvert")
public class JobAdvertsController {

    private JobAdvertService jobAdvertService;

    @Autowired
    public JobAdvertsController(JobAdvertService jobAdvertService) {
        super();
        this.jobAdvertService = jobAdvertService;
    }


    @PostMapping("/add")

    public Result add(@RequestBody JobAdvert jobAdvert){
        return this.jobAdvertService.add(jobAdvert);
    }
    //
//	@PostMapping("/update")
//	public Result update(@RequestBody JobAdvert jobAdvert){
//		return this.jobAdvertService.update(jobAdvert);
//	}
//
//	@PostMapping("/delete")
//	public Result delete(@PathVariable("id") int id){
//		return this.jobAdvertService.delete(id);
//	}
//
    @GetMapping("/getbyid")
    public DataResult<JobAdvert> getById(int id){
        return this.jobAdvertService.getById(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<JobAdvert>> getAll(){
        return this.jobAdvertService.getAll();
    }

    @PostMapping("/changeOpenToClose")
    public Result changeOpenToClose(int id){
        return this.jobAdvertService.changeOpenToClose(id);
    }

    @GetMapping("/getAllOpenJobAdvertList")
    public DataResult<List<JobAdvert>> getAllOpenJobAdvertList(){
        return this.jobAdvertService.getAllOpenJobAdvertList();
    }

    @GetMapping("/findAllByOrderByPublishedAt")
    public DataResult<List<JobAdvert>> findAllByOrderByPublishedAt(){
        return this.jobAdvertService.findAllByOrderByPublishedAt();
    }

    @GetMapping("/getAllOpenJobAdvertByEmployer")
    public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id){
        return this.jobAdvertService.getAllOpenJobAdvertByEmployer(id);
    }
}
