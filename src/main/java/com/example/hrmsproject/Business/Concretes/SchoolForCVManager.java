package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.SchoolForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Core.Utilities.Results.SuccessDataResult;
import com.example.hrmsproject.Core.Utilities.Results.SuccessResult;
import com.example.hrmsproject.DataAccess.Abstracts.SchoolForCVDao;
import com.example.hrmsproject.Entities.Concretes.SchoolForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolForCVManager implements SchoolForCVService {

    private SchoolForCVDao schoolForCVDao;

    @Autowired
    public SchoolForCVManager(SchoolForCVDao schoolForCVDao) {
        this.schoolForCVDao = schoolForCVDao;
    }

    @Override
    public Result add(SchoolForCV schoolForCV) {
        this.schoolForCVDao.save(schoolForCV);
        return new SuccessResult("Okul bilgisi eklendi");
    }

    @Override
    public Result update(SchoolForCV schoolForCV) {
        this.schoolForCVDao.save(schoolForCV);
        return new SuccessResult("Okul bilgisi güncellendi");
    }

    @Override
    public Result delete(int id) {
        this.schoolForCVDao.deleteById(id);
        return new SuccessResult("Okul bilgisi silindi");
    }

    @Override
    public DataResult<SchoolForCV> getById(int id) {
        return new SuccessDataResult<SchoolForCV>(this.schoolForCVDao.getById(id));
    }

    @Override
    public DataResult<List<SchoolForCV>> getAll() {
        return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.findAll());
    }

    @Override
    public DataResult<List<SchoolForCV>> getAllByJobSeekerIdOrderByEndAtDesc(int id) {
        return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.getAllByJobSeeker_idOrderByEndAtDesc(id));
    }

    @Override
    public DataResult<List<SchoolForCV>> getAllByJobSeekerId(int id) {
        return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.getAllByJobSeeker_id(id));
    }
}
