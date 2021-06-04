package com.example.hrmsproject.Api.Conrollers;

import com.example.hrmsproject.Business.Abstracts.ForeignLanguageForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.ForeignLanguageForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foreignlanguage")
public class ForeignLanguagesService {
    private ForeignLanguageForCVService foreignLanguageForCVService;

    @Autowired
    public ForeignLanguagesService(ForeignLanguageForCVService foreignLanguageForCVService) {
        this.foreignLanguageForCVService = foreignLanguageForCVService;
    }

    @PostMapping("/add")
    public Result add(ForeignLanguageForCV foreignLanguageForCV){
        return this.foreignLanguageForCVService.add(foreignLanguageForCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id){
        return this.foreignLanguageForCVService.delete(id);
    }

    @PostMapping("/update")
    public Result update(ForeignLanguageForCV foreignLanguageForCV){
        return this.foreignLanguageForCVService.update(foreignLanguageForCV);
    }

    @GetMapping("/getById")
    public DataResult<ForeignLanguageForCV> getById(@RequestParam("id") int id){
        return this.foreignLanguageForCVService.getById(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<ForeignLanguageForCV>> getAll(){
        return this.foreignLanguageForCVService.getAll();
    }

    @GetMapping("/getAllByJobSeekerId")
    public DataResult<List<ForeignLanguageForCV>> getAllByJobSeeker_id(@RequestParam int id){
        return this.foreignLanguageForCVService.getAllByJobSeekerId(id);
    }


}
