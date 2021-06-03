package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.CoverLetterForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Core.Utilities.Results.SuccessDataResult;
import com.example.hrmsproject.Core.Utilities.Results.SuccessResult;
import com.example.hrmsproject.DataAccess.Abstracts.CoverLetterForCVDao;
import com.example.hrmsproject.Entities.Concretes.CoverLetterForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverLetterForCVManager implements CoverLetterForCVService {

    private CoverLetterForCVDao coverLetterForCVDao;

    @Autowired
    public CoverLetterForCVManager(CoverLetterForCVDao coverLetterForCVDao) {
        this.coverLetterForCVDao = coverLetterForCVDao;
    }


    @Override
    public Result add(CoverLetterForCV coverLetterForCV) {
        this.coverLetterForCVDao.save(coverLetterForCV);
        return new SuccessResult("Ön yazı eklendi");
    }

    @Override
    public Result update(CoverLetterForCV coverLetterForCV) {
        this.coverLetterForCVDao.save(coverLetterForCV);
        return new SuccessResult("Ön yazı güncellendi");
    }

    @Override
    public Result delete(int id) {
        this.coverLetterForCVDao.deleteById(id);
        return new SuccessResult("Ön yazı silindi");
    }

    @Override
    public DataResult<CoverLetterForCV> getById(int id) {
        return new SuccessDataResult<CoverLetterForCV>(this.coverLetterForCVDao.getById(id));
    }

    @Override
    public DataResult<List<CoverLetterForCV>> getAll() {
        return new SuccessDataResult<List<CoverLetterForCV>>(this.coverLetterForCVDao.findAll());
    }
}
