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


    public boolean createCarTable()throws LetsEVGeneralException{
        try {
            return repository.createCarTable();
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while creating Car table",e);
        }

    }


    public int carRegister(CarDTO carDto) throws LetsEVGeneralException {
        try{
            return repository.registerCar(carDto);
        }catch(LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while registering the car",e);
        }
    }

    public CarDTO getCar(int id) throws LetsEVGeneralException{
        try{
            return repository.getCar(id);
        }catch(LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while Fetching the admin ",e);
        }
    }

    public List<CarDTO> getAllCar()throws LetsEVGeneralException{
        try{
            return repository.getAllCar();
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occured while fetching all the cars",e);
        }
    }

    public int updatecar(CarDTO carDto) throws LetsEVGeneralException {
        try{
            return repository.updateCar(carDto);
        }catch(LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while Updating the Car ",e);
        }
    }

    public boolean deleteCar(int id) throws LetsEVGeneralException{
        try{
            return repository.deleteCar(id);
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occured while deleting the Car",e);
 }
}
}