package com.india.letsev.service;

import com.india.letsev.dto.CarDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.repository.CarRepository;

public class CarService {

    private CarRepository repository;

    public CarService(){

        repository=new CarRepository();
    }

    public int carRegister(CarDTO carDTO) throws LetsEVGeneralException{
        try {
            return repository.registerCar(carDTO);
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while registering the car",e);
        }
    }
}
