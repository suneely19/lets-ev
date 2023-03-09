package com.india.letsev.repository;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.AdminDto;
import com.india.letsev.dto.CarDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.mapper.CarMapper;
import com.india.letsev.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class CarRepository {


    public boolean createCarTable() throws LetsEVDBException{
        try{
            Connection connection= ConnectionUtil.getConnection();
            Statement statement = connection.createStatement();
        return  statement.execute(QueryConstants.CREATE_CAR_QUERY);
        }catch (Exception e){
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while creating the Cars table",e);

        }
    }

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

    public CarDTO getCar(int id) throws LetsEVDBException{
        Connection connection= null;
        PreparedStatement preparedStatement=null;
        try{
            connection=ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(QueryConstants.GET_CAR_QUERY);
            preparedStatement.setInt(1,id);
            ResultSet resultSet=preparedStatement.executeQuery();
            return  CarMapper.populateCarFromResultSetMapper(resultSet);

        }catch (Exception e) {
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while fetching the car");
        }finally {
            try{
                preparedStatement.close();
                connection.close();
            }catch (Exception e){
                throw new LetsEVDBException("Exception occurred while closing the connection");
            }
        }

        }

    public List<CarDTO> getAllCars() throws LetsEVDBException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionUtil.getConnection();
            statement=connection.createStatement();

            ResultSet resultSet=statement.executeQuery(QueryConstants.GET_ALL_CAR_QUERY);
            return CarMapper.populateAllCarsFromResultSetMapper(resultSet);
        } catch (Exception e) {
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while Fetching the All Cars");

        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }

    public int updatecar(CarDTO CarDto) throws LetsEVDBException{
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.UPDATE_CAR_QUERY);
            preparedStatement= CarMapper.carUpdateMapper(preparedStatement,CarDto);
            return preparedStatement.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while Updating the Car");

        }finally {
            try{
                preparedStatement.close();
                connection.close();
            }catch (Exception e){
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }


    public boolean deleteCar(int id) throws LetsEVDBException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.DELETE_CAR_QUERY);
            preparedStatement.setInt(1,id);
            boolean flag=preparedStatement.execute();
            return flag;
        } catch (Exception e) {
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while Deleting the Car");

        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }
}

