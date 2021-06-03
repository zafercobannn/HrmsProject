package com.example.hrmsproject.Core.Utilities.imageUpload;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface ImageUploadService {
    DataResult<Map> uploadImageFile(MultipartFile imageFile);
}
