package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.UserService;
import com.example.hrmsproject.Core.Utilities.Results.*;
import com.example.hrmsproject.DataAccess.Abstracts.UserDao;
import com.example.hrmsproject.Entities.Concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getall() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Kullanıcılar listelendi");
    }

    @Override
    public DataResult<User> getUserByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findUserByEmail(email));
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi");
    }

   /* @Override
    public Result delete(int id) {
        this.userDao.deleteById(id);
        return new SuccessResult("Kullanıcı silindi");
    }

    @Override
    public Result update(User user) {
        return null;
    }*/
}
