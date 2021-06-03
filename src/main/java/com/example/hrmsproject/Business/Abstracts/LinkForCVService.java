package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.LinkForCV;

import javax.xml.crypto.Data;
import java.util.List;

public interface LinkForCVService {
    Result add(LinkForCV linkForCV);
    Result update(LinkForCV linkForCV);
    Result delete(int id);
    DataResult<LinkForCV> getById(int id);
    DataResult<List<LinkForCV>> getAll();
    DataResult<List<LinkForCV>>getAllByJobSeekerId(int id);
}
