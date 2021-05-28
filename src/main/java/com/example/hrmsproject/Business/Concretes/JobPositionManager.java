package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.JobPositionService;
import com.example.hrmsproject.Core.Utilities.Results.*;
import com.example.hrmsproject.DataAccess.Abstracts.JobPositionDao;
import com.example.hrmsproject.Entities.Concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"İş pozisyonları listelendi");
    }

    @Override
    public Result add(JobPosition jobPosition) {
        if (getJobByTitle(jobPosition.getJobTitle()).getData() !=null){
            return new ErrorResult(jobPosition.getJobTitle()+ "Bu iş pozisyonu zaten var");
        }
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult("İş pozisyonu eklendi");
    }

    @Override
    public DataResult<JobPosition> getJobByTitle(String title) {
        return new SuccessDataResult<JobPosition>(this.jobPositionDao.findByJobTitle(title));
    }
}