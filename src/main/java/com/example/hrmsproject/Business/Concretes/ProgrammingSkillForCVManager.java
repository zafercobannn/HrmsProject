package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.ProgrammingSkillForCVService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Core.Utilities.Results.SuccessDataResult;
import com.example.hrmsproject.Core.Utilities.Results.SuccessResult;
import com.example.hrmsproject.DataAccess.Abstracts.ProgrammingSkillForCVDao;
import com.example.hrmsproject.Entities.Concretes.ProgrammingSkillForCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingSkillForCVManager implements ProgrammingSkillForCVService {

    private ProgrammingSkillForCVDao programmingSkillForCVDao;

    @Autowired
    public ProgrammingSkillForCVManager(ProgrammingSkillForCVDao programmingSkillForCVDao) {
        this.programmingSkillForCVDao = programmingSkillForCVDao;
    }

    @Override
    public Result add(ProgrammingSkillForCV programmingSkillForCV) {
        this.programmingSkillForCVDao.save(programmingSkillForCV);
        return new SuccessResult("Programlama becerisi eklendi");
    }

    @Override
    public Result update(ProgrammingSkillForCV programmingSkillForCV) {
        this.programmingSkillForCVDao.save(programmingSkillForCV);
        return new SuccessResult("Programlama becerisi güncellendi");
    }

    @Override
    public Result delete(int id) {
        this.programmingSkillForCVDao.deleteById(id);
        return new SuccessResult("Programlama becerisi silindi");
    }

    @Override
    public DataResult<ProgrammingSkillForCV> getById(int id) {
        return new SuccessDataResult<ProgrammingSkillForCV>(this.programmingSkillForCVDao.getById(id));
    }

    @Override
    public DataResult<List<ProgrammingSkillForCV>> getAll() {
        return new SuccessDataResult<List<ProgrammingSkillForCV>>(this.programmingSkillForCVDao.findAll());
    }

    @Override
    public DataResult<List<ProgrammingSkillForCV>> getAllByJobSeekerId(int id) {
        return new SuccessDataResult<List<ProgrammingSkillForCV>>(this.programmingSkillForCVDao.getAllByJobSeeker_id(id));
    }
}
