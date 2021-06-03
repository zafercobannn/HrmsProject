package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.ExperienceForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Core.Utilities.Results.SuccessDataResult;
import com.example.hrmsproject.Core.Utilities.Results.SuccessResult;
import com.example.hrmsproject.DataAccess.Abstracts.ExperienceForCVDao;
import com.example.hrmsproject.Entities.Concretes.ExperienceForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceForCVManager implements ExperienceForCVService {

    private ExperienceForCVDao experienceForCVDao;

    @Autowired
    public ExperienceForCVManager(ExperienceForCVDao experienceForCVDao) {
        this.experienceForCVDao = experienceForCVDao;
    }

    @Override
    public Result add(ExperienceForCV experienceForCV) {
        this.experienceForCVDao.save(experienceForCV);
        return new SuccessResult("İş deneyimi eklendi");
    }

    @Override
    public Result update(ExperienceForCV experienceForCV) {
        this.experienceForCVDao.save(experienceForCV);
        return new SuccessResult("İş deneyimi bilgisi güncellendi");
    }

    @Override
    public Result delete(int id) {
        this.experienceForCVDao.getById(id);
        return new SuccessResult("İş deneyimi bilgisi silindi");
    }

    @Override
    public DataResult<ExperienceForCV> getById(int id) {
        return new SuccessDataResult<ExperienceForCV>(this.experienceForCVDao.getById(id));
    }

    @Override
    public DataResult<List<ExperienceForCV>> getAll() {
        return new SuccessDataResult<List<ExperienceForCV>>(this.experienceForCVDao.findAll());
    }

    @Override
    public DataResult<List<ExperienceForCV>> getAllByJobSeeker_idOrderByEndAtDesc(int id) {
        return new SuccessDataResult<List<ExperienceForCV>>(this.experienceForCVDao.getAllByJobSeeker_idOrderByEndAtDesc(id));
    }

    @Override
    public DataResult<List<ExperienceForCV>> getAllByJobSeekerId(int id) {
        return new SuccessDataResult<List<ExperienceForCV>>(this.experienceForCVDao.getAllByJobSeeker_id(id));
    }
}
