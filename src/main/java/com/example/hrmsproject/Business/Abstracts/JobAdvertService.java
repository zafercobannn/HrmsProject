package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.JobAdvert;

import java.util.List;

public interface JobAdvertService {
    Result add(JobAdvert jobAdvert);
    Result update(JobAdvert jobAdvert);
    Result delete(int id);
    Result changeOpenToClose(int id);
    DataResult<JobAdvert> getById(int id);
    DataResult<List<JobAdvert>> getAll();
    DataResult<List<JobAdvert>> getAllOpenJobAdvertList();
    DataResult<List<JobAdvert>> findAllByOrderByPublishedAt();
    DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id);
}
