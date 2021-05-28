package com.example.hrmsproject.Api.Conrollers;

import com.example.hrmsproject.Business.Abstracts.AuthService;
import com.example.hrmsproject.Core.Utilities.Results.Result;
import com.example.hrmsproject.Entities.Concretes.Employer;
import com.example.hrmsproject.Entities.Concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 @RequestMapping("/api/auth")
 public class AuthController {

        private AuthService authService;

        @Autowired
        public AuthController(AuthService authService) {
            this.authService = authService;
        }

        @PostMapping("/registerEmployer")
        public Result registerEmpolyer(@RequestBody Employer employer, String confirmPassword)
        {
            return authService.registerEmployer(employer, confirmPassword);
        }

        @PostMapping("/registerJobseeker")
        public Result registerJobseeker(@RequestBody JobSeeker jobseeker, String confirmPassword)
        {
            return authService.registerJobSeeker(jobseeker, confirmPassword);
        }
 }
