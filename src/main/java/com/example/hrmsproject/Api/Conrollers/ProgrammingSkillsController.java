package com.example.hrmsproject.Api.Conrollers;

import com.example.hrmsproject.Business.Abstracts.ProgrammingSkillForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.ProgrammingSkillForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmingSkills")
public class ProgrammingSkillsController {

    private ProgrammingSkillForCVService programmingSkillForCVService;

    @Autowired
    public ProgrammingSkillsController(ProgrammingSkillForCVService programmingSkillForCVService) {
        super();
        this.programmingSkillForCVService = programmingSkillForCVService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody ProgrammingSkillForCV programmingSkillForCV){
        return this.programmingSkillForCVService.add(programmingSkillForCV);
    }

    @PostMapping("/update")
    public Result update(@RequestBody ProgrammingSkillForCV programmingSkillForCV){
        return this.programmingSkillForCVService.update(programmingSkillForCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id){
        return this.programmingSkillForCVService.delete(id);
    }

    @GetMapping("/getbyid")
    public DataResult<ProgrammingSkillForCV> getById(@RequestParam("id") int id){
        return this.programmingSkillForCVService.getById(id);
    }

    @GetMapping("/getall")
    public DataResult<List<ProgrammingSkillForCV>> getAll(){
        return this.programmingSkillForCVService.getAll();
    }

    @GetMapping("/getAllByJobseekerId")
    public DataResult<List<ProgrammingSkillForCV>> getAllByJobSeekerId(@RequestParam int id){
        return this.programmingSkillForCVService.getAllByJobSeekerId(id);
    }
}
