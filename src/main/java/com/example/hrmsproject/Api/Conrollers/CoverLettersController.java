package com.example.hrmsproject.Api.Conrollers;


import com.example.hrmsproject.Business.Abstracts.CoverLetterForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.CoverLetterForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLettersController {

    private CoverLetterForCVService coverLetterForCVService;

    @Autowired
    public CoverLettersController(CoverLetterForCVService coverLetterForCVService) {
        this.coverLetterForCVService = coverLetterForCVService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CoverLetterForCV coverLetterForCV){
        return this.coverLetterForCVService.add(coverLetterForCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id){
        return this.coverLetterForCVService.delete(id);
    }

    @PostMapping("/update")
    public Result update(@RequestBody CoverLetterForCV coverLetterForCV){
        return this.coverLetterForCVService.add(coverLetterForCV);
    }

    @GetMapping("/getById")
    public DataResult<CoverLetterForCV> getById(@RequestParam("id") int id){
        return this.coverLetterForCVService.getById(id);
    }

    @GetMapping("getall")
    public DataResult<List<CoverLetterForCV>> getAll(){
        return this.coverLetterForCVService.getAll();
    }
}
