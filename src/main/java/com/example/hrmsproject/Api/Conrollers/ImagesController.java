package com.example.hrmsproject.Api.Conrollers;

import com.example.hrmsproject.Business.Abstracts.ImageForCVService;
import com.example.hrmsproject.Business.Abstracts.JobSeekerService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.ImageForCV;
import com.example.hrmsproject.Entities.Concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImagesController {

    private ImageForCVService imageForCVService;
    private JobSeekerService jobSeekerService;

    @Autowired
    public ImagesController(ImageForCVService imageForCVService, JobSeekerService jobSeekerService) {
        super();
        this.imageForCVService = imageForCVService;
        this.jobSeekerService = jobSeekerService;
    }

    @PostMapping(value = "/add")
    public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
        JobSeeker jobseeker = this.jobSeekerService.getById(id).getData();
        ImageForCV imageForCV = new ImageForCV();
        imageForCV.setJobSeeker(jobseeker);
        return this.imageForCVService.add(imageForCV, imageFile);
    }

    @PostMapping("/update")
    public Result update(@RequestBody ImageForCV imageForCV){
        return this.imageForCVService.update(imageForCV);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id){
        return this.imageForCVService.delete(id);
    }

    @GetMapping("/getbyid")
    public DataResult<ImageForCV> getById(@RequestParam("id") int id){
        return this.imageForCVService.getById(id);
    }

    @GetMapping("/getall")
    public DataResult<List<ImageForCV>> getAll(){
        return this.imageForCVService.getAll();
    }


    @GetMapping("/getByJobseekerId")
    public DataResult<ImageForCV> getByJobSeekerId(@RequestParam int id){
        return this.imageForCVService.getByJobSeekerId(id);
    }
}
