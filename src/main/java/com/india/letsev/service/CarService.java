package com.india.letsev.service;

import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.repository.CarRepository;
import com.india.letsev.repository.CarRepository;

public class CarService {
    CarRepository repository;
    public CarService(){
        repository=new CarRepository();
    }


    public boolean createAdminTable()throws LetsEVGeneralException {
        try {
            return repository.createCarTable();
        } catch (Exception e) {
            throw new LetsEVGeneralException("Exception occured while creating Car table", e);
        }
    }
}
