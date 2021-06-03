package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.CoverLetterForCV;

import java.util.List;

public interface CoverLetterForCVService {

    Result add(CoverLetterForCV coverLetterForCV);
    Result update(CoverLetterForCV coverLetterForCV);
    Result delete(int id);
    DataResult<CoverLetterForCV> getById(int id);
    DataResult<List<CoverLetterForCV>> getAll();

}
