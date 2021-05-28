package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.VerificationCode;

public interface VerificationCodeService {

    Result add(VerificationCode code);
//	Result delete(VerificationCode code);
//	Result update(VerificationCode code);
//
//  DataResult<VerificationCode> getById(int id);
//	DataResult<List<VerificationCode>> getAll();


}