package com.example.hrmsproject.DataAccess.Abstracts;

import com.example.hrmsproject.Entities.Concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findUserByEmail(String email);
    User getById(int id);
}
