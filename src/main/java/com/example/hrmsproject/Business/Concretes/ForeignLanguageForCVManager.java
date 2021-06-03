package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.ForeignLanguageForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Core.Utilities.Results.SuccessDataResult;
import com.example.hrmsproject.Core.Utilities.Results.SuccessResult;
import com.example.hrmsproject.DataAccess.Abstracts.ForeignLanguageForCVDao;
import com.example.hrmsproject.Entities.Concretes.ForeignLanguageForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForeignLanguageForCVManager implements ForeignLanguageForCVService {

    private ForeignLanguageForCVDao foreignLanguageForCVDao;

    @Autowired
    public ForeignLanguageForCVManager(ForeignLanguageForCVDao foreignLanguageForCVDao) {
        this.foreignLanguageForCVDao = foreignLanguageForCVDao;
    }

    @Override
    public Result add(ForeignLanguageForCV foreignLanguageForCV) {
        this.foreignLanguageForCVDao.save(foreignLanguageForCV);
        return new SuccessResult("Yabancı dil bilgisi eklendi");
    }

    @Override
    public Result delete(int id) {
        this.foreignLanguageForCVDao.deleteById(id);
        return new SuccessResult("Yabancı dil bilgisi silindi");
    }

    @Override
    public Result update(ForeignLanguageForCV foreignLanguageForCV) {
        this.foreignLanguageForCVDao.save(foreignLanguageForCV);
        return new SuccessResult("Yabancı dil bilgisi güncellendi");
    }

    @Override
    public DataResult<ForeignLanguageForCV> getById(int id) {
        return new SuccessDataResult<ForeignLanguageForCV>(this.foreignLanguageForCVDao.getById(id));
    }

    @Override
    public DataResult<List<ForeignLanguageForCV>> getAll() {
        return new SuccessDataResult<List<ForeignLanguageForCV>>(this.foreignLanguageForCVDao.findAll());
    }

    @Override
    public DataResult<List<ForeignLanguageForCV>> getAllByJobSeekerId(int id) {
        return new SuccessDataResult<List<ForeignLanguageForCV>>(this.foreignLanguageForCVDao.getAllByJobSeeker_id(id));
    }
}
