package com.example.hrmsproject.Core.Utilities.Adapters;

public interface ValidationService {
    boolean validateByMernis(long nationalId, String firstName, String lastName, int yearOfBirth);
}