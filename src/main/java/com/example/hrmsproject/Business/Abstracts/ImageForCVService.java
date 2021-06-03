package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.ImageForCV;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageForCVService {
    Result add(ImageForCV imageForCV, MultipartFile imageFile);
    Result update(ImageForCV imageForCV);
    Result delete(int id);
    DataResult<ImageForCV> getById(int id);
    DataResult<List<ImageForCV>> getAll();
    DataResult<ImageForCV> getByJobSeekerId(int id);
}
