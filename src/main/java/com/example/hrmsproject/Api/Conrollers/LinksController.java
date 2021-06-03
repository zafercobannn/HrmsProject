package com.example.hrmsproject.Api.Conrollers;

import com.example.hrmsproject.Business.Abstracts.LinkForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.LinkForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/links")
public class LinksController {

    private LinkForCVService linkForCVService;

    @Autowired
    public LinksController(LinkForCVService linkForCVService) {
        super();
        this.linkForCVService = linkForCVService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody LinkForCV linkForCV){
        return this.linkForCVService.add(linkForCV);
    }

    @PostMapping("/update")
    public Result update(@RequestBody LinkForCV linkForCV){
        return this.linkForCVService.update(linkForCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id){
        return this.linkForCVService.delete(id);
    }

    @GetMapping("/getbyid")
    public DataResult<LinkForCV> getById(@RequestParam("id") int id){
        return this.linkForCVService.getById(id);
    }

    @GetMapping("/getall")
    public DataResult<List<LinkForCV>> getAll(){
        return this.linkForCVService.getAll();
    }

    @GetMapping("/getAllByJobSeekerId")
    public DataResult<List<LinkForCV>> getAllByJobSeekerId(@RequestParam int id){
        return this.linkForCVService.getAllByJobSeekerId(id);
    }


}
