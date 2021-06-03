package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.LinkForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Core.Utilities.Results.SuccessDataResult;
import com.example.hrmsproject.Core.Utilities.Results.SuccessResult;
import com.example.hrmsproject.DataAccess.Abstracts.LinkForCVDao;
import com.example.hrmsproject.Entities.Concretes.LinkForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkForCVManager implements LinkForCVService {

    private LinkForCVDao linkForCVDao;

    @Autowired
    public LinkForCVManager(LinkForCVDao linkForCVDao) {
        this.linkForCVDao = linkForCVDao;
    }

    @Override
    public Result add(LinkForCV linkForCV) {
        this.linkForCVDao.save(linkForCV);
        return new SuccessResult("Bağlantı eklendi");
    }

    @Override
    public Result update(LinkForCV linkForCV) {
        this.linkForCVDao.save(linkForCV);
        return new SuccessResult("Bağlantı güncellendi");
    }

    @Override
    public Result delete(int id) {
        this.linkForCVDao.deleteById(id);
        return new SuccessResult("Bağlantı silindi");
    }

    @Override
    public DataResult<LinkForCV> getById(int id) {
        return new SuccessDataResult<LinkForCV>(this.linkForCVDao.getById(id));
    }

    @Override
    public DataResult<List<LinkForCV>> getAll() {
        return new SuccessDataResult<List<LinkForCV>>(this.linkForCVDao.findAll());
    }

    @Override
    public DataResult<List<LinkForCV>> getAllByJobSeekerId(int id) {
        return new SuccessDataResult<List<LinkForCV>>(this.linkForCVDao.getAllByJobSeeker_id(id));
    }
}
