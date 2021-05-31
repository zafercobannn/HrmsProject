package com.example.hrmsproject.Business.Concretes;

import com.example.hrmsproject.Business.Abstracts.CityService;
import com.example.hrmsproject.Core.Utilities.Results.DataResult;
import com.example.hrmsproject.Core.Utilities.Results.SuccessDataResult;
import com.example.hrmsproject.DataAccess.Abstracts.CityDao;
import com.example.hrmsproject.Entities.Concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        super();
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll());
    }

}
