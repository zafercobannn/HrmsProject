package com.example.hrmsproject.Core.Verification;

public interface VerificationService {
    void sendLink(String email);
    String sendCode();
}
