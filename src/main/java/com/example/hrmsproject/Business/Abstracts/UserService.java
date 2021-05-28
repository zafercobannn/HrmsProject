package com.example.hrmsproject.Business.Abstracts;

import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.User;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getall();
    DataResult<User> getUserByEmail(String email);
    Result add(User user);
    //Result delete(int id);
    //Result update(User user);
}
