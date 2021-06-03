package com.example.hrmsproject.Entities.Dtos;

import com.example.hrmsproject.Entities.Concretes.*;

import java.util.List;

public class JobSeekerCVDto {

    public JobSeeker jobSeeker;
    public List<SchoolForCV> schools;
    public List<ProgrammingSkillForCV> programingSkills;
    public List<LinkForCV> links;
    public List<ForeignLanguageForCV> languages;
    public List<ExperienceForCV> experiences;
    public ImageForCV image;
}
