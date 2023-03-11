package com.india.letsev.service;


import com.india.letsev.dto.CarDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.repository.CarRepository;

import java.util.List;

public class CarService {

    private CarRepository repository;

    public CarService(){

        repository=new CarRepository();
    }

    public boolean createCarTable() throws  LetsEVGeneralException{
        try{
            return repository.createCarTable();
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while creating Car table");
        }
    }

    public int carRegister(CarDTO carDTO) throws LetsEVGeneralException{
        try {
            return repository.registerCar(carDTO);
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while registering the car",e);

        }
    }

    public CarDTO getCar(int id) throws LetsEVGeneralException{
        try{
            return repository.getCar(id);
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while fetching the car",e);
        }
    }
    public List<CarDTO> getAllCars() throws LetsEVGeneralException{
        try{
            return repository.getAllCars();
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("exception occurred while fetching all the employees");
        }
    }
    public int updateCar(CarDTO carDTO) throws LetsEVGeneralException{
        try{
            return repository.updatecar(carDTO);
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while updating the car",e);

        }
    }
    public boolean deleteCar(int id ) throws  LetsEVGeneralException{
        try{
            return repository.deleteCar(id);
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while deleting the car",e);
        }
    }
}
