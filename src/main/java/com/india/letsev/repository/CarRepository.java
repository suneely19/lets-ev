package com.india.letsev.repository;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.CarDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.mapper.CarMapper;
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
            preparedStatement= CarMapper.carInsertMapper(preparedStatement,carDTO);

         return  preparedStatement.executeUpdate();

        }catch (Exception e){
            throw new LetsEVDBException("Exception occurred while registering the car",e);
        }finally {
            try{
                preparedStatement.close();
                connection.close();
            }catch (Exception e){
                throw new LetsEVDBException("Exception occurred while closing the connection",e);
            }
        }


    }
}
