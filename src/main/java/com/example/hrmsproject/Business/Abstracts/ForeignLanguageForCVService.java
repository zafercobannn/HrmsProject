package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.ForeignLanguageForCV;

import javax.xml.crypto.Data;
import java.util.List;

public interface ForeignLanguageForCVService {
    Result add(ForeignLanguageForCV foreignLanguageForCV);
    Result delete(int id);
    Result update(ForeignLanguageForCV foreignLanguageForCV);
    DataResult<ForeignLanguageForCV> getById(int id);
    DataResult<List<ForeignLanguageForCV>> getAll();
    DataResult<List<ForeignLanguageForCV>> getAllByJobSeekerId(int id);
}
