package com.india.letsev.repository;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.CarDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CarRepository {

    public int registerCar(CarDTO carDTO) throws LetsEVDBException{
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try{
            connection= ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.INSERT_CAR_QUERY);

            preparedStatement.setInt(1,carDTO.getId());
            preparedStatement.setString(2,carDTO.getBrand());
            preparedStatement.setString(3,carDTO.getModel());
            preparedStatement.setString(4, carDTO.getColour());
            preparedStatement.setString(5,carDTO.getFeatures());
            preparedStatement.setInt(6,carDTO.getSeatingcapacity());
            preparedStatement.setString(7,carDTO.getFuelType());
            preparedStatement.setString(8,carDTO.getVeified());
            preparedStatement.setDouble(9,carDTO.getMilage());
            preparedStatement.setString(10,carDTO.getChasisno());
            preparedStatement.setString(11,carDTO.getRegistrationno());
            preparedStatement.setString(12,carDTO.getEngineno());
            preparedStatement.setInt(13,carDTO.getVerfiedAdminId());

         return  preparedStatement.executeUpdate();

        }catch (Exception e){
            throw new LetsEVDBException("Exception occured while registering the car",e);
        }finally {
            try{
                preparedStatement.close();
                connection.close();
            }catch (Exception e){
                throw new LetsEVDBException("Exception occure while closing the connection",e);
            }
        }


    }


}
