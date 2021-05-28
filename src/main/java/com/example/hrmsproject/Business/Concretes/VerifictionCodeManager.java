package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.VerificationCodeService;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Core.Utilities.Results.SuccessResult;
import com.example.hrmsproject.DataAccess.Abstracts.VerificationCodeDao;
import com.example.hrmsproject.Entities.Concretes.VerificationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VerifictionCodeManager implements VerificationCodeService{

    private VerificationCodeDao verificationCodeDao;

    @Autowired
    public VerifictionCodeManager(VerificationCodeDao verificationCodeDao) {
        super();
        this.verificationCodeDao = verificationCodeDao;
    }

    @Override
    public Result add(VerificationCode code) {
        this.verificationCodeDao.save(code);
        return new SuccessResult("Code has been saved.");
    }

//	@Override
//	public Result delete(VerificationCode code) {
//		this.verificationCodeDao.delete(code);
//		return new SuccessResult("Code has been deleted.");
//	}
//
//	@Override
//	public Result update(VerificationCode code) {
//		this.verificationCodeDao.save(code);
//		return new SuccessResult("Code has been updated.");
//	}
//
//	@Override
//	public DataResult<VerificationCode> getById(int id) {
//		return new SuccessDataResult<VerificationCode>(this.verificationCodeDao.getOne(id));
//	}
//
//	@Override
//	public DataResult<List<VerificationCode>> getAll() {
//		return new SuccessDataResult<List<VerificationCode>>(this.verificationCodeDao.findAll());
//	}
}