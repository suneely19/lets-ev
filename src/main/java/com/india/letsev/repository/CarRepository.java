package com.india.letsev.repository;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.AdminDto;
import com.india.letsev.dto.CarDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.mapper.AdminMapper;
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
            Connection connection=ConnectionUtil.getConnection();
            Statement statement=connection.createStatement();
            return statement.execute(QueryConstants.CREATE_CAR_QUERY);

        }catch (Exception e){
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while creating the Car table",e);
        }

    }

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



    public CarDTO getCar(int id) throws LetsEVDBException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(QueryConstants.GET_CAR_QUERY);
            preparedStatement.setInt(1,id);
            ResultSet resultSet=preparedStatement.executeQuery();
            return CarMapper.populateCarFromResultSetMapper(resultSet);
        } catch (Exception e) {
            throw new LetsEVDBException("Exception occurred while Fetching the Admin");

        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }

    public List<CarDTO> getAllCar() throws LetsEVDBException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionUtil.getConnection();
            statement=connection.createStatement();

            ResultSet resultSet=statement.executeQuery(QueryConstants.GET_ALL_CAR_QUERY);
            return CarMapper.populateAllCarFromResultSetMapper(resultSet);
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


    public int updateAdmin(CarDTO CarDto) throws LetsEVDBException{
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.UPDATE_CAR_QUERY);
            preparedStatement= CarMapper.CarUpdateMapper(preparedStatement,CarDto);
            return preparedStatement.executeUpdate();

        }catch (Exception e){
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
            throw new LetsEVDBException("Exception occurred while Deleting the CARS");

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


