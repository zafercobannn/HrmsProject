package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.*;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Core.Utilities.Results.SuccessDataResult;
import com.example.hrmsproject.Core.Utilities.Results.SuccessResult;
import com.example.hrmsproject.DataAccess.Abstracts.JobSeekerDao;
import com.example.hrmsproject.Entities.Concretes.JobSeeker;
import com.example.hrmsproject.Entities.Dtos.JobSeekerCVDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private ExperienceForCVService experienceForCVService;
    private ForeignLanguageForCVService foreignLanguageForCVService;
    private ImageForCVService imageForCVService;
    private LinkForCVService linkForCVService;
    private ProgrammingSkillForCVService programmingSkillForCVService;
    private SchoolForCVService schoolForCVService;

    public JobSeekerManager(JobSeekerDao jobSeekerDao, ExperienceForCVService experienceForCVService,
                            ForeignLanguageForCVService foreignLanguageForCVService, ImageForCVService imageForCVService,
                            LinkForCVService linkForCVService, ProgrammingSkillForCVService programmingSkillForCVService,
                            SchoolForCVService schoolForCVService) {
        super();
        this.jobSeekerDao = jobSeekerDao;
        this.experienceForCVService = experienceForCVService;
        this.foreignLanguageForCVService = foreignLanguageForCVService;
        this.imageForCVService = imageForCVService;
        this.linkForCVService = linkForCVService;
        this.programmingSkillForCVService = programmingSkillForCVService;
        this.schoolForCVService = schoolForCVService;
    }

    @Override
    public Result add(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("JobSeeker has been added.");
    }

    @Override
    public Result update(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("JobSeeker has been updated.");
    }

    @Override
    public Result delete(int id) {
        this.jobSeekerDao.deleteById(id);
        return new SuccessResult("JobSeeker has been deleted.");
    }

    @Override
    public DataResult<JobSeeker> getById(int id) {
        return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getById(id));
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
    }

    @Override
    public DataResult<JobSeeker> getJobSeekerByNationalId(String nationalId) {
        return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findJobSeekerByNationalId(nationalId));
    }

    @Override
    public DataResult<JobSeekerCVDto> getJobSeekerCVById(int id) {
        JobSeekerCVDto cv = new JobSeekerCVDto();
        cv.experiences = this.experienceForCVService.getAllByJobSeekerId(id).getData();
        cv.languages = this.foreignLanguageForCVService.getAllByJobSeekerId(id).getData();
        cv.image = this.imageForCVService.getByJobSeekerId(id).getData();
        cv.links = this.linkForCVService.getAllByJobSeekerId(id).getData();
        cv.programingSkills = this.programmingSkillForCVService.getAllByJobSeekerId(id).getData();
        cv.schools = this.schoolForCVService.getAllByJobSeekerId(id).getData();
        return new SuccessDataResult<JobSeekerCVDto>(cv);
    }

}
