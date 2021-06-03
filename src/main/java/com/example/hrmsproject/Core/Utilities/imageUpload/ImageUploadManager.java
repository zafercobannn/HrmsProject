package com.example.hrmsproject.Core.Utilities.imageUpload;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.ErrorDataResult;
import com.example.hrmsproject.Core.Utilities.Results.SuccessDataResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class ImageUploadManager implements ImageUploadService{

    private Cloudinary cloudinary;

    public ImageUploadManager() {

        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "doxtatmlp",
                "api_key", "439341472418824",
                "api_secret", "pwjbWBQDrxs5AX2IkO_oPkhXxQM"));
    }

    @Override
    public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
        try {
            @SuppressWarnings("unchecked")
            Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(resultMap);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        return new ErrorDataResult<Map>();
    }
}
