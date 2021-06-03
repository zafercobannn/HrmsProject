package com.example.hrmsproject.Api.Conrollers;

import com.example.hrmsproject.Business.Abstracts.ExperienceForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.ExperienceForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.crypto.Data;
import java.util.List;

@Service
public class ExperiencesController {

    private ExperienceForCVService experienceForCVService;

    @Autowired
    public ExperiencesController(ExperienceForCVService experienceForCVService) {
        this.experienceForCVService = experienceForCVService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody ExperienceForCV experienceForCV){
        return this.experienceForCVService.add(experienceForCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id){
        return this.experienceForCVService.delete(id);
    }

    @PostMapping("/update")
    public Result update(@RequestBody ExperienceForCV experienceForCV){
        return this.experienceForCVService.update(experienceForCV);
    }

    @GetMapping("/getById")
    public DataResult<ExperienceForCV> getById(@RequestParam int id){
        return this.experienceForCVService.getById(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<ExperienceForCV>> getAll(){
        return this.experienceForCVService.getAll();
    }

    @GetMapping("/getAllByJobSeekerIdOrderByEndAtDesc")
    public DataResult<List<ExperienceForCV>> getAllByJobSeeker_idOrderByEndAtDesc(@RequestParam("id") int id){
        return this.experienceForCVService.getAllByJobSeeker_idOrderByEndAtDesc(id);
    }

    @GetMapping("/getAllByJobseekerId")
    public DataResult<List<ExperienceForCV>> getAllByJobSeeker_id(@RequestParam int id){
        return this.experienceForCVService.getAllByJobSeekerId(id);
    }












}
