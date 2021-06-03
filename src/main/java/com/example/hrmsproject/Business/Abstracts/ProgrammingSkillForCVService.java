package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.ProgrammingSkillForCV;

import javax.xml.crypto.Data;
import java.util.List;

public interface ProgrammingSkillForCVService {
    Result add(ProgrammingSkillForCV programmingSkillForCV);
    Result update(ProgrammingSkillForCV programmingSkillForCV);
    Result delete(int id);
    DataResult<ProgrammingSkillForCV> getById(int id);
    DataResult<List<ProgrammingSkillForCV>> getAll();
    DataResult<List<ProgrammingSkillForCV>> getAllByJobSeekerId(int id);
}
