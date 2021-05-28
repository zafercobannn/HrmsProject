package com.example.hrmsproject.Core.Utilities.Adapters;

import com.example.hrmsproject.MernisService.FakeMernisService;
import org.springframework.stereotype.Service;

@Service
public class MernisServiceAdapter implements ValidationService {

    @Override
    public boolean validateByMernis(long nationalId, String firstName, String lastName, int yearOfBirth) {

        FakeMernisService client = new FakeMernisService();

        boolean result = true;
        try {
            result = client.ValidateByPersonalInfo(nationalId, firstName, lastName, yearOfBirth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }



}
